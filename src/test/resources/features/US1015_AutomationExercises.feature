Feature: US1015 User tests www.automationexercise.com

  Scenario: SN15 user selects the product and orders the product with the card information.
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click on SignupLogin button
    And Fill all details in Signup and create account
    And Verify ACCOUNT CREATED and click Continue button
    And Verify Logged in as username at top
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    And Verify that ACCOUNT DELETED is visible and click Continue button


