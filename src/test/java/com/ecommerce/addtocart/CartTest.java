package com.ecommerce.addtocart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;
import com.trendeeverse.genericUtility.BaseClass;
import com.trendeeverse.genericUtility.JavaUtility;
import com.trendeeverse.genericUtility.PFileUtility;
import com.trendeeverse.genericUtility.PropertyFileKeys;
import com.trendeeverse.genericUtility.WebDriverUtelity;
import com.trendeeverse.objectRepository.CartPage;
import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;
import com.trendeeverse.objectRepository.PowerBankPage;

/**
 * this testscript describes adding product to the cart 
 * @author Biddappa1
 *
 */
@Listeners(com.trendeeverse.genericUtility.Listenerimplementationclass.class)
public class CartTest extends BaseClass
{
	@Test
	public void AddingProductToTheCart()throws InterruptedException, IOException 
	{
		String expectedResult1="Ubon Pb X90";
	
		//read the commondata from property file
		//String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		//String password = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD.convertToString());
		long timeOut = Long.parseLong(pFileUtility.getDataFromPropertyFile(PropertyFileKeys.TIMEOUT.convertToString()));



		//pom class object creation
		PowerBankPage powerBank= new PowerBankPage(driver);
		CartPage cartpage= new CartPage(driver);

		String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD.convertToString());
		login.clickOnShopperLoginButton();
		login.loginActions(mail,password);
		home.waitUntilPageLoad(wu, timeOut);

		//mouse hover on Electronics
		home.moveToElement(wu, driver);
		home.clickOnPowerBank();
		String actual = driver.findElement(By.xpath("//span[text()='ubon pb x90']")).getText();
	Assert.fail();

		//mouse hover back on Electronics
		powerBank.mouseOverOnElectronics(wu, driver);
		powerBank.clickOnAddToCartButton();
		//home.waitUntilPageLoad(wu, timeOut);
	
		// click on add to cart
		Thread.sleep(6000);
		powerBank.clickOnAddToCartIcon();
		String actualProductName =cartpage.getTextProductText();
		System.out.println(actualProductName);

		//verify
		Assert.assertTrue(actualProductName.contains(expectedResult1));
//		{
//			System.out.println("Testcase pass");
//		}
//		else
//		{
//			System.out.println("Testcase Fail");
//		}
//
//		wu.closeBrowser(excelUtility, pFileUtility);
//		
			
		}
	}