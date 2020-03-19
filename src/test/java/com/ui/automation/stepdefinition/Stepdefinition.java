package com.ui.automation.stepdefinition;

import com.ui.automation.pages.HealthAndSafety;
import com.ui.automation.pages.HomePage;
import com.ui.automation.testBase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition {


@Given("Launch the application URL")
public void launch_the_application_URL() throws Exception {
	TestBase.initialisation();
    
}

@When("Mouse over for selecting All Categories link")
public void mouse_over_for_selecting_All_Categories_link() {
	HomePage home=new HomePage();
	home.click_on_allcatagory();
    
}

@When("Select Offers link")
public void select_Offers_link() {
	HomePage home=new HomePage();
	home.click_on_offers();
    
}

@When("Select Health and Safety")
public void select_Health_and_Safety() {
	
	HomePage home=new HomePage();
	home.click_on_HealthAndSafety();
    
}

@When("Clicking on a link under Health and Safety")
public void clicking_on_a_link_under_Health_and_Safety() {
	HealthAndSafety h=new HealthAndSafety();
	h.click_on_toothpaste();
    
}

@When("Select an item")
public void select_an_item() {
	HealthAndSafety h=new HealthAndSafety();
	h.click_on_item();
}

@When("Capture the price of the selected item")
public void capture_the_price_of_the_selected_item() {
    
}

@When("Goto the cart and view the cart")
public void goto_the_cart_and_view_he_cart() {
    
}
	
}