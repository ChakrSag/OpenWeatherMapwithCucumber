package com.qa.browserSelector;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.qa.BusinessComponants.homeComp;
import com.qa.BusinessComponants.cityTempDetailsComp;
import com.qa.BusinessComponants.citySearchResultComp;
import com.qa.SupportLibrary.BrowserConfigurations;
import com.qa.SupportLibrary.reusableLibrary;
import com.qa.SupportLibrary.webDriverUtil;
import com.qa.objectRepository.homePage;
import com.qa.objectRepository.cityTempDetailsPage;
import com.qa.objectRepository.citySearchResultPage;
import com.qa.readProperty.readPropertyFileData;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.Reporting.*;

public class selectBrowser {
	public static WebDriver driver;
	public static String scenarioName;
	protected Logger logEvent=Logger.getLogger(getClass().getSimpleName());
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static String suiteName;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	public static File reportDirectoryCheck;
	protected static boolean nextsteptobeSkipped=false;

	//protected static ArrayList<ExtentTest> historicalExtentTests/*= new ArrayList<ExtentTest>()*/;
	protected static readPropertyFileData dataReadFromPropertyFile=new readPropertyFileData();
	//protected selectBrowser browserToLaunch=new selectBrowser();
	//protected MySQLCon sqlConnect=new MySQLCon();
	//protected jSonTestDataReader dataset=new jSonTestDataReader();
	public static homePage homepage;
	protected static homeComp homecomp;
	protected static cityTempDetailsPage cityTempDetailspage;
	protected static cityTempDetailsComp cityTempDetailscomp;
	protected static citySearchResultPage citySearchResultpage;
	protected static citySearchResultComp citySearchResultcomp;
	protected static webDriverUtil wutil;
	//protected Logger log = Logger.getLogger(getClass().getSimpleName());
	
	
	public WebDriver getBrowser(String browser) {
		try {
			if (System.getProperty("os.name").contains("Window")){
				//log.info("Execution happening in Windows System");
				if (browser.equalsIgnoreCase("Firefox")){
					//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+BrowserConfigurations.fireFoxDriverLocation);
					driver= new FirefoxDriver();
					driver.manage().window().maximize();
					/*driver.manage().window().maximize();
					driver.get("https://www.google.co.in/");
					log.info("Firefox browser launched");
					driver.get("https://www.google.co.in/");*/
					
					
				}
				else if (browser.equalsIgnoreCase("Chrome")){
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+BrowserConfigurations.googleChromeDriverLocation);
					ChromeOptions option = new ChromeOptions();
					option.addArguments("disable-extensions");
					option.addArguments("--start-maximized");
					driver = new ChromeDriver(option);
					//NgWebDriver ngWebDriver=new NgWebDriver(driver);
					/*log.info("Chrome browser launched");
					driver.get("https://www.google.co.in/");*/
					
				
				}
				/*else {
					log.info("Please select proper browser");
				}*/
			}
			
			else if (System.getProperty("os.name").contains("Mac")){
				//log.info("Execution happening in Mac System");
				if (browser.equalsIgnoreCase("Firefox")){
					System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+BrowserConfigurations.fireFoxDriverLocationMAC);
					driver= new FirefoxDriver();
					driver.manage().window().maximize();
					//driver.get("https://www.google.co.in/");
					/*driver.manage().window().maximize();
					driver.get("https://www.google.co.in/");
					log.info("Firefox browser launched");
					driver.get("https://www.google.co.in/");*/
					
					
				}
				else if (browser.equalsIgnoreCase("Chrome")){
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+BrowserConfigurations.googleChromeDriverLocationMAC);
					ChromeOptions option = new ChromeOptions();
					option.addArguments("disable-extensions");
					option.addArguments("--start-maximized");
					driver = new ChromeDriver(option);
					//log.info("Chrome browser launched");
					//driver.get("https://www.phptravels.net/");
					
				
					}
					/*else {
					log.info("Please select proper browser");
					}*/
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				wutil=new webDriverUtil(driver);
				homepage=new homePage(driver);
				homecomp=new homeComp(driver);
				cityTempDetailspage=new cityTempDetailsPage(driver);
				cityTempDetailscomp=new cityTempDetailsComp(driver);
				citySearchResultpage=new citySearchResultPage(driver);
				citySearchResultcomp=new citySearchResultComp(driver);

			}
		return driver;
	}
	
	public void getResult(String stepName, String status) throws IOException {
		if (status.equalsIgnoreCase("Fail")) {
			childTest.log(Status.FAIL, MarkupHelper.createLabel("Step:- '"+stepName+"' FAILED due to below issues:",ExtentColor.RED));
			childTest.log(Status.FAIL, Arrays.toString((new Throwable()).getStackTrace()));
			childTest.log(Status.FAIL, "Snapshot below: ", MediaEntityBuilder.createScreenCaptureFromPath(wutil.getScreenshotWhereRequired(reusableLibrary.stpNmeScrnshtCreatn(stepName))).build());
			//childTest.addScreenCaptureFromPath(wutil.getScreenshotWhereRequired(reusableLibrary.stpNmeScrnshtCreatn(stepName)));
		} else if (status.equalsIgnoreCase("Pass")) {
			childTest.log(Status.PASS, MarkupHelper.createLabel("Step:- '"+stepName + "' PASSED", ExtentColor.GREEN));
			childTest.log(Status.PASS, "Snapshot below: ", MediaEntityBuilder.createScreenCaptureFromPath(wutil.getScreenshotWhereRequired(reusableLibrary.stpNmeScrnshtCreatn(stepName))).build());
		} else {
			childTest.log(Status.SKIP, MarkupHelper.createLabel("Step:- '"+stepName+ "' Test Case SKIPPED because the previous step failed", ExtentColor.ORANGE));
			//childTest.log(Status.SKIP, Arrays.toString((new Throwable()).getStackTrace()));
		}
	}
		
	
}
