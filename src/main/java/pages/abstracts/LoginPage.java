package pages.abstracts;

import org.openqa.selenium.WebDriver;

public abstract class LoginPage extends CommonPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public abstract void enterUserName(String userName);

    public abstract void enterPassword(String password);

    public abstract void clickLogin();

    public abstract void login(String userName, String password);
}
