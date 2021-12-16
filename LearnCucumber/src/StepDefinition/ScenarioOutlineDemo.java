package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineDemo {
	WebDriver driver;
	@Given("^User navigatesto the website demowebshoptricentis$")
	public void user_navigatesto_the_website_demowebshoptricentis() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}		
		@When("^user logs in with ([^\\\"]*) and ([^\\\"]*)$")
	    public void user_logs_in_with_email_and_password(String email,String password) throws Throwable {
	        driver.findElement(By.id("Email")).sendKeys(email);
	        driver.findElement(By.name("Password")).sendKeys(password);
	        driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Then("^user should see logout link$")
	public void user_should_see_logout_link() throws Throwable {
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	    
	}

}
