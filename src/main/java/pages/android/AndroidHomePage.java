package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.abstracts.HomePage;

public class AndroidHomePage extends HomePage {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    WebElement lblTitle;

    public AndroidHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return getText(lblTitle).equals("Products");
    }
}
