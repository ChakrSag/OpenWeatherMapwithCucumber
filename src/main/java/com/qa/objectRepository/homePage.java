package com.qa.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {

	private WebDriver driver=null;
	
	public homePage(WebDriver driver){
		this.driver=driver;
	}
	
	protected By openWeatherMapImg=By.xpath("//img[@src='/themes/openweathermap/assets/vendor/owm/img/logo_OpenWeatherMap_orange.svg']");
	protected By searchBoxforCityEntry=By.cssSelector("input#q:nth-child(2)");
	protected By searchButtonForCity=By.cssSelector("button[class='btn btn-orange']");
	
	
	public WebElement get_openWeatherMapImg() {
		WebElement openWeatherMapImgElement=driver.findElement(openWeatherMapImg);
		return openWeatherMapImgElement;
	}
	
	public WebElement get_searchBoxforCityEntry() {
		WebElement searchBoxforCityEntryElement=driver.findElement(searchBoxforCityEntry);
		return searchBoxforCityEntryElement;
	}
	
	public WebElement get_searchButtonForCity() {
		WebElement searchButtonForCityElement=driver.findElement(searchButtonForCity);
		return searchButtonForCityElement;
	}
}
