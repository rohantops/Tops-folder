package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class Q01_selenium {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("rohan");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("mansuri");
		WebElement mo = driver.findElement(By.name("reg_email__"));
		mo.sendKeys("7990855693");
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("rohan@3105");
		WebElement days = driver.findElement(By.id("day"));
		Select day = new Select(days);
		day.selectByIndex(0);
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("6");
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("2002");
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
