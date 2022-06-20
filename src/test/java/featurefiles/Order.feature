@All
Feature: Amazon Order Page
In order to check my order details 
As a register user 
I want to specify  the features of order details page

Background:
Given a registered user exists
Given user is on Amazon login page
When user enters username
And user enters password
And user clicks on login button
Then user navigates to order page

Scenario: Check Previous Order Details
When user clicks on Order link
Then user checks the previous order details


Scenario: Check Open Order Details
When user clicks on Open orders link
Then user checks the Open order details


Scenario: Check Cancelled  Order Details
When users click on cancelled orders link
Then user checks the cancelled order details

