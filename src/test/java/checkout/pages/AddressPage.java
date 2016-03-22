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

    @FindBy(xpath = "//*[@id='modal-address-doctor']//div[7]//button")
    WebElement addressDoctorSubmitBtn;

    private String addressDocPopup = "//*[@id='modal-address-doctor']";

    public AddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void submitAddressData(){
        submitBtn.click();
    }

    public void addressDocAccept(){
        explicitWait(addressDocPopup);
        addressDoctorSubmitBtn.click();
    }

    public void rachelBasilDillColeHagen(){
        salutationFrau.click();
        firstName.sendKeys("Rachel");
        lastName.sendKeys("Hagen");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Rachel-BasilDillCole@Hagen.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void fibiBasilDillColeHagen(){
        salutationFrau.click();
        firstName.sendKeys("Fibi");
        lastName.sendKeys("Hagen");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Fibi-BasilDillCole@Hagen.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void fibiBasilDillColeIkea(){
        salutationFrau.click();
        firstName.sendKeys("Fibi");
        lastName.sendKeys("Ikea");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Fibi-BasilDillCole@Ikea.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void joeyBasilDillColeUlm(){
        salutationFrau.click();
        firstName.sendKeys("Joey");
        lastName.sendKeys("Ulm");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Joey-BasilDillCole@Ulm.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void chandlerBasilDillColeUlm(){
        salutationFrau.click();
        firstName.sendKeys("Chandler");
        lastName.sendKeys("Ulm");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Chandler-BasilDillCole@Ulm.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void rossBasilDillColeUlm(){
        salutationFrau.click();
        firstName.sendKeys("Ross");
        lastName.sendKeys("Ulm");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Ross-BasilDillCole@Ulm.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void rossChiliDillColeHagen(){
        salutationFrau.click();
        firstName.sendKeys("Ross");
        lastName.sendKeys("Hagen");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Ross-ChiliDillCole@Hagen.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void rossBasilDillTomatoUlm(){
        salutationFrau.click();
        firstName.sendKeys("Ross");
        lastName.sendKeys("Ulm");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Ross-BasilDillTomato@Ulm.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void rossChiliPaprikaColeHagen(){
        salutationFrau.click();
        firstName.sendKeys("Ross");
        lastName.sendKeys("Hagen");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Ross-ChiliPaprikaCole@Hagen.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }


    public void rossChiliPaprikaTomatoUlm(){
        salutationFrau.click();
        firstName.sendKeys("Ross");
        lastName.sendKeys("Ulm");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Ross-ChiliPaprikaTomato@Ulm.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void monikaChiliPaprikaTomatoUlm(){
        salutationFrau.click();
        firstName.sendKeys("Monika");
        lastName.sendKeys("Ulm");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Monika-ChiliPaprikaTomato@Ulm.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void monikaBasilDillColeAachen(){
        salutationFrau.click();
        firstName.sendKeys("Monika");
        lastName.sendKeys("Aachen");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Monika-BasilDillCole@Aachen.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }

    public void monikaBasilDillTomatoOldenburg(){
        salutationFrau.click();
        firstName.sendKeys("Monika");
        lastName.sendKeys("Oldenburg");
        selectBirthdate("4", "Februar", "1988");
        email.sendKeys("Monika-BasilDillTomato@Oldenburg.de");
        hinweisCheckbox.click();
        zip.sendKeys("40221");
        city.sendKeys("Dusseldorf");
        street.sendKeys("testStrasse");
        houseNo.sendKeys("50");
        sameShippingAddressCheckbox.click();
    }
}
