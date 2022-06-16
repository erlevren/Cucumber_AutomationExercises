Feature: US1016 Kullanici AutomationExercises Sitesini Test Eder

  Scenario: SN16 kullanici urun secer ve kart bilgileri ile urun siparis eder
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
   And Click X button corresponding to particular product
   And Verify that product is removed from the cart