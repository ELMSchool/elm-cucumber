Feature: Shopping Cart 
	Story:
	Verify login function works as expected

	Background:
		Given I am on the login page
		When I login as an admin

Scenario: Add item to cart
    Given the user is on the product page
    When the user adds the item to their cart
    Then the item should be added to the cart

  Scenario: Remove item from cart
    Given the user is on the cart page
    When the user removes the item from their cart
    Then the item should be removed from the cart

  Scenario: Checkout with items in cart
    Given the user has items in their cart
    When the user goes to the checkout page
    Then the user should see their items in the cart
    And the user should be able to complete the checkout process