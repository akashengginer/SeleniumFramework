package com.netBankingV1.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.netBankingV1.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_001 extends BaseClass
{
	@Test
	public void loginTest() throws Exception
	{
		driver.get(baseUrl);
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Username Entered");
		
		lp.setPassword(password);
		logger.info("Password Entered");
		fullpageScreen(driver, "TC_001 HomePage");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals(" Guru99 Bank Manager HomePage"))
		{
			captureScreen(driver, "TC_001");
			fullpageScreen(driver, "TC_001");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver, "TC_001");
			fullpageScreen(driver, "TC_001");
			Assert.assertFalse(false);
		}
	}

}
