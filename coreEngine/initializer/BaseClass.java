package initializer;



import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import dataSource.PropertiesReader;



public class BaseClass {
	public WebDriver driver = null;
	public static String testData = "C:/Eclipse/Complex_Design_Pattern_Framework/TestData/";
	public ExtentTest reportLogger;
	public ExtentReports graphicalReport;
	
	//@Parameters({"project"})
	@BeforeSuite
	public void beforeAllTest() {
		graphicalReport = new ExtentReports(testData+ "/medifox/report.html", true);
	}
	 
	@Parameters({"project", "browser"})
	@BeforeMethod
	public void beforeEachTestCase(String projectName, String browserName,Method testMethod) throws IOException{
	  reportLogger = graphicalReport.startTest(testMethod.getName());
	  driver = BrowserInitialization.openBrowser(browserName);
	  driver.get(PropertiesReader.getPropertyValue(testData+ projectName +"/config.properties",
				"url"));
	}
	
	@AfterMethod
	public void afterEachTestCase(){
		//driver.close();
		graphicalReport.endTest(reportLogger);
		graphicalReport.flush();
	}
}

