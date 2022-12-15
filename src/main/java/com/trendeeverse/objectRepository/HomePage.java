package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trendeeverse.genericUtility.WebDriverUtelity;

/**
 * this class will describe all the functionality in home page 
 * @author Biddappa1
 *
 */
//class name should be same as page name
public class HomePage 
{
	@FindBy(id="fl_login_btn") 
	private WebElement loginButton1;
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-892d40']")
	private WebElement accountSettings;
	@FindBy(xpath="//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiAvatar-fallback css-13y7ul3']")
	private WebElement myProfile;
	@FindBy(xpath="//a[text()='Electronic']")
	private WebElement Electronic;
	@FindBy(xpath="//div[contains(text(),'successfully')]")
	private WebElement waitUntilLoad;
	@FindBy(xpath="//a[text()='Power bank']")
	private WebElement powerBank;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	

	
	//business library
	public void clickOnLogin()
	{
		loginButton1.click();
	}

	public void clickOnAccuntSettings()
	{
		accountSettings.click();
	}
	public void clickOnMyProfile()
	{
		myProfile.click();
	}
	public void moveToElement(WebDriverUtelity wu,WebDriver driver)
	{
		wu.mouseOveronElement(driver, Electronic);
	}
	public void waitUntilPageLoad(WebDriverUtelity wu,long timeout)
	
	{
		wu.waitForPageToLoad(timeout, waitUntilLoad);
		
	}
	
	//public void accSettingToeClickable(WebDriverUtelity wu,long timeout)
	//{
	//	wu.elementTobeClickable(timeout, accountSettings);
	public void clickOnPowerBank()
	{
		powerBank.click();
	}
}