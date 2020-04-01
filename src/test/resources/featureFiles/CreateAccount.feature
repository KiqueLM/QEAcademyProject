
@CreateAccount
Feature: Create Account Page
as user i should be able to create an Account
so i can interact with the web page

  @UnloggedUser
  Scenario: Unlogged User is already on the website 
    Given User is on Home Page
    When User click in Sign in
    When User enters new email as "xxx@xx.com"
    And User click Create Account
    Then User is not able to create an Account

  