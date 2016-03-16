package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductViewPage extends BasePage{

    private final String STAGE_URL = "http://frontend.dev.fashionette.de";

    @FindBy(css=".product-details__description__brand")
    private WebElement productBrand;

    @FindBy(css=".product-details__description__brand")
    private WebElement productTitle;

    @FindBy(css=".dropdown__title")
    private WebElement sizeBox;

    private String sizeBoxValue="//*[@class='dropdown__options']//*[contains(text(), '$1')]";

    @FindBy(css =".btn__submit")
    private WebElement addToCartBtn;

    public ProductViewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        }

    public ProductViewPage open(String productURL) {
        driver.get(STAGE_URL + "/product/" + productURL);
        return this;
    }

    public void selectSize(String size){
            sizeBox.click();
            driver.findElement(By.xpath(sizeBoxValue.replace("$1", size))).click();
        }

        public void addProductToTheCart(){
            //isElementPresent(By.cssSelector(addToCartBtn));
            addToCartBtn.click();
        }



}
