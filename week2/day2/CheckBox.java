package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Basic CheckBox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//choose your favorite languages
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		//Tri state checkbox
		driver.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']"));
		
		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//Verify if check box is disabled
		boolean enabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
		if(enabled) {
			System.out.println("Checkbox is not disabled");
		}
		else {
			System.out.println("Checkbox is disabled");
		}
		
		//Select Multiple
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
		

	}

}
