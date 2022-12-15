package com.trendeeverse.genericUtility;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.trendeeverse.genericUtility.Listenerimplementationclass.class)
public class sampleclass extends BaseClass{
	@Test
	public void test() {
		System.out.println("------hi-----");
		Assert.assertEquals(false, true);
	}

}
