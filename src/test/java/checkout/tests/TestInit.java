package checkout.tests;

import checkout.pages.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * TestInit class is parent class for all test classes
 * contains main setUp of driver, @Before and @After methods
 *
 * @author Alina Roshchupkina
 */
public class TestInit {
    protected WebDriver driver;

    ProductViewPage productViewPage;
    ShoppingBagPage shoppingBagPage;
    AddressPage addressPage;
    PaymentPage paymentPage;
    DirectDebitPage directDebitPage;
    CreditCardPage creditCardPage;
    InstallmentsPaymentPage installmentsPaymentPage;

    //Before each test class actions (setup driver, etc.)
    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage()
                .timeouts()
                .implicitlyWait(5, TimeUnit.SECONDS);
        initPages();
    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult){
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(testResult.getStatus());
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String methodname = testResult.getName();
            try {
                FileUtils.copyFile(scrFile, new File("d:\\selenium_scr\\" + methodname + System.currentTimeMillis() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            } } }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @AfterTest(alwaysRun = true)
    public void ClearBrowserCache()
    {
        driver.manage().deleteAllCookies(); //delete all cookies
    }

    private void initPages(){
        productViewPage = new ProductViewPage(driver);
        shoppingBagPage = new ShoppingBagPage(driver);
        addressPage = new AddressPage(driver);
        paymentPage = new PaymentPage(driver);
        directDebitPage = new DirectDebitPage(driver);
        creditCardPage = new CreditCardPage(driver);
        installmentsPaymentPage = new InstallmentsPaymentPage(driver);
    }
}

