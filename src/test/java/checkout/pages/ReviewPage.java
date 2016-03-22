package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alinka on 22.03.2016.
 */
public class ReviewPage extends BasePage{

    private String reviewPageTitle = "//*[contains(text(), 'Alles richtig?')]";

    public ReviewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean checkPageIsOpened(){
        if(isElementPresent(By.xpath(reviewPageTitle))){
            return true;
        } else return false;
    }
}
