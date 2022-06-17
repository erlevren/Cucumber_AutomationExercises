Feature: US1025 User tests www.automationexercise.com

  Scenario: SN25 user tests scroll down
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Click on arrow at bottom right side to move upward
    And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
