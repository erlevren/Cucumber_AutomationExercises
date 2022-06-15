Feature: US1005 Kullanici bilgileri ile hesap olusturur

  Scenario: SN5 kullanici automationexercise sitesine login olur
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And wait 1 second
    And Click on SignupLogin button
    And Verify New User Signup is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist is visible
