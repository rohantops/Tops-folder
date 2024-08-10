package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.DriverConnection;

public class Q10_selenium {

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/web-table-element.php";
		WebDriver driver = DriverConnection.getDriver(url);
		
		List<WebElement>TableHeaders = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead"));
		for (WebElement T :TableHeaders ) {
			System.out.print(T.getText()+ " ");
		}
		System.out.println();
		System.out.println(); 
		
		List<WebElement> Data = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
		for (WebElement data : Data ) {
			System.out.print(data.getText()+" ");
			
		}
		System.out.println();

	}

}
