package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumActions {

    WebDriver driver;

    public SeleniumActions(WebDriver driver) {
        this.driver=driver;
    }



    public void enterValue(WebElement element, String data){
        element.sendKeys(data);
    }

    public void enterValue(By by, String data){
        driver.findElement(by).sendKeys(data);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public String getTextMessage(WebElement element){
        return element.getText();
    }

    public String getTextMessage(By by){
        return driver.findElement(by).getText();
    }
    public String getTextMessage(List<WebElement> elements){
        return elements.get(0).getText();
    }

    public void selectByValue1(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    public void moveToElement(WebElement source,WebElement target){
        Actions actions=new Actions(driver);
        actions.moveToElement(source).moveToElement(target).click().perform();
    }

    public void clickOnElementUsingJs(WebElement element){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public void clickOnElementUsingJs1(WebElement element){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",element);
    }
    public void clickOnElementUsingJs2(By by){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",by);
    }

    public void elementNot(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement element1=wait.until(ExpectedConditions.elementToBeClickable(element));
        element1.click();
    }

    public void elementNot1(By by){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element1.click();

    }

    public void elementNo2(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("element"))).click();

    }

    public String elelementNo3(By by){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
        WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
       return element1.getText();

    }


}
