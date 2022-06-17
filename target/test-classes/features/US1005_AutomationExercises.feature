Feature: US1005 User tests www.automationexercise.com

  Scenario: SN5 user tests not being able to register with the registered email address.
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And wait 1 second
    And Click on SignupLogin button
    And Verify New User Signup is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist is visible
