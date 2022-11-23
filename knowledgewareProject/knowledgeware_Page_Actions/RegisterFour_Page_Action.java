package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterFour_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebCheckBox;
import web_Common_Functions.WebLink;
import web_Common_Functions.WebTextBox;

public class RegisterFour_Page_Action {
	
	WebDriver driver  = null;  //create global instance of webdriver
	RegisterFour_Page_Locator regFourPL = null; //instance create kiya Page two locator ka
	ExtentTest logger=null;
	
	public RegisterFour_Page_Action(WebDriver driver,ExtentTest logger){
		this.driver = driver;
		this.logger= logger;
		regFourPL = new RegisterFour_Page_Locator(driver); // yaha se driver pass kiya

}
	
	public boolean verifyTitle(String expectedTitle){
		return WebBrowser.verifyTitle(driver, expectedTitle);
	}
	
	public void checkBoxClick(){
		WebCheckBox.selectCheckBox(regFourPL.getCheckbox(), "checkBox", logger);
	}
	public void checkBoxSinging(){
		WebCheckBox.selectCheckBox(regFourPL.getSinging(), "Singing", logger);
	}

	public void checkBoxDancing(){
		WebCheckBox.selectCheckBox(regFourPL.getDancing(), "Dancing", logger);
	}
	public void checkBoxSketching(){
		WebCheckBox.selectCheckBox(regFourPL.getSketching(), "Sketching", logger);
	}
	public void hobbyOther(){
		WebCheckBox.selectCheckBox(regFourPL.getOther(), "OtherCheckbox", logger);
	}
	
	public void enterHobby(String hob){
		WebTextBox.sendInput(regFourPL.getHobby(), hob, "Hobby", logger);
	}
	
	
	public void ClickOnNext(){
		WebLink.click(regFourPL.getNextButton(), "NextButton", logger);
	}
	
	public void enterPageFourDetails(String H){
		checkBoxClick();
		checkBoxSinging();
		checkBoxDancing();
		checkBoxSketching();
		hobbyOther();
		enterHobby(H);
		ClickOnNext();
	}
}