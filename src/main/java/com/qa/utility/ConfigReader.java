package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	private Properties tdata;

	/**
	 * This method is used to load the properties from config.properties file
	 * @return it returns Properties prop object
	 */
	public Properties init_prop() {

		prop = new Properties();	
		try {
			//String projectPath = System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream("./src/test/resources/org/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
	public Properties test_data_prop() {
		
		tdata = new Properties();	
		try {
			//String projectPath = System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream("./src/test/resources/org/test_data/test_data.properties");
			tdata.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return tdata;	
	}
	
}
