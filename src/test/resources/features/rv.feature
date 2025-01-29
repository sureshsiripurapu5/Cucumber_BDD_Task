Feature: Add product to cart and wishlist

  Scenario: Verify that the user is able to select a product and add it to the cart
    Given the user is on the Home Page
    When the user selects a category from the menu
    And the user selects a product from the products page
    Then the user verifies the product name and product title
    And the user selects the product size
    And the user clicks on the Add to bag button
    And the user click on the Bag and clicks view bag
    Then the user verifies the product name and price
