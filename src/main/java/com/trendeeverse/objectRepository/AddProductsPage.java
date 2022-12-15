package com.trendeeverse.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class describes add product 
 * @author Biddappa1
 *
 */
public class AddProductsPage 
{
	@FindBy(id="pname")
	private WebElement productNameTextfield;
	@FindBy(id="brand")
	private WebElement brandTextfield;
	@FindBy(id="productTilte")
	private WebElement productTitleTextfield;
	@FindBy(id="category")
	private WebElement catageryDropdown;
	@FindBy(xpath="//li[@data-value='men']")
	private WebElement selectCatageryDropdown;
	@FindBy(id="categoryType") 
	private WebElement CatageryTypeDropdown;
	@FindBy(xpath="//li[@data-value='men-tshirt']") 
	private WebElement selectCatageryTypeDropdown;
	@FindBy(id="offer") 
	private WebElement offer1;
	@FindBy(xpath="(//input[@id='outlined-size-small'])[last()-1]") 
	private WebElement price1;
	@FindBy(xpath="(//input[@id='outlined-size-small'])[last()]") 
	private WebElement quantity1;
	@FindBy(id="thumbnailImages") 
	private WebElement thumbNailImage;
	@FindBy(id="description") 
	private WebElement description1;
	@FindBy(id="ProductImages") 
	private WebElement imagelink1;
	@FindBy(xpath="(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeLarge css-arnt9q'])[last()-1]") 
	private WebElement productImageLinkButton;
	@FindBy(id="searchTags") 
	private WebElement searchTag1;
	@FindBy(xpath="(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeLarge css-arnt9q'])[last()]") 
	private WebElement searchtagButton;
	@FindBy(xpath="//button[@class='product_bn5__+KCz3']") 
	private WebElement saveButton;
	@FindBy(xpath="//li[text()='ProductName']") 
	private WebElement productNametext;


		
		
		
		public  AddProductsPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this );
		}
		
		public void sendproductname(String productname)
		{
			productNameTextfield.sendKeys(productname);
		}
		public void sendproductBarnd(String brand)
		{
			brandTextfield.sendKeys(brand);
		}
		public void sendProductTitle(String productTitle)
		{
			productTitleTextfield.sendKeys(productTitle);
		}
		public void actionOnCatageryDD()
		{
			catageryDropdown.click();
			
		}
		public void actionOnMenCatageryDD()
		{
			selectCatageryDropdown.click();
		}
		public void actionOnCatageryDD(String productTitle)
		{
			catageryDropdown.sendKeys(productTitle);
		}
		public void actionOnCatagerTypeDD()
		{
			CatageryTypeDropdown.click();
		
		}
		public void actionMensTSdirtOnCatagerTypeDD()
		{
			selectCatageryTypeDropdown.click();
		
		}
		public void sendOffer(String offer)
		{
			offer1.sendKeys(offer);
		
		}
		public void sendPrice(String price)
		{
		price1.sendKeys(price);;
		
		}
		public void sendQuantity(String quantity)
		{
		quantity1.sendKeys(quantity);;
		
		}
		public void sendthumbnailImageLink(String tImagelink)
		{
		thumbNailImage.sendKeys(tImagelink);;
		
		}
		public void sendDescription(String description)
		{
			description1.sendKeys(description);
	
		}
		public void sendImageLink(String imagelink)
		{
			imagelink1.sendKeys(imagelink);
        }
		public void clickOnProductImageLinkButton()
		{
			productImageLinkButton.click();
        }
		public void sendSearchTag(String searchTag)
		{
			searchTag1.sendKeys(searchTag);
        }
		public void clickOnSearchTagButton()
		{
			searchtagButton.click();
        }
		public void clickOnSaveButton()
		{
			saveButton.click();
        }
		public String getTextproductNametext()
		{
			return productNametext.getText();
			
		}
		
}