package week2.day2;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioLeafground {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Your most favorite browser
		System.out.println("Your most favorite browser");
		driver.findElement(By.xpath("//label[text()='Firefox']")).click();
		//Unselectable
		System.out.println("Unselectable");
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		//Find the default select radio button
		System.out.println("Find the default select radio button");
		String text = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[@checked='checked']/following::label")).getText();
		System.out.println(text);
		boolean selected = driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")).isSelected();
		
		if(!selected) {
			driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")).click();
		}
		
	}
	
}
