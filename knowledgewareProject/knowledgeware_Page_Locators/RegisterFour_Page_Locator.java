package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebElementWait;

public class RegisterFour_Page_Locator {
	
	 WebDriver driver = null;
	 public RegisterFour_Page_Locator(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 
	 @FindBy(xpath="//input[@type='checkbox']")
	 private WebElement checkBoxes;
	 
	 public WebElement getCheckbox(){
			if(WebElementWait.waitToElementClickable(driver, checkBoxes)!=null)
				return checkBoxes;
			else
				return null;
		}
	 
	 @FindBy(name="Hobby_Singing")
		private WebElement hobbySinging;
		public WebElement getSinging(){
			if(WebElementWait.waitToElementClickable(driver,hobbySinging)!=null)
				return hobbySinging;
			else 
				return null;
		}
		@FindBy(name="Hobby_Dancing")
		private WebElement hobbyDancing;
		public WebElement getDancing(){
			if(WebElementWait.waitToElementClickable(driver,hobbyDancing)!=null)
				return hobbyDancing;
			else 
				return null;
		}
		@FindBy(name="Hobby_Cooking")
		private WebElement hobbySketching;
		public WebElement getSketching(){
			if(WebElementWait.waitToElementClickable(driver,hobbySketching)!=null)
				return hobbySketching;
			else 
				return null;
		}
		@FindBy(name="Hobby_Other")
		private WebElement hobbyOther;
		public WebElement getOther(){
			if(WebElementWait.waitToElementClickable(driver,hobbyOther)!=null)
				return hobbyOther;
			else 
				return null;
		}
	 @FindBy(name="Other_Hobby")
	 private WebElement hobby;
	 
	 public WebElement getHobby(){
			if(WebElementWait.waitToElementClickable(driver, hobby)!=null)
				return hobby;
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
