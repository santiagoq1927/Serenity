Feature: Add transaction

  Scenario: Add new transaction
    Given A user is logged in application
      | user | pass  |
    When  A user enter the required information for de new transaction
      | 10/02/2025 | 500     |
    Then  A user should see a new transaction with correct details in the page
