Feature: US1026 User tests www.automationexercise.com

  Scenario: SN26 user tests scroll down and up
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And wait 1 second
    And Scroll down to footer
    And wait 1 second
    And Verify text SUBSCRIPTION
    And wait 1 second
    And Scroll up page to top
    And wait 1 second
    And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
