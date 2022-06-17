Feature: US1009 User tests www.automationexercise.com

  Scenario: SN9 user tests product page
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And wait 2 second
    And Verify all the products related to search are visible

