package knowledgeware_Page_Tests;

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
import knowledgeware_Page_Actions.RegisterOne_Page_Action;

import knowledgeware_Page_Actions.RegisterThree_Page_Action;
import knowledgeware_Page_Actions.RegisterTwo_Page_Action;
import knowledgeware_Page_Actions.RegisterFour_Page_Action;

public class RegisterOne_Page_Test extends BaseClass {
	@Test(priority = 1)
	public void loginPageTest() throws IOException {

		try {
			RegisterOne_Page_Action regOnePA = new RegisterOne_Page_Action(driver, reportLogger);
			Assert.assertEquals(regOnePA.verifyTitle("Register page"), true);
			regOnePA.enterPageOneDetails(
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "username"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "password"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "confirmpassword"));
			reportLogger.log(LogStatus.PASS,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		} catch (IOException e) {
			String s = e.toString().substring(1, 15);
			reportLogger.log(LogStatus.FAIL,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")) + s);
		}
	}

	@Test(priority = 2)
	public void pageOneTest() throws IOException {
		try {
			RegisterTwo_Page_Action regTwoPA = new RegisterTwo_Page_Action(driver, reportLogger);
			Assert.assertEquals(regTwoPA.verifyTitle("Reg2"), true);
			regTwoPA.enterPageTwoDetails(
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "firstName"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "lastName"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "BirthDate"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "BirthMonth"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "BirthYear"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "EmailID"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "MobNum"));
			reportLogger.log(LogStatus.PASS,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		} catch (IOException e) {
			reportLogger.log(LogStatus.FAIL,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		}
	}

	@Test(priority = 3)
	public void pageTwoTest() throws IOException {
		try {
			RegisterThree_Page_Action regThreePA = new RegisterThree_Page_Action(driver, reportLogger);
			Assert.assertEquals(regThreePA.verifyTitle("Reg3"), true);
			regThreePA.enterPageThreeDetails(
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "Address"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "City"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "PinCode"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "State"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "Country"));
			reportLogger.log(LogStatus.PASS,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		} catch (IOException e) {
			reportLogger.log(LogStatus.FAIL,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		}
	}

	@Test(priority = 4)
	public void pageFourTest() throws IOException {
		try {
			RegisterFour_Page_Action regFourPA = new RegisterFour_Page_Action(driver, reportLogger);
			Assert.assertEquals(regFourPA.verifyTitle("Reg4"), true);
			regFourPA.enterPageFourDetails(
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath, "Hobby"));
			reportLogger.log(LogStatus.PASS,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		} catch (IOException e) {
			reportLogger.log(LogStatus.FAIL,
					reportLogger.addScreenCapture(Reporter.screenCapture(driver, "LoginTest")));
		}
	}
}
