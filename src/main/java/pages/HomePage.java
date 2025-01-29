package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumActions;

public class HomePage {

    SeleniumActions seleniumActions;

    public HomePage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
        PageFactory.initElements(driver,this);

    }

//    @FindBy(xpath = "//span[text()='men']")
//    WebElement men;
    By men=By.xpath("//span[text()='men']");

//    @FindBy(xpath = "//a[normalize-space()='All Menswear']")
//    WebElement allMenClothing;

    By allMenClothing=By.xpath("//a[normalize-space()='All Menswear']");

//    @FindBy(xpath = "//button[text()='Accept all and continue']")
//    WebElement cookie;

    By cookie=By.xpath("//button[text()='Accept all and continue']");

    public void acceptCookie(){
        seleniumActions.elementNot1(cookie);
    }

//    public void searchingCategoryByMouseAction(){
//        seleniumActions.moveToElement(men,allMenClothing);
//    }
    public void move(){
        seleniumActions.elementNot1(men);
    }
    public void move1(){
        seleniumActions.elementNot1(allMenClothing);
    }


}
