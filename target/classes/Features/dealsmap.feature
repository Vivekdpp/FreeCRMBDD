Feature: Deal data collection

Scenario: Free CRM Create deal Scenario

	Given User is already on Login Page
    When Title of login page is Free CRM
    Then User enters username and password
		| username | password|
		 | vivekdpp | Vivek@123 |
		
	Then User clicks on login button
    Then user is on homepage
    Then user goes to deals page
    Then user enters deal details 
		|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
	Then close the browser