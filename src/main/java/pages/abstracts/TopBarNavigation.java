package pages.abstracts;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public abstract class TopBarNavigation extends BasePage {

    public TopBarNavigation(WebDriver driver) {
        super(driver);
    }

    public abstract void openMainMenu();

    public abstract void accessLoginMenuItem();

    public abstract void openMenuItem(String itemName);
}
