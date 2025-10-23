package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager {

    private static final Logger logger = LogManager.getLogger(DriverManager.class);
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(String platformName) {
        if(driver.get() == null) {
            try {
                driver.set(createDriver(platformName));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver.get();
    }

    private static WebDriver createDriver(String platformName) throws MalformedURLException {
        WebDriver webDriver;
        switch (platformName) {
            case "android":
                UiAutomator2Options androidOptions = new UiAutomator2Options();
                androidOptions.setPlatformName("Android");
                androidOptions.setAutomationName("UiAutomator2");
                androidOptions.setDeviceName("emulator-5554");
                androidOptions.setPlatformVersion("15");
                androidOptions.setAppPackage("com.saucelabs.mydemoapp.android");
                androidOptions.setAppActivity("com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
                androidOptions.setAdbExecTimeout(Duration.ofSeconds(300));
                webDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),androidOptions);
                break;
            case "ios":
                XCUITestOptions iosOptions = new XCUITestOptions();
                iosOptions.setPlatformName("ios");
                iosOptions.setAutomationName("XCUITest");
                iosOptions.setDeviceName("iPhone 17 Pro Simulator");
                iosOptions.setUdid("87F8DA42-F0F6-4C6F-85C9-84646D59A10B");
                iosOptions.setBundleId("com.saucelabs.mydemo.app.ios");
                webDriver = new IOSDriver(new URL("http://127.0.0.1:4723/"), iosOptions);
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
