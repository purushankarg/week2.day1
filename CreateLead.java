package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/main");
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
	Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KPMG GLOBAL");
	Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Radha");
	Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rao");
	WebElement ele = Driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd = new Select(ele);
	dd.selectByVisibleText("Conference");
	Driver.findElement(By.name("submitButton")).click();
	Driver.close();
	
	
	
		

	}

}
