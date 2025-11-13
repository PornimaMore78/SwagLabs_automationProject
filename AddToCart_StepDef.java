package bDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_StepDef {
	WebDriver driver;

	@Given("User on Add to Cart URL")
	public void user_on_add_to_cart_url() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
	}

	@When("click on Fleece jacket description")
	public void click_on_fleece_jacket_description() {
		// click on Fleece jacket description
		driver.findElement(By.xpath("//img[@data-test='inventory-item-sauce-labs-fleece-jacket-img']")).click();
	}

	@When("Click on Add to cart1")
	public void click_on_add_to_cart1() {
		driver.findElement(By.xpath("//button[@data-test='add-to-cart']")).click();
	}

	@When("click on Back To Products1")
	public void click_on_back_to_products1() {
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
	}

	@When("Click on Orange Tshirt")
	public void click_on_orange_tshirt() {
		driver.findElement(By.xpath("//img[@alt='Test.allTheThings() T-Shirt (Red)']")).click();
	}

	@When("Click on Add to cart2")
	public void click_on_add_to_cart2() {
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
	}

	@When("click on Back To Products2")
	public void click_on_back_to_products2() {
		driver.findElement(By.xpath("//button[@data-test='back-to-products']")).click();  
	}

	@When("click on Bike image")
	public void click_on_bike_image() {
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click(); 
	}

	@When("Click on Add to cart3")
	public void click_on_add_to_cart3() {
		driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
	}

	@When("click on Back To Products3")
	public void click_on_back_to_products3() {
		driver.findElement(By.xpath("//button[@data-test='back-to-products']")).click(); 
	}

	@Then("Products added successfully")
	public void products_added_successfully() throws InterruptedException {
	   
		String expRes="Swag Labs";
		String actRes= driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		Assert.assertEquals(actRes, expRes);
		System.out.println("Cart is Successfully Added");
		Thread.sleep(2000);
		
		driver.close();
	}


}
