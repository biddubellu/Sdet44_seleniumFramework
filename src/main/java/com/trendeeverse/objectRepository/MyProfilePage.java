package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class will contain the objects of my profile page 
 * @author Biddappa1
 *
 */
public class MyProfilePage 
{
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myAddress;
	
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	public void clickOnMyAddress()
	{
		myAddress.click();
	}
	

}