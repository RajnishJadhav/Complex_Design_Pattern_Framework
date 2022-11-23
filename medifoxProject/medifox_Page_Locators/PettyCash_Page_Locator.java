package medifox_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PettyCash_Page_Locator {
	
WebDriver driver = null;
	
	public PettyCash_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
