package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by roshchupkina on 3/17/2016.
 */
public class AddressPage extends BasePage {

    @FindBy(xpath = "//input[@value='Mr']")
    WebElement salutationHerr;

    @FindBy(xpath = "//input[@value='Mrs']")
    WebElement salutationFrau;

    @FindBy(xpath = "//*[@name='billing-title']")
    WebElement title;

    @FindBy(xpath = "//*[@name='billing-firstname']")
    WebElement firstName;

    @FindBy(xpath = "//*[@name='billing-lastname']")
    WebElement lastName;

    @FindBy(xpath = "//*[@data-value='$1']")
    WebElement birthdateValue;

    @FindBy(xpath = "//*[@name='email']")
    WebElement email;

    @FindBy(xpath = "//*[@name='solvencycheck']")
    WebElement hinweisCheckbox;

    @FindBy(xpath = "//*[@name='billing-zipcode']")
    WebElement zip;

    @FindBy(xpath = "//*[@name='billing-city']")
    WebElement city;

    @FindBy(xpath = "//*[@name='billing-street']")
    WebElement street;

    @FindBy(xpath = "//*[@name='billing-hnr']")
    WebElement houseNo;

    @FindBy(xpath = "//*[@name='samebillandshippingaddress']")
    WebElement sameShippingAddressCheckbox;

    @FindBy(css = ".btn__submit")
    WebElement submitBtn;

    public AddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillDataForRachelBasilHagen(){
        salutationFrau.click();
        firstName.sendKeys("Rachel");
        lastName.sendKeys("Hagen");
        selectBirthdate("4", "10", "1988");
        email.sendKeys("Rachel-BasilDillCole@Hagen.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
        submitBtn.click();
    }
}
