package testConfig;

import base.SetupDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.products.AccountPage;
import pages.products.DesktopPage;
import pages.products.LaptopPage;

public class BaseTest extends SetupDriver
{
    //PageObjects
   public HomePage homePage;
   protected LoginPage loginPage;
   protected RegisterPage registerPage;
   protected DesktopPage desktopPage;
   protected LaptopPage laptopPage;
   protected AccountPage accountPage;

   //Key for pageObject initialization
    protected String key;

    public BaseTest()
    {
        browserTypeKey = "chrome";
    }
    @BeforeMethod(alwaysRun = true)
    public void setup()
    {
        setupDriver();
        if(key.equalsIgnoreCase("homepage"))
        {
            homePage = new HomePage(driver);
        } else if(key.equalsIgnoreCase("loginpage"))
        {
            loginPage = new LoginPage(driver);
        } else if(key.equalsIgnoreCase("registerpage"))
        {
            registerPage = new RegisterPage(driver);
        } else if(key.equalsIgnoreCase("desktoppage"))
        {
            desktopPage = new DesktopPage(driver);
        } else if(key.equalsIgnoreCase("laptoppage"))
        {
            laptopPage = new LaptopPage(driver);
        } else if (key.equalsIgnoreCase("accountpage"))
        {
            accountPage = new AccountPage(driver);
        } else {
            System.out.println("Page not yet defined!!");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        quitDriver();
    }

}
