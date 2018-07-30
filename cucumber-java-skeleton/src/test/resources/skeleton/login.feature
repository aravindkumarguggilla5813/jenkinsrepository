Feature: Login Feature
Scenario: Valid User

Given The url of application
When  user enters mercury as username
And user enter mercury as password
And user click on submit
Then user is valid 
