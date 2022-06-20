Feature: Login Feature

Scenario Outline: Login fail-possible combinations
Given user is on application landing page
When users click on Sign in button
Then user is displayed login screen
When user enters "<UserName>" in username field
And user enters "<Password>" in password  field
And user clicks sign in button
Then user get login failed error message

     Examples:
     | UserName |Password |
     | sonali |12345 |
     | incorrectusername |incorrectPassword |
     | sahani |78987 |
     
     

