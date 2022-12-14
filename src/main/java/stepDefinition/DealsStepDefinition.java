/*package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepDefinition {
	
	WebDriver driver;
	
    @Given("^User is already on Login Page$")  //Given annotation and we need method for every annotation. (need to import Given anno. from cucumber.
	
	public void user_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vivekdpatel/Desktop/Selenium/SeleniumJars/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
	}
	
	@When("^Title of login page is Free CRM")
	
	public void title_of_login_page_is() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
		
	}
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials){
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0)); //Only 1 row that is 0 and 2 columns with index no: 0 and 1. 
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	    
	}
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
		
	@Then("^user is on homepage$")
	public void user_is_on_homepage(){
		String title = driver.getTitle();
		System.out.println("Home page title is" + title);
		Assert.assertEquals("CRMPRO", title);
	   
	}

	@Then("^user goes to deals page$")
	public void user_goes_to_deals_page(){
		driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	    
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable information){
		List<List<String>> dealvalues = information.raw();
		 driver.findElement(By.id("title")).sendKeys(dealvalues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealvalues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealvalues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealvalues.get(0).get(3));
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	        
	}
	@Then("^close the browser$")
	public void close_browser() {
		driver.quit();
	}
	

}*/
