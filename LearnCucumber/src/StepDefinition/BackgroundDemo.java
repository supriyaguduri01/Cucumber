package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackgroundDemo {
	WebDriver driver;
	@Given("^I am on home page of demo webshop$")
	public void i_am_on_home_page_of_demo_webshop() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	    
	}

	@Then("^I should see title contains shop$")
	public void i_should_see_title_contains_shop() throws Throwable {
		assert driver.getTitle().contains("shop");
		driver.close();
	}

	@Then("^I should see that source contains shop$")
	public void i_should_see_that_source_contains_shop() throws Throwable {
		assert driver.getPageSource().contains("shop");
	
	}

}
