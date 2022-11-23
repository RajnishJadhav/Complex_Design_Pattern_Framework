package web_Common_Functions;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import web_Common_Functions.WebElementCommon;

public class WebTextBox {
	/*
	 * Purpose: - THis method is to enter text into a text box
	 * param 1: - WebElement
	 * Param 2: - String
	 * Return: - Void/None
	 */
	public static void sendInput(WebElement textBox, String text, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(textBox,fieldName,logger)){
			textBox.sendKeys(text);
			logger.log(LogStatus.PASS, fieldName+" entered successfully");
		}else {
			logger.log(LogStatus.FAIL, fieldName+" not able to entered");
		}
	}
	
	public static void clearText(WebElement textBox, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(textBox,fieldName,logger)){
			textBox.clear();
			logger.log(LogStatus.PASS, fieldName+" entered successfully");
		}else {
			logger.log(LogStatus.FAIL, fieldName+" not able to entered");
		}
		}
	}

