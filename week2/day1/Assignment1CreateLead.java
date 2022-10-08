package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment1CreateLead {
	
	public static void main(String[] args) {

	// Setup driver before staring the browser
			WebDriverManager.chromedriver().setup();
			// Open a chrome browser
			ChromeDriver driver = new ChromeDriver();
			//Load the URL to test
			driver.get("http://leaftaps.com/opentaps/control/main");
	        // Maximize the browser
			driver.manage().window().maximize();
		
			
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
			
			
			 //Click on Create Button
			
			WebElement entersubmit = driver.findElement(By.className("smallSubmit"));
			entersubmit.click();
			
	         //Get the Title of Resulting Page. refer the video  using driver.getTitle() 
		
			String title = driver.getTitle();
			System.out.println("The title of the page is " + title);
			
			if(title.contains("View Lead")){
				
				System.out.println("I confirm the titile has  View Lead | opentaps CRM ");
			} else {
				System.out.println(" The title doesnot have View Lead | opentaps CRM");
			}
			
}
}

