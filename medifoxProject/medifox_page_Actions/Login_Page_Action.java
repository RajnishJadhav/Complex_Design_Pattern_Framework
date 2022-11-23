package medifox_page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterOne_Page_Locator;
import medifox_Page_Locators.Login_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebLink;
import web_Common_Functions.WebTextBox;

public class Login_Page_Action {
   
	WebDriver driver =null;
	Login_Page_Locator logOnePL=null;
	ExtentTest logger=null;
	
	public Login_Page_Action(WebDriver driver,ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		logOnePL = new Login_Page_Locator(driver);
	}

	
	public boolean verifyTitle(String expectedTitle){
		return WebBrowser.verifyTitle(driver, expectedTitle);
	}
	
	public void enterUserName(String name) {
		WebTextBox.sendInput(logOnePL.getuserName(), name, "UserName", logger);
	}
	
	public void enterPassword(String Pass) {
		WebTextBox.sendInput(logOnePL.getPassword(), Pass, "Password", logger);
	} 
	
	public void clickOnLogin() {
		WebLink.click(logOnePL.getLogin(), "Login", logger);
	}
	
	public DoctorConvOPD_Page_Action enterPageOneDetail(String n, String p){
		DoctorConvOPD_Page_Action convOPDTwoPA=null;
	try {
				enterUserName(n);
           	   enterPassword(p);
			   clickOnLogin();
			convOPDTwoPA=new DoctorConvOPD_Page_Action(driver,logger);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       return convOPDTwoPA;
	}
	
}
