
Feature: Free CRM Login Feature


#Without Example keyword
#Scenario: Free CRM Login Test Scenario

    #Given User is already on Login Page
    #When Title of login page is Free CRM
    #Then User enters "vivekdpp" and "Vivek@123"
    #Then User clicks on login button
    #Then user is on homepage

#with Example keyword
Scenario Outline: Free CRM Login Test Scenario

    Given User is already on Login Page
    When Title of login page is Free CRM
    Then User enters "<username>" and "<password>" 
    Then User clicks on login button
    Then user is on homepage
    Then close the browser
 
Examples:
 | username | password |
 | vivekdpp | Vivek@123 |
 | naveenk | test@123 |
 | tomlp | Tommy@342 |