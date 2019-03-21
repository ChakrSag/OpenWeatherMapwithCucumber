package com.qa.Reporting;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
//import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class ExtentManagerAssociateFunctions {

	/**
	 * Function to return the Current date as a string
	 * @return
	 */
	public static String getCurrentDate(){
		DateFormat dateFormat=new SimpleDateFormat("MM-dd-yyyy");
		Date date=new Date();
		String dateString = dateFormat.format(date);
		//System.out.println("****************Sagar**************");
		return dateString;
	}
	
	/**
	 * function to create directory
	 * @param directoryName
	 * @return
	 */
	public static File createDirectory(String directoryName){

			File directoryfortheDay=new File(directoryName);
		
		if (!directoryfortheDay.exists()) {
			directoryfortheDay.mkdir();
			
			//System.out.println("****************Created*****************");
		}
		
		else{
			/**
			 * Do Nothing
			 */
			//System.out.println("****************Already created*****************");
		}
		
		return directoryfortheDay;
	}
	
	/**
	 * Function to return the Current date time stamp as a string
	 * @return
	 */
	public static String getCurrentDateandTime(){
		DateFormat dateFormat=new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss a");
		Date date=new Date();
		String dateString = dateFormat.format(date);
		
		return dateString;
	}
	
	
	
	/*public static String getSprintTimeFrame() {
		
		//considering All sprint work has started from 1st Monday of this year
		String date="1/7/2019";
		//String inputDatePrimary=
		String exactMonth=(date.split("/"))[0];
		int exactYear=Integer.parseInt((date.split("/"))[2]);
		int exactDate=Integer.parseInt((date.split("/"))[1]);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		Month month;
		LocalDate nextMondayDate=null;

		//String nextMondayDateString=null;
		LocalDate sprintEndDate=null;
		//String sprintEndDateString=null;
		
		nextMondayDate = LocalDate.of(2019, month, 13);
		System.out.println(nextMondayDate);
		nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		//System.out.println(ld);
		
		if(exactMonth.equals("1")) {
			month=Month.JANUARY;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("2")) {
			month=Month.FEBRUARY;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//System.out.println("Mamma");
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("3")) {
			month=Month.MARCH;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("4")) {
			month=Month.APRIL;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("5")) {
			month=Month.MAY;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("6")) {
			month=Month.JUNE;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("7")) {
			month=Month.JULY;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("8")) {
			month=Month.AUGUST;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("9")) {
			month=Month.SEPTEMBER;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("10")) {
			month=Month.OCTOBER;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("11")) {
			month=Month.NOVEMBER;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		else if(exactMonth.equals("12")) {
			month=Month.DECEMBER;
			nextMondayDate = LocalDate.of(exactYear, month, exactDate);
			nextMondayDate = nextMondayDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			//nextMondayDateString = nextMondayDate.format(formatter);
			sprintEndDate = nextMondayDate.plus(1, ChronoUnit.WEEKS);
			//sprintEndDateString = sprintEndDate.format(formatter);
		}
		
		//String regressionDateRange=nextMondayDate+"__"+sprintEndDate;
		return nextMondayDate.format(formatter)+"__"+sprintEndDate.format(formatter);
		//return sprintEndDate.format(formatter);
		
		//LocalDate today = LocalDate.now();
        //System.out.println("Current date: " + today);

        //add 2 week to the current date
        
        //System.out.println("Next week: " + next2Week);
	}*/
	
	/*public static void main(String[] args) {
		//new File("D:\\mytestDirectory").mkdir();
		//new File("\\\\APACBLR01APP47Q\\c$\\ISagar").mkdir();
		//System.out.println(getSprintTimeFrame("2/11/2019"));
		ArrayList<String> a=getAllSprintTime();
		for(String s:a) {
			System.out.println(s);
		}
		//System.out.println(today());
		//System.out.println(decideDailyorSprintReport());
		if(reportDateString().contains("__")) {
			System.out.println("Mamma");
		}
		else {
			System.out.println("Pappa");
		}
	}*/
	
	
	
	static String today() {
		//return LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
		//return formatter.print(DateTime.now());
		//for test
		return formatter.print(DateTime.now().plusDays(9));
	}
	
	public static boolean checkEmptyFolder(File folderPath) {
		//File file = new File(folderPath);
		if(folderPath.isDirectory()){
			if(folderPath.list().length>0){
				
				System.out.println("Directory is not empty!");
				return false;
					
			}else{
					
				System.out.println("Directory is empty!");
				return true;
					
			}
		}
		else{
			
			System.out.println("This is not a directory");
			return true;
				
		}
	}
	
	
	
}
