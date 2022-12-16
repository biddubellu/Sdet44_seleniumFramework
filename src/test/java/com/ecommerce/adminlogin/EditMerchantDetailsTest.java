package com.ecommerce.adminlogin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.trendeeverse.genericUtility.BaseClass;
import com.trendeeverse.genericUtility.SheetName;
import com.trendeeverse.genericUtility.WebDriverUtelity;
import com.trendeeverse.objectRepository.AdminLogin;
import com.trendeeverse.objectRepository.ApprovedMerchantPage3;

public class EditMerchantDetailsTest extends BaseClass{
	@Test
	public void editmercnt() throws EncryptedDocumentException, IOException, InterruptedException {
		AdminLogin admin=new AdminLogin(driver);
		ApprovedMerchantPage3 app=new ApprovedMerchantPage3(driver);
		String un = excelUtility.getDataFromExcel( SheetName.LOGIN.getSheeCelltName(),0,0);
		String pwd = excelUtility.getDataFromExcel( SheetName.LOGIN.getSheeCelltName(),0,1);
		String ele = excelUtility.getDataFromExcel( SheetName.LOGIN.getSheeCelltName(),0,2);
		
		
		admin.clickonadminloginbuttton();
		admin.emailtextfield(un);
		admin.passwordtextfield(pwd);
		admin.clickonloginbutton();
		Thread.sleep(2000);
		app.checkifthecontentisdisplayed();
		app.clickonedit();
		app.lastname(ele);
		app.scrolltillUpdate(wu);
//		 WebElement update = app.update();
//		wu.scrolltillend(update);
		app.update();
		
	}
	
	

}
