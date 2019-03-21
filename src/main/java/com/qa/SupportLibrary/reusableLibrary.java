package com.qa.SupportLibrary;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.readProperty.*;
import com.qa.testDataUtil.testDataReader;
import com.qa.browserSelector.*;
import com.qa.objectRepository.homePage;
import com.qa.objectRepository.citySearchResultPage;
import com.qa.objectRepository.cityTempDetailsPage;
import com.qa.BusinessComponants.homeComp;
import com.qa.BusinessComponants.citySearchResultComp;
import com.qa.BusinessComponants.cityTempDetailsComp;



public abstract class reusableLibrary {
	
	protected Logger logEvent=Logger.getLogger(getClass().getSimpleName());
	protected readPropertyFileData dataReadFromPropertyFile=new readPropertyFileData();
	protected selectBrowser browserToLaunch=new selectBrowser();
	//protected readXML xmlReader=new readXML();
	protected testDataReader testData=new testDataReader();
/*	protected commonPage commonpage;
	protected commonComp commoncomp;
	protected profilePage profilepage;
	protected profileComp profilecomp;
	protected residencePage residencepage;
	protected residenceComp residencecomp;
	protected employmentPage employmentpage;
	protected employmentComp employmentcomp;
	protected criminalandIdentityPage criminalandIdentitypage;
	protected addlInfoReviewLogOutPage addlInfoReviewLogOutpage;
	protected addlInfoReviewLogOutComp addlInfoReviewLogOutcomp;*/
	
	/**
	 * Abstract functions to be declared in child class
	 */
	
	public abstract void hardWait();	
	public abstract boolean explicitWaitforElementClickable(WebElement element);
	public abstract boolean explicitWaitforElementVisible(WebElement element);
	public abstract void clickObject(WebElement element);
	public abstract void selectDatabyVizText(WebElement element,String data);
	public abstract void fillData(WebElement element,String data);
	public abstract boolean findElement(By by);
	public abstract String findPartialElementText(By by);
	public abstract String getScreenshotWhereRequired(String testName);
	public abstract void handleAlert(boolean action);
	public abstract void monthSelectorfromCalendar(String Date, WebElement calendarMonthYear, WebElement calendarMonthSwipeButton);
	public abstract void dateSelector(String exactDate, List<WebElement> datetoSelect);
	public abstract void typeStringintoHotelSearchBox(String string, WebElement searchBox, String browser);
	public abstract void scrolltoViewWebElement(WebElement element);
	public abstract void clickElementUsingJavaScript(WebElement element);
	public abstract void keyboardAction(CharSequence Key, int keycode);
	
	
	
	/**
	 * Function to return the Current date timestamp as a string
	 * @return
	 */
	static String getCurrentDateandTime(){
		DateFormat dateFormat=new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss a");
		Date date=new Date();
		String dateString = dateFormat.format(date);
		
		return dateString;
	}
	
	/**
	 * function to create directory
	 * @param directoryName
	 * @return
	 */
	public File createDirectory(String directoryName){

			File directoryfortheDay=new File(directoryName);
		
		if (!directoryfortheDay.exists()) {
			//logEvent.info("Directory creation takes place for Reports" + directoryfortheDay);
			directoryfortheDay.mkdir();
			//System.out.println("**************Created************");
		}
		
		else{
			//logEvent.info(directoryfortheDay+ " already created directory");
			//System.out.println("**************Already Created************");
			/**
			 * Do nothing
			 */
		}
		
		return directoryfortheDay;
	}
	
	/**
	 * Function to return exact class name to feed into excel for test data finding
	 * @param className
	 * @return
	 */
	
	public String classNameSplit(String className){
		
		String actualclass[]=className.split("\\.");
		//logEvent.info("Required class name:- "+actualclass[3]);
		return actualclass[3];
	}
	
	
	/**
	 * Function to return exact class name to feed into excel for test data finding
	 * @param className
	 * @return
	 */
	
	public String testDataSeperator(String globalTestData){
		
		String actualTestdata[]=globalTestData.split("#");
		//logEvent.info("Required class name:- "+actualTestdata[1]);
		return actualTestdata[1];
	}
	
	/**
	 * Reg Exp functions to facilitate reporting utilities
	 * @param test
	 * @return
	 */
	
	public static boolean ifStringhasSpace(String test) {
		boolean containSpace=false;
		if(test.contains(" ")) {
			containSpace=true;
		}		
		return containSpace;
	}
	
	public static String scenarioNameforTData(String scenarioName) {
		String revisedScenarioName=null;
		if(scenarioName.contains(" ")) {
			revisedScenarioName=scenarioName.replaceAll("\\s+", "");
		}		
		return revisedScenarioName;
	}
	
	public static String featrNmeReportCreatn(String scenarioID) {
		String featureFolder[]=scenarioID.split("\\;");
		String aclFetrNme=featureFolder[0].replaceAll("-", "_");
		return aclFetrNme;
	}
	
	public static String stpNmeScrnshtCreatn(String actualStepName) {
		String revisedStepName=null;
		if(actualStepName.contains(" ")) {
			revisedStepName=actualStepName.replace('"', ' ');
		}
		if(revisedStepName.contains(" ")) {
			revisedStepName=revisedStepName.replaceAll("\\s+", "_");
		}		
		return revisedStepName;
	}
	
	public static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
  
	
}
