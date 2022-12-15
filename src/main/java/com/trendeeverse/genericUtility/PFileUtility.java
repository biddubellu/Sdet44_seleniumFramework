package com.trendeeverse.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods for property file
 * @author Biddappa1
 *
 */

public class PFileUtility 
{
	private FileInputStream fis;
	private Properties p;


	/**
	 * This method is used to fetch the data from property file
	 * @param propertyFilePath
	 * @param key
	 * @return
	 * @throws IOException 
	 */

	//open the property file
	public void openproprtyfile() throws IOException
	{
		fis= new FileInputStream(IConstant.PROPERTY_FILE_PATH);
		p = new Properties();
		p.load(fis);
	}
	// fetch the common data from the property file
	public String getDataFromPropertyFile(String key) throws IOException
	{	
		String value = p.getProperty(key);
		return value;
	}
	public void ClosepropertyFile() throws IOException
	{
		fis.close();

	}


}