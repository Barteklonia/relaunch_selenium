package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Alinka on 16.03.2016.
 */
public class BasePage {
    protected WebDriver driver;

    private String birthDay = "//select[@data-title='Tag']";

    private String birthMonth = "//select[@data-title='Monat']";

    private String birthYear =  "//select[@data-title='Jahr']";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void selectBirthdate (String day, String month, String year){
        Select selectDay = new Select(driver.findElement(By.xpath(birthDay)));
        selectDay.selectByValue(day);
        Select selectMonth = new Select(driver.findElement(By.xpath(birthMonth)));
        selectMonth.selectByValue(month);
        Select selectYear = new Select(driver.findElement(By.xpath(birthYear)));
        selectYear.selectByValue(year);
    }
}
