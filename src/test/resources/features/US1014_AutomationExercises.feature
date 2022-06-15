Feature: US1014 Kullanici AutomationExercises Sitesini Test Eder

  Scenario: SN14 kullanici anasayfada random urun secer ve yeni bir hesap olusturur
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Click Register Login button
    And Fill all details in Signup and create account
    And Verify ACCOUNT CREATED and click Continue button
    And Verify Logged in as username at top
    And Click Cart button

