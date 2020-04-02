@CreateAccount
Feature: Create Account Page
As user i should be able to create an Account
So i can interact with the web page

  @UnloggedUser
  Scenario Outline:  Not able to create an account
    Given User is on Home Page
    When User click in Sign in
    When User enters new email as "<username>"
    And User click Create Account
    Then User is not able to create an Account

  Examples:
      |username     |
      |123fdf		|
      
  @ValidUser
  Scenario Outline:  Unlogged User is already on the website 
    Given User is on Home Page
    When User click in Sign in
    When User enters new email as "<username>"
    And User click Create Account
    Then User is not able to create an Account

  Examples:
      |username           |
      |Sancristol34@hotmail.com						|

      
  @Register
  Scenario Outline:  User with no credentials creates an account
    Given User is on Home Page
    When User click in Sign in
    When User enters new email as "<username>"
    And User click Create Account
    When User click on Mr Radio Button
    And User Introduce Firts Name as "<name>"
    And User Introduce Last Name as "<lastName>"
    And User insert a Email as "eduardolopezvs@outlook.com"
    And User write a Password as "derp123"
    And User enter his Address as "Linda Vista , calle florida"
    And User write a city as "Monterrey"
    And select an state on list box
    And User Writes a Zipcode as "66059"
    And User select an state on country box
    And User write a mobile number in Mobile Phone as "81234490"
    And Assign an address on alias for future reference as "this address"
    And click on Register button
    Then Account created Correctly

    Examples:
    |username                           |name|  |lastName|
    |emilianojckjk@gmail.com			|Josefo||estabanato|