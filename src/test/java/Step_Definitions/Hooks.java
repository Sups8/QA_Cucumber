package Step_Definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void startWebDriver()
    {
        System.out.println("Opening the Browser");

        driver = new ChromeDriver();

        driver.manage().deleteAllCookies();

        driver.manage().window().maximize();

    }

    @After
    public void TearDownTest()
    {
        System.out.println("Closing the browser");

        driver.quit();
    }
}
