package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Step 6: Click on Create New Account button
		WebElement elementCreateAccount = driver.findElement(By.linkText("Create New Account"));
		elementCreateAccount.click();

		// Step 7: Enter the first name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("francis");

		// Step 8: Enter the last name
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("carol");

		// Step 9: Enter the mobile number
		WebElement mobileNo = driver.findElement(By.name("reg_email__"));
		mobileNo.sendKeys("8825535622");

		// Step 10: Enter the password
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Testleaf@123");

		// Step 11: Handle all the three drop downs

		// Select Date for Date of Birth
		WebElement dd = driver.findElement(By.id("day"));

		// create object for select class and pass the parent web element
		Select date = new Select(dd);

		// select the option using by value
		date.selectByValue("26");

		// Select Month for Date of Birth
		WebElement mm = driver.findElement(By.id("month"));

		// create object for select class and pass the parent web element
		Select month = new Select(mm);

		// select the option using visible text
		month.selectByVisibleText("Nov");

		// Select year for Date of Birth
		WebElement yy = driver.findElement(By.id("year"));

		// create object for select class and pass the parent web element
		Select year = new Select(yy);

		List<WebElement> options = year.getOptions();

		int size = options.size();

		System.out.println(size);

		year.selectByIndex(29);

		// Step 12: Select the radio button "Female"
		// ( A normal click will do for this step)

		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();

	}

}
