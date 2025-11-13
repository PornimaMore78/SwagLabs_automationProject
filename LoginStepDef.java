package bDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	
	@Given("I am on Saucedemo url")
	public void i_am_on_saucedemo_url() {
	    
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

	}

	@When("I am enter UserName")
	public void i_am_enter_user_name() {
	   
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");

		
	}

	@When("I enter Password")
	public void i_enter_password() {
	    
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
	}

	@Then("login should be successfully complete")
	public void login_should_be_successfully_complete() throws InterruptedException {
		String expRes="Swag Labs";
		String actRes= driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		Assert.assertEquals(actRes, expRes);
		System.out.println("Login Successfully");
		Thread.sleep(2000);
		
		driver.close();
		
		
	    
	}
}
