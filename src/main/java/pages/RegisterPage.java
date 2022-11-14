package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.products.AccountPage;

import static base.CustomWaits.staticWait;

// page_url = https://naveenautomationlabs.com/opencart/index.php?route=account/register
public class RegisterPage
{
    WebDriver driver;

    //locators
    private final By firstName = By.xpath("//*[@id='input-firstname']");
    private final By lastName = By.xpath("//*[@id='input-lastname']");
    private final By email = By.xpath("//*[@id='input-email']");
    private final By telephone = By.xpath("//*[@id='input-telephone']");
    private final By password = By.xpath("//*[@id='input-password']");
    private final By confirmPswd = By.xpath("//*[@id='input-confirm']");
    private final By agreePrivacyPolicy = By.xpath("//input[@name='agree']");

    private final By continueBtn = By.xpath("//input[@type='submit']");
    private final String page_url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void routeToRegisterPage()
    {
        driver.get(page_url);
        staticWait(2);
    }

    public void setFirstName(String fName)
    {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void setLastName(String lName)
    {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void setEmail(String Email)
    {
        driver.findElement(email).sendKeys(Email);
    }

    public void setTelephone(String number)
    {
        driver.findElement(telephone).sendKeys(number);
    }

    public void setPassword(String pswd)
    {
        driver.findElement(password).sendKeys(pswd);
    }

    public void setConfirmPswd(String cPswd)
    {
        driver.findElement(confirmPswd).sendKeys(cPswd);
    }

    public void setAgreePrivacyPolicy()
    {
        driver.findElement(agreePrivacyPolicy).click();
    }

    public void setContinueBtn()
    {
        driver.findElement(continueBtn).click();
    }

    public AccountPage RegisterUser(String fName, String lName, String Email, String number,
                                    String pswd)
    {
        setFirstName(fName);
        staticWait(1);
        setLastName(lName);
        staticWait(1);
        setEmail(Email);
        staticWait(1);
        setTelephone(number);
        staticWait(1);
        setPassword(pswd);
        staticWait(1);
        setConfirmPswd(pswd);
        staticWait(1);
        setAgreePrivacyPolicy();
        staticWait(1);
        setContinueBtn();
        staticWait(10);
        return new AccountPage(driver);
    }

}
