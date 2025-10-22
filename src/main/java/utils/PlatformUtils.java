package utils;

import drivers.DriverManager;
import enums.PlatformType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

public class PlatformUtils {

    public static PlatformType getPlatformType() {
        WebDriver driver = DriverManager.getCurrentDriver();
        if(driver instanceof AndroidDriver) {
            return PlatformType.ANDROID;
        } else if(driver instanceof IOSDriver) {
            return PlatformType.IOS;
        } else {
            return null;
        }
    }
}
