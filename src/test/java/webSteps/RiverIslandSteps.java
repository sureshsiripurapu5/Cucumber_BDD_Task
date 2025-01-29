package webSteps;

import factory.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;

public class RiverIslandSteps extends WebDriverFactory {
    HomePage homePage;
    ProductsPage productsPage;
    CartPage cartPage;

    @Given("the user is on the Home Page")
    public void the_user_is_on_the_home_page() {

    }

    @When("the user selects a category from the menu")
    public void theUserSelectsACategoryFromTheMenu() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.acceptCookie();
        homePage.move();
        homePage.move1();
    }

    @And("the user selects a product from the products page")
    public void theUserSelectsAProductFromTheProductsPage() throws InterruptedException {
      productsPage=new ProductsPage(driver);
      productsPage.clickOnProduct();
    }

    @Then("the user verifies the product name and product title")
    public void theUserVerifiesTheProductNameAndProductTitle() {
       String v1= productsPage.getProductText();
        System.out.println(v1);
        String v2=productsPage.getProductPrice();
        System.out.println(v2);
    }

    @When("the user selects the product size")
    public void theUserSelectsTheProductSize() {
        productsPage.selectSize();
    }

    @And("the user clicks on the Add to bag button")
    public void theUserClicksOnTheAddToBagButton() {
        productsPage.addProductToBag1();
    }
    @And("the user click on the Bag and clicks view bag")
    public void theUserClickOnTheBagAndClicksViewBag() {
       productsPage.clickOnBag();
    }

    @Then("the user verifies the product name and price in the bag")
    public void theUserVerifiesTheProductNameAndPriceInTheBag() {
        productsPage.addProductToBag();
        String v3=productsPage.getBagProductTitle();
        String v4=productsPage.getBagProductPrice();
        System.out.println(v3);
        System.out.println(v4);
        cartPage=new CartPage(driver);
        String cartProductTitle=cartPage.getCartProductTitle();
        String cartProductPrice=cartPage.getCartProductPrice();
        System.out.println(cartProductTitle);
        System.out.println(cartProductPrice);



    }


    @Then("the user verifies the product name and price")
    public void theUserVerifiesTheProductNameAndPrice() {
    }
}
