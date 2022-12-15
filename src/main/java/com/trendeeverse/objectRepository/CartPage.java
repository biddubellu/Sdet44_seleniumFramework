package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class will describe the cart page 
 * @author Biddappa1
 *
 */
public class CartPage 
{
	@FindBy(xpath="//h3[text()='ubon pb x90']")
	WebElement addedProductText;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTextProductText()
	{
		return addedProductText.getText();
	}

}