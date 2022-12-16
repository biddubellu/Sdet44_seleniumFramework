package com.trendeeverse.genericUtility;

/**
 * This enum contains sheet name of Excel
 * @author Biddappa1
 *
 */
public enum SheetName 
{
     MERCHANT("merchant"),ADDRESS("address"),LOGIN("Login");
	
	private String shtName;
	//setter (constructor)
	private SheetName(String stName)
	{
		this.shtName=stName;
	}
	//getters
	public String getSheeCelltName()
	{
		return shtName.toString();
		
	}
}