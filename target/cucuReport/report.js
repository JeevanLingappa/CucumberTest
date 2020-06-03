$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Search.feature");
formatter.feature({
  "name": "vegetable search and place order on greenKart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of search functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MainTest"
    }
  ]
});
formatter.step({
  "name": "User logged into greenKart home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.user_logged_into_greenkart_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search \"Cucumber\" on search option",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.user_search_something_on_search_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cucumber\" vegetable should be shortlisted",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.something_vegetable_should_be_shortlisted(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of search functionality and placing the order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MainTest"
    }
  ]
});
formatter.step({
  "name": "User logged into greenKart home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.user_logged_into_greenkart_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search \"Brinjal\" on search option",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.user_search_something_on_search_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added \"5\" items to the cart by clicking add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.added_something_items_to_the_cart_by_clicking_add_to_cart_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on ProccedToCheckOut button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.user_clicks_on_proccedtocheckout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to order confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.user_should_navigate_to_order_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product name should contains \"Brinjal\" and Quantity as \"5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.product_name_should_contains_something_and_quantity_as_something(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Place order button should be enabled",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.StepDefinationGK.place_order_button_should_be_enabled()"
});
formatter.result({
  "status": "passed"
});
});