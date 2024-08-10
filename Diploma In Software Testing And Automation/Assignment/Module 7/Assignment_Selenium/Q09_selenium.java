package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class Q09_selenium {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/delete_customer.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement button = driver.findElement(By.name("cusid"));
		button.click();
		button.sendKeys("9874");
		
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

	}

}
