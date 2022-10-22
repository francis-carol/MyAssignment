package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCustomerservice {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("ramkumar.ramaiah@testleaf.com");

		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("Password#123");
		
		WebElement elementLogin = driver.findElement(By.id("Login"));
		elementLogin.click();
		
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listHandles.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		
		driver.close();
		
		driver.switchTo().window(listHandles.get(0));

		driver.quit();

		
		

		
	}

}
