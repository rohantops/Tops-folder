package Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;
@RunWith(Parameterized.class)
public class Q03_JUnit  {
	String email;
	String password;
	
	public  Q03_JUnit(String email,String password) {
		this.email = email;
		this.password = password;
	}
	static WebDriver driver = null;
	@Before
	public void openbrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	@Test
	public void logintest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();  
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
		Thread.sleep(5000);
		driver.quit();
	}
	@Parameters
	public  static List<Object[]>data() {
		Object[][] obj = new Object [4][2];
		
		obj[0][0] = "rohan@123";
		obj[0][1] = "rohan"; 
		
		obj[1][0] = "rohan@123";
		obj[1][1] = "rohan";
		
		obj[2][0] = "rohan@123";
		obj[2][1] = "rohan";
		
		obj[3][0] = "rohan@123";
		obj[3][1] = "rohan";
		
		return Arrays.asList(obj);
		
	}

}
