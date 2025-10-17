package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonPage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    WebElement lblTitle;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return getText(lblTitle).equals("Products");
    }
}
