Feature: US1023 User tests www.automationexercise.com

  Scenario: SN23 user tests delivery address and billing address
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
    And Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    And Click Delete Account button
    And Verify that ACCOUNT DELETED is visible and click Continue button
