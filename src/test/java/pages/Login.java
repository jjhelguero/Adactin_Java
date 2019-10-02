package pages;


import enums.Url;
import org.openqa.selenium.By;
import utilities.CommonUtilities;

public class Login extends CommonUtilities {

    //TODO map objects for sign in page, create modular function sign in process
    //https://www.toolsqa.com/selenium-webdriver/page-object-model/
    //https://github.com/tjmaher/automate-amazon

    private final By textUSERNAME = By.cssSelector("input[name='username'][id='username'][type='text']");
    private final By textPASSWORD = By.cssSelector("input[name='password'][id='password'][type='password']");
    private final By buttonLOGIN = By.cssSelector("input[name='login'][id='login'][type='Submit']");

    public void navigateToLogInPage() {
        String url = Url.BASEURL.getUrl();
        System.out.println("Navigating to Login page: " + url);
        navigateToURL(url);
    }

    public void inputUsername(String username) {
        sendKeysToTextbox(textUSERNAME, username);
    }

    public void inputPassword(String password) {
        sendKeysToTextbox(textPASSWORD, password);
    }

    public void clickLogInButton() {
        click(buttonLOGIN);
    }

}
