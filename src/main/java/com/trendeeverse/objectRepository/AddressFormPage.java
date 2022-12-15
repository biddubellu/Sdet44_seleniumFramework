package com.trendeeverse.objectRepository;
/**
 * this class will describe the address form page 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trendeeverse.genericUtility.WebDriverUtelity;

public class AddressFormPage 

{
	@FindBy(xpath="//input[@placeholder='John Doe']")
	private WebElement userNameTextField ;
	@FindBy(xpath="//input[@placeholder='eg-142/87, ABC Apartment']")
	private WebElement houseInfo1;
	@FindBy(xpath="//input[@placeholder='eg-4th streetInfo']")
	private WebElement streetInfo1;
	@FindBy(xpath="//input[@placeholder='eg-near This and That']")
	private WebElement landMarkInfo1;
	@FindBy(xpath="//option[text()='Country']/parent::select")
	private WebElement countryDropDown;
	@FindBy(xpath="//option[text()='State']/parent::select[@id='demo-simple-select-placeholder-label']")
	private WebElement stateDropDown;
	@FindBy(xpath="//option[text()='City']/parent::select[@id='demo-simple-select-placeholder-label']")
	private WebElement cityDropDown;
	@FindBy(xpath="//div[@helpertext='Must be Number']/input")
	private WebElement pincode1;
	@FindBy(xpath="//input[@placeholder='9876543210']")
	private WebElement phoneNumber11;
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	
	
	public AddressFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	public void sendUserName(String name)
	{
		userNameTextField.sendKeys(name);
		
	}
	public void sendHouseInfo(String houseInfo)
	{
		houseInfo1.sendKeys(houseInfo);
	}
	public void sendStreetInfo(String streetnfo)
	{
		streetInfo1.sendKeys(streetnfo);
	}
	public void sendLandMarkInfo(String LandMarkInfo)
	{
		landMarkInfo1.sendKeys(LandMarkInfo);
	}
	public void clickOnContryDropDown(WebDriverUtelity wu,String  value)
	{
		wu.selectByVisibleText(countryDropDown, value);
	}
	public void clickOnStateDropDown(WebDriverUtelity wu,String  value)
	{
		wu.selectByVisibleText(stateDropDown, value);
	}
	public void clickOnCityDropDown(WebDriverUtelity wu,String  value)
	{
		wu.selectByVisibleText(cityDropDown, value);
	}
	public void sendPincode(String pincode)
	{
		pincode1.click();
		pincode1.sendKeys(pincode);
    }
	public void sendPhoneNumber(String phoneNumber)
	{
		phoneNumber11.sendKeys(phoneNumber);
	}
	public void clickOnaddaddressButton()
	{
		addAddressButton.click();
	}
}