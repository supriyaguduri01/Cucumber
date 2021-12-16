Feature: Check title

Background: driver installed
Given I am on home page of demo webshop

Scenario: Verify title of demowebshop
Then I should see title contains shop

Scenario: Verify source of demowebshop
Then I should see that source contains shop