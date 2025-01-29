package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumActions;

import java.util.List;

public class ProductsPage {
    SeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
        PageFactory.initElements(driver,this);

    }

//    @FindBy(xpath = "//h5[@data-qa='product-title' and contains(text(),'Black Faux Leather Bomber Jacket')]/../button[@name='Wishlist']")
//    List<WebElement> wishList;

    @FindBy(xpath = "//h5[@data-qa='product-title' and contains(text(),'Black Faux Leather Bomber Jacket')]")
    WebElement product;

    @FindBy(xpath = "//div[@role='button' and text()='S']")
    WebElement size;

    @FindBy(xpath = "//h1[text()='Black Faux Leather Bomber Jacket']")
    WebElement productText;

    @FindBy(xpath = "//span[contains(@class,'current-price') and text()='£85.00']")
    WebElement productPrice;

    @FindBy(xpath = "//span[text()='Add to bag']")
    WebElement addToBag;

    @FindBy(xpath = "//span[@id='basket-value' and text()='Bag']")
    WebElement bag;
//    By bag=By.xpath("//span[@id='basket-value' and text()='Bag']");

//    @FindBy(xpath = "//p[text()='Black Faux Leather Bomber Jacket']")
//    WebElement addeadItemProductText;
    By addeadItemProductText=By.xpath("//p[text()='Black Faux Leather Bomber Jacket']");

    @FindBy(xpath = "//p[contains(@class,'price--list')]")
    WebElement addeadProductPrice;

    @FindBy(xpath = "//a[@title='VIEW BAG']")
    WebElement viewBagBtn;

//    public void addToWishList(){
//        seleniumActions.clickOnElement(wishList.get(0));
//    }

    public void clickOnProduct(){
        seleniumActions.clickOnElement(product);


    }

    public void selectSize(){
        //seleniumActions.clickOnElement(size);
        seleniumActions.elementNot(size);
    }

    public String getProductText( ){
        return seleniumActions.getTextMessage(productText);
    }

    public String getProductPrice() {
        return  seleniumActions.getTextMessage(productPrice);
    }
    public void addProductToBag1(){
        seleniumActions.clickOnElement(addToBag);
    }

    public void addProductToBag(){
      seleniumActions.elementNot(bag);
    }
    public void clickOnBag(){
        seleniumActions.elementNot(viewBagBtn);
    }
    public String getBagProductTitle(){
        return seleniumActions.elelementNo3(addeadItemProductText);
    }
    public String getBagProductPrice(){
        return seleniumActions.getTextMessage(addeadProductPrice);
    }


}
