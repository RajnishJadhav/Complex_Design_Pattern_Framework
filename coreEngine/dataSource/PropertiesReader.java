package dataSource;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	public static String getPropertyValue(String filePath, String key) throws IOException{
		FileReader file = new FileReader(filePath);//To Read any type of file
		Properties property = new Properties();//To Start Properties file ops
		property.load(file);//It will load complete file key/value
		return property.getProperty(key);//Will return a value of any key
	}
	
	public static String[] getPropertyValue(String filePath, String[] key) throws IOException{
		FileReader file = new FileReader(filePath);//To Read any type of file
		Properties property = new Properties();//To Start Properties file ops
		property.load(file);//It will load complete file key/value
		String[] values = new String[key.length];
		for(int i=0;i<key.length;i++){
			values[i] = property.getProperty(key[i]);
		}
		return values;//Will return a value of any key
	}
	public static void main(String[] args) throws IOException {
		String userVal = getPropertyValue("C:/Eclipse/Complex_Design_Pattern_Framework/TestData/medifox/config.properties",
				"url");
		System.out.println(userVal);
	}
}
/*
 * 
 * data provider
 * parameter
 * xml
 * properties
 * excel
 * csv
 */
