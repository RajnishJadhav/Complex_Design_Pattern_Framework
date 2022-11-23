package web_Common_Functions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import initializer.Reporter;

public class WebElementWait {
	public static Alert isAlertPresent(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static WebElement waitToElementClickable(WebDriver driver, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement waitToElementClickable(WebDriver driver, By by){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public static WebElement visibilityOfElement(WebDriver driver,By by){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
}
