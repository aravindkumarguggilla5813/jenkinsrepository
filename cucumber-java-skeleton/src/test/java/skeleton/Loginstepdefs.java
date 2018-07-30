package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefs {
	WebDriver driver;
	@Given("^The url of application$")
	public void the_url_of_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("^user enters mercury as username$")
	public void user_enters_mercury_as_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.name("userName")).sendKeys("mercury");
	}

	@When("^user enter mercury as password$")
	public void user_enter_mercury_as_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

   driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("^user click on submit$")
	public void user_click_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.name("Login")).click();
	  
	}

	@Then("^user is valid$")
	public void user_is_valid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(driver.getTitle().contains("Find"));
	}
}
