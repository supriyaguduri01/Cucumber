Feature: Verify Login

Scenario: Successful Login with valid credentials
Given User is on login page
When user enters email and password
Then user should see a message Successful Login.
