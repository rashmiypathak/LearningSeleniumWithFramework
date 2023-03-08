package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
	
	private WebDriver driver;
	private By logoutLink = By.linkText("Logout");
	private By leftMenuHeader = By.xpath("//div[@id='content']/h2");
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitleAccountPage() {
		return driver.getTitle();
	}
	
	public String getURLAccountPage() {
		return driver.getCurrentUrl();
	}
	
	public Boolean isLogoutLinkExists() {
		return driver.findElement(logoutLink).isDisplayed();
	}
	
	public int getAccountPageHeaderCount() {
		int headerCount = driver.findElements(leftMenuHeader).size();
		System.out.println("Header count is : " + headerCount);
		return headerCount;
	}
	
	
			
}
