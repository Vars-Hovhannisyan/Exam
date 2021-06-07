import com.google.gson.JsonObject;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static setup.DriverSetup.getDriver;

public class TestBase {
    private String key;

    @BeforeMethod
    public void setup() throws IOException {
       // JsonObject user = ApiHelper.createUser();
       // key = user.get("response").getAsJsonObject().get("key").getAsString();
        LoginPage loginPage = new LoginPage();

        Cookie cookie = new Cookie("user_key", key);
        getDriver().manage().addCookie(cookie);
        getDriver().navigate().refresh();

    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}