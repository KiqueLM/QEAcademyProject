@Purchase
Feature: Shoping
  As a user logged in the web
  I should be able to add a product on the cart
  So I can pay for them

  @HappyPath
  Scenario: Purchasing a short
    Given User is logged in with username as "test800@hotmail.com" and enters password as "test123"
    When User clics on the WOMEN tab
    And User adds the first item that appears in that section
    And User clics on the Proceed to checkout button in the frame
    And User clics on the Proceed to checkout button
    And User clics on the Proceed to checkout button
    And User clics on the checkmark button
    And User clics on the Proceed to checkout button
    And User selects Pay by check
    And User clics on the I confirm my order button
    Then User should get a message with the approval