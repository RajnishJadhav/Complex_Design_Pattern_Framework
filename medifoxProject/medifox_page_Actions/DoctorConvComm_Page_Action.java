package medifox_page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import medifox_Page_Locators.DoctorConvComm_Page_Locator;
import medifox_Page_Locators.DoctorConvOPD_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebLink;
import web_Common_Functions.WebTextBox;

public class DoctorConvComm_Page_Action {
	
	WebDriver driver =null;
	DoctorConvComm_Page_Locator convCommPL=null;
	ExtentTest logger=null;
	
	public DoctorConvComm_Page_Action(WebDriver driver,ExtentTest logger) {
		this.driver=driver;
		this.logger=logger;
		convCommPL=new DoctorConvComm_Page_Locator(driver);
	}
	
	public boolean verifyTitle(String expectedTitle){
		return WebBrowser.verifyTitle(driver, expectedTitle);
	}
	
	public void clickOnDoctor() {
		WebLink.click(convCommPL.getDoctorlink(), "Doctor", logger);
	}
      
	public void clickOnDoctorCommLink() {
		WebLink.click(convCommPL.getCommLink(), "DoctorCommissionReport", logger);
	}
	public void clickOnFromDate(String fDate) {
		WebTextBox.sendInput(convCommPL.getFromdate(),fDate, "From Date", logger);
	}
	public void clickOnToDate(String TDate) {
		WebTextBox.sendInput(convCommPL.getTodate(),TDate, "To date", logger);
	}
	public void clickOnSearch() {
		WebLink.click(convCommPL.getSearchButton(), "Search", logger);
	}
	public void clickOnExportButton() {
		WebLink.click(convCommPL.getExportToExcelButton(), "Export Button", logger);
	}
	
	public void enterConvCommDetails(String f, String t) {
		clickOnDoctor();
		clickOnDoctorCommLink();
		clickOnFromDate(f);
		clickOnToDate(t);
		clickOnSearch();
		clickOnExportButton();
	}
}
