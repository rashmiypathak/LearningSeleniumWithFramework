package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.AppDriver;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	AppDriver ad;
	WebDriver driver;
	protected LoginPage loginPage;
	protected AccountPage accountPage;
	
		
	@BeforeTest
	public void setup() {
	ad = new AppDriver();
	driver = ad.initDriver("chrome");
	loginPage = new LoginPage(driver);
	//accountPage = new AccountPage(driver);
		
	}
	
	@AfterTest
	public void tearDown() {

	}
}
