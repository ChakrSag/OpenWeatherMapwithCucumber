package com.qa.SupportLibrary;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class webDriverUtil extends reusableLibrary{

	protected WebDriver driver=null;
	//protected NgWebDriver ngWebDriver=null;
	
	public webDriverUtil (WebDriver driver) {
		this.driver=driver;
		//ngWebDriver = new NgWebDriver((JavascriptExecutor) this.driver);
	}
	
	public int monthIntegerConvrtr(String month) {
		int i=0;
		
		if (month.equalsIgnoreCase("January")) {
			i=1;
		}
		else if (month.equalsIgnoreCase("February")) {
			i=2;
		}
		else if (month.equalsIgnoreCase("March")) {
			i=3;
		}
		else if (month.equalsIgnoreCase("April")) {
			i=4;
		}
		else if (month.equalsIgnoreCase("May")) {
			i=5;
		}
		else if (month.equalsIgnoreCase("June")) {
			i=6;
		}
		else if (month.equalsIgnoreCase("July")) {
			i=7;
		}
		else if (month.equalsIgnoreCase("August")) {
			i=8;
		}
		else if (month.equalsIgnoreCase("September")) {
			i=9;
		}
		else if (month.equalsIgnoreCase("October")) {
			i=10;
		}
		else if (month.equalsIgnoreCase("November")) {
			i=11;
		}
		else if (month.equalsIgnoreCase("December")) {
			i=12;
		} 
		
		return i;
	}
	
	public boolean validateElement(WebElement element) {
		boolean emailFildLod=false;		
		if(explicitWaitforElementVisible(element)) {
			//logEvent.info("Successfully loaded PA login page");
			emailFildLod=true;
		}
		else {
			//logEvent.fatal("PA Page did not load properly");
		}
		
		return emailFildLod;
	}
	
	/**
	 * Function to wait for hard coded time
	 * @param waitTime
	 * @throws InterruptedException
	 */
	public void hardWait(){
		int waitTime=(Integer.parseInt(dataReadFromPropertyFile.readData("maxintegertimeout")))/10;
		try{
			
			for (int i=1;i<=waitTime;i++)
			//Thread.sleep(1000*i);
			driver.manage().timeouts().implicitlyWait(10*i, TimeUnit.SECONDS);
			//logEvent.info("Hard wait:-waited for "+waitTime+" seconds");
		}catch(Exception E){
			//logEvent.error("Could not wait for element:- "+E);
		}
	}
	
	/**
	 * Function to wait for element to be clickable
	 * @param element
	 */
	
	public boolean explicitWaitforElementClickable(WebElement element){
	boolean elementClickable=false;
	try{
		int waitTime=Integer.parseInt(dataReadFromPropertyFile.readData("maxintegertimeout"));
		try{
			WebDriverWait wait=new WebDriverWait(driver,waitTime);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			elementClickable=true;
			//logEvent.info("Waited for Element to be clickable");
			}catch(ElementNotInteractableException E){
				//logEvent.error("Could not explicitly wait for element to be clicked:- "+E);
				elementClickable=false;
			}
		}catch(Exception E){
			//logEvent.error("Wait time could not be initialized:- "+E);
			elementClickable=false;
		}
		return elementClickable;
	}
	
	/**
	 * Function to wait for element to be visible
	 * @param element
	 */
	
	public boolean explicitWaitforElementVisible(WebElement element){
	boolean elementFound=false;
		try{
			int waitTime=Integer.parseInt(dataReadFromPropertyFile.readData("maxintegertimeout"));
			try{
				WebDriverWait wait=new WebDriverWait(driver,waitTime);
				wait.until(ExpectedConditions.visibilityOf(element));
				elementFound=true;
				//logEvent.info("Waited for Element to be found");
				}catch(ElementNotVisibleException E){
					//logEvent.error("Could not explicitly wait for element to be visible:- "+E);
					elementFound=false;
				}
			}catch(Exception E){
				//logEvent.error("Wait time could not be initialized:- "+E);
				elementFound=false;
			}
	
			return elementFound;
		}
	
	/**
	 * Function to click object
	 * @param element
	 */
		public void clickObject(WebElement element){
			try{
					element.click();
					//logEvent.info("Element is clicked successfully");
				}catch(ElementNotInteractableException E){
					//logEvent.error("element not interacting to click operation:- "+E);
				}
		}
		
		public void stopFlow(int n) {
			
			
				try {
					for(int i=1;i<=n;i++) {
					Thread.sleep(1000*i);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		/**
		 * Function to select data from Static dropdown
		 * @param element
		 * @param data
		 */
		public void selectDatabyVizText(WebElement element,String data){
			try{
					Select select=new Select(element);
					//WebElement alreadySelect=select.getFirstSelectedOption();
					
					/*if(alreadySelect.getText().equalsIgnoreCase(data)) {
						logEvent.info("Data already selected");
					}
					else {
					
					}*/
						select.selectByVisibleText(data);
						//logEvent.info("Data selected successfully");
					
					
					//element.click();
					//element.clear();
					//element.sendKeys(data);
					//logEvent.info("Data sent to Element successfully");
				}catch(ElementNotInteractableException E){
					//logEvent.error("data could not be filled up due to:- "+E);
				}
		}
		
		/**
		 * Function to set data
		 * @param element
		 * @param data
		 */
		public void fillData(WebElement element,String data){
			try{
					element.click();
					element.clear();
					element.sendKeys(data);
					//logEvent.info("Data sent to Element successfully");
				}catch(ElementNotInteractableException E){
					//logEvent.error("data could not be filled up due to:- "+E);
				}
		}
		
		/**
		 * Function to find exact element locator
		 * @param by
		 * @return
		 */
		
		public boolean findElement(By by){
			
			boolean returnType;
			try{
					driver.findElement(by);
					returnType=true;
					//logEvent.info("Element found successfully");
				}catch(ElementNotVisibleException E){
					//logEvent.error("Element could not be found due to:- "+E);
					returnType=false;
				}
			return returnType;
		}
		
		/**
		 * Function to find exact element locator partial text for Assertion verification
		 * @param by
		 * @return
		 */
		public String findPartialElementText(By by){
			
			String ElementText = null;
			try{
				ElementText = driver.findElement(by).getText();
				//logEvent.info("Partial text found-Assertion passed");
			}catch(ElementNotVisibleException E){
				//logEvent.error("Element could not be found for Assertion:- "+E);
			}
				String[] actualText=ElementText.split(",");
				return actualText[0];
		}
		
	
		
		/**
		 * Method to handle Alert
		 * @param action
		 * Date:-11/20/2018
		 */
		
		public void handleAlert(boolean action) {
			
			Alert alert=driver.switchTo().alert();
			
			if(action) {
				alert.accept();
				//logEvent.info("Alert accepted");
			}
			else {
				alert.dismiss();
				//logEvent.info("Alert rejected");
			}
		}
		
		/**
		 * Method which will capture screenshot
		 * @return:- String path of the Screenshot captured
		 */
		
		public String getScreenshotWhereRequired(String testName){
			
			String path=null;
			//final String fileSeperator = System.getProperty("file.separator");
			
			String directoryPath=System.getProperty("user.dir") +"\\ScreenShots";
			//Just test
			//String directoryPath="D:\\ScreenShots";
			
			//String directoryPath="\\\\"+dataReadFromPropertyFile.readData("ServerIP")+"\\"+dataReadFromPropertyFile.readData("ServerDrive")+"\\PAResults\\ScreenShots";
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			if(driver instanceof TakesScreenshot){
				
				//File directory=new File("E:/SeleniumSBA/selenium.maven.deom/ScreenShots"+fileSeperator+testName);
				
				//Checking whether directory for test name is present for server location
				//File directoryExistance=createDirectory(directoryPath+"\\"+testName);
				
				//Checking whether directory for test name is present for Local location
				File directoryExistance=createDirectory(directoryPath+"\\"+testName);
				//logEvent.info("Actual folder created to push screenshots");
				//File directory=new File(directoryPath+"/"+testName);
				
				/*if (!directory.exists()) {
					log.info("Directory creation takes place for screenshots" + directory);
					directory.mkdir();
				}
				
				else{
					log.info(directory+ " already created directory");
				}*/
				
				File srcFile=ts.getScreenshotAs(OutputType.FILE);
				
				//for server
				//path=directoryExistance+"\\screenshot__"+getCurrentDateandTime()+".jpg";
				
				//for local
				//path=directoryExistance+"/screenshot__"+getCurrentDateandTime()+".jpg";
				
				//changed for klov
				path=directoryExistance+"\\screenshot__"+getCurrentDateandTime()+".jpg";
				
				//Only for KLOV Test
				//path=directoryPath+"\\screenshotaaaaaaaaaaaaaa"+".jpg";
					
					//path="E:/SeleniumSBA/selenium.maven.deom/ScreenShots/screenshot__"+System.currentTimeMillis()+".png";
				
					
					
				File destination= new File(path);
				
				try{
					FileUtils.copyFile(srcFile, destination);
					
				}catch (IOException E){
					
					//logEvent.error("Screen capture copy failed "+E);
				}
			}
			
			else{
				//logEvent.error("Issues to add add screenshot to file due to ClassCastException");
			}
			
			return path;
			//System.out.println(path);
		}

		
		/**
		 * This is the default calendar function to call wherever there is a need to select Calendar
		 * @param Date:- Pass the date in mm-dd-yyyy format
		 * @param calendarMonthYear:- WebElement which contains:-'November 2018'
		 * @param calendarMonthSwipeButton:- WebElement which contains the next ('>') button
		 * @param datetoSelect:- select the date passed from excel
		 */
		
		public void monthSelectorfromCalendar(String Date, WebElement calendarMonthYear, WebElement calendarMonthSwipeButton) {
			//System.out.println("jaggu"+Date);
			String year=(Date.split("/"))[2];
			String month=(Date.split("/"))[1];
			String actualMonth=null;
			if (month.equals("1")) {
				actualMonth="January";
			}
			else if (month.equals("2")) {
				actualMonth="February";
			}
			else if (month.equals("3")) {
				actualMonth="March";
			}
			else if (month.equals("4")) {
				actualMonth="April";
			}
			else if (month.equals("5")) {
				actualMonth="May";
			}
			else if (month.equals("6")) {
				actualMonth="June";
			}
			else if (month.equals("7")) {
				actualMonth="July";
			}
			else if (month.equals("8")) {
				actualMonth="August";
			}
			else if (month.equals("9")) {
				actualMonth="September";
			}
			else if (month.equals("10")) {
				actualMonth="October";
			}
			else if (month.equals("11")) {
				actualMonth="November";
			}
			else if (month.equals("12")) {
				actualMonth="December";
			}
			
			else {
				//logEvent.error("Please enter proper month otherwise System will terminate");
			}
			String monthyearStringtoFind=actualMonth+" "+year;
			//System.out.println("Sgar "+monthyearStringtoFind);
				while(true) {
					//System.out.println("Payel"+calendarMonthYear.getText());
					if(!calendarMonthYear.getText().equalsIgnoreCase(monthyearStringtoFind)) {
						//System.out.println("Payel1"+calendarMonthYear.getText());
						hardWait();
						if (explicitWaitforElementClickable(calendarMonthSwipeButton)) {
							//System.out.println("Payel2");
							clickObject(calendarMonthSwipeButton);
						}
						
						
					}
					else {
						//System.out.println("Payel3"+calendarMonthYear.getText());
						break;
					}
				}

				//WebElement calendar=driver.findElement(By.xpath("//div[@style='display: block; top: 355.625px; left: 453.323px;']"));
				//List<WebElement> datetoSelect1=calendar.findElements(By.cssSelector("td.day"));
			
			//At this point month got selected; now need to select Date
			
			
		}
		
		public void dateSelector(String exactDate, List<WebElement> datetoSelect) {
			String date=(exactDate.split("/"))[0];			
			for (WebElement wb:datetoSelect) {
				//System.out.println(date);
				//System.out.println(wb.getText());
				//hardWait(500);
				
				if(wb.getText().equals(date)) {
					
					//hardWait(300);
					//System.out.println("kaka2");
					wb.click();
					//hardWait(500);
					break;
				}
				else {
					
					//System.out.println("kaka3");
					continue;
					
				}
			}
		}
		
		public void typeStringintoHotelSearchBox(String string, WebElement searchBox, String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				if(explicitWaitforElementClickable(searchBox)) {
					
					try {
						//Handling for Mozila
						//clickObject(searchBox);
						//logEvent.info("Clicked searchbox for Mozila Firefox");
					}catch (WebDriverException e) {
						//Handling for chrome
						//logEvent.info("Moved to Catch block for Chrome for Exception:- "+e);
						clickObject(searchBox);
						//logEvent.info("Clicked searchbox for Chrome");
					}
					hardWait();
					
					try {
						//Handling for Mozila
						fillData(searchBox, string);
						//logEvent.info("Sent data in searchbox for Mozila Firefox");
					}catch (Exception e) {
						//Handling for chrome
						//logEvent.info("Moved to Catch block for Chrome for Exception:- "+e);
						//System.out.println(e);
						new Actions(driver).sendKeys(string).build().perform();
						//logEvent.info("Sent data to searchbox from Chrome Chrome");
					}
					
					
				}
				else {
					//logEvent.info("Hotel Searchbox could not be found in Homepage");
				}
			}
			
			if (browser.equalsIgnoreCase("firefox")) {
				if(explicitWaitforElementClickable(searchBox)) {
					
					try {
						//Handling for Mozila
						clickObject(searchBox);
						//logEvent.info("Clicked searchbox for Mozila Firefox");
					}catch (WebDriverException e) {
						System.out.println(e);
						//Handling for chrome
						//logEvent.info("Moved to Catch block for Chrome for Exception:- "+e);
						//clickObject(searchBox);
						//logEvent.info("Clicked searchbox for Chrome");
					}
					hardWait();
					
					try {
						//Handling for Mozila
						fillData(searchBox, string);
						//logEvent.info("Sent data in searchbox for Mozila Firefox");
					}catch (Exception e) {
						//System.out.println(e);
						//Handling for chrome
						//logEvent.info("Moved to Catch block for Chrome for Exception:- "+e);
						//System.out.println(e);
						//new Actions(driver).sendKeys(string).build().perform();
						//logEvent.info("Sent data to searchbox from Chrome Chrome");
					}
					
					
				}
				else {
					//logEvent.info("Hotel Searchbox could not be found in Homepage");
				}
			}
		}
		
		/**
		 * Function to scroll down through the page to find out the required element
		 * @param pixels:- Pass the required WebElement
		 */
		
		public void scrolltoViewWebElement(WebElement element) {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			
		}
		
		public void clickElementUsingJavaScript(WebElement element) {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
			
		}
	
		public void keyboardAction(CharSequence Key, int keycode) {
			Actions action;
			Robot robot;
			
			try {
				
				//This block is handling Chrome as Action is not implemented in Geckodriver 0.13
				action=new Actions(driver);
				action.sendKeys(Key).build().perform();
				action.release().perform(); 
				//logEvent.info("Clicked on "+Key+"key from chrome");
			} catch (Exception e) {
				
				//This block is for firefox, cannot work in headless mode
				try {
					robot = new Robot();
					robot.keyPress(keycode);
					robot.keyRelease(keycode);
					//logEvent.info("Clicked on "+keycode+"key from mozila");
				} catch (AWTException E) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		
		public void fluentWaitforEAuth(WebElement element) {

			 @SuppressWarnings("deprecation")
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				        .withTimeout(300, TimeUnit.SECONDS)
				        .pollingEvery(30, TimeUnit.SECONDS)
				        .ignoring(NoSuchElementException.class);
			 
			 wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public void fluentWaitforProfileSubmissionSuccess(WebElement element) {

			 @SuppressWarnings("deprecation")
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				        .withTimeout(1000, TimeUnit.SECONDS)
				        .pollingEvery(100, TimeUnit.SECONDS)
				        .ignoring(NoSuchElementException.class);
			 
			 wait.until(ExpectedConditions.visibilityOf(element));
		}
		
/*public void getScreenshot(String testName){
			
			String path=null;
			//final String fileSeperator = System.getProperty("file.separator");
			
			String directoryPath=System.getProperty("user.dir") +"/ScreenShots";
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			if(driver instanceof TakesScreenshot){
				
				//File directory=new File("E:/SeleniumSBA/selenium.maven.deom/ScreenShots"+fileSeperator+testName);
				System.out.println("MOOOOOOOOJOOOOOOOOOOOOO");
				//Checking whether directory for test name is present
				File directoryExistance=createDirectory(directoryPath+"/"+testName);
				//logEvent.info("Actual folder created to push screenshots");
				//File directory=new File(directoryPath+"/"+testName);
				
				if (!directory.exists()) {
					log.info("Directory creation takes place for screenshots" + directory);
					directory.mkdir();
				}
				
				else{
					log.info(directory+ " already created directory");
				}
				System.out.println("BEEEEEEFFFFFFOOOOOORRRREEEEEE");
				File srcFile=ts.getScreenshotAs(OutputType.FILE);
					
				path=directoryExistance+"\\screenshot__"+getCurrentDateandTime()+".jpg";
					
					//path="E:/SeleniumSBA/selenium.maven.deom/ScreenShots/screenshot__"+System.currentTimeMillis()+".png";
				
				System.out.println("AAAAFFFFTTTTEEEERRRRRR");	
					
				File destination= new File(path);
				
				try{
					FileUtils.copyFile(srcFile, destination);
					
				}catch (IOException E){
					System.out.println("HHHHHHHHHHHHHHHUUUUUUUUU");
					//logEvent.error("Screen capture copy failed "+E);
				}
			}
			
			else{
				System.out.println("LLLLLLLLLLUUUUUU");
				//logEvent.error("Issues to add add screenshot to file due to ClassCastException");
			}
			
			//return path;
			System.out.println("YOOOOOOOOOOOOOOO "+path);
		}*/
}
