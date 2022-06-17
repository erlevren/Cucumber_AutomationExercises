Feature: US1002 User tests www.automationexercise.com

  Scenario: SN2 user logs in to the automationexercise site and deletes the account.
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
    And wait 1 second
    And Click Delete Account button
    And wait 1 second
    And Verify that ACCOUNT DELETED is visible and click Continue button
