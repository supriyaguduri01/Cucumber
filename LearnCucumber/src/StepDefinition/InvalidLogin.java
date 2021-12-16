package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLogin {
	WebDriver driver;
	@Given("^User in on the login page$")
	public void user_in_on_the_login_page() throws Throwable {
	}

	@Then("^User should see a message Successful login$")
	public void user_should_see_a_message_Successful_login() throws Throwable {
	    
	}

	@Given("^user given login page$")
	public void user_given_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();  
	}

	@When("^user enter invalid email and invalid password$")
	public void user_enter_invalid_email_and_invalid_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("priyag15@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("priyag15");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^user should see a message error login$")
	public void user_should_see_a_message_error_login() throws Throwable {
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

}
