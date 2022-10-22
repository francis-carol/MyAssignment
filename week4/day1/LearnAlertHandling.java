package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Prompt Alert
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Testleaf");
		alert2.accept();

		// Simple Alert

		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		// To move from main menu to alert
		Alert alert = driver.switchTo().alert();

		// to get alert message
		String text = alert.getText();
		System.out.println(text);

		// to click on oK button
		alert.accept();

		// Confirm Alert

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().dismiss();

	}

}
