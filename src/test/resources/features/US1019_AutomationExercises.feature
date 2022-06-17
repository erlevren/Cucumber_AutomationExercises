Feature: US1019 User tests www.automationexercise.com

  Scenario: SN19 user chooses from the product category section.
    Given Navigate to url "autoUrl"
    Then Verify that categories are visible on left side bar
    And Click on Products button
    And Verify that Brands are visible on left side bar
    And wait 5 second
    And Click on any brand name
    And wait 2 second
    And Verify that user is navigated to brand page and brand products are displayed
    And wait 5 second
    And On left side bar, click on any other brand link
    And Verify that user is navigated to that brand page and can see products