package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;
import java.util.Random;

/**
 * Created by roshchupkina on 3/21/2016.
 */
public class DirectDebitPage extends BasePage {

    @FindBy(xpath = "//*[@name='account_owner']")
    WebElement ownerField;

    @FindBy(xpath = "//*[@name='account_iban']")
    WebElement IBANfield;

    @FindBy(xpath = "//*[@name='account_bic']")
    WebElement BICfield;

    @FindBy(xpath = "//*[contains(@class, 'payment--direct-debit__button')]//*[@class='btn-default form__submit']")
    WebElement goToReviewPageBtn;

    @FindBy(xpath = "//*[contains(@class, 'form form payment--creditcard__accounts form--valid')]//*[@class='btn-default form__submit']")
    WebElement savedAccSubmitBtn;

    private String savedAccCheckbox = "//*[@class='radiobutton-group__radiobutton__input']";

    public DirectDebitPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean invalidATAccForDEStoreLFT(){
        IBANfield.sendKeys("AT65736274637463746382");
        BICfield.sendKeys("1234567");
        if (isElementPresent(By.id("account_iban-error"))&&isElementPresent(By.id("account_bic-error"))) {
           return true;
        } else return false;
    }

    public boolean invalidAccLengthLFT(){
        IBANfield.sendKeys("DE657362746374637463");
        if (isElementPresent(By.id("account_iban-error"))) {
            return true;
        } else return false;
    }

    public String checkBICisFilledAutomatically(){
        IBANfield.sendKeys("DE08 3804 0007 0253 7041 00");
        BICfield.click();
        String bic = BICfield.getAttribute("value");
        return bic;
    }

    public void enterIBAN(){
        IBANfield.sendKeys("DE08 3804 0007 0253 7041 00");
        BICfield.click();
    }

    public void submitData() {
        goToReviewPageBtn.click();
    }

    public void selectRandomSavedAccAndSubmit(){
        List<WebElement> accounts = driver.findElements(By.xpath(savedAccCheckbox));
        Random randomSavedAcc = new Random();
        WebElement account = accounts.get(randomSavedAcc.nextInt(accounts.size()));
        account.click();
        savedAccSubmitBtn.click();
    }
}
