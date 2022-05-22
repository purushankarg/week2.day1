package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser window
		Driver.manage().window().maximize();
		//Identify webelement
	WebElement eleUserName = Driver.findElement(By.id("username"));
	//Enter the username
	eleUserName.sendKeys("DemoSalesManager");
	Driver.findElement(By.id("password")).sendKeys("crmsfa");
	Driver.findElement(By.className("decorativeSubmit")).click();
	Driver.findElement(By.linkText("CRM/SFA")).click();
	Driver.findElement(By.linkText("Leads")).click();
	Driver.findElement(By.linkText("Create Lead")).click();
	Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KGS");
	Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiran");
	Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kutty");
	Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tax");
	Driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc:Tax Technology Leadership");
	Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kiran_reddy@gmail.com");
	// Ctr+2+L
	WebElement element = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dropdown = new Select(element);
	dropdown.selectByVisibleText("New York");
	
	Driver.findElement(By.name("submitButton")).click();
	
	Driver.findElement(By.linkText("Edit")).click();
	Driver.findElement(By.id("updateLeadForm_description")).clear();
	Driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("TEXT NOTEST");
	
	Driver.findElement(By.name("submitButton")).click();
	System.out.println("Title: " + Driver.getTitle());
	
	Driver.close();
	
	
	
	
	
	
	}

}
