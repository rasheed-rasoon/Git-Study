package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	@Given("^Open fire fox and start application$")
	public void open_fire_fox_and_start_application() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","F:\\softwares\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://inctest.apcgg.gov.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("^I entered valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_entered_valid_userName_and_valid_password(String userName,String Password) throws Throwable {
		driver.findElement(By.name("txtMobileNo")).sendKeys(userName);
		driver.findElement(By.name("txtPassWord")).sendKeys(Password);
		
	
	}

	@Then("^User should ablle to login succesfully$")
	public void user_should_ablle_to_login_succesfully() throws Throwable {
		driver.findElement(By.name("sub_style")).click();
	}
}
