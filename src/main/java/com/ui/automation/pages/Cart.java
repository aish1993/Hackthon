package com.ui.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
@FindBy(css = "span[class='B18_42'][class='cart-card-content-info-final-amount-rupees-icon']")
public WebElement price;
}