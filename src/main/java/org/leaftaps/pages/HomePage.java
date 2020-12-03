package org.leaftaps.pages;

import org.leaftaps.basic.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage  extends ProjectSpecificMethods{
	
	
	public HomePage(ChromeDriver driver)
	
	{
		
		this.driver = driver;
		
	}
	
	  public LoginPage clickLogOut()
	
	
	{
		
		
		driver.findElementByClassName(prop.getProperty("Home.logoutB.ClassName")).click();
		
		return new LoginPage(driver);
		
		}
	
	
	public MyHomePage clickcrmfsa()
	
	
	{
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		return new MyHomePage(driver);
		
	}

}
