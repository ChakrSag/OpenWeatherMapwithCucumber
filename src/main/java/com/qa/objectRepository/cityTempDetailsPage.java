package com.qa.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cityTempDetailsPage {
	
	private WebDriver driver=null;
	
	public cityTempDetailsPage(WebDriver driver){
		this.driver=driver;
	}

	protected By weatherWidgetHeader=By.cssSelector("div#weather-widget h2");
	protected By weatherWidgetTempDetails=By.cssSelector("div#weather-widget h3");
	protected By foreCastHeader=By.cssSelector("div.weather-forecast-hourly-graphic h2");
	
	public WebElement get_weatherWidgetHeader() {
		WebElement weatherWidgetHeaderElement=driver.findElement(weatherWidgetHeader);
		return weatherWidgetHeaderElement;
	}
	
	public WebElement get_weatherWidgetTempDetails() {
		WebElement weatherWidgetTempDetailsElement=driver.findElement(weatherWidgetTempDetails);
		return weatherWidgetTempDetailsElement;
	}
	
	public WebElement get_foreCastHeader() {
		WebElement foreCastHeaderElement=driver.findElement(foreCastHeader);
		return foreCastHeaderElement;
	}
}
