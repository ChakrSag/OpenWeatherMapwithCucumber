package com.qa.readProperty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readPropertyFileData {
	
public String readData (String data){
		
		Properties p=new Properties();
		InputStream input=null;
		String propFileName = "config.properties";
		
		try{
			input=getClass().getClassLoader().getResourceAsStream(propFileName);
			
			if (input!= null) {
				p.load(input);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
			
		}catch(IOException ex){
			ex.printStackTrace();
		} finally{
			
			if (input!=null){
				try{
				input.close();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
			else{
				System.out.println("Input is null");
			}
			
		}
		return p.getProperty(data);
	}
}
