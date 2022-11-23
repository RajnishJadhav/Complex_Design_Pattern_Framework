package web_Common_Functions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class WebAlert {
	public static void accept(WebDriver driver){
		if(WebElementWait.isAlertPresent(driver)!=null){
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}else{
			System.out.println("Alert not present");
		}
	}
	public static void decline(WebDriver driver){
		if(WebElementWait.isAlertPresent(driver)!=null){
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}else{
			System.out.println("Alert not present");
		}
	}
	public static String getAlertText(WebDriver driver){
		String alerttext = null;
		if(WebElementWait.isAlertPresent(driver)!=null){
			Alert alert = driver.switchTo().alert();
			alerttext = alert.getText();
		}else{
			System.out.println("Alert not present");
		}	
		return alerttext;
	}
	public static void sendInput(WebDriver driver, String textToEnter){
		if(WebElementWait.isAlertPresent(driver)!=null){
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(textToEnter);
		}else{
			System.out.println("Alert not present");
		}
	}
}
