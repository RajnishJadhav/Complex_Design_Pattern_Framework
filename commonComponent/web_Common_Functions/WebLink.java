package web_Common_Functions;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import web_Common_Functions.WebElementCommon;

public class WebLink {
	public static void click(WebElement link, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(link,fieldName,logger)){
			link.click();
			logger.log(LogStatus.PASS, fieldName+" is Clickable");
		}else {
			logger.log(LogStatus.FAIL, fieldName+" is not Clickable");
		}
		}
	}

