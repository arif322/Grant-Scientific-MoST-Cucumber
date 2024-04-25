Feature: Login Feature

@login
Scenario: Successfully Enter in Valid URL
	
	Given User Launch Chrome browser
	When  User opens URL "https://tr-services.most.gov.bd"
	And user click the Login button
	And  user enter the valid email as "tr-arif1122@yopmail.com" and pssword as "Abc123!"
	And click on submit button
	Then Page title should be "Integrated Digital Service Delivery Platfrom - Digital Service Portal"
	

Scenario Outline: Successfully Enter in Valid URL
	
	Given User Launch Chrome browser
	When  User opens URL "https://tr-services.most.gov.bd"
	And user click the Login button
	And  user enter the valid email as "<email>" and pssword as "<password>"
	And click on submit button
	Then Page title should be "Integrated Digital Service Delivery Platfrom - Digital Service Portal"
	
Examples:
|email|password|
|tr-arif1122@yopmail.com|Abc123!|