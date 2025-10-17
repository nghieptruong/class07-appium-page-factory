package components;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TopBarNavigation extends BasePage {

    @AndroidFindBy(accessibility = "View menu")
    WebElement menuMain;

    @AndroidFindBy(accessibility = "Login Menu Item")
    WebElement loginMenuItem;

    public TopBarNavigation(WebDriver driver) {
        super(driver);
    }

    public void openMainMenu() {
        click(menuMain);
    }

    public void accessLoginMenuItem() {
        click(loginMenuItem);
    }

    public void openMenuItem(String itemName) {

    }
}
