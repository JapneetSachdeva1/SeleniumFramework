package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static base.CustomWaits.staticWait;
import static utils.PropertyReaderHelper.getCustomProperty;

// page_url = https://naveenautomationlabs.com/opencart/
public class HomePage
{
     public WebDriver driver;

    //locators
    private final By profileSwitch = By.xpath("//a[@title='My Account']");
    private final By loginBtn = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void loadHomePage()
    {
        System.out.println(getCustomProperty("homePageUrl"));
        driver.get(getCustomProperty("homePageUrl"));
        staticWait(2);
    }

    public LoginPage goToLoginPage()
    {
        driver.findElement(profileSwitch).click();
        driver.findElement(loginBtn).click();
        staticWait(2);
        return new LoginPage(driver);
    }

}
