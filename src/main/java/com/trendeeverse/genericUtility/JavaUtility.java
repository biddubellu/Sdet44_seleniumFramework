package com.trendeeverse.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility {

/** 
 * this class contain java reusable method
 * 
 */

	public String getSyatemDateAndTime()
	{
		 Date date = new Date();
		return date.toString();
	}
	public String getSystemDateWithFormate()
	{
		 Date date = new Date();
		 String dateAndTime = date.toString();
		 
		String YYYY = dateAndTime.split(" ")[5];
		String DD = dateAndTime.split(" ")[2];
		int MM = date.getMonth()+1;
		
		String finalFormate = YYYY +"-"+MM+"-"+DD;
		return finalFormate;
		 
	}
public String getDateTime() {
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_YYYY_HH_mm_sss");
	String d=sdf.format(date);
	return d;
	
}
}