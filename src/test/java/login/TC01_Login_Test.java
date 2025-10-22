package login;

import base.BaseTest;
import drivers.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.abstracts.HomePage;
import pages.abstracts.LoginPage;
import pages.factories.PageFactory;

public class TC01_Login_Test extends BaseTest {

    @Test(description = "Valid Login Test")
    public void testValidLogin() {
        HomePage homePage = PageFactory.getHomePage();
        LoginPage loginPage = PageFactory.getLoginPage();

        //Step 1: Click on Main Menu -> Log In link
        homePage.getTopBarNavigation().openMainMenu();
        homePage.getTopBarNavigation().accessLoginMenuItem();

        //Step 2: Enter user name
        //Step 3: Enter password
        //Step 4: Click Login button
        loginPage.login("bod@example.com", "10203040");

        //VP: Verify valid login successfully
        //VP1: Check user is navigated to Home page
        Assert.assertTrue(homePage.isDisplayed(), "Home page does not display!");

        //VP2: Check 'Log out' menu item display

    }
}
