package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub // Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Click and Confirm title.

		WebElement clickButton = driver.findElement(By.xpath("//button[contains(@class, 'rounded-button')]"));
		clickButton.click();

		// confirm title

		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);

		if (title.contains("Dashboard")) {

			System.out.println("I confirm the title of the page is " + title);
		} else {
			System.out.println("Couldn't confirm the title");
		}

		driver.navigate().back();

		// Confirm if the button is disabled.

		Boolean enabled = driver.findElement(By.xpath(" //button[@id='j_idt88:j_idt92']")).isEnabled();
		if (!enabled) {
			System.out.println("The button is Not enabled");
		} else {
			System.out.println("The button is enabled");
		}

		// Find the position of the Submit button
		Point position = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]")).getLocation();
		System.out.println(position);

		// Find the Save button color
		String buttonColor = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println(buttonColor);

		// Find the height and width of this button
		// use getsize inorder to find height and width
		Dimension size = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']/span[2]")).getSize();
		System.out.println(size);
		
		//Mouse over and confirm the color changed
		System.out.println("Mouse over and confirm the color changed");
		
		WebElement success = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']/span"));
		//first check the before color
		String BeforeColor = success.getCssValue("background-color");
		System.out.println("BeforeColor");
		//use action class for mouseover
		Actions builder = new Actions(driver);
		builder.moveToElement(success).perform();
		//after mouse over
		String AfterColor = success.getCssValue("background-color");
		System.out.println(AfterColor);
		if(!BeforeColor.equals(AfterColor)) {
			System.out.println("color changed");
		}else {
			System.out.println("color is not changed");
		}
		
		//Click Image Button and Click on any hidden button
		
		//first click on image button
		
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt102:imageBtn\']/span")).click();
		
		//click somehwere hidden elemnt
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt102:imagePanel']/div")).click();
		
		//How many rounded buttons are there?
		System.out.println("How many rounded buttons are there?");
		
		List<WebElement> roundButton = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		int size2 = roundButton.size();
		System.out.println(size2);
		

		
		

	}

}
