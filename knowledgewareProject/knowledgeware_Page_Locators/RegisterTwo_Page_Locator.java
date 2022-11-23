package knowledgeware_Page_Locators;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebElementWait;

public class RegisterTwo_Page_Locator {
   
	WebDriver driver = null;  //create global instance of webdriver

    // this is parameterized constructor with one parameter
    public RegisterTwo_Page_Locator(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);//Mandatory to initialize page fatctory elements
}

  @FindBy(name="First_Name")
  private WebElement firstName;

  public WebElement getFName(){
	if(WebElementWait.waitToElementClickable(driver, firstName)!=null)
		return firstName;
	else
		return null;
}
  
  @FindBy(name="Last_Name")
  private WebElement lastName;

  public WebElement getLName(){
	if(WebElementWait.waitToElementClickable(driver, lastName)!=null)
		return lastName;
	else
		return null;
}
  @FindBy(name="Birthday_day")
  private WebElement birthday;

  public WebElement getBirthdayDay(){
	if(WebElementWait.waitToElementClickable(driver, birthday)!=null)
		return birthday;
	else
		return null;
}
  @FindBy(name="Birthday_Month")
  private WebElement birthmonth;

  public WebElement getBirthdayMonth(){
	if(WebElementWait.waitToElementClickable(driver, birthmonth)!=null)
		return birthmonth;
	else
		return null;
}
  @FindBy(name="Birthday_Year")
  private WebElement birthyear;

  public WebElement getBirthdayYear(){
	if(WebElementWait.waitToElementClickable(driver, birthyear)!=null)
		return birthyear;
	else
		return null;
}
  @FindBy(name="Email_Id")
  private WebElement email;

  public WebElement getEmailID(){
	if(WebElementWait.waitToElementClickable(driver, email)!=null)
		return email;
	else
		return null;
}
  @FindBy(name="Mobile_Number")
  private WebElement mobNo;

  public WebElement getMobNum(){
	if(WebElementWait.waitToElementClickable(driver, mobNo)!=null)
		return mobNo;
	else
		return null;
}
  @FindBy(name="Gender")
  private WebElement gender;

  public WebElement getGenderMale(){
	if(WebElementWait.waitToElementClickable(driver, gender)!=null)
		return gender;
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
  
 /* @FindBy(linkText="BACK")
  private WebElement backButton;

  public WebElement getBackButton() {
	  if(WebElementWait.waitToElementClickable(driver, nextButton)!=null)
  		return backButton;
	  else
		  return null;
  } */
  
}