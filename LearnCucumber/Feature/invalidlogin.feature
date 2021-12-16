Feature: Verify login

Scenario: Successful login with valid credentials
Given User in on the login page
When user enters email and password
Then User should see a message Successful login

Scenario: Login with invalid credentials
Given user given login page
When user enter invalid email and invalid password 
Then user should see a message error login