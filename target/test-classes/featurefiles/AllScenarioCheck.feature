Feature: Check all the functionality of Cucumber

Background:
Given user is on facebook page

@smoke
Scenario: check facebook login functionality
 When user enter username
 And user enter password
 Then click on login button

@smoke
Scenario Outline: Login Fail possible combinations
  When user enter username as "<username>"
  And user enter password as "<password>"
  Then click on login button
  But the login failed
  
  Examples:
    |username|password|
    |sonali|sonu1234|
    |mama|mama1234|
    |soma|soma1234|
    
    
  @smoke  
Scenario: Data table asList:Check the   new user registration successfull after giving the correct details 
  User Register with different data
Given User is on registration page
When User enters following detials
 |sonali|sahani|sonali@gmail.com|755016|Odisha|
 |Mamuni|Dash|mamuni.dash@gmail.com|755018|kolkata|
 Then User registration should be successfull

  @smoke 
Scenario: Datat table asMap: User Registration with different data with columns
 Given User is on registration page
 When User enters following detials with columns
 
 |firstname|lastname|email|phone|city|
 |sonali|sahani|sonali@gmail.com|755016|Odisha|
 |Mamuni|Dash|mamuni.dash@gmail.com|755018|kolkata|
 Then User registration should be successfull 
    
    