package marathon.java.challange;
//Testcase:3-Create Task

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//1) Launch the browser

//2) Click Login

//3) Login with the credentials

//4) Click on Global Actions SVG icon(App Launcher)

//5) Click view all

//6) Type task and select task

//7) Click New Task under dropdown icon

//6) Enter subject as "Bootcamp "                                            


public class CreateTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);

		driver.get("https://login.salesforce.com/?locale=in");

		driver.manage().window().maximize();

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
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']"));
		searchButton.sendKeys("Task");
		
		WebElement TaskTab = driver.findElement(By.xpath("//mark[text()='Task']"));
		TaskTab.click();
		
		WebElement findNewTask = driver.findElement(By.xpath("//span[text()='Show more actions']"));
		driver.executeScript("arguments[0].click();", findNewTask);
		
		WebElement NewTaskButton = driver.findElement(By.xpath("//div[text()='New Task']"));
		driver.executeScript("arguments[0].click();", NewTaskButton);
		
		WebElement subject = driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]"));
		subject.sendKeys("Bootcamp");
		
		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));
		save.click();
		
		WebElement Text = driver.findElement(By.xpath("//span[text()='Task']//div"));

		String message = Text.getAttribute("title");

		if (message.contains("Bootcamp")) {
			System.out.println("Task Bootcamp created message has been verified");
		} else {
			System.out.println("Task is not created");
		}

		
		

	}

}
