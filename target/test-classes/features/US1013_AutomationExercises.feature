Feature: US1013 Kullanici AutomationExercises Sitesini Test Eder

  Scenario: SN13 kullanici anasayfada random urun secer
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click View Product for any product on home page
    And Verify product detail is opened
    And Increase quantity to four
    And Click Add to cart button
    And Click View Cart button
    And Verify that product is displayed in cart page with exact quantity

