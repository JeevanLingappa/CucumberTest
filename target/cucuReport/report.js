$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Feature02.feature");
formatter.feature({
  "name": "Validation of selenium practice website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test01_validation of simple demo form Two input field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on simple demo form homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.StepDefine01.user_is_on_simple_demo_form_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a value of \"10\" and \"30\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.StepDefine01.user_enters_a_value_of_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Get_Total button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.StepDefine01.click_on_Get_Total_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the sum of \"10\" and \"30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.StepDefine01.user_should_see_the_sum_of_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test02_validation of simple demo form Two input field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on simple demo form homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.StepDefine01.user_is_on_simple_demo_form_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a value of \"20\" and \"40\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.StepDefine01.user_enters_a_value_of_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Get_Total button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.StepDefine01.click_on_Get_Total_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the sum of \"20\" and \"40\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.StepDefine01.user_should_see_the_sum_of_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});