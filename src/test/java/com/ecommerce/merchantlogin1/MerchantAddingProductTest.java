package com.ecommerce.merchantlogin1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.trendeeverse.genericUtility.BaseClass;
import com.trendeeverse.genericUtility.ExcelUtility;
import com.trendeeverse.genericUtility.IConstant;
import com.trendeeverse.genericUtility.IConstant;
import com.trendeeverse.genericUtility.JavaUtility;
import com.trendeeverse.genericUtility.PFileUtility;
import com.trendeeverse.genericUtility.PropertyFileKeys;
import com.trendeeverse.genericUtility.SheetName;
import com.trendeeverse.genericUtility.WebDriverUtelity;
import com.trendeeverse.objectRepository.AddProductsPage;
import com.trendeeverse.objectRepository.HomePage;
import com.trendeeverse.objectRepository.LoginPage;
import com.trendeeverse.objectRepository.ProductListpage;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * this script contains Merchant Adding the Product
 * @author Biddappa1
 *
 */
@Listeners(com.trendeeverse.genericUtility.Listenerimplementationclass.class)
public class MerchantAddingProductTest extends BaseClass
{
	@Test
	public  void address() throws Exception
	{
		
		String expectedResult = "1: ProductName";
		//create an object for generic utility
		ExcelUtility excelUtility = new ExcelUtility();
		
	

		//open the propertyfile
		pFileUtility.openproprtyfile();
		//read the common data from property file
			String mail = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.MAIL.convertToString());
		String password1 = pFileUtility.getDataFromPropertyFile(PropertyFileKeys.PASSWORD1.convertToString());

		//Open the Excel
		excelUtility.openExcel();

		//read the data from excel
		String pname=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),1,1);
		String brand=excelUtility.getDataFromExcel(SheetName.MERCHANT.getSheeCelltName(),2,2);
		String ptitle=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,3);
		String offer=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,4);
		String price=excelUtility.getDataFromExcel(SheetName.MERCHANT.getSheeCelltName(),2,5);
		String quantity=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,6);
		String tnailimagelink=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,7);
		String description=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,8);

		String pimagelink=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,9);
		String searchtag=excelUtility.getDataFromExcel( SheetName.MERCHANT.getSheeCelltName(),2,10);

		
		//click on login Button

		//POM class object creation 
		
		ProductListpage product= new ProductListpage(driver);
		AddProductsPage addProductPage= new AddProductsPage(driver);

		//click on merchant login
		
		login.clickOnMerchantButtn();
		login.loginActions(mail, password1);

		//clicking on product name
		product.actionfirstNavigationbar();
		product.action();
		product.actionOnAddproduct();
		addProductPage.sendproductname(pname);
		addProductPage.sendproductBarnd(brand);
		addProductPage.sendProductTitle(ptitle);
		addProductPage.actionOnCatageryDD();
		addProductPage.actionOnMenCatageryDD();
		addProductPage.actionOnCatagerTypeDD();
		addProductPage.actionMensTSdirtOnCatagerTypeDD();		
		addProductPage.sendOffer(offer);
		addProductPage.sendPrice(price);
		addProductPage.sendQuantity(quantity);
		addProductPage.sendthumbnailImageLink(tnailimagelink);
		addProductPage.sendDescription(description);	
		addProductPage.sendImageLink(pimagelink);
		addProductPage.clickOnProductImageLinkButton();
		addProductPage.sendSearchTag(searchtag);
		addProductPage.clickOnSearchTagButton();
		addProductPage.clickOnSaveButton();
		String actualResult = addProductPage.getTextproductNametext();
		System.out.println(actualResult);

		if(actualResult.equals(expectedResult))
		{
			System.out.println("Product is added successfully");
			excelUtility.setDataToExcel(IConstant.EXCEL_PATH, SheetName.MERCHANT.getSheeCelltName(),2,11,"Test case pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
		driver.close();
		excelUtility.closeExcel();
		pFileUtility.ClosepropertyFile();

	}
}