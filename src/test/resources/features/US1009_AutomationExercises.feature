Feature: US1009 Kullanici bilgileri ile hesap olusturur

  Scenario: SN9 kullanici automationexercise sitesine login olur
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And wait 2 second
    And Verify all the products related to search are visible

