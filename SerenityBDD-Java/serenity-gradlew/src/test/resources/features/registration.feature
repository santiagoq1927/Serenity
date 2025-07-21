Feature: Registration

  Scenario Outline: Successful registration
    Given A user wants to sign up in application
    When A user sends the required information to sign up
      | <name> | <lastname> | <age> | <email> | <country> |
    #Then the user should have a new account created
    Examples:
      | name     | lastname | age | email              | country  |
      | Santiago | Quijano  | 28  | santiago@gmail.com | Colombia |
      | Goku     | Quijano  | 30  | goku@gmail.com     | Colombia    |

  #Scenario: Missing required field for registration
    #Given A user wants to sign up in application but fail in required information
    #When  A user does not send the required information
    #Then A user should be told all fields are required