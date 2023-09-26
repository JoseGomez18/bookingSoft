Feature: Register
  I as user, I need to register me

  Scenario Outline: Succesful register
    Given he user enter to the web page
    And he user clicks on the 'hazte una cuenta' button
    When he user enter his data
      | email   | password   |
      | <email> | <password> |
    Then he user could see his succeful register

    Examples:
      | email                  | password      |
      | Josefergo987@gmail.com | Joselito23-2  |
      | josefergio89@gmail.com | Joselito6739- |

    Scenario: Failed register
      Given he user enter to the web page
