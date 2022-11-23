package medifox_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebElementWait;

public class DoctorConvOPD_Page_Locator {
	WebDriver driver = null;
	
	public DoctorConvOPD_Page_Locator(WebDriver driver){
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
	
	@FindBy(linkText="Doctor Conv. OPD")
	private WebElement doctorConvOpdLink;
	public WebElement getDoctorConvOPDlink() {
		if(WebElementWait.waitToElementClickable(driver, doctorConvOpdLink)!=null)
		return doctorConvOpdLink;
	else
		return null;
    }
	
	@FindBy(id="SelectedDoctor")
	private WebElement selDoctDropDown;
	public WebElement getSelectDoct() {
		if(WebElementWait.waitToElementClickable(driver, selDoctDropDown)!=null)
		return selDoctDropDown;
	else
		return null;
    }
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement addCommisonButton;
	public WebElement getCommButton() {
		if(WebElementWait.waitToElementClickable(driver, addCommisonButton)!=null)
		return addCommisonButton;
	else
		return null;
    }
	
	@FindBy(id="amount")
	private WebElement aMount;
	public WebElement getAmount() {
		if(WebElementWait.waitToElementClickable(driver, aMount)!=null)
		return aMount;
	else
		return null;
    }
	
	@FindBy(id="SaveBtn")
	private WebElement addButton;
	public WebElement getAddButton() {
		if(WebElementWait.waitToElementClickable(driver, addButton)!=null)
		return addButton;
	else
		return null;
    }
	
	@FindBy(linkText="Voucher")
	private WebElement voucherButton;
	public WebElement getVoucherButton() {
		if(WebElementWait.waitToElementClickable(driver, voucherButton)!=null)
		return voucherButton;
	else
		return null;
    }
	
	@FindBy(xpath="//a[@onclick='window.print();']")
	private WebElement printButton;
	public WebElement getPrintButton() {
		if(WebElementWait.waitToElementClickable(driver, printButton)!=null)
		return printButton;
	else
		return null;
    }
	
	@FindBy(xpath="//button[@class='btn btn-default pull-left']")
	private WebElement closeButton;
	public WebElement getCloseButton() {
		if(WebElementWait.waitToElementClickable(driver, closeButton)!=null)
		return closeButton;
	else
		return null;
    }
	
	@FindBy(xpath="//button[@class='close']")
	private WebElement closeArrow;
	public WebElement getCloseArrowButton() {
		if(WebElementWait.waitToElementClickable(driver, closeArrow)!=null)
		return closeArrow;
	else
		return null;
    }
}
