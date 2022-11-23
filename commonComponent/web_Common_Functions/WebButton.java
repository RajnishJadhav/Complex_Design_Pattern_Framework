package web_Common_Functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import web_Common_Functions.WebElementCommon;

public class WebButton {
	public static void click(WebElement button, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(button,fieldName,logger)){
			button.click();
			logger.log(LogStatus.PASS, "As a user i am validating "+fieldName+" clicked successfully");
	}   else {
			logger.log(LogStatus.FAIL, fieldName+" not able to clicked");
		 }
	}
	
	
	public static void click(WebElement button, JavascriptExecutor js, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(button,fieldName,logger)){
			js.executeScript("arguments[0].click();", button);
			logger.log(LogStatus.PASS, fieldName+" clicked successfully");
		}   else {
				logger.log(LogStatus.FAIL, fieldName+" not able to clicked");
			 }
		}
	}

