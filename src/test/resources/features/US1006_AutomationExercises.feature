Feature: US1006 Kullanici bilgileri ile hesap olusturur

  Scenario: SN6 kullanici automationexercise sitesine login olur
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    And Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And Enter name email subject and message
    And Upload file
    And wait 3 second
    And Click Submit button
    And wait 3 second
    And Click OK button
    And Verify success message Success Your details have been submitted successfully is visible
    And Click Home button and verify that landed to home page successfully
