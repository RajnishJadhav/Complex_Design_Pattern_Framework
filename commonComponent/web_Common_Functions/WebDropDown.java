package web_Common_Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebDropDown {
	
	public static void selectDropDownByVal(WebElement drpDown, String date, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(drpDown,fieldName,logger)){
			Select drpDownValue = new Select(drpDown);
			drpDownValue.selectByValue(date);
			logger.log(LogStatus.PASS, fieldName+" selected successfully");
		}   else {
				logger.log(LogStatus.FAIL, fieldName+" not able to select");
			 }
		}
	
	
	public static void selectDropDownByIndex(WebElement drpDown, int index, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(drpDown,fieldName,logger)){
			Select drpDownValue = new Select(drpDown);
			drpDownValue.selectByIndex(index);
			logger.log(LogStatus.PASS, fieldName+" selected successfully");
		}   else {
				logger.log(LogStatus.FAIL, fieldName+" not able to select");
			 }
		}
	
	
	public static void selectDropDownByVisibleText(WebElement drpDown, String text, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(drpDown,fieldName,logger)){
			Select drpDownValue = new Select(drpDown);
			drpDownValue.selectByVisibleText(text);
			logger.log(LogStatus.PASS, fieldName+" selected successfully");
		}   else {
				logger.log(LogStatus.FAIL, fieldName+" not able to select");
			 }
		}
	}


