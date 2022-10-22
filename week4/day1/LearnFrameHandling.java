package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
//Classroom:
//
//=========
//
//1. Load https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
//
//2. click Try it button
//
//3. Enter your name in the prompt alert
//
//4. Click Ok in the alert
//
//5. Read the text below Try it and print it in the Console

public class LearnFrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Switch to frame using Web element
	WebElement iframe = driver.findElement(By.id("iframeResult"));
	driver.switchTo().frame(iframe);
	
	//Switch to frame using id
	//driver.switchTo().frame("iframeResult");
	
	
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Carol");
	alert.accept();
	String Text = driver.findElement(By.xpath("//p[contains(text(),'How are you today?')]")).getText();
	System.out.println(Text);
	
	
	
	}

}
