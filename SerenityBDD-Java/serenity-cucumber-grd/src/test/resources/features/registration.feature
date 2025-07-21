Feature: Registration

  Scenario: Successful registration
    Given A user wants to sign up in application
    When the user sends the required information to sign up
    Then the user should have a new account created