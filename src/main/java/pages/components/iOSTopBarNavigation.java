package pages.components;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.abstracts.TopBarNavigation;

public class iOSTopBarNavigation extends TopBarNavigation {

    @iOSXCUITFindBy(accessibility = "More-tab-item")
    private WebElement menuMain;

    @iOSXCUITFindBy(accessibility = "Login Button")
    private WebElement loginMenuItem;

    public iOSTopBarNavigation(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openMainMenu() {
        click(menuMain);
    }

    @Override
    public void accessLoginMenuItem() {
        click(loginMenuItem);
    }

    @Override
    public void openMenuItem(String itemName) {

    }
}
