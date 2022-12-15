package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * in this class it described the objects of my address page
 * @author Biddappa1
 *
 */
public class MyAddressesPage 
{

	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s']")
	private WebElement addAddress;
	@FindBy(xpath="//h3[text()='Aishwarya']") 
	private WebElement addressestext;
	
	
	public  MyAddressesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	public void clickOnaddAddress()
	{
		addAddress.click();
	}
	public String getTextaddressNametext()
	{
		return addressestext.getText();
		
	}

}