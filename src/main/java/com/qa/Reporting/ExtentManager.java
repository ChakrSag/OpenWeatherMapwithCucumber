package com.qa.Reporting;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentKlovReporter;
//import com.aventstack.extentreports.reporter.KlovReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    
    static ExtentReports extent;
    //static ExtentTest parentTest;
    //static ExtentKlovReporter klov;
    //static ExtentHtmlReporter htmlReporter;
    
    static ExtentReports getInstance() {
    	extent = new ExtentReports();
        return extent;
    }
    
  /*  static ExtentHtmlReporter gethtmlReporterInstance(String fileName) {
    	htmlReporter= new ExtentHtmlReporter(fileName);
        return htmlReporter;
    }*/
    
    /*static ExtentTest getExtentInstance() {
    	
        return parentTest;
    }*/
    
    public static ExtentReports createInstance(String fileName) {
    			ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter(fileName);
    		 	//htmlReporter = new ExtentHtmlReporter(fileName);
    	        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
    	        htmlReporter.config().setChartVisibilityOnOpen(true);
    	        htmlReporter.config().setTheme(Theme.STANDARD);
    	        htmlReporter.config().setDocumentTitle(fileName);
    	        htmlReporter.config().setEncoding("utf-8");
    	        //htmlReporter.config().setProtocol(Protocol.HTTPS);
    	        htmlReporter.config().setReportName("PA BDD-Regression Testing Report");
    	        extent = new ExtentReports();
    	       
    	        /*klov=new ExtentKlovReporter("PA BDD-All Runs", "Build 1");
    	        klov.initMongoDbConnection("localhost", 27017);
    	        klov.setProjectName("PA BDD-All Runs");
    	        klov.setReportName("PA History"+ExtentManagerAssociateFunctions.getCurrentDateandTime());
    	        klov.initKlovServerConnection("http://localhost");*/
    	        //System.out.println("Babaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    	        //htmlReporter.setAppendExisting(true);
    	        extent.attachReporter(htmlReporter);
    	/*}
    	
    	else {
    		System.out.println("Existing instance");
    		//htmlReporter = new ExtentHtmlReporter(fileName);
    		htmlReporter.setAppendExisting(true);
    		extent=getInstance();
            extent.attachReporter(htmlReporter);
    	}*/
       
    	//System.out.println("payelaaaaaaaaaa:-"+extent.toString());
        return extent;
        
        //Check Klov report:-http://localhost:90/dashboard
    }
    
/*	public static ExtentTest createTest(String description){
		parentTest = extent.createTest(description);
		
		return parentTest;
	}*/
    
}

