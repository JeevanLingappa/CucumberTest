Feature: Multiple vegetable search and place order on greenKart

@MainTest
Scenario Outline: Validation of search functionality and placing multiple Vegetable order
Given User logged into greenKart home page
When User search <vegName> on search option 
And Added <quantity> items to the cart by clicking add to cart button
And User clicks on ProccedToCheckOut button
Then User should navigate to order confirmation page
And product name should contains <vegName> and Quantity as <quantity>
And Place order button should be enabled

Examples:
|vegName	|quantity	|
|Brinjal	|3			|
|Beetroot	|5			|
|Cucumber	|2			|