package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.trendeeverse.genericUtility.WebDriverUtelity;

public class AdminLogin {
	@FindBy(id = "fl_login_btn") private WebElement mainloginbutton;
	@FindBy(xpath = "//button[text()='Admin Login']") private WebElement adminloginbuttton;
	@FindBy(id ="fl_email") private WebElement email;
	@FindBy(id = "fl_password") private WebElement password;
	@FindBy(xpath = "//span[text()='Login']") private WebElement loginbutton;
	
	
	
	
	public AdminLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void clickonmainloginbutton() {
		mainloginbutton.click();
	}
	public void clickonadminloginbuttton() {
		adminloginbuttton.click();
	}
	public void emailtextfield(String mail) {
		email.sendKeys(mail);
		
	}
	public void passwordtextfield(String pwd) {
		password.sendKeys(pwd);
		
	}
	public void clickonloginbutton() {
		loginbutton.click();
		
			
		}
}
