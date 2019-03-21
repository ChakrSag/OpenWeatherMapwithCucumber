package com.qa.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class citySearchResultPage {
	
	private WebDriver driver=null;
	
	public citySearchResultPage(WebDriver driver){
		this.driver=driver;
	}

	protected By cityNotFoundError=By.xpath("//div[@class='alert alert-warning' and contains(text(),'Not found')]");
	protected By actualCityFound=By.xpath("//div[@id='forecast_list_ul']//td[2]//b/a");
	
	public WebElement get_cityNotFoundError() {
		WebElement cityNotFoundErrorElement=driver.findElement(cityNotFoundError);
		return cityNotFoundErrorElement;
	}
	
	public WebElement get_actualCityFound() {
		WebElement actualCityFoundElement=driver.findElement(actualCityFound);
		return actualCityFoundElement;
	}
}
