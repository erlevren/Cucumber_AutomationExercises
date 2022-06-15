Feature: US1003 Kullanici bilgileri ile hesap olusturur

  Scenario: SN3 kullanici yanlis mail ve password ile giris yapilamadigini test eder
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And wait 1 second
    And Click on SignupLogin button
    And Verify Login to your account is visible
    And wait 1 second
    And Enter incorrect email address and password
    And wait 1 second
    And Click login button
    And wait 1 second
    And Verify error Your email or password is incorrect is visible