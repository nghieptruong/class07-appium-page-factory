package pages.components;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.abstracts.TopBarNavigation;

public class AndroidTopBarNavigation extends TopBarNavigation {

    @AndroidFindBy(accessibility = "View menu")
    WebElement menuMain;

    @AndroidFindBy(accessibility = "Login Menu Item")
    WebElement loginMenuItem;

    public AndroidTopBarNavigation(WebDriver driver) {
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
