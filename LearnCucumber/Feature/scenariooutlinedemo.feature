Feature: Check login with multiple data

Scenario Outline: Successful signin with valid entries
Given User navigatesto the website demowebshoptricentis
When user logs in with <email> and <password>
Then user should see logout link

Examples: 
|email								|password|
|priyag15@gmail.com		|priyag15|
|priyag22@gmail.com		|priyag22|