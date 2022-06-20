@All
Feature: Uber booking feature

@smoke
Scenario: Booking the Sedan Cab
Given User select the car type "Sedan" from uber app
When User wants to travel from "Bangalore" to "Pune"
Then Driver starts the journey
And Driver end the journey
Then User pays 1000 USD

@Regression
Scenario: Booking the USV  Cab
Given User select the car type "USV" from uber app
When User wants to travel from "Bangalore" to "odisha"
Then Driver starts the journey
And Driver end the journey
Then User pays 10000 USD

@prod
Scenario: Booking the  mini Cab
Given User select the car type "MIni" from uber app
When User wants to travel from "Bangalore" to "Hyderabad"
Then Driver starts the journey
And Driver end the journey
Then User pays 1000 USD