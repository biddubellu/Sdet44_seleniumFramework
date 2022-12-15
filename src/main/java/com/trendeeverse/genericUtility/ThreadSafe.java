package com.trendeeverse.genericUtility;

public class ThreadSafe {
	private static ThreadLocal<WebDriverUtelity> webdriverUtility=new ThreadLocal<WebDriverUtelity>();
	
	public static WebDriverUtelity getWebdriverDriverUtelity()
	{
		return webdriverUtility.get();
	}
public static void setWebdriverUtility(WebDriverUtelity swedriverUtility)
{
	webdriverUtility.set(swedriverUtility);
}
}
