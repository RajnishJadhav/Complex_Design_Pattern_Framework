package medifox_page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import medifox_Page_Locators.DoctorConvOPD_Page_Locator;
import medifox_Page_Locators.Login_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebButton;
import web_Common_Functions.WebDropDown;
import web_Common_Functions.WebLink;
import web_Common_Functions.WebTextBox;

public class DoctorConvOPD_Page_Action {
	WebDriver driver =null;
	DoctorConvOPD_Page_Locator convOPDTwoPL=null;
	ExtentTest logger=null;
	
	public DoctorConvOPD_Page_Action(WebDriver driver,ExtentTest logger) {
		this.driver = driver;
		this.logger= logger;
		convOPDTwoPL = new DoctorConvOPD_Page_Locator(driver);
	}
	
	public boolean verifyTitle(String expectedTitle){
		return WebBrowser.verifyTitle(driver, expectedTitle);
	}
	
	public void clickOnDoctor() {
		WebLink.click(convOPDTwoPL.getDoctorlink(), "Doctor", logger);
	}
	
	public void clickOnDoctorConvOPD() {
		WebLink.click(convOPDTwoPL.getDoctorConvOPDlink(),"DoctorConvOPD", logger );
	}
	
	public void selectDoctor(String dName) {
		WebDropDown.selectDropDownByVal(convOPDTwoPL.getSelectDoct(), dName, "DoctorName", logger);
	}
	
	public void clickOnCommisionButton() {
		WebButton.click(convOPDTwoPL.getCommButton(), "CommissionButton", logger);
	}
	
	public void enterAmount(String amount) {
		WebTextBox.sendInput(convOPDTwoPL.getAmount(), amount, "Amount", logger);
	}
	
	public void clickOnAddButton() {
		WebButton.click(convOPDTwoPL.getAddButton(),"addButton", logger);
	} 
	
	public void clickOnVoucherButton() {
		WebButton.click(convOPDTwoPL.getVoucherButton(),"voucherButton", logger);
	}
		
	public void clickOnPrintButton() {
		WebButton.click(convOPDTwoPL.getPrintButton(),"PrintButton", logger);
	}
	
  /*public void clickOnCloseButton() {
		WebButton.click(convOPDTwoPL.getCloseButton(), "CloseButton", logger);
	} */
	
	/*public void clickOnCloseArrowButton() {
		WebButton.click(convOPDTwoPL.getCloseArrowButton());
	}*/
	
	public void enterConvOPDDetails(String d, String a){
		clickOnDoctor();
		clickOnDoctorConvOPD();
		selectDoctor(d);
		clickOnCommisionButton();
		enterAmount(a);
		clickOnAddButton();
		clickOnVoucherButton();
		clickOnPrintButton();
	//	clickOnCloseButton();
	//	clickOnCloseArrowButton();
	}
}
