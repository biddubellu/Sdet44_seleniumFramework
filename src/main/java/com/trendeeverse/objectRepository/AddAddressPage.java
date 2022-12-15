package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * here we try  to click on account settings
 * @author Biddappa1
 *
 */

public class AddAddressPage 
{
	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-16j4xbv']")
	private WebElement accountSettings;
	
	
	public AddAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	/**
	 * 
	 */
	
	public void clickOnAccuntSettings()
	{
		accountSettings.click();
	}
	
	

}