package pageTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testConfig.BaseTest;


@Listeners(utils.ListenerHelper.class)

public class HomePageTests extends BaseTest
{
    //PageObjects
    //HomePage homePage;

    public HomePageTests()
    {
        key = "homepage";
    }

    @Test(priority = 1, groups = {"smoke"},
    description = "Test routing to Homepage is working fine")
    public void testURLLoading()
    {
        homePage.loadHomePage();
    }

    @Test(priority = 2,groups = {"regression"},
    description = "Test routing to login page is working from Homepage")
    public void testLoginPageRouting()
    {
        homePage.loadHomePage();
        homePage.goToLoginPage();
    }

}
