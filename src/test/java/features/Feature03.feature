Feature: Validation of selenium practice website using data parameterisation

Background:
Given Validate the browser
When Browser is triggered
Then check browser is loaded


@RegTest
Scenario Outline: validation of simple demo form Two input field
Given user is on simple demo form homepage to validate data parameterisation
When user enters value <first> and <second>
And clicks on GetTotal button 
Then user should see the totalSum

Examples:
|first |second |
|10    |15     |

@RegTest
Scenario: validation of simple demo form Two input field with dataTable
Given user is on simple demo form homepage to validate data parameterisation
When user enters below value 
|10|20|
|20|20|
And clicks on GetTotal button 
Then user should see the totalSum

