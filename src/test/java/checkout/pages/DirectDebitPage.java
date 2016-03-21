package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//*[contains(@class, 'form form payment--direct-debit')]//*[@class='btn__submit']")
    WebElement goToReviewPageBtn;

    private String IBANerror = "account_iban-error";



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

    public boolean validAccountLFT(){
        IBANfield.sendKeys("DE657362746374637463");
        if (isElementPresent(By.id("account_iban-error"))) {
            return true;
        } else return false;
    }
}
