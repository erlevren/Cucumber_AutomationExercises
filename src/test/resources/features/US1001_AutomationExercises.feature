Feature: US1001 User tests www.automationexercise.com

    Scenario: user login to automationexercise site
      Given Navigate to url "autoUrl"
      Then Verify that home page is visible successfully
      And wait 1 second
      And Click on SignupLogin button
      And Verify New User Signup is visible
      And wait 1 second
      And Enter name and email address
      And wait 1 second
      And Click Signup button
      And wait 1 second
      And Verify that ENTER ACCOUNT INFORMATION is visible
      And Fill details: Title, Name, Email, Password, Date of birth
      And wait 2 second
      And Select checkbox Sign up for our newsletter
      And wait 1 second
      And Select checkbox Receive special offers from our partners
      And wait 1 second
      And Click Create Account button
      And wait 1 second
      And Verify that ACCOUNT CREATED is visible
      And wait 1 second
      And Click Continue button
      And wait 1 second
      And Verify that Logged in as username is visible
      And wait 1 second
      And Click Delete Account button
      And wait 1 second
      And Verify that ACCOUNT DELETED is visible and click Continue button
      And wait 1 second