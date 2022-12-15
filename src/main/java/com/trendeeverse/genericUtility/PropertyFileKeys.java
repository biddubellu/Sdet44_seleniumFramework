package com.trendeeverse.genericUtility;
/**
 * In this we declare the property file keys
 * @author Biddappa1
 *
 */
public enum PropertyFileKeys
{
	BROWSER("browser"),URL("url"),MAIL("mail"),PASSWORD1("password1"),TIMEOUT("timeOut"),PASSWORD("password");
	
	private String keys;
	
	//setters
	
	private PropertyFileKeys(String Keys)
	{
		this.keys=Keys;
	}
	
	//getters
	
	public String convertToString()
	{
		return keys.toString();
	}
	

}