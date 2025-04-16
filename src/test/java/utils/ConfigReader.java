package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties intializeProperties() throws IOException {
		
		
		
		 Properties prop = new Properties();
		    File profile = new File("D:\\Eclipse\\SeleniumProject\\src\\test\\java\\config\\config.properties");
		    FileInputStream fis = new FileInputStream(profile);
		    prop.load(fis);
		    return prop;
	}

}
