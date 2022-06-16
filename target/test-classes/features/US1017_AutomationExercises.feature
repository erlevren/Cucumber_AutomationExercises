Feature: US1017 Kullanici AutomationExercises Sitesini Test Eder

  Scenario: SN17 kullanici urun secip sepete ekler ve sepetten siler
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click X button corresponding to particular product
    And wait 1 second
    And Verify that product is removed from the cart