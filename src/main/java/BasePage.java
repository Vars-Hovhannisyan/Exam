import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static setup.DriverSetup.getDriver;

public abstract class BasePage {
    private static final Logger LOGGER = Logger.getLogger(BasePage.class);
    protected WebDriver driver;
    public static String BASE_URL = "https://tree.taiga.io/discover";
    public static String NEW_URL = "https://tree.taiga.io/";
    public static String NEW_PROJECT_URL = "https://tree.taiga.io/project/new";

    public BasePage() {
        this.driver = getDriver();
    }

    public abstract String getUrl();

    public void open(String url) {
        LOGGER.info("Opening url -> " + url);
        driver.get(url);
    }

    public WebElement find(By location) {
        LOGGER.info("Finding element -> " + location.toString());
        return driver.findElement(location);
    }
    public List<WebElement> findAll(By location) {
        LOGGER.info("Finding elements -> " + location.toString());
        return driver.findElements(location);
    }

    public void click(By location) {
        LOGGER.info("Clicking on element -> " + location.toString());
        click(find(location));
    }

    public void type(By location, String text) {
        type(find(location), text);
    }

    public void type(WebElement element, String text) {
        LOGGER.info("Typing " + text +" to field  -> " + element.toString());
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void changeTab(int tabIndex) {
        List<String> windowHandlers = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windowHandlers.get(tabIndex));
    }
}