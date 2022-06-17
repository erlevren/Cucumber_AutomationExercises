Feature: US1022 User tests www.automationexercise.com

  Scenario: SN22 user tests RECOMMENDED ITEMS are visible
    Given Navigate to url "autoUrl"
    Then Scroll to bottom of page
    And Verify RECOMMENDED ITEMS are visible
    And Click on Add To Cart on Recommended product
    And Click on View Cart button
    And Verify that product is displayed in cart page