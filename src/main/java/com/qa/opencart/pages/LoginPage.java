package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//1. Page Locators
	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@type='submit']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	private By rightNavigationLinks = By.xpath("//div[@class='list-group']/a");
	
	//2. Page Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. Page Methods
	public String getTitleLoginPage() {
		return driver.getTitle();
	}
	
	public String getURLLoginPage() {
		return driver.getCurrentUrl();
	}
	
	public Boolean isForgotPasswordLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public int getRightNavigationLinkCount() {
		int rightNavLinkCount = driver.findElements(rightNavigationLinks).size();
		return rightNavLinkCount;
	}
	
	public AccountPage doLogin(String uName, String pwd) {
		driver.findElement(username).sendKeys(uName);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new AccountPage(driver);
		
	}
		
	

}
