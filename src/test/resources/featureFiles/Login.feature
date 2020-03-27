@Login
Feature: Log in Page
  As a user I should be able to log in
  So I can buy Products

  @ValidCredentials
  Scenario: Title of your scenario
    Given User is on login page
    When User enters username as "test800@hotmail.com"
    And User enters password as "test123"
    And User clics on sign in button
    Then User should be logged correctly

  @InvalidCredentials
  Scenario: Title of your scenario
    Given User is on login page
    When User enters username as "wrongUsername@test.com"
    And User enters password as "test1234"
    And User clics on sign in button
    Then User should not get logged in

  @NotEnteringCredentials
  Scenario: Title of your scenario
    Given User is on login page
    When User clics on sign in button
    Then User should not get logged in
