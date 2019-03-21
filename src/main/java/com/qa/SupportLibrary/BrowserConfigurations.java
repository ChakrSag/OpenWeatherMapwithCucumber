package com.qa.SupportLibrary;

public enum BrowserConfigurations {
	
	fireFoxDriverLocation {
	      public String toString() {
	          return "/drivers/geckodriver.exe";
	      }
	  },
	
	fireFoxDriverLocationMAC {
	      public String toString() {
	          return "/drivers/geckodriver";
	      }
	  },
	
	googleChromeDriverLocation {
	      public String toString() {
	          return "/drivers/chromedriver.exe";
	      }
	  },
	
	googleChromeDriverLocationMAC {
	      public String toString() {
	          return "/drivers/chromedriver";
	      }
	  }
	
}
