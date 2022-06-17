Feature: US1010 User tests www.automationexercise.com

  Scenario: SN10 user tests the subscription section
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed is visible

