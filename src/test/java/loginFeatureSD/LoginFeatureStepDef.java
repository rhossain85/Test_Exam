package loginFeatureSD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFeatureStepDef {
	
WebDriver driver;
	
	@Given("^user need to be on SWAGLAB login page$")
	public void user_need_to_be_on_SWAGLAB_login_page() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "src/main/resources/Driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	 
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");	   
	}

	@When("^when user enters password$")
	public void when_user_enters_password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  
	}

	@When("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	 
	}


}
