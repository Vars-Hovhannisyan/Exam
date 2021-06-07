import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {


//    @FindBy(css ="[translate='LOGIN_COMMON.ACTION_SIGN_IN']")
//    private WebElement = loginButtonLocation;
//
//    @FindBy(css ="[class='user-avatar']")
//    private WebElement = logoLocation;

    private final By usernameFieldLocation = By.name("username");
    private final By passwordFieldLocation = By.name("password");
    private final By loginButtonLocation = By.cssSelector("[translate='LOGIN_COMMON.ACTION_SIGN_IN']");
    private final By signUpButtonLocation = By.cssSelector("[translate='REGISTER_FORM.ACTION_SIGN_UP']");
    private final By avatarLocation = By.cssSelector("[class='user-avatar']");


    public void clickLoginButton() {
        click(loginButtonLocation);
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usernameFieldLocation));
    }

    public void clickSignUpButton() {
        click(signUpButtonLocation);
    }

    public boolean isUserLoggedIn() {
        WebElement avatarIcon = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated((avatarLocation)));
        return avatarIcon.isDisplayed();
    }

    @Override
    public String getUrl() {
        return BASE_URL;
    }

    public LoginPage() {
        open("https://tree.taiga.io/discover");
    }

    public void typeUsername(String username) {
        type(usernameFieldLocation, username);
    }

    public void typePassword(String password) {
        type(passwordFieldLocation, password);
    }
}