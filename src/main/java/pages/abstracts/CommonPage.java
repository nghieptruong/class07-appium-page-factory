package pages.abstracts;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.factories.PageFactory;

public abstract class CommonPage extends BasePage {

    private TopBarNavigation topBarNavigation;

    public CommonPage(WebDriver driver) {
        super(driver);
        this.topBarNavigation = PageFactory.getTopBarNavigation();
    }

    public TopBarNavigation getTopBarNavigation() {
        return this.topBarNavigation;
    }
}
