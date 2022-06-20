@All
Feature: User Registration

Scenario: User Register with different data
Given User is on registration page
When User enters following detials
 |sonali|sahani|sonali@gmail.com|755016|Odisha|
 |Mamuni|Dash|mamuni.dash@gmail.com|755018|kolkata|

 Then User registration should be successfull
 
 Scenario: User Registration with different data with columns
 Given User is on registration page
 When User enters following detials with columns
 |firstname|lastname|email|phone|city|
 |sonali|sahani|sonali@gmail.com|755016|Odisha|
 |Mamuni|Dash|mamuni.dash@gmail.com|755018|kolkata|
 Then User registration should be successfull