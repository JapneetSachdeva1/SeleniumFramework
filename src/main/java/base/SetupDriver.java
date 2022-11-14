package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupDriver extends Commons
{
    public WebDriver driver;
    public String browserTypeKey;
    //TODO: Will help to trigger browser depending upon user selection
    public void setupDriver()
    {
        if(browserTypeKey.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        } else if (browserTypeKey.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        } else if (browserTypeKey.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        } else
        {
            System.out.println("Driver not supported!!!");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void quitDriver()
    {
        driver.quit();
    }
}
