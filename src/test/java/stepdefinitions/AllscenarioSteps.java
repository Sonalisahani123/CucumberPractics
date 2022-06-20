package stepdefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllscenarioSteps {
	
	WebDriver driver;
	
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	   
	}
	
	@When("user enter username")
	public void user_enter_username() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8951968472");
	   
	}

	@When("user enter password")
	public void user_enter_password() {
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Sonu1234");
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	   
	}

	@Then("the login failed")
	public void the_login_failed() {
		System.out.println("login failed");
	}

	
	@When("user enter username as {string}")
	public void user_enter_username_as(String un) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
	    
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String pw) {
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pw);
	    	}
	
}
