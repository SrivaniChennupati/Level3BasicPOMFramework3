package org.leaftaps.testcases;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.leaftaps.pages.CreateLeadPage;
import org.leaftaps.pages.LoginPage;
import org.leaftaps.pages.MyHomePage;
import org.leaftaps.pages.MyLeadsPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_CreateLead extends ProjectSpecificMethods{
	
	
	@BeforeTest
	
	public void setData()
	
	
	{
		
		excelName = "TC002_CreateLead" ;
		
		
	}

	
	@Test (dataProvider = "getData")
	
	public void createLead(String uname ,String pwd ,String CName ,String FName,String LName, String PNum){
		
		
		 new LoginPage(driver).enterUserName(uname).enterPassWord(pwd).clickLogin().clickcrmfsa();
		
		 new MyHomePage(driver).clickLeads();
		
		 new MyLeadsPage(driver).clickCreateLead();
		
		 new CreateLeadPage(driver). enterCompanyName(CName).enterFirstName(FName).enterLastName(LName).enterPhoneNumber(PNum).clickCreateLead();
				     
	

	}

}
