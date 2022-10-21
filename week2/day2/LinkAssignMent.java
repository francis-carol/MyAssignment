package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAssignMent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Take me to dashboard
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		String title = driver.getTitle();
		if (title.contains("Dashboard")) {
			System.out.println("Dashboard is confirmed");
			
		}else
		{
			System.out.println("Dashboard is not confirmed");
		}
		
		driver.navigate().back();
		
		//find my destination
		//inorder to find the link without clicking we need to use getAttribute
		String attribute = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).getAttribute("a");
		System.out.println(attribute);
		
		//Am I broken Link
		driver.findElement(By.xpath("//a[text()='Broken?']")).click();
		String title2 = driver.getTitle();
		if (title2.contains("404")) {
			System.out.println("Link is Borken");
			
		}else
		{
			System.out.println("Link is not Borken");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]")).click();
		driver.navigate().back();
		//count Links
		//inorder to find the number of links
		List <WebElement> findElements = driver.findElements(By.tagName("a"));
		System.out.println(findElements.size());
		//Count layout links
		//first you need to click on this link and then find number of links
		driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
		List <WebElement> findElements2 = driver.findElements(By.tagName("a"));
		System.out.println(findElements2.size());
		
		
		
		
		
		
		
		
	}

}
