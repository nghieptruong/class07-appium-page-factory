package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {

    private static final Logger logger = LogManager.getLogger(DriverManager.class);
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(String platformName) {
        if(driver.get() == null) {
            driver.set(createDriver(platformName));
        }
        return driver.get();
    }

    private static WebDriver createDriver(String platformName) {
        WebDriver webDriver;
        switch (platformName) {
            case "android":
                UiAutomator2Options options = new UiAutomator2Options();
                options.setPlatformName("Android");
                options.setAutomationName("UiAutomator2");
                options.setDeviceName("emulator-5554");
                options.setPlatformVersion("15");
                options.setAppPackage("com.saucelabs.mydemoapp.android");
                options.setAppActivity("com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
                webDriver = new AndroidDriver(options);
                break;
            case "ios":
                // Not implement yet!
                webDriver = null;
                break;
            default:
                throw new IllegalArgumentException("Platform not supported: " + platformName);
        }
        logger.info("Driver initialized for platform: " + platformName);
        return webDriver;
    }

    public static void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }

    public static WebDriver getCurrentDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if(driver.get() != null) {
            driver.get().quit();
            driver.remove();
            logger.info("Driver quit successfully");
        }
    }
}
