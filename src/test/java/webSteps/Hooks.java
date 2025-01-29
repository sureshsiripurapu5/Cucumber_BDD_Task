package webSteps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

import static factory.WebDriverFactory.*;

public class Hooks {
    public static WebDriver driver;
    @BeforeAll
    public static void initializingReportDrivers(){
        initializeDriver();
    }

    @Before
    public static void launchApplication() throws InterruptedException {
        openApp();
    }
    @AfterAll
    public static void killSession(){
        killWebDriver();
    }
}
