package pages.ios;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.abstracts.LoginPage;

public class IOSLoginPage extends LoginPage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    WebElement txtUserName;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
    WebElement txtPassword;

    @iOSXCUITFindBy(iOSNsPredicate = "name == \"Login\" AND label == \"Login\" AND type == \"XCUIElementTypeButton\"")
    WebElement btnLogin;

    public IOSLoginPage(WebDriver driver) {
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
