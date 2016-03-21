package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alinka on 20.03.2016.
 */
public class PaymentPage extends BasePage{

    private String paymentMethod = ".payment-method__title";

    @FindBy(xpath = "//*[contains(text(), 'Lastschrift')]")


    public PaymentPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ArrayList<String> checkActualPaymentList(){
        List<WebElement> payments = driver.findElements(By.cssSelector(paymentMethod));
        ArrayList actualPayments = new ArrayList();
        for(WebElement payment: payments){
            String paymentName = payment.getText();
            actualPayments.add(paymentName);
        }
        return actualPayments;
    }

}
