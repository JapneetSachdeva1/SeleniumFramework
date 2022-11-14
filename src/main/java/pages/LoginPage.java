package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.products.AccountPage;

import static base.CustomWaits.staticWait;

// page_url = https://naveenautomationlabs.com/opencart/index.php?route=account/login
public class LoginPage
{
    protected WebDriver driver;

    //locators
    private final By emailId = By.xpath("//*[@id='input-email']");
    private final By password = By.xpath("//*[@id='input-password']");
    private final By loginBtn = By.xpath("//input[@type='submit']");
    private final By incorrectLoginWarning = By.xpath("//div[contains(text(),' Warning: No match for E-Mail Address and/or Password.')]");
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void routeToLoginPage(String url)
    {
        driver.get(url);
    }
    public void setEmailId(String email)
    {
        driver.findElement(emailId).sendKeys(email);
    }

    public void setPassword(String pswd)
    {
        driver.findElement(password).sendKeys(pswd);
    }

    public void setLoginBtn()
    {
        driver.findElement(loginBtn).click();
    }

    public AccountPage loginUser(String email, String pswd)
    {
        setEmailId(email);
        staticWait(1);
        setPassword(pswd);
        staticWait(1);
        setLoginBtn();
        staticWait(2);

        return new AccountPage(driver);
    }

    public String getIncorrectLoginWarning()
    {
       return driver.findElement(incorrectLoginWarning).getText();
    }

}
