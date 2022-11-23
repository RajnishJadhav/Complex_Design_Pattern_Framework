package medifox_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebElementWait;

public class DoctorConvComm_Page_Locator {
	
     WebDriver driver = null;
	
	public DoctorConvComm_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Doctor")
	private WebElement doctorLink;
	public WebElement getDoctorlink() {
		if(WebElementWait.waitToElementClickable(driver, doctorLink)!=null)
		return doctorLink;
	else
		return null;
    }
	
	@FindBy(linkText="Doctor Comm. Report")
	private WebElement doctorCommLink;
	public WebElement getCommLink() {
		if(WebElementWait.waitToElementClickable(driver, doctorCommLink)!=null)
			return doctorCommLink;
		else
			return null;
	}
	
	@FindBy(id="FromDate")
	private WebElement fromDate;
	public WebElement getFromdate() {
		if(WebElementWait.waitToElementClickable(driver, fromDate)!=null)
			return fromDate;
		else
			return null;
	}
	
	@FindBy(id="ToDate")
	private WebElement toDate;
	public WebElement getTodate() {
		if(WebElementWait.waitToElementClickable(driver, toDate)!=null)
			return toDate;
		else
			return null;
	}
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchButton;
	public WebElement getSearchButton() {
		if(WebElementWait.waitToElementClickable(driver, searchButton)!=null)
			return searchButton;
		else
			return null;
	}
	
	@FindBy(xpath="//a[@onclick='ExportToExcel();']")
	private WebElement exportButton;
	public WebElement getExportToExcelButton() {
		if(WebElementWait.waitToElementClickable(driver, exportButton)!=null)
			return exportButton;
		else
			return null;
	}
}
