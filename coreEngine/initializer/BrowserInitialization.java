package initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserInitialization {
	public static WebDriver driver = null;
	public static WebDriver openBrowser(String browserName){
		switch(browserName){
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", 
						"C:/Eclipse/Driver/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "Firefox":
				System.setProperty("webdriver.chrome.driver", 
						"C:/Eclipse/Driver/chromedriver.exe");
				driver = new FirefoxDriver();
				break;
			case "Edge": 
				System.setProperty("webdriver.chrome.driver", 
						"C:/Eclipse/Driver/chromedriver.exe");
				driver = new EdgeDriver();
				break;
			case "Opera":
				System.setProperty("webdriver.chrome.driver", 
						"C:/Eclipse/Driver/chromedriver.exe");
				driver = new OperaDriver();
				break;
			default:
				System.setProperty("webdriver.chrome.driver", 
						"C:/Eclipse/Driver/chromedriver.exe");
				driver = new ChromeDriver();
				break;
		}
		return driver;
	}
}
