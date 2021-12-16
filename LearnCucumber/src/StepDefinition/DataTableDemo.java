package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableDemo {
	WebDriver driver;
	@Given("^User is on demowebshop tricentis page$")
	public void user_is_on_demowebshop_tricentis_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^user signs in with email and password$")
	public void user_signs_in_with_email_and_password(DataTable credentials) throws Throwable {
		List<List<String>> data=credentials.raw();
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^user should seelogout$")
	public void user_should_seelogout() throws Throwable {
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
}
