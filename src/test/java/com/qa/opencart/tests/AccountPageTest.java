package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class AccountPageTest extends BaseTest{
	
	@Test(priority = 1)
	public void doLoginTest() {
		accountPage = loginPage.doLogin("rashmi111@gmail.com", "Testing@123");
	}
	
	@Test(priority = 2)
	public void getAccountPageURLTest() {
		String actualURL = accountPage.getURLAccountPage();
		String expectedURL = "route=account/account";
		System.out.println("Actual URL is :"+ actualURL);
		Assert.assertTrue(actualURL.contains(expectedURL));
	}
	
	@Test(priority = 3)
	public void getAccountPageTitleTest() {
		String actualTitle = accountPage.getTitleAccountPage();
		System.out.println("Actual Title is :" + actualTitle);
		Assert.assertEquals(actualTitle, "My Account");
	}
	
	@Test(priority = 4)
	public void getAccountPageHeaderCountTest() {
		int actualHeaderCount = accountPage.getAccountPageHeaderCount();
		Assert.assertEquals(actualHeaderCount, 4);
	}

}
