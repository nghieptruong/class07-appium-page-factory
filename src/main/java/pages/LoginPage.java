package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends CommonPage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    WebElement txtUserName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    WebElement txtPassword;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/loginBtn")
    WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(String userName) {
        sendKeys(txtUserName, userName);
    }

    public void enterPassword(String password) {
        sendKeys(txtPassword, password);
    }

    public void clickLogin() {
        click(btnLogin);
    }

    public void login(String userName, String password) {
        enterUserName(userName);
        enterPassword(password);
        clickLogin();
    }
}
