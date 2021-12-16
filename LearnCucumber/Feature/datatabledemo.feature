Feature: Datatable demo

Scenario: Successful Login with valid entries
Given User is on demowebshop tricentis page
When user signs in with email and password
|priyag15@gmail.com|priyag15|
Then user should seelogout
