import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver wd;
    @BeforeClass
    public void preCondition(){
        wd = new ChromeDriver();
        wd.get("");

    }
    @Test
    public void loginSuccess(){
        


    }
    @Test
    public void loginWrongEmail(){


    }
    @Test
    public void loginWrongPassword(){


    }

    @AfterClass
    public void postCondition(){
wd.close();

    }

}
