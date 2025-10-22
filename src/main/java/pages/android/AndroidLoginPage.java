package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.abstracts.LoginPage;

public class AndroidLoginPage extends LoginPage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    WebElement txtUserName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    WebElement txtPassword;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/loginBtn")
    WebElement btnLogin;

    public AndroidLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterUserName(String userName) {
        sendKeys(txtUserName, userName);
    }

    @Override
    public void enterPassword(String password) {
        sendKeys(txtPassword, password);
    }

    @Override
    public void clickLogin() {
        click(btnLogin);
    }

    @Override
    public void login(String userName, String password) {
        enterUserName(userName);
        enterPassword(password);
        clickLogin();
    }
}
