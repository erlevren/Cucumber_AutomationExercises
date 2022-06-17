Feature: US1020 User tests www.automationexercise.com

  Scenario: SN20 user tests that the products have been added to the cart
    Given Navigate to url "autoUrl"
    Then Verify that categories are visible on left side bar
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And wait 3 second
    And Verify all the products related to search are visible
    And wait 5 second
    And Add those products to cart
    And Click Cart button and verify that products are visible in cart
    And Click Signup  Login button and submit login details
    And Again, go to Cart page
    And Verify that those products are visible in cart after login as well