import org.openqa.selenium.By;

public class NewProjectTestPage extends BasePage{

    private final By newProjectButton = By.cssSelector("[class='btn-small create-project-button']");

    public void clickNewProjectButton() {
        click(newProjectButton);
    }

    @Override
    public String getUrl() {
        return NEW_PROJECT_URL;
    }
}
