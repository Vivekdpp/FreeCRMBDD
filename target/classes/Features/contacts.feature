
Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario

    Given User is already on Login Page
    When Title of login page is Free CRM
    Then User enters "<username>" and "<password>" 
    Then User clicks on login button
    Then user is on homepage
    Then user goes to new contact page
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then close the browser
 
Examples:
 | username | password  | firstname | lastname | position |
 | vivekdpp | Vivek@123 | Tom       |  hank    | manager  |  
 | vivekdpp | Vivek@123 | Harry     |  Rose    | Director |