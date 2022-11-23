package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import web_Common_Functions.WebElementWait;

public class RegisterThree_Page_Locator {
	
	 WebDriver driver = null;
	 public RegisterThree_Page_Locator(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 
	 @FindBy(name="Address")
	 private WebElement address;
	 
	 public WebElement getAddress(){
			if(WebElementWait.waitToElementClickable(driver, address)!=null)
				return address;
			else
				return null;
		}
	 
	 @FindBy(name="City")
	 private WebElement city;
	 
	 public WebElement getCity(){
			if(WebElementWait.waitToElementClickable(driver, city)!=null)
				return city;
			else
				return null;
		}
	 
	 @FindBy(name="Pin_Code")
	 private WebElement pincode;
	 
	 public WebElement getPincode(){
			if(WebElementWait.waitToElementClickable(driver, pincode)!=null)
				return pincode;
			else
				return null;
		}
	 
	 @FindBy(name="State")
	 private WebElement state;
	 
	 public WebElement getState(){
			if(WebElementWait.waitToElementClickable(driver, state)!=null)
				return state;
			else
				return null;
		}
	 
	 @FindBy(name="Country")
	 private WebElement country;
	 public WebElement getCountry(){
			if(WebElementWait.waitToElementClickable(driver, country)!=null)
				return country;
			else
				return null;
		}
	 
	 @FindBy(linkText="NEXT")
	  private WebElement nextButton;

	  public WebElement getNextButton() {
		  if(WebElementWait.waitToElementClickable(driver, nextButton)!=null)
	  		return nextButton;
		  else 
			  return null;
	  }

}
