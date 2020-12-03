package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeadsPage extends ProjectSpecificMethods {
	



	public MyLeadsPage(ChromeDriver driver)   {
		
		this.driver = driver;
		
	}
		
	



	public CreateLeadPage clickCreateLead()
	
	{
		
		driver.findElementByLinkText("Create Lead").click();
		
		return new CreateLeadPage(driver);
		
	}
	
	public FindLeadsPage clickFindLeads() {
		
		driver.findElementByLinkText("Find Leads").click();
		
		return  new FindLeadsPage(driver);
		
	}

	
	

}
