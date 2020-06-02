Feature: Validation of selenium practice website

@SmokeTest
Scenario: Test01_validation of simple demo form Two input field
Given user is on simple demo form homepage 
When user enters a value of "10" and "30"
And click on Get_Total button
Then user should see the sum of "10" and "30"

@SmokeTest
Scenario: Test02_validation of simple demo form Two input field
Given user is on simple demo form homepage 
When user enters a value of "20" and "40"
And click on Get_Total button
Then user should see the sum of "20" and "40"