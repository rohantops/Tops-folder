package Assignment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class Q02_JUnit 
{
    static WebDriver driver = null ;
	@BeforeClass	
public static void beforeclass() throws InterruptedException {
	String url = "https://www.instagram.com/accounts/login/?hl=en";
	 driver = DriverConnection.getDriver(url);
	 Thread.sleep(3000);
	
}
	@Test
public void login() throws InterruptedException {
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("rohanmansuri");
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("rohan@1234");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	Thread.sleep(2000);

}
@AfterClass
public static void closebrowser() {
	driver.quit();
}
}