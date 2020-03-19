$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/ui/automation/features/Testfeature.feature");
formatter.feature({
  "name": "Validate the new price information after applying the promocode if not applied before",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the price of selected item in the cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the application URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.launch_the_application_URL()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.ui.automation.testBase.TestBase.initialisation(TestBase.java:32)\r\n\tat com.ui.automation.stepdefinition.Stepdefinition.launch_the_application_URL(Stepdefinition.java:15)\r\n\tat ✽.Launch the application URL(file:///C:/Users/aishwarya.tripathy/workspace/HackathonTeamB/./src/test/java/com/ui/automation/features/Testfeature.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Mouse over for selecting All Categories link",
  "keyword": "When "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.mouse_over_for_selecting_All_Categories_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Offers link",
  "keyword": "And "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.select_Offers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Health and Safety",
  "keyword": "And "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.select_Health_and_Safety()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clicking on a link under Health and Safety",
  "keyword": "And "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.clicking_on_a_link_under_Health_and_Safety()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select an item",
  "keyword": "And "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.select_an_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Capture the price of the selected item",
  "keyword": "And "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.capture_the_price_of_the_selected_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Goto the cart and view the cart",
  "keyword": "And "
});
formatter.match({
  "location": "com.ui.automation.stepdefinition.Stepdefinition.goto_the_cart_and_view_he_cart()"
});
formatter.result({
  "status": "skipped"
});
});