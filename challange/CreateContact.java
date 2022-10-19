package marathon.java.challange;

import java.time.Duration;

import org.apache.hc.core5.http.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ch=new ChromeOptions();

		ch.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(ch);

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://login.salesforce.com/?locale=in");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("ramkumar.ramaiah@testleaf.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Password#123");
		
		WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();
		
		Thread.sleep(5000);
		
		WebElement toggleButton = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggleButton.click();
		
		WebElement viewAll = driver.findElement(By.xpath("//button[contains(text(), 'View All')]"));
		viewAll.click();
		
		WebElement Sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		Sales.click();
		

		WebElement Accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", Accounts);
		
		WebElement newButton = driver.findElement(By.xpath("//div[@title='New']"));
		newButton.click();
		
		WebElement accountName = driver.findElement(By.xpath("//input[@name='Name']"));
		accountName.sendKeys("Carol");
		
		WebElement noneButton = driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		driver.executeScript("arguments[0].click();", noneButton);
		WebElement Ownership = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click();", Ownership);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		WebElement Text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']//div"));
		
		String message = Text.getAttribute("title");
		
		
		if(message.contains("Carol")) {
			System.out.println("Account created message has been verified");
		}else {
			System.out.println("Account is not created");
		}
		

		
		
		
		
		
		
		
		
		

	}

}
