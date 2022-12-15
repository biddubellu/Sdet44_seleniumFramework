package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class will contain the objects of login page 
 * @author Biddappa1
 *
 */
public class LoginPage
{
	@FindBy(id="vertical-tab-0")
	private WebElement shopperloginbtn;

	@FindBy(id = "vertical-tab-1") 
	private WebElement merchantloginbtn;
	@FindBy(id="fl_email")
	private WebElement userNameTextfield;
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']") 
	private WebElement passwordTextfield;
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginBtn2;


	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnShopperLoginButton()
	{
		shopperloginbtn.click();
	}
	public void clickOnMerchantButtn()
	{
		merchantloginbtn.click();
	}
	public void loginActions(String mail, String password)
	{
		userNameTextfield.sendKeys(mail);
		passwordTextfield.sendKeys(password);
		loginBtn2.click();
		
	}
	
}