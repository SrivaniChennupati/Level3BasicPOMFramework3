Feature: CreateLead in LeafTapsApplication [TET-100]
Scenario: [TC001] Positive Flow For CreateLead
Given User opens the Chrome browser
And User loads the  LeafTaps Prod URL
And User Maximize the window 
And User Set the Implicit wait 
And User Enters the  username as Demosalesmanager in LoginPage
And User Enters PassWord as crmsfa in LoginPage 
And User Clicks on Login button 
And User clicks on CRMFSA in HomePage 
And User Clicks on leads in MyHomePage 
And User clicks on CreateLead in MyLeads Page 
And User enters the Company Name as Hexaware in CreateLead Page 
And User enters the First Name as Srivani in CreateLead Page 
And User enters the Last Name as Chennupati in CreateLead Page 
When User Clicks on CreateLead button in CreateLead Page
Then User should be able to Create the Lead 

Scenario: [TC002] Positive Flow For EditLead
Given User loads the  LeafTaps Prod URL
And User Maximize the window 
And User Set the Implicit wait 
And User Enters the  username as Demosalesmanager in LoginPage
And User Enters PassWord as crmsfa in LoginPage User Clicks on Login button 
And User clicks on CRMFSA in HomePage 
And User Clicks on leads in MyHomePage 
And User Clicks on Find Leads in My Leads Page
And User Clicks on Phone in FindLeads Page 
And User enters the Phone as 123456789 in FindLeads Page
And User Clicks on FindLeads button in FindLeads Page
And User Clicks on first Resulting Leads ID in FindLeads Page
And User Clicks on the Edit button in View Lead Page
And User Clears the Existing First Name OpenTaps CRM Page
And User Enters the First Name as Srivani in OpenTaps CRM Page
When User Clicks on Update button in OpenTaps CRM Page
Then User Should be able to Edit the Lead



