package web_Common_Functions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

public class WebCheckBox {
	
	public static void selectCheckBox(WebElement elements, String fieldName, ExtentTest logger){
		if(WebElementCommon.isClickable(elements,fieldName,logger)){
			elements.click();
		}
		    	  
	}
	
	/*public static void selectCheckBox(List<WebElement> elements){
		if(WebElementCommon.isClickable(elements)){
		elements.click();
		}
		    	  
	}*/
}


/*if(WebElementWait.waitToVisibilityOfElements(driver, elements)!=null) {
for(WebElement element : elements) {
	  String attributeText=element.getAttribute(attributeType);
	  for(int i=0;i<attributeValues.length;i++) {
		  if(attributeText.equals(attributeValues[i])) {
			  if(element.isSelected()) {
				  
			  } else {
				  WebButton.click(element);
			  }
			  break;
		  } else {
			  if(element.isSelected()) {
				  WebButton.click(element);
			  }
		  }
	  }
}
}
}*/