package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class will contain the objects of product list page 
 * @author Biddappa1
 *
 */
public class ProductListpage 
{
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-edgeStart MuiIconButton-sizeMedium css-16sgp3y']") 
	private WebElement firstNavigation;
	@FindBy(xpath="//span[text()='Product ']")
	private WebElement leftnavigationbar;
	@FindBy(xpath="//span[text()='Add Product']")
	private WebElement addproduct;




	public ProductListpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}


	//business library
	public void action()
	{
		leftnavigationbar.click();
	}

	public void actionOnAddproduct()
	{
		addproduct.click();
	}
	public void actionfirstNavigationbar()
	{
		firstNavigation.click();
	}

}