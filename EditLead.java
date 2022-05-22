package week2.day1;
//Assignment 2:Edit Lead
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		Driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser window
		Driver.manage().window().maximize();
		//Identify webelement
 //Enter UserName and Password Using Id Locator
	WebElement eleUserName = Driver.findElement(By.id("username"));
	eleUserName.sendKeys("DemoSalesManager");
	Driver.findElement(By.id("password")).sendKeys("crmsfa");
// Click on Login Button using Class Locator
	Driver.findElement(By.className("decorativeSubmit")).click();
// Click on CRM/SFA Link
	Driver.findElement(By.linkText("CRM/SFA")).click();
// Click on Leads Button
	Driver.findElement(By.linkText("Leads")).click();
// Click on Create Lead 
	Driver.findElement(By.linkText("Create Lead")).click();
// Enter CompanyName Field Using id Locator
	Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KGS");
// Enter FirstName Field Using id Locator
	Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiran");
// Enter LastName Field Using id Locator
	Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
// Enter FirstName(Local) Field Using id Locator
	Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kutty");
// Enter Department Field Using any Locator of Your Choice
	Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tax");
// Enter Description Field Using any Locator of your choice
	Driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc:Tax Technology Leadership");
// Enter E-mail address Field using the locator of your choice
	Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kiran_reddy@gmail.com");
	
// Select State/Province as NewYork Using Visible Text
	// Ctr+2+L
	WebElement element = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dropdown = new Select(element);
	dropdown.selectByVisibleText("New York");
	
// Click on Create Button	
	Driver.findElement(By.name("submitButton")).click();
	
// Click on edit button	
	Driver.findElement(By.linkText("Edit")).click();
// Clear the Description Field using .clear()
	Driver.findElement(By.id("updateLeadForm_description")).clear();
// Fill ImportantNote Field with Any text
	Driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("TEXT demo TEST");
// Click on update button 	
	Driver.findElement(By.name("submitButton")).click();
// Get the Title of Resulting Page. refer the video  using driver.getTitle()
	System.out.println("Title: " + Driver.getTitle());
// Close Browser	
	Driver.close();
	
	
	
	
	
	
	}

}
