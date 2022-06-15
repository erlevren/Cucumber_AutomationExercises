Feature: US1004 Kullanici bilgileri ile hesap olusturur

  Scenario: SN4 kullanici dogru mail adresi ile giris yapar
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