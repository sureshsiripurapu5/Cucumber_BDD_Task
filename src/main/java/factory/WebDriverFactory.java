package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverFactory {

    public static WebDriver driver;
    public static void initializeDriver(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    public static void openApp() throws InterruptedException {
        driver.get("https://www.riverisland.com/men");

    }

    public static void killWebDriver(){
        driver.quit();
    }
}
