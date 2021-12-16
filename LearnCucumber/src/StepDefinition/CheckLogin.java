package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckLogin {
	WebDriver driver;
		@Given("^User is on login page$")
		public void user_is_on_login_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();  
		}

		@When("^user enters email and password$")
		public void user_enters_email_and_password() throws Throwable {
			driver.findElement(By.id("Email")).sendKeys("priyag15@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("priyag15");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}

		@Then("^user should see a message Successful Login\\.$")
		public void user_should_see_a_message_Successful_Login() throws Throwable {
			driver.findElement(By.linkText("Log out")).click();
			driver.close();
		}
	}

