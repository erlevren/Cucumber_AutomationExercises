Feature: US1005 Kullanici AutomationExercises Sitesini Test Eder

  Scenario: SN5 kullanici kayitli olan email adresi ile kayit olamamayi test eder
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And wait 1 second
    And Click on SignupLogin button
    And Verify New User Signup is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist is visible
