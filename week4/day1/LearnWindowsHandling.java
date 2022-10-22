package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.irctc.co.in/nget/train-search");
//		driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//	
//	driver.findElement(By.partialLinkText("FLIGHTS")).click();
//	
//	
//	System.out.println("----------------");
//	
//	Set<String> windowHandles = driver.getWindowHandles();
//	List<String> listHandles = new ArrayList<String>(windowHandles);
//	
//	String secondwindowHanlde = listHandles.get(1);
//	
//	driver.switchTo().window(secondwindowHanlde);
//	
//	System.out.println(windowHandles);
//	
//	String title = driver.getTitle();
//	System.out.println(title);
//	
//	driver.close();
//	
//String firstWindow = listHandles.get(0);
//	
//	driver.switchTo().window(firstWindow);
//	
//	System.out.println(windowHandles);
//	
//	String title2 = driver.getTitle();
//	System.out.println(title2);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		Thread.sleep(5000);

		Set<String> windowHandles = driver.getWindowHandles();
		//Copy the set into list
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		
		//to move the control to the second window
		driver.switchTo().window(listHandles.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		driver.switchTo().window(listHandles.get(0));
		String title1 = driver.getTitle();
		System.out.println(title1);
	
	
	}

}
