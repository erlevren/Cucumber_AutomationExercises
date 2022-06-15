Feature: US1007 Kullanici AutomationExercises Sitesini Test Eder

  Scenario: SN7 kullanici test cases sayfasini test eder
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click on Test Cases button
    And Verify user is navigated to test cases page successfully
