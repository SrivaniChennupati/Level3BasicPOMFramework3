package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	
	public static ChromeDriver driver;  

	@Given("User opens the Chrome browser")
	
	public  void openBrowser() {
		
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	 driver = new ChromeDriver();
		
	}
	@Given ("User loads the  LeafTaps Prod URL")
	public void loadURL()
	
	{
		
	      driver.get("http://leaftaps.com/opentaps");
		
	}

	@Given("User Maximize the window")
	public void maximizeBroswer()
	
	{
		
		
		driver.manage().window().maximize();
	}
	
	@Given ("User Set the Implicit wait")
	public void setWait()
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Given("User Enters the  username as (.*) in LoginPage")
	
	public void enterUserName(String UName)
	
	{
		
		driver.findElementById("username").sendKeys(UName);
		
	}
	@Given("User Enters PassWord as (.*) in LoginPage")
	
	public void enterPassWord(String Pwd)
	{
		
		driver.findElementById("password").sendKeys(Pwd);
		
		
	}
	
	@Given("User Clicks on Login button")
	
	public void clickLogin()
	
	{
		
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given ("User clicks on CRMFSA in HomePage")
	public void clickCRMFSA()
	
	{
		
		
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@Given("User Clicks on leads in MyHomePage")
	public void clickLeads()
	
	{
		
		driver.findElementByLinkText("Leads").click();
		
	}
	
	@Given("User clicks on CreateLead in MyLeads Page")
	
	public void clickCreateLead()
	
	{
		
		driver.findElementByLinkText("Create Lead").click();
		
	}
	
	@Given("User enters the Company Name as (.*) in CreateLead Page")
	public void enterCompanyName(String CName)
	
	{
		
		driver.findElementById("createLeadForm_companyName").sendKeys(CName);
		
	}
	
	@Given("User enters the First Name as (.*) in CreateLead Page")
	public void enterFirstName(String FName)
	{
		
		
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
	}
	
	@Given("User enters the Last Name as (.*) in CreateLead Page")
	public void enterLastName(String LName)
	{
		
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
	}
	
	@When ("User Clicks on CreateLead button in CreateLead Page")
	public void clickCreateLead1()
	
	{
		
		driver.findElementByName("submitButton").click();
	}
	
	@Then("User should be able to Create the Lead")
	public void verifyCreateLead()
	
	{
		
		System.out.println("Create lead is success");
		
	}
}
