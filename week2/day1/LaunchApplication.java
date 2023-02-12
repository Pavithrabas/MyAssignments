package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		EdgeDriver drive = new EdgeDriver();
		drive.get("https://www.facebook.com/");
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.salesforce.com/in/");
		
		EdgeDriver browser = new EdgeDriver();
		browser.get("https://www.salesforce.com/in/");
		
		
		
		
		
			
		
		
		
		
	}

}
