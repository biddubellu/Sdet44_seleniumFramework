package com.trendeeverse.genericUtility;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This class contain common data driver action
 * @author Biddappa1
 *
 */
public class WebDriverUtelity
{
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	private Select sel;
	private JavascriptExecutor jse;
	/**
	 * This method is used to 
	 * launch browser based in browser key
	 * maximize the browser
	 * provide implicit wait
	 * launch the application using url
	 * @param browser
	 * @return
	 */

	public WebDriver launchApplication(String browser,long timeout,String url)
	{

		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("please enter valid browser name");

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.get(url);

		return driver;
	}
	/**
	 * used to place mouse cursor on specified element
	 * @param driver
	 * @param element  
	 */

	public void mouseOveronElement(WebDriver driver, WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * used to perform doubleclick on the element
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver,WebElement element)
	{
		act= new Actions(driver);
		act.doubleClick(element);
	}
	/**
	 * used to rightclick on the perticularElement
	 * @param driver
	 * @param element
	 */
	public void rightclick(WebDriver driver,WebElement element )
	{
		act= new Actions(driver);
		act.contextClick(element);
	}

	/**
	 * wait for pageload before identefing any synchronization
	 * @param driver
	 */

	public void waitforPageLoad( WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
	}
	/**
	 * used to switch alert  window and click on ok
	 * @param driver
	 */
	public void switchToalertWindowAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * used to witch alert window and click on ok
	 * @param driver
	 */
	public void switchToalertWindowAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * switch to frame window based on index
	 * @param
	 */
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);

	}
	/**
	 * select value drop down value based on index
	 */
	public void  selectByIndex(WebElement element, int index)
	{
		sel= new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * select the value of the drop by visible text
	 */
	public void selectByVisibleText(WebElement element,String Text)
	{
		sel= new Select(element);
		sel.selectByVisibleText(Text);

	}

	/**
	 * pass enter Key appertain in to Browser
	 * @param driver
	 */
	public void passEnterKey(WebDriver driver)
	{

		act.sendKeys(Keys.ENTER).perform();

	}
	/**
	 * performing scroll by action 
	 * @param element
	 * @param Text
	 */

	public void scrolltillend(WebElement element)
	{
		jse=(JavascriptExecutor) driver;
		Point loc = element.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}

	/**
	 * If test script gets failed take a screenshot
	 * @param driver
	 * @param screenShotName
	 * @return 
	 * @throws IOException
	 */
	public String takesScreenShot(String testCaseName) throws IOException
	{
		String fileName=testCaseName+"_"+new JavaUtility().getDateTime();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshot/"+fileName+".PNG");
		Files.copy(src, dst);
		return dst.getAbsolutePath();
	}
	/**
	 * wait in homepage until invisibility of an bar
	 * @param timeOut
	 * @param element
	 */
	public void waitForPageToLoad(long timeOut,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	//public void elementTobeClickable(long timeOut,WebElement element)
	//{
	//	WebDriverWait wait= new WebDriverWait(driver, timeOut);
	//	wait.until(ExpectedConditions.elementToBeClickable(element));
	/**
	 * This method is used for custom wait
	 * @param duration
	 * @param element
	 * @param pollingtime
	 */
public void CustomWait(int duration,WebElement element,long pollingtime )	{
	int count=0;
	while(count<duration) {
		element.click();
		try {
		Thread.sleep(pollingtime);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		count++;
		break;
	}
}
public void closeBrowser(ExcelUtility excelUtility,PFileUtility pFileUtility) {
	driver.quit();
}
}