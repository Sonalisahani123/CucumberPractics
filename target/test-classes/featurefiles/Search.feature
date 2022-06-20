Feature: Amazon Search

@smoke
Scenario: Search a product
	Given I have a search field on Amazon Page
	When I search  for a product  with name "Apple MacBook pro" and price 100000
	Then product  with name "Apple MacBook Pro" should be displayed
	