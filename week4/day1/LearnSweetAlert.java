package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSweetAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node01jnu5xkzymbizu5s0sxpln4ic389795.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		 driver.findElement(By.xpath("[button(text()='Alert Box')]")).click();
//		//To move from main menu to alert
//		Alert alert = driver.switchTo().alert();
//		
//		//to get alert message
//		String text = alert.getText();
//		System.out.println(text);
//
//		//to click on oK button
//		alert.accept();
//		
//		//Confirm Alert
//		
//		driver.findElement(By.xpath("[button(text()='Confirm Box')]")).click();
//		driver.switchTo().alert().dismiss();
//		
//		//Prompt Alert
//		driver.findElement(By.xpath("[button(text()='Prompt Box')]")).click();
//		Alert alert2 = driver.switchTo().alert();
//		alert2.sendKeys("Testleaf");
//		alert2.accept();

		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		//sweet alert
		driver.findElement(By.xpath("//span[text()='Yes']")).click();


	}

}
