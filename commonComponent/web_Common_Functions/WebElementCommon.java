package web_Common_Functions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebElementCommon {
	/*
	 * Purpose: - This method is to validate web element is present in the dom
	 * Param: - WebElement
	 * Return: - Boolean (True/False)
	 */
	public static boolean isPresent(WebElement element,String fieldName, ExtentTest logger){
		boolean isPre = false;
		if(element.isDisplayed()){
			isPre = true;
			logger.log(LogStatus.PASS, "As a user i am validating "+fieldName+" is Present in DOM.");
		}else {
			logger.log(LogStatus.FAIL, "As a user i am validating "+fieldName+" is not Present in DOM");
		}
		return isPre;
	}
	
	/*public static boolean isPresent(List<WebElement> elements){
		boolean isPre = false;
	if(elements.isDisplayed()){
			isPre = true;
		}
		return isPre;
	}*/
	/*
	 * Purpose: - This method is to validate web element is clickable or not
	 * Param: - WebElement
	 * Return: - Boolean (True/False)
	 */
	public static boolean isClickable(WebElement element,String fieldName, ExtentTest logger){
		boolean isClick = false;
		if(isPresent(element,fieldName,logger)){
			if(element.isEnabled()){
				isClick = true;
				logger.log(LogStatus.PASS, "As a user i am validating "+fieldName+" is Clickable");
			}else {
				logger.log(LogStatus.FAIL, "As a user i am validating "+fieldName+" is not Clickable");
			}
		}
	
		return isClick;
	}
	/*public static boolean isClickable(List<WebElement> element){
		boolean isClick = false;
		if(isPresent(element)){
			if(((WebElement) element).isEnabled()){
				isClick = true;
			}
		}
	
		return isClick;
	} */
}
