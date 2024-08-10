package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Connection.DriverConnection;

public class Q03_selenium {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//1.alert
		//WebElement btn = driver.findElement(By.id("alertButton"));
		//btn.click();
		//Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		//alert.accept();
		
		//2.alert 
		//WebElement btn = driver.findElement(By.id("timerAlertButton"));
		//btn.click();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.alertIsPresent());
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		//3.alert
		//WebElement btn = driver.findElement(By.id("confirmButton"));
		//btn.click();
		//Thread.sleep(2000);
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss(); 
		
		//4.alert 
		WebElement btn = driver.findElement(By.id("promtButton"));
		btn.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("rohan");
		alert.accept();

	}

}
