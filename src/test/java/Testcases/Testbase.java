package Testcases;

import Utility.Utilities;
import drivers.DriverFactory;
import drivers.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Testbase extends Utilities {

    protected static WebDriver driver;

    @Parameters("browser")
    @BeforeTest
   public void setupDriver(String browser) {
       driver = DriverFactory.getNewInstance(browser);
       DriverHolder.setDriver(driver);

       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   }

    @AfterTest
    public void tearDown() {
        // driver.quit();
        // Thread.currentThread().interrupt();
    }
    }

