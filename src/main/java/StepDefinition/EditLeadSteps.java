package StepDefinition;

import cucumber.api.java.en.Given;

public class EditLeadSteps extends CreateLeadSteps {
	
	

	@Given ("User Clicks on Find Leads in My Leads Page")  
	public void clickFindLeads()
	
	{
		
		
	driver.findElementByLinkText("Find Leads").click();
		

	}
	
	public void clickPhone()
	
	{
		
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner'])[2]");
		
	}

}
