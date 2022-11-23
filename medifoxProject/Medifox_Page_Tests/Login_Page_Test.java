package Medifox_Page_Tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import dataSource.StringArray;
import initializer.BaseClass;
import initializer.Reporter;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import dataSource.PropertiesReader;
import medifox_page_Actions.DoctorConvComm_Page_Action;
import medifox_page_Actions.DoctorConvOPD_Page_Action;
import medifox_page_Actions.Login_Page_Action;

public class Login_Page_Test extends BaseClass {

	@Test(priority = 1)
	public void TC1() throws IOException {
		try {
			Login_Page_Action loginPA = new Login_Page_Action(driver, reportLogger);
			Assert.assertEquals(loginPA.verifyTitle("Login"), true);
			loginPA.enterPageOneDetail(
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Username"),
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Password"));
			reportLogger.log(LogStatus.PASS,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		} catch (IOException e) {
			reportLogger.log(LogStatus.FAIL,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		}
	}

	@Test(priority = 2)
	public void TC2() throws IOException {
		try {
			Login_Page_Action loginPA = new Login_Page_Action(driver, reportLogger);
			loginPA.enterPageOneDetail(
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Username"),
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Password"));
			DoctorConvOPD_Page_Action convOPDTwoPA = new DoctorConvOPD_Page_Action(driver, reportLogger);
			Assert.assertEquals(loginPA.verifyTitle("NOVA GRACE HOSPITAL - Dashboard"), true);
			convOPDTwoPA.enterConvOPDDetails(
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Doctor"),
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Amount"));
			reportLogger.log(LogStatus.PASS,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		} catch (IOException e) {
			reportLogger.log(LogStatus.FAIL,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		}
	}
	
	@Test(priority=3)
	public void TC3() throws IOException{
		try {
			Login_Page_Action loginPA = new Login_Page_Action(driver, reportLogger);
			loginPA.enterPageOneDetail(
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Username"),
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "Password"));
			DoctorConvComm_Page_Action convCommPA = new DoctorConvComm_Page_Action(driver, reportLogger);
			Assert.assertEquals(loginPA.verifyTitle("NOVA GRACE HOSPITAL - Dashboard"), true);
			convCommPA.enterConvCommDetails(
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "fromDate"),
					PropertiesReader.getPropertyValue(mediFoxStaticTestData.configPath, "toDate"));
			reportLogger.log(LogStatus.PASS,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		} catch (IOException e) {
			reportLogger.log(LogStatus.FAIL,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		}
	}

}
