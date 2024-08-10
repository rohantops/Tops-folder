package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class Q07_selenium {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement Country = driver.findElement(By.name("country"));
		Country.click();
		Country.sendKeys("india");
		Country.click();

	}

}
