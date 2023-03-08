package com.qa.opencart.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriverWait wait;
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;

	}

	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;		
	}
	
	public  WebElement getElement(By locator, int timeOut) {
		return waitForElementVisible(locator, timeOut);		
	}	
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	//Wait Utils
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementVisible(By locator, int timeOut) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementPresence(By locator, int timeOut) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible. 
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater 
	 * than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param timeOut
	 * @param titleFractionValue
	 * @return
	 */
	public String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();		
	}
	
	/**
	 * An expectation for checking the title of a page.
	 * @param timeOut
	 * @param titleValue
	 * @return
	 */
	public String waitForTitleIsAndFetch(int timeOut, String titleValue) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();		
	}
	
	public String waitForURLContainsAndFetch(int timeOut, String urlFractionValue) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(urlFractionValue));
		return driver.getCurrentUrl();	
	}
	
	public String waitForURLIsAndFetch(int timeOut, String urlValue) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(urlValue));
		return driver.getCurrentUrl();		
	}
}
