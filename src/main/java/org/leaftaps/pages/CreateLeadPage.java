package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	
	

	public CreateLeadPage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}

	public  CreateLeadPage enterCompanyName(String CName) {
		
		
		
		driver.findElementById("createLeadForm_companyName").sendKeys(CName);
		return this;
		

	}
	
	
   public  CreateLeadPage enterFirstName(String FName) {
		
		
		
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
		return this;
		

	}
   
   
      public  CreateLeadPage enterLastName(String LName) {
		
		
		
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
		return this;
		

	}
      
      
      public CreateLeadPage enterPhoneNumber(String PNum)
      
      {
    	  
    	  
    	  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(PNum);
    	  return this;
      }
      
      public ViewLeadPage clickCreateLead()
      
      {
    	  
    	  driver.findElementByName("submitButton").click();
    	  
    	  return new ViewLeadPage(driver);
    	  
      }
  
  
}
