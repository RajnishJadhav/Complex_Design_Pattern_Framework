package knowledgeware_Page_Actions;


import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterThree_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebDropDown;
import web_Common_Functions.WebLink;
import web_Common_Functions.WebTextBox;

public class RegisterThree_Page_Action {
	
	WebDriver driver  = null;  //create global instance of webdriver
	RegisterThree_Page_Locator regThreePL = null; //instance create kiya Page two locator ka
	ExtentTest logger=null;
	
	public RegisterThree_Page_Action(WebDriver driver,ExtentTest logger){
		this.driver = driver;
		this.logger =logger;
		regThreePL = new RegisterThree_Page_Locator(driver); // yaha se driver pass kiya
	}
	
	public boolean verifyTitle(String expectedTitle){
		return WebBrowser.verifyTitle(driver, expectedTitle);
	}
	
	public void enterAddress(String addr){
		WebTextBox.sendInput(regThreePL.getAddress(), addr, "address", logger);
	}
	public void enterCity(String city){
		WebTextBox.sendInput(regThreePL.getCity(), city, "City", logger);
	}
	public void enterPincode(String pin){
		WebTextBox.sendInput(regThreePL.getPincode(), pin, "pinCode", logger);
	}
	public void enterState(String state){
		WebTextBox.sendInput(regThreePL.getState(), state, "state", logger);
	}
	public void enterCountry(String country){
		WebDropDown.selectDropDownByVal(regThreePL.getCountry(), country, "Country", logger);
	}
	public void ClickOnNext(){
		WebLink.click(regThreePL.getNextButton(), "ClickButton", logger);
	}
	
	public RegisterFour_Page_Action enterPageThreeDetails(String a, String c, String p, String s, String co){
		RegisterFour_Page_Action regFourPA=null;
				try {
					enterAddress(a);
					enterCity(c);
					enterPincode(p);
					enterState(s);
					enterCountry(co);
					ClickOnNext();
					regFourPA= new RegisterFour_Page_Action(driver,logger);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return regFourPA;
				
		}
	}


