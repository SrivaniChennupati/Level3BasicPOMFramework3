package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewLeadPage  extends ProjectSpecificMethods{
	
	
public ViewLeadPage(ChromeDriver driver) {
		
		this.driver= driver;
		
	}



	public OpenTapsCRMPage clickEdit() {
		
		driver.findElementByLinkText("Edit").click();
		return new OpenTapsCRMPage(driver);
	
	}
	
	public MyLeadsPage clickDelete()
	{
		
		driver.findElementByLinkText("Delete").click();
		
		return new MyLeadsPage(driver);
		
	}
	

}
