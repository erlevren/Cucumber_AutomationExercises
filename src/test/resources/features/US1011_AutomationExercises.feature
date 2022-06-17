Feature: US1011 User tests www.automationexercise.com

  Scenario: SN11 user tests the card section and the subscription section
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click Cart button
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed is visible

