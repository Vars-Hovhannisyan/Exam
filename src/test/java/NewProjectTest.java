import org.testng.annotations.Test;

public class NewProjectTest extends TestBase{


    @Test
    public void newProjectTest(){
        NewProjectTestPage newProjectTestPage = new NewProjectTestPage();
        newProjectTestPage.clickNewProjectButton();
    }
}
