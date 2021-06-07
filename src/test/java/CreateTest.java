import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CreateTest extends TestBase{

    @Test
    public void myTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickLoginButton();
        loginPage.typeUsername("testdirect9@gmail.com");
        loginPage.typePassword("ExamTest");
        loginPage.clickSignUpButton();
        assertTrue(loginPage.isUserLoggedIn(), "User eas not logged in!");
    }



}
