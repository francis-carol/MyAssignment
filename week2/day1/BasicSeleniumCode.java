package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {

	public static void main(String[] args) {
		// Setup driver before staring the browser
		WebDriverManager.chromedriver().setup();
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL to test
		driver.get("http://leaftaps.com/opentaps/control/main");
        // Maximize the browser
		driver.manage().window().maximize();
	
		
		//Find an element
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementCRM = driver.findElement(By.linkText("CRM/SFA"));
		elementCRM.click();
		
		WebElement enterLeads = driver.findElement(By.linkText("Leads"));
		enterLeads.click();
		
		WebElement enterCreatLead = driver.findElement(By.linkText("Create Lead"));
		enterCreatLead.click();
		
		WebElement enterCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		enterCompanyName.sendKeys("Testleaf");
		
		WebElement enterFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		enterFirstName.sendKeys("Carol");
		
		WebElement enterLastName = driver.findElement(By.id("createLeadForm_lastName"));
		enterLastName.sendKeys("Dass");
		
		WebElement entersubmit = driver.findElement(By.className("smallSubmit"));
		entersubmit.click();
		
		
		
	}

}
