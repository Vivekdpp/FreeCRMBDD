Feature: Deal data collection

Scenario: Free CRM Create deal Scenario

    Given User is already on Login Page
    When Title of login page is Free CRM
    Then User enters username and password
    | vivekdpp | Vivek@123 |
    Then User clicks on login button
    Then user is on homepage
    Then user goes to deals page
    Then user enters deal details 
    | test deal | 1000 | 50 | 10 |
    Then close the browser
 