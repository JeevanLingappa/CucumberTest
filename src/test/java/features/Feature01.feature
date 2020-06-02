Feature: Validation of selenium practice website

Scenario: validation of simple demo form title
Given user logged in to practice website 
And click on startPractising buttton
When user clicks on simple_form_demo tab
Then user should navigate to base demo form
And Page title should be validated 

Scenario: validation of simple demo form Single input field
Given user is on simple demo form page 
When user enters  a message on Enter Message test box 
And click on show message button 
Then user should see the entered message 

Scenario: validation of simple demo form Two input field
Given user is on simple demo form page 
When user enters a value of a
And value of b
And click on get total button
Then user should see the sum of a and b 