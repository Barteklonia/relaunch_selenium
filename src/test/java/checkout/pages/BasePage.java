package checkout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alinka on 16.03.2016.
 */
public class BasePage {
    protected WebDriver driver;

    private String birthDay = "//p[contains(@class, 'dropdown__title') and text() = 'Tag']";
    private String birthDayOption = "//p[contains(@class, 'dropdown__option') and text() = '$2']";
    private String birthMonth = "//p[contains(@class, 'dropdown__title') and text() = 'Monat']";
    private String birthMonthOption = "//p[contains(@class, 'dropdown__option') and text() = '$3']";
    private String birthYear =  "//p[contains(@class, 'dropdown__title') and text() = 'Jahr']";
    private String birthYearOption = "//p[contains(@class, 'dropdown__option') and text() = '$4']";

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

    public void explicitWait(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void selectBirthdate (String day, String month, String year){
        driver.findElement(By.xpath(birthDay)).click();
        driver.findElement(By.xpath(birthDayOption.replace("$2", day))).click();
        driver.findElement(By.xpath(birthMonth)).click();
        driver.findElement(By.xpath(birthMonthOption.replace("$3", month))).click();
        driver.findElement(By.xpath(birthYear)).click();
        driver.findElement(By.xpath(birthYearOption.replace("$4", year))).click();
    }
}
