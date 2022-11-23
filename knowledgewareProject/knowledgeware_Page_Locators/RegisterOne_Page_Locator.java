package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebElementWait;

public class RegisterOne_Page_Locator {
	WebDriver driver = null;
	public RegisterOne_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);//Mandatory to initialize page fatctory elements
	}
	
	//WebElement userName = driver.findElement(By.name("name"));
	@FindBy(name="name") 
	private WebElement userName;
	
	public WebElement getUserName(){
		if(WebElementWait.waitToElementClickable(driver, userName)!=null)
			return userName;
		else
			return null;
	}
	
	@FindBy(name="password") 
	private WebElement password;
	
	public WebElement getPassword(){
		if(WebElementWait.waitToElementClickable(driver, password)!=null)
			return password;
		else
			return null;
	}
	
	@FindBy(xpath="//input[@name='confirmpassword']") 
	private WebElement confirmPassword;
	
	public WebElement getConfirmPassword(){
		if(WebElementWait.waitToElementClickable(driver, confirmPassword)!=null)
			return confirmPassword;
		else
			return null;
	}
	
	@FindBy(linkText="LOGIN")
	private WebElement loginButton;
	
	public WebElement getLoginLink(){
		if(WebElementWait.waitToElementClickable(driver, loginButton)!=null)
		return loginButton;
		else
			return null;
	}  
}
