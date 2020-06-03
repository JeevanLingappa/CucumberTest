$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/SearchAndOrder.feature");
formatter.feature({
  "name": "Multiple vegetable search and place order on greenKart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validation of search functionality and placing multiple Vegetable order",
  "description": "",
  "keyword": "Scenario Outline",
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
formatter.step({
  "name": "User search \u003cvegName\u003e on search option",
  "keyword": "When "
});
formatter.step({
  "name": "Added \u003cquantity\u003e items to the cart by clicking add to cart button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on ProccedToCheckOut button",
  "keyword": "And "
});
formatter.step({
  "name": "User should navigate to order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "name": "product name should contains \u003cvegName\u003e and Quantity as \u003cquantity\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Place order button should be enabled",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "vegName",
        "quantity"
      ]
    },
    {
      "cells": [
        "Brinjal",
        "3"
      ]
    },
    {
      "cells": [
        "Beetroot",
        "5"
      ]
    },
    {
      "cells": [
        "Cucumber",
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of search functionality and placing multiple Vegetable order",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User search Brinjal on search option",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.user_search_on_search_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added 3 items to the cart by clicking add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.added_items_to_the_cart_by_clicking_add_to_cart_button(java.lang.String)"
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
  "name": "product name should contains Brinjal and Quantity as 3",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.product_name_should_contains_and_quantity_as(java.lang.String,java.lang.String)"
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of search functionality and placing multiple Vegetable order",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User search Beetroot on search option",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.user_search_on_search_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added 5 items to the cart by clicking add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.added_items_to_the_cart_by_clicking_add_to_cart_button(java.lang.String)"
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
  "name": "product name should contains Beetroot and Quantity as 5",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.product_name_should_contains_and_quantity_as(java.lang.String,java.lang.String)"
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
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of search functionality and placing multiple Vegetable order",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User search Cucumber on search option",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.user_search_on_search_option(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added 2 items to the cart by clicking add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.added_items_to_the_cart_by_clicking_add_to_cart_button(java.lang.String)"
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
  "name": "product name should contains Cucumber and Quantity as 2",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.MultipleOrderStepDefination.product_name_should_contains_and_quantity_as(java.lang.String,java.lang.String)"
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
formatter.after({
  "status": "passed"
});
});