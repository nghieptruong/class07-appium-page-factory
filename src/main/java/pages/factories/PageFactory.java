package pages.factories;

import drivers.DriverManager;
import enums.PlatformType;
import pages.abstracts.HomePage;
import pages.abstracts.LoginPage;
import pages.android.AndroidHomePage;
import pages.android.AndroidLoginPage;
import pages.ios.IOSHomePage;
import pages.ios.IOSLoginPage;
import utils.PlatformUtils;

public class PageFactory {
    public static HomePage getHomePage() {
        if(PlatformUtils.getPlatformType() == PlatformType.ANDROID) {
            return new AndroidHomePage(DriverManager.getCurrentDriver());
        } else if(PlatformUtils.getPlatformType() == PlatformType.IOS) {
            return new IOSHomePage(DriverManager.getCurrentDriver());
        } else {
            return null;
        }
    }

    public static LoginPage getLoginPage() {
        if(PlatformUtils.getPlatformType() == PlatformType.ANDROID) {
            return new AndroidLoginPage(DriverManager.getCurrentDriver());
        } else if(PlatformUtils.getPlatformType() == PlatformType.IOS) {
            return new IOSLoginPage(DriverManager.getCurrentDriver());
        } else {
            return null;
        }
    }
}
