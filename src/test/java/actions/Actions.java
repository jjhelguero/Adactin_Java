package actions;

import pages.*;

public class Actions {

    public void navigateToLogInPage() {
        Login login = new Login();
        login.navigateToLogInPage();
    }

    public void loginAs(String username, String password) {
        Login login = new Login();
        login.navigateToLogInPage();
        login.inputUsername(username);
        login.inputPassword(password);
        login.clickLogInButton();
    }
}
