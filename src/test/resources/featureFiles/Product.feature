@Product
Feature: Product customization
  As a user I should be able change some characteristics from my product
  So I can have a product as I want it

  @CanCustomize
  Scenario: User can select the quantity, available size and color and then add to cart
    Given User is logged in with username as "test800@hotmail.com" and enters password as "test123"
    And User is on Home Page
    When User clics on any item from the shop
    And User puts the number two on the quantity option
    And User selects medium size
    And User selects a different color
    And User clics on Add to cart button
    Then User should get a success message
