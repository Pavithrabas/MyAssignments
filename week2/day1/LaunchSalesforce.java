package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchSalesforce {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().minimize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com\\r\\n");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
