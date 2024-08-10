package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class Q02_TestNG {
	static WebDriver driver = null;
	@BeforeTest
	public static void login() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
		
	}
	@Test
	public void test1() {
		WebElement t1 = driver.findElement(By.name("email"));
		t1.sendKeys("rohan@123");
		WebElement t2 = driver.findElement(By.name("pass"));
		t2.sendKeys("rohan@123");
	}
	@AfterTest
	public static void closebrowser() {
		driver.quit();
}
}