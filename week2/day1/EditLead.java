package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Atos Syntel");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baskar");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavithra B");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("csc");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have a four years experience in ETL process");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavinicky238@gmail.com");
		Thread.sleep(2000);
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Thread.sleep(2000);
		Select dd = new Select(stateDropdown);
		dd.selectByVisibleText("Alabama");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("happy");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
	}

}



