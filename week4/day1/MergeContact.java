package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("demosalesmanager");

		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");

		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();

		WebElement elementCRM = driver.findElement(By.linkText("CRM/SFA"));
		elementCRM.click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(1000);

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);

		driver.switchTo().window(listHandles.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(listHandles.get(0));

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[2]/td[2]/a")).click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listHandles2 = new ArrayList<String>(windowHandles2);

		driver.switchTo().window(listHandles2.get(1));

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		driver.switchTo().window(listHandles.get(0));

		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();

		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);

	}

}
