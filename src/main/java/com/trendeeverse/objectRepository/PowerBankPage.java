package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trendeeverse.genericUtility.WebDriverUtelity;

/**
 * this class will contain the objects of power bank page 
 * @author Biddappa1
 *
 */

public class PowerBankPage 
{
	@FindBy(xpath="//a[text()='Electronics']")
	private WebElement electronics;
	@FindBy(xpath="//span[text()='ubon pb x90']/ancestor::div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root featuredProducts_productCard__66Fh7 css-s18byi aos-init aos-animate']/descendant::button")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@class='navbar_authBlock2__oMeAw']//a")
	private WebElement clickOnaddtoCart;

	public PowerBankPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void mouseOverOnElectronics(WebDriverUtelity wu,WebDriver driver)
	{
		wu.mouseOveronElement(driver, electronics);
	}
	public void clickOnAddToCartButton()
	{
		addToCartButton.click();
		
	}
	public void clickOnAddToCartIcon()
	{
		clickOnaddtoCart.click();
}
}