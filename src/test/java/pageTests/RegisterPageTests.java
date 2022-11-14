package pageTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testConfig.BaseTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class RegisterPageTests extends BaseTest {
    public RegisterPageTests() {
        key = "registerPage";
    }

    @Test(priority = 1, groups = {"regression"}, description = "Register a new user and is routed to Account page",
    dataProvider = "getRegisterUserData")
    public void testPositiveRegistrationOfUser(HashMap<String,String> input)
    {
        registerPage.routeToRegisterPage();
       accountPage = registerPage.RegisterUser(input.get("fName"),input.get("lName"),input.get("email"),
                input.get("telephone"), input.get("password"));
       String text = accountPage.getAccountCreatedText();
        Assert.assertEquals(text,"Your Account Has Been Created!");
    }

    @DataProvider
    public Object[][] getRegisterUserData() throws IOException
    {
        List<HashMap<String, String>> data = getjsonData(System.getProperty("user.dir") + "/src/test/java/testData/ecom_login_data.json");
        return new Object[][]
                {
                        {data.get(0)}
                };
    }
}
