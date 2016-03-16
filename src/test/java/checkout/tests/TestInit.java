package checkout.tests;

import checkout.pages.ProductViewPage;
import checkout.pages.ShoppingBagPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

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

    private void initPages(){
        productViewPage = new ProductViewPage(driver);
        shoppingBagPage = new ShoppingBagPage(driver);
    }
}

