package pageTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testConfig.BaseTest;

import java.awt.image.PackedColorModel;

import static utils.PropertyReaderHelper.getCustomProperty;

@Listeners(utils.ListenerHelper.class)

public class LoginPageTests extends BaseTest
{
    public LoginPageTests()
    {
        key = "loginPage";
    }

    @Test(priority = 1, groups = {"smoke"}, description = "Test user is able to login and routed to Account Page")
    public void TestPositiveUserLogin()
    {
        loginPage.routeToLoginPage(getCustomProperty("loginPageUrl"));
       accountPage = loginPage.loginUser(getCustomProperty("username"),
                getCustomProperty("password"));
       Assert.assertEquals(accountPage.getAccountText(), "My Account");

    }

    @Test(priority = 2, groups = {"smoke"}, description = "Test user is no able to login")
    public void TestNegativeUserLogin()
    {
        loginPage.routeToLoginPage(getCustomProperty("loginPageUrl"));
        loginPage.loginUser(getCustomProperty("incorrectUsername"),
                getCustomProperty("password"));
       String text = loginPage.getIncorrectLoginWarning();
       Assert.assertEquals(text, "Warning: No match for E-Mail Address and/or Password.");
       System.out.println(text);

    }

}
