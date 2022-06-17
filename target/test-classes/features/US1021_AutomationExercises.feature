Feature: US1021 User tests www.automationexercise.com

  Scenario: SN21 user tests that the products have been added to the cart
    Given Navigate to url "autoUrl"
    Then Verify that categories are visible on left side bar
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Click on View Product button
    And Verify Write Your Review is visible
    And Enter name, email and review
    And Click Review Submit button
    And Verify success message Thank you for your review.