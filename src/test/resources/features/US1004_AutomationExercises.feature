Feature: US1004 User tests www.automationexercise.com
  @pr2
  Scenario: SN4 user logs in with the correct e-mail address.
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And wait 1 second
    And Click on SignupLogin button
    And Verify Login to your account is visible
    And wait 1 second
    And Enter correct email address and password
    And wait 1 second
    And Click login button
    And wait 1 second
    And Verify that Logged in as username is visible
    And Click Logout button
    And Verify that user is navigated to login page