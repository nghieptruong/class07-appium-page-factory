package pages.ios;

import org.openqa.selenium.WebDriver;
import pages.abstracts.HomePage;

public class IOSHomePage extends HomePage {

    public IOSHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        //Not Implement yet
        return true;
    }
}
