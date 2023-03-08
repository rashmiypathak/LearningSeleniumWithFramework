package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AppDriver {
	protected WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Please enter valid browser..."+browserName);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
		
	}
	public void initProp() {
		
	}
}
