package pages;

import components.TopBarNavigation;
import org.openqa.selenium.WebDriver;

public class CommonPage extends BasePage {

    private TopBarNavigation topBarNavigation;

    public CommonPage(WebDriver driver) {
        super(driver);
        topBarNavigation = new TopBarNavigation(driver);
    }

    public TopBarNavigation getTopBarNavigation() {
        return this.topBarNavigation;
    }
}
