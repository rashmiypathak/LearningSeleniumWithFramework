package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
		
	@Test(priority = 1)
	public void getLoginPageURLTest() {
		String actualURL = loginPage.getURLLoginPage();
		String expectedURL = "route=account/login";
		Assert.assertTrue(actualURL.contains(expectedURL));
		
	}
	
	@Test(priority = 2)
	public void getLoginPageTitleTest() {
		String actualTitle = loginPage.getTitleLoginPage();
		Assert.assertEquals(actualTitle, "Account Login");
		
	}
	
	@Test(priority = 3)
	public void isForgotPasswordLinkExistsTest() {
		Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
		
	}
	
	
	@Test(priority = 4)
	public void doLoginTest() {
		loginPage.doLogin("rashmi111@gmail.com", "Testing@123");
		
	}

}
