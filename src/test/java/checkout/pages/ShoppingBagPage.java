package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShoppingBagPage extends BasePage{

    private String itemName="//*[@itemprop='name']";

    private String removeLink="//*[contains(text(), 'entfernen')]";

    private String article = "//*[@itemprop='itemListElement']";

 //   @FindBy(xpath="//*[@itemprop='name']")
 //   WebElement itemName;

    @FindBy(xpath="//*[contains(text(), 'zuletz')]")
    WebElement restoreLastProductLink;

    @FindBy(css = ".btn__content")
    WebElement goToAddress;

    public ShoppingBagPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String removeAllProductsFromCartAndSaveLastProductName(){
        List<WebElement> articles = driver.findElements(By.xpath(article));
        String productName="";
        for(WebElement item: articles){
            productName = item.findElement(By.xpath(itemName)).getText();
            item.findElement(By.xpath(removeLink)).click();
        }
        return productName;
    }

    public void removeAllProductsFromCart(){
        List<WebElement> productsRemove = driver.findElements(By.xpath(removeLink));
        for(WebElement productRemove: productsRemove){
            productRemove.click();
        }
    }

    public String restoreProduct(){
        restoreLastProductLink.click();
        String restoredProductName=driver.findElement(By.xpath(itemName)).getText();
        return restoredProductName;
    }

    public boolean checkCorrectProductRestored(){
        if(removeAllProductsFromCartAndSaveLastProductName().equals(restoreProduct())) {
            return true;
        }
        return false;
    }

    public void goToAddressPage(){
        goToAddress.click();
    }
}
