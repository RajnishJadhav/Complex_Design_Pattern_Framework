package knowledgeware_Page_Actions;


import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterTwo_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebButton;
import web_Common_Functions.WebDropDown;
import web_Common_Functions.WebLink;
import web_Common_Functions.WebTextBox;

public class RegisterTwo_Page_Action {
	
	WebDriver driver  = null;  //create global instance of webdriver
	RegisterTwo_Page_Locator regTwoPL = null; //instance create kiya Page two locator ka
	ExtentTest logger=null;
	
	public RegisterTwo_Page_Action(WebDriver driver,ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		regTwoPL = new RegisterTwo_Page_Locator(driver); // yaha se driver pass kiya
	}
	
	public boolean verifyTitle(String expectedTitle){
		return WebBrowser.verifyTitle(driver, expectedTitle);
	}
	
	public void getFirstName(String fName){
		WebTextBox.sendInput(regTwoPL.getFName(), fName, "first Name", logger);
	}
	
	public void getLastName(String lName){
		WebTextBox.sendInput(regTwoPL.getLName(), lName, "last Name", logger);
	}
	public void getBirthDay(String bDay){
		WebDropDown.selectDropDownByVal(regTwoPL.getBirthdayDay(), bDay, "birthday", logger);
	}
	public void getBirthMonth(String bMonth){
		WebDropDown.selectDropDownByVal(regTwoPL.getBirthdayMonth(), bMonth, "birthdayMonth", logger);
	}
	public void getBirthYear(String bYear){
		WebDropDown.selectDropDownByVal(regTwoPL.getBirthdayYear(), bYear, "birthdayYear", logger);
	}
	
	public void getEmail(String eMail){
		WebTextBox.sendInput(regTwoPL.getEmailID(), eMail, "EmailID", logger);
	}
	public void getMobNumber(String MobNo){
		WebTextBox.sendInput(regTwoPL.getMobNum(), MobNo, "Mob_No", logger);
	}
	public void getGender(){
		WebButton.click(regTwoPL.getGenderMale(), "Male Gender", logger); 
	}
	
	public void ClickOnNext(){
		WebLink.click(regTwoPL.getNextButton(), "NextButton", logger);
	}
	/*public void ClickOnBack(){
		WebLink.click(regTwoPL.getBackButton());
	}*/
	
	public RegisterThree_Page_Action enterPageTwoDetails(String fN, String lN, String d, String i, String y, String e, String mo) {
		RegisterThree_Page_Action regThreePA = null;
				try {
					getFirstName(fN);
					getLastName(lN);
					getBirthDay(d);
					getBirthMonth(i);
					getBirthYear(y);
					getEmail(e);
					getMobNumber(mo);
					getGender();
					ClickOnNext();
					regThreePA= new RegisterThree_Page_Action(driver,logger);	
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return regThreePA;
			}		
	}
