package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumActions;

public class WishList {

    SeleniumActions seleniumActions;
    public WishList(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(@class,'ui-body-text')]/div/p")
    WebElement wishListProductTitle;

    @FindBy(xpath = "//div[@class='product-price']/span")
    WebElement wishListProductPrice;

    @FindBy(xpath = "//select[@name='SizeKey']")
    WebElement selectSize;

    //value="17060" option value

    @FindBy(xpath = "//button[text()='Move to bag']")
    WebElement moveToBag;

}
