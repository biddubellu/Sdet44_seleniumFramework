package com.trendeeverse.objectRepository;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.trendeeverse.genericUtility.WebDriverUtelity;

public class ApprovedMerchantPage3 {
	WebDriverUtelity wu=new WebDriverUtelity();
	
	@FindBy(xpath = "//div[text()='VaaniBazaar']") private WebElement elememt;
	@FindBy(xpath = "//a[@href=\"/edit-merchant-profile/1383\"]") private WebElement edit;
	@FindBy(xpath = "//input[@placeholder='Enter Your Last Name']") private WebElement lastnametextfiled;
	@FindBy(xpath = "//span[text()='Update Merchant Details']")private WebElement update;
	public ApprovedMerchantPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void checkifthecontentisdisplayed() {
		
		boolean value = elememt.isDisplayed();
		System.out.println(value);}
	public void clickonedit() {
		
		edit.click();
	}
	public void lastname(String ele1) {
		
		lastnametextfiled.sendKeys(ele1);
		
	}
	public WebElement update()
	{
		//
		return update;
	}
}
