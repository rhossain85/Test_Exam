package phoneixAutomationSD;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PhoneixAutomationStepDef {
	
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
	
	@When("^user selects Sauce Lab Backpack from the product page$")
	public void user_selects_Sauce_Lab_Backpack_from_the_product_page() throws Throwable {
		driver.findElement(By.className("inventory_item_name")).click();	   
	}
	
	@When("^user adds the product to users cart$")
	public void user_adds_the_product_to_users_cart() throws Throwable {
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();  
	  
	}

	@When("^user clicks on shopping cart link$")
	public void user_clicks_on_shopping_cart_link() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'1')]")).click();	    
	   
	}

	@When("^user selects the checkout button$")
	public void user_selects_the_checkout_button() throws Throwable {
		driver.findElement(By.id("checkout")).click();	   
	   
	}

	@When("^user enters first name$")
	public void user_enters_first_name() throws Throwable {
		driver.findElement(By.id("first-name")).sendKeys("Rashed");	   
	   
	}
	@Then("^user checks user first name is presesent$")
	public void user_checks_user_first_name_is_presesent() throws Throwable {
		String userNameActual=driver.findElement(By.id("first-name")).getAttribute("value");
		Assert.assertEquals("Rashed", userNameActual);	  
	}

	@When("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		driver.findElement(By.id("last-name")).sendKeys("Hossain");	  
	   
	}
	@Then("^user checks user last name is presesent$")
	public void user_checks_user_last_name_is_presesent() throws Throwable {
		String userNameActual=driver.findElement(By.id("last-name")).getAttribute("value");
		Assert.assertEquals("Hossain", userNameActual);
	}

	@When("^user enters zipcode$")
	public void user_enters_zipcode() throws Throwable {
		driver.findElement(By.id("postal-code")).sendKeys("22191");
	  
	}
	@Then("^user checks user zipcode is present$")
	public void user_checks_user_zipcode_is_present() throws Throwable {
		String userZipcodeActual=driver.findElement(By.id("postal-code")).getAttribute("value");
		Assert.assertEquals("22191", userZipcodeActual);
	}

	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		driver.findElement(By.id("continue")).click();
	   
	}
	@Then("^user checks the item in the order is the same item that was selected from the product page$")
	public void user_checks_the_item_in_the_order_is_the_same_item_that_was_selected_from_the_product_page() throws Throwable {
		 WebElement sauceLabBackpack = driver.findElement(By.className("inventory_item_name"));
		 Assert.assertEquals(true, sauceLabBackpack.isDisplayed());
	}

	@Then("^user clicks on Finish button$")
	public void user_clicks_on_Finish_button() throws Throwable {
		driver.findElement(By.id("finish")).click();	    
	}	
	@Then("^user validates that user order has been placed$")
	public void user_validates_that_user_order_has_been_placed() throws Throwable {
		 WebElement thankYouForYourOrder = driver.findElement(By.className("complete-header"));
		 Assert.assertEquals(true, thankYouForYourOrder.isDisplayed());		
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
		driver=null;	 
	}

}
