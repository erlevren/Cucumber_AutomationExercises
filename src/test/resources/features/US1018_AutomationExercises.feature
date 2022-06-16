Feature: US1018 Kullanici AutomationExercises Sitesini Test Eder

  Scenario: SN18 kullanici urun secer ve kart bilgileri ile urun siparis eder
    Given Navigate to url "autoUrl"
    Then Verify that categories are visible on left side bar
    And Click on Women category
    And wait 2 second
    And Click on any category link under Women category, for example: Dress
    And wait 5 second
    And Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    And wait 2 second
    And On left side bar, click on any sub-category link of Men category
    And wait 2 second
    And Verify that user is navigated to that category page