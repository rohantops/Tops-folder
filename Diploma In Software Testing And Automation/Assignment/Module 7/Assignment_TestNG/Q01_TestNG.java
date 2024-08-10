package Assignment;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class Q01_TestNG {
	static WebDriver driver = null;
	@org.testng.annotations.BeforeClass
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
	@AfterClass
	public static void closebrowser() {
		driver.quit();
	}

}
