package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SelectLastDropDown{
	
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
			
		 
		 WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 
		 Select ownership = new Select (elementOwnership);
		 
		 //to get all options as weblements under the select tag
		 List<WebElement> options = ownership.getOptions();
		 
		 // to find number of times
		 int size = options.size();		
		 
		 System.out.println(size);
		 //to get single ite from list

		 WebElement elefive = options.get(5);
		 elefive.click();
			
		 //options.get(size-1);
			
			
			
			
			
			
			
}
}

