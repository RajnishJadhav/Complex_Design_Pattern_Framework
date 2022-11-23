package dataSource;

import java.io.IOException;

public class StringArray {

	public static void main(String[] args) throws IOException {

          String arr=PropertiesReader.getPropertyValue("C:/Eclipse/Complex_Design_Pattern_Framework/TestData/knowledgeware/config.properties",
  				"Hobbies"); 
          
          String[] ar=methodA(arr);
          for(int i=0;i<ar.length;i++) {
        	  System.out.println(ar[i]);
          }
	}
	
	public static String[] methodA(String a) {
		 return a.split(",");
	}

}
