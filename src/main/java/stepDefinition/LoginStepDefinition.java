/*package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

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
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$") //can also use \"([^\"]*)\"
	public void user_enters_username_and_password(String username, String password){
	    
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
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
	
	@Then("^user goes to new contact page$")
	public void user_goes_to_new_contact_page(){
		driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	    
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details(String firstname, String lastname, String position) {
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	    
	}
	@Then("^close the browser$")
	public void close_browser() {
		driver.quit();
	}
	
	
	
}*/
