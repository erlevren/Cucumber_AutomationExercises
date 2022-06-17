Feature: US1012 User tests www.automationexercise.com

  Scenario: SN12 user tests the card section and its contents
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click on Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices quantity and total price

