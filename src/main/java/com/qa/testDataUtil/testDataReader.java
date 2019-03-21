package com.qa.testDataUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;



public class testDataReader {
	
	public String getCommonDataUsingjSON(String scenarioName, String key) {
		String value=null;
		try {
			String text = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/testData/JSon/global_TestData.json")), StandardCharsets.UTF_8);
			JSONObject obj = new JSONObject(text);
			JSONObject profileData = obj.getJSONObject(scenarioName).getJSONObject("Common");
			value = profileData.getString(key);
			return value;
            
		} catch (Exception ex) {
			// TODO: handle exception
			//System.out.println(ex.toString());
			return value;
		}
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		testDataReader js=new testDataReader();
		System.out.println(js.getCommonDataUsingjSON("ValidCityWeatherScenario", "validCity"));
	}*/
}

