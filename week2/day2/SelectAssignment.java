package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement select = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select drp = new Select(select);
		drp.selectByVisibleText("Playwright");
		// Choose your preferred country
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		Thread.sleep(2000);
		// confirm cities belongs to cointry is loaded
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		WebElement city1 = driver.findElement(By.xpath("//li[@id='j_idt87:city_1']"));
		String text = city1.getText();
		city1.click();
		// now change the country and check the city is different or not
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);
		// now check the city and click
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		WebElement city2 = driver.findElement(By.xpath("//li[@id='j_idt87:city_2']"));
		String text2 = city2.getText();
		city2.getText();
		city2.click();
		// choose the course
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='AWS']")).click();

		// choose language

		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(2000);
		// Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_3']")).click();

	}

}
