package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTapsCRMPage extends ProjectSpecificMethods{
	
	
	public OpenTapsCRMPage(ChromeDriver driver)
	
	{
		
		
		this.driver = driver;
	}

	
	public OpenTapsCRMPage updateCompanyName(String CName) {
		
		
		driver.findElementById("updateLeadForm_companyName").clear();
		
		driver.findElementById("updateLeadForm_companyName").sendKeys(CName);
		return this;
	}
	
	
	public ViewLeadPage clickSubmit()
	{
		
		driver.findElementByName("submitButton").click();
		 return new ViewLeadPage(driver);
		
	}


}
