package testcases;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import base.LoadProperties;
import actions.*;
import utilities.DriverUtilities;


public class LoginTest {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
    }


    @Test()
    public void LoginTest (){
        Actions actions = new Actions();
        String user = LoadProperties.user.toString();
        String username = LoadProperties.getPropertyValue(user,"adactin.username");
        String password = LoadProperties.getPropertyValue(user,"adactin.password");
        actions.loginAs(username, password);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
//    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
//        try {
//            driver.get("http://adactin.com/HotelApp/index.php");
//        } finally {
//            driver.quit();
//        }
//    }
}