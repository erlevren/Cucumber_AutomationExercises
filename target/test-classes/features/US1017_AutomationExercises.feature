Feature: US1017 User tests www.automationexercise.com

  Scenario: SN17 user selects a product, adds it to the cart and deletes it from the cart.
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click X button corresponding to particular product
    And wait 1 second
    And Verify that product is removed from the cart