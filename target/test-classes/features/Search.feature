Feature: vegetable search and place order on greenKart

@CucuSmokeTest
Scenario: Validation of search functionality
Given User logged into greenKart home page
When User search "Cucumber" on search option 
Then "Cucumber" vegetable should be shortlisted

@CucuParameterTest
Scenario: Validation of search functionality and placing the order
Given User logged into greenKart home page
When User search "Brinjal" on search option 
And Added "5" items to the cart by clicking add to cart button
And User clicks on ProccedToCheckOut button
Then User should navigate to order confirmation page
And product name should contains "Brinjal" and Quantity as "5"
And Place order button should be enabled