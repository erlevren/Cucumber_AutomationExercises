Feature: US1007 User tests www.automationexercise.com

  Scenario: SN7 user tests test cases page
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click on Test Cases button
    And Verify user is navigated to test cases page successfully
