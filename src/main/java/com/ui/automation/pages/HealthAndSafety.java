package com.ui.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthAndSafety {

	
		@FindBy(xpath="//a[text()='Toothpaste']")
		public WebElement toothpaste;
		@FindBy(css="div[class='bn_btn M14_white li_ml lft ga_bn_btn_addcart'][id='41848']")
		public WebElement AddToCart;
		@FindBy(xpath="//img[@title='Mee Mee Fluoride-Free Strawberry Flavor Toothpaste - 70 Gram']")
		public WebElement image;
		public void click_on_toothpaste(){
			toothpaste.click();
		System.out.println("Successfully clicked on toothpaste button");}
		public void click_on_AddToCart(){
			AddToCart.click();
		System.out.println("Successfully clicked on AddToCart button");}
		public void click_on_item(){
			image.click();
		}
		
	}


