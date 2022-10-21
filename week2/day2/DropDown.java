package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DropDown{
	
	public static void main(String[] args) {

	// Setup driver before staring the browser
			WebDriverManager.chromedriver().setup();
			// Open a chrome browser
			ChromeDriver driver = new ChromeDriver();
			//Load the URL to test
			driver.get("http://leaftaps.com/opentaps/control/main");
	        // Maximize the browser
			driver.manage().window().maximize();
			
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			
			//Find an elementUsername
			WebElement elementUsername = driver.findElement(By.id("username"));
			elementUsername.sendKeys("demosalesmanager");
			
			//Find an elementPassword
			WebElement elementPassword = driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");
			
			//Find an elementLogin

			WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
			elementLogin.click();
			
			//Find an elementCRM/SFA Link

			WebElement elementCRM = driver.findElement(By.linkText("CRM/SFA"));
			elementCRM.click();
			
			//Click on Leads Button

			WebElement enterLeads = driver.findElement(By.linkText("Leads"));
			enterLeads.click();
			
			//Click on Create Lead 
			
			WebElement enterCreatLead = driver.findElement(By.linkText("Create Lead"));
			enterCreatLead.click();
			
			//Enter CompanyName Field Using id Locator

			WebElement enterCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
			enterCompanyName.sendKeys("Testleaf");
			
			//Enter FirstName Field Using id Locator
			
			WebElement enterFirstName = driver.findElement(By.id("createLeadForm_firstName"));
			enterFirstName.sendKeys("Carol");
			
			//Enter LastName Field Using id Locator

			WebElement enterLastName = driver.findElement(By.id("createLeadForm_lastName"));
			enterLastName.sendKeys("Dass");
			
			//Enter Department Field Using any Locator of Your Choice
			
			WebElement enterDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
			enterDepartment.sendKeys("QA");
			
			 // Enter Description Field Using any Locator of your choice 
			
			WebElement enterDescription= driver.findElement(By.id("createLeadForm_description"));
			enterDescription.sendKeys("Selenium Automation Course Week2.Day1");
			
			 // Enter your email in the E-mail address Field using the locator of your choice
			WebElement enterEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
			enterEmailAddress.sendKeys("franciscarol126@gmail.com");
			
			
			//Select Employee from Source
			 
			WebElement elementSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
			
			// create object for select class and pass the parent web element
			Select source = new Select(elementSource);
			
			// select the option using visible text
			
			source.selectByVisibleText("Employee");
			
			//Select finance from Industry
			WebElement elemtIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			// create object for select class and pass the parent web element

			Select industry = new Select(elemtIndustry);
			// select the option using value 
		 industry.selectByValue("IND_FINANCE");
		 
		 WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 
		 Select ownership = new Select (elementOwnership);
		 ownership.selectByIndex(5);
		 

			
			
			
			
			
			
			
			
}
}

