package com.trendeeverse.genericUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimplementationclass implements ITestListener {

	public void onTestStart(ITestResult arg0) {
		System.out.println("execution starts here");
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("test executed successfully");
	}

	public void onTestFailure(ITestResult arg0) {
		try {
			ThreadSafe.getWebdriverDriverUtelity().takesScreenShot(arg0.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
