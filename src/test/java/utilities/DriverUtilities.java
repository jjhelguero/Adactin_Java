package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverUtilities {
    public static WebDriver _driver;

    @BeforeSuite(alwaysRun = true)
    public void setUp() {
        _driver = new FirefoxDriver();
    }


    public static WebDriver getDriver() {
        if (_driver == null) {
            _driver = new FirefoxDriver();
        }

        return _driver;
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        _driver.close();
        _driver.quit();
    }
}
