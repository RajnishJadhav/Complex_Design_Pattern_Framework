package web_Common_Functions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class WebBrowser {
	public static void setBrowserSize(WebDriver driver, int height, int width){
		Dimension newDim = new Dimension(width, height);
		driver.manage().window().setSize(newDim);
	}
	public static boolean verifyTitle(WebDriver driver, String expectedTitle){
		boolean titleMatch = false;
		if(driver.getTitle().equals(expectedTitle)){
			titleMatch = true;
		}
		return titleMatch;
	}
}
