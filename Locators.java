package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		// Click on Log button
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		// click on Fleece jacket description
		driver.findElement(By.xpath("//img[@data-test='inventory-item-sauce-labs-fleece-jacket-img']")).click();
		Thread.sleep(2000);
		// Click on Add to cart button
		driver.findElement(By.xpath("//button[@data-test='add-to-cart']")).click();
		Thread.sleep(2000);
		// Click on Back_to_product
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		Thread.sleep(2000);
		// click on Orange_Tshirt Image
		driver.findElement(By.xpath("//img[@alt='Test.allTheThings() T-Shirt (Red)']")).click();
		Thread.sleep(2000);
		// Click on Add to cart button
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		Thread.sleep(1000);

		
		  //Click on Back_to_product
		  driver.findElement(By.xpath("//button[@data-test='back-to-products']")).click(); 
		  Thread.sleep(2000); 
		  //Click on Sauce_Labs_Bike_Light Text
		  driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click(); 
		  Thread.sleep(2000); 
		  //Click on Add_to_cart button
		  driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
		  Thread.sleep(1000); 
		  //Click on Shopping_cartLogo Button
		  driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		  Thread.sleep(2000);
		  //Click on Checkout button 
		  driver.findElement(By.name("checkout")).click(); 
		  Thread.sleep(2000);
		  //Input in First_name
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pornima");
		  Thread.sleep(2000);
		  //Input in Last_name
		  driver.findElement(By.xpath("//input[@data-test='lastName']")).sendKeys("More");
		  Thread.sleep(2000);
		  //Input on zip code
		  driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("400 604");
		  Thread.sleep(2000);
		  //Click on Contuinue
		  driver.findElement(By.xpath("//input[@id='continue']")).click();
		 Thread.sleep(3000);
		 
		 //Click on Finish Button
		 driver.findElement(By.xpath("//button[text()='Finish']")).click();
		 Thread.sleep(3000);
		 //Click on open_menu
		 driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		 Thread.sleep(2000);
		 
		 //Click on LogOut
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 Thread.sleep(2000);
		
		 driver.close();
		 

	}

}