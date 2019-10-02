package utilities;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;


public abstract class CommonUtilities {

    public static WebDriver _driver;

    public CommonUtilities(){
        _driver = DriverUtilities.getDriver();
    }

    public void navigateToURL(String URL) {
        try {
            _driver.navigate().to(URL);
        } catch (Exception e) {
            System.out.println("URL did not load : " + URL);
        }
    }

    public void getPageTitle(){
        try {
            _driver.getTitle();
        } catch (Exception e) {
            System.out.println("Current Page Title is : " + _driver.getTitle());
        }
    }

    public WebElement getElement(By selector) {
        try {
            return _driver.findElement(selector);
        } catch (Exception e) {
            System.out.println("Element " + selector + " does not exist");
        }
        return null;
    }

    public void click(By selector) {
        WebElement element = _driver.findElement(selector);
        try {
            element.click();
        } catch (Exception e) {
            System.out.println("Element " + selector + " is not clickable");
        }
    }

    public void getLinkText(By selector)  {
        WebElement element = _driver.findElement(selector);
        try {
            element.getText();
        } catch (Exception e) {
            System.out.println("Element " + selector + " does not have text");
        }
    }

    public void sendKeysToTextbox(By selector, String inputText) {
        WebElement element = _driver.findElement(selector);
        try {
            element.sendKeys(inputText);
        } catch(Exception e) {
            System.out.println("Cannot send keys to " + selector);
        }
    }
}