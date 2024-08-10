package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.DriverConnection;

public class Q08_selenium1 {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		driver.findElement(By.name("firstName")).click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT)
		.sendKeys("rohan")
		.keyUp(Keys.SHIFT)
		.build()
		.perform(); 
		
		driver.findElement(By.name("lastName")).click();
		action.keyDown(Keys.SHIFT)
		.sendKeys("mansuri")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.click();
		phone.sendKeys("7990855693"); 
		
		driver.findElement(By.id("userName")).click();
		action.sendKeys("rohanmansuri0207@gmail.com")
		.build()
		.perform();
		
		driver.findElement(By.name("address1")).click();
		action.keyDown(Keys.SHIFT)
		.sendKeys("prantij")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		driver.findElement(By.name("city")).click();
		action.keyDown(Keys.SHIFT)
		.sendKeys("himmatnagar")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		driver.findElement(By.name("state")).click();
		action.keyDown(Keys.SHIFT)
		.sendKeys("gujarat")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		WebElement code = driver.findElement(By.name("postalCode"));
		code.click();
		code.sendKeys("383205");
		
		WebElement coun = driver.findElement(By.name("country"));
		coun.click();
		coun.sendKeys("india");
		coun.click();
		
		driver.findElement(By.id("email")).click();
		action.keyDown(Keys.SHIFT)
		.sendKeys("rohan mansuri")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		driver.findElement(By.name("password")).click();
		action.keyDown(Keys.SHIFT)
		.sendKeys("mansuri rohan")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		driver.findElement(By.name("confirmPassword")).click();
		action.keyDown(Keys.SHIFT)
		.sendKeys("mansuri rohan")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
