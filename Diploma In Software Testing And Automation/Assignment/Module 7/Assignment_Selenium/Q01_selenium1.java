package Assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class Q01_selenium1 {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		for (WebElement e:links) {
			System.out.println(e.getText());
			
		}
		links.get(1).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();

	}

}
