package Assignment;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.DriverConnection;

public class Q08_selenium {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.ajio.com";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement men = driver.findElement(By.linkText("MEN"));
		WebElement women = driver.findElement(By.linkText("WOMEN"));
		WebElement kids = driver.findElement(By.linkText("KIDS"));
		WebElement beauty = driver.findElement(By.linkText("BEAUTY"));
		WebElement homeandkitchen = driver.findElement(By.linkText("HOME AND KITCHEN"));
		
		Actions action = new Actions(driver); 
		action.moveToElement(men).build().perform();
		Thread.sleep(2000);
		action.moveToElement(women).build().perform();
		Thread.sleep(2000);
		action.moveToElement(kids).build().perform();
		Thread.sleep(2000);
		action.moveToElement(beauty).build().perform();
		Thread.sleep(2000);
		action.moveToElement(homeandkitchen).build().perform();
			
		

	}

}
