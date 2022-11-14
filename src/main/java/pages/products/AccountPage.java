package pages.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage
{
    public WebDriver driver;

    public AccountPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //locators
    private final By accountText = By.xpath("//div[@id='content']//h2[contains(text(),'Account')]");
    private final By accountCreatedText = By.xpath("//div[@id='content']//h1");

    public String getAccountText()
    {
        return driver.findElement(accountText).getText();
    }

    public String getAccountCreatedText()
    {
        return driver.findElement(accountCreatedText).getText();
    }

}
