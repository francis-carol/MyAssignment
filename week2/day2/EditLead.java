package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setup driver before staring the browser
		WebDriverManager.chromedriver().setup();
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL to test
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();

		// Find an elementUsername
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("demosalesmanager");

		// Find an elementPassword
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");

		// Find an elementLogin

		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();

		// Find an elementCRM/SFA Link

		WebElement elementCRM = driver.findElement(By.linkText("CRM/SFA"));
		elementCRM.click();

		// Click on Leads Button

		WebElement enterLeads = driver.findElement(By.linkText("Leads"));
		enterLeads.click();

		// 7 Click Find leads

		WebElement findLeadButton = driver.findElement(By.linkText("Find Leads"));
		findLeadButton.click();

		// Enter First Name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='ext-gen248']"));
		firstName.sendKeys("carol");

		// Click Find leads button
		WebElement findLeads = driver.findElement(By.xpath("//table[@id='ext-gen242']"));
		findLeads.click();
		
		Thread.sleep(2000);

		// Click on first resulting lead
		WebElement firstLead = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a"));
		firstLead.click();

		// Verify title of the page
		// Get the Title of Resulting Page. refer the video using driver.getTitle()
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);

		if (title.contains("View Lead")) {

			System.out.println("I confirm the titile has  View Lead | opentaps CRM");
		} else {
			System.out.println(" The title doesnot have View Lead | opentaps CRM");
		}

		// Click on edit button

		WebElement clickEdit = driver.findElement(By.linkText("Edit"));
		clickEdit.click();

		// Change the company name

		WebElement enterCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		enterCompanyName.sendKeys("Leaftest");

		// Click on update button

		WebElement clickUpdate = driver.findElement(By.className("smallSubmit"));
		clickUpdate.click();

		WebElement companyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));

		String Name = companyName.getText();

		System.out.println("The Company Name is " + Name);

		if (Name.contains("Leaftest")) {

			System.out.println("I confirm the Company Name is updated to Leaftest");
		} else {
			System.out.println(" I confirm the Company Name is not updated to Leaftest");
		}

		driver.close();

	}

}
