package Assignment;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class Q04_TestNG {
static WebDriver driver = null;
@BeforeClass 
public static void openbrowser() {
	driver = DriverConnection.getDriver("https://www.instagram.com/");
	
}
@Parameters(name ="dp")
@Test(dataProvider = "dp")
public void test(String	email,String password) {
	WebElement emailEle = driver.findElement(By.name("email"));
	emailEle.clear();
	emailEle.sendKeys(email);
	WebElement passEle = driver.findElement(By.name("pass"));
	passEle.clear();
	passEle.sendKeys(password);
	
}
@DataProvider(name = "dp")
public static  Object[][]data() {
	Object[][] obj = new Object[4][2];
	
	obj[0][0] = "rohan@123";
	obj[0][1] = "rohan";
	
	obj[1][0] = "rohan@123";
	obj[1][1] = "rohan";
	
	obj[2][0] = "rohan@123";
	obj[2][2] = "rohan";
	
	obj[3][0] = "rohan@123";
	obj[3][3] = "rohan"; 
	
	return obj;
	
	
}
}
