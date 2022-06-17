Feature: US1013 User tests www.automationexercise.com

  Scenario: SN13 User chooses random product on homepage
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click View Product for any product on home page
    And Verify product detail is opened
    And Increase quantity to four
    And Click Add to cart button
    And Click View Cart button
    And Verify that product is displayed in cart page with exact quantity

