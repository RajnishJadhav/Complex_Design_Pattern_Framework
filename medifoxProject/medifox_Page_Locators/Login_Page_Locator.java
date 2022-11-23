package medifox_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebElementWait;

public class Login_Page_Locator {
	WebDriver driver = null;
	
	public Login_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);//Mandatory to initialize page factory elements
	}
	
	@FindBy(name="Username")
	private WebElement usrName;
	public WebElement getuserName() {
		if(WebElementWait.waitToElementClickable(driver, usrName)!=null)
		return usrName;
	else
		return null;
    }
	
	@FindBy(name="Password")
	private WebElement pass;
	public WebElement getPassword() {
		if(WebElementWait.waitToElementClickable(driver, pass)!=null)
		return pass;
	else
		return null;
    }
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;
	public WebElement getLogin() {
		if(WebElementWait.waitToElementClickable(driver, login)!=null)
		return login;
	else
		return null;
    }
	
	
		
	}


