package week2.day2;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Point;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub // Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://www.leafground.com/input.xhtml");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Type your name

		driver.findElement(By.id("j_idt88:name")).sendKeys("Carol");

		// Append Country to this City.

		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Salem");

		// Verify if text box is disabled

		Boolean textBox = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		System.out.println(textBox);
		if (textBox == true) {
			System.out.println("The textbox is enabled");
		} else {
			System.out.println("The textbox is disabled");
		}

		// Clear the typed text.

		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();

		// Retrieve the typed text.
		String Typedtext = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(Typedtext);

		// Type email and Tab. Confirm control moved to next element.
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("testleaf@gmail.com", Keys.TAB);
		
		//inorder to check whether control moved using active element method
		WebElement activeElement = driver.switchTo().activeElement();
		String text = activeElement.getText();
		if(text.contains("About yourself")) {
			System.out.println("control moved");
		}
		else {
			System.out.println("control not moved");
		}
		
		//Type about yourself
		System.out.println("Type abput yourself:");
		activeElement.sendKeys("I am Test Enginerr");
		//Text Editor
		System.out.println("Text Editor");
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[8]/div/div/div[2]/div[1]")).sendKeys("Testleaf");
		
		//-----------
		
		//Just press Enter and confirm error message.
		driver.findElement(By.xpath("//*[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		String error= driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		if(error.contains("Age is Mandatory")) {
			System.out.println("confirmed error message");
		}
		else {
			System.out.println("not confirmed error message");
		}
		
		//Click and confirm label position changes
		System.out.println("Click and Confirm Lable Postion Changes");
		WebElement label = driver.findElement(By.xpath("//*[@id=\'j_idt106:float-input\']"));
		Point location = label.getLocation();
		//get that location then click it and check again getting location
		label.click();
		Point location2 = label.getLocation();
		if (!location.equals(location2)) {
			System.out.println("Position Changed");
			
		}else {
			System.out.println("Position not changed");
		}
		
		//Type your name and choose the third option
		
		System.out.println("Type your name and choose the third option");
		WebElement type = driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']/following::input[1]"));
		type.sendKeys("Testleaf");
		Thread.sleep(3000);
		//use action class to mouse hover and click on third options
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\'j_idt106:auto-complete_panel\']/ul/li[1]/span"));
		Actions builder = new Actions(driver);
		builder.moveToElement(findElement).perform();
		Thread.sleep(3000);
		//after mouse hover
		for (int i =0; i <3; i++) {
			type.sendKeys(Keys.DOWN);
	
		}
		
		type.sendKeys(Keys.ENTER);
		//Type your DOB
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("01/01/1994");	
		//typpe number and spin to confirm value changed
		System.out.println("typpe number and spin to confirm value changed");
		WebElement spin = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
		spin.sendKeys("5");
		String attribute2 = spin.getAttribute("value");
		driver.findElement(By.xpath("//*[@id='j_idt106:j_idt118']/a[1]/span/span")).click();
		String attribute3 = spin.getAttribute("value");
		if(!attribute2.equals(attribute3)) {
			System.out.println("confirmed value changed");
		}else {
			System.out.println("value not changed");
		}
		//Type random number(1-100) and confirm slider moves correctly
		System.out.println("Type random number(1-100) and confirm slider moves correctly");
		//first get the position of that icon
		Point location3 = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt120']/span")).getLocation();
		//type value in it
		driver.findElement(By.xpath("//*[@id='j_idt106:slider']")).sendKeys("50");
		Point location4 = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt120']/span")).getLocation();
		//compare two location
		if (!location3.equals(location4)) {
			System.out.println("slides moved correctly");
			
		}else
		{
			System.out.println("slides not moved correctly");
		}
		
		//click and confirm keyboard appears
		System.out.println("click and confirm keyboard appears");
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
		boolean displayed = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
		if (displayed) {
			System.out.println("keyboard displayed");
		}else
		{
			System.out.println("keyboard is not displayed");
		}
		
		//custom toolbar
		System.out.println("custom toolbar:");
		driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt124_editor\"]/div[1]")).sendKeys("Testleaf");

	}

}
