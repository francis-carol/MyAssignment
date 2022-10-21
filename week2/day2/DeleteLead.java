package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		/*
		 * 8 Click on Phone 9 Enter phone number 10 Click find leads button 11 Capture
		 * lead ID of First Resulting lead 12 Click First Resulting lead 13 Click Delete
		 * 14 Click Find leads 15 Enter captured lead ID 16 Click find leads button 17
		 * Verify message "No records to display" in the Lead List. This message
		 * confirms the successful deletion 18 Close the browser (Do not log out)
		 */

		Thread.sleep(2000);

		// Click on Phone
		WebElement phoneTab = driver.findElement(By.xpath("//span[text()='Phone']"));
		phoneTab.click();
		// Enter phone number
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\'ext-gen270\']"));
		phoneNumber.sendKeys("123");

		// Click Find leads button
		WebElement findLeads = driver.findElement(By.xpath("//table[@id='ext-gen242']"));
		findLeads.click();

		Thread.sleep(2000);

		// Click on first resulting lead
		WebElement firstLead = driver.findElement(By.xpath(
				"/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a"));
		String LeadId = firstLead.getText();
		System.out.println("The LeadId number is " + LeadId);
		firstLead.click();

		// Click Delete

		WebElement deleteButton = driver.findElement(By.xpath("//a[text()='Delete']"));
		deleteButton.click();

		// Click Find leads
		WebElement findLeadButton2 = driver.findElement(By.linkText("Find Leads"));
		findLeadButton2.click();

		// Enter captured lead ID
		WebElement Lead = driver.findElement(By.xpath("//input[@name='id']"));
		Lead.sendKeys(LeadId);

		// Click find leads button
		WebElement findLeads2 = driver.findElement(By.xpath("//table[@id='ext-gen242']"));
		findLeads2.click();

		Thread.sleep(5000);
		WebElement zeroRecords = driver.findElement(By.className("x-paging-info"));
		String LeadId2 = zeroRecords.getText();
		System.out.println(LeadId2);

		if (LeadId2.contains("No records")) {
			System.out.println("Verified " + LeadId2);
		}

	}

}
