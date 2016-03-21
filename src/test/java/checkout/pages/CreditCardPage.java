package checkout.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by roshchupkina on 3/21/2016.
 */
public class CreditCardPage extends BasePage {

    public CreditCardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
