package marathon.java.challange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opportunities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://login.salesforce.com/?locale=in");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("ramkumar.ramaiah@testleaf.com");

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Password#123");

		WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();

		Thread.sleep(5000);

		WebElement toggleButton = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggleButton.click();

		WebElement viewAll = driver.findElement(By.xpath("//button[contains(text(), 'View All')]"));
		viewAll.click();

		WebElement Sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		Sales.click();

		WebElement Opportunities = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", Opportunities);

		WebElement newButton = driver.findElement(By.xpath("(//div[@title='New'])[1]"));
		newButton.click();

		WebElement opportunityName = driver.findElement(By.xpath("//input[@name='Name']"));
		opportunityName.sendKeys("Carol");

		WebElement closeDate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		closeDate.sendKeys("10/5/2023");

		WebElement noneButton = driver.findElement(By.xpath(
				"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_opportunity___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[2]/div/span/slot/sfa-input-stage-name/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button"));
		driver.executeScript("arguments[0].click();", noneButton);

		Thread.sleep(5000);
		//WebElement stage = driver.findElement(By.xpath("(//span[contains(text(),'Needs Analysis')])[130]"));
		//WebElement stage = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_opportunity___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[2]/div/span/slot/sfa-input-stage-name/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/button/span/text()"));
		WebElement stage = driver.findElement(By.xpath("//*[@id=\"combobox-button-227-3-227\"]/span[2]/span"));
		driver.executeScript("arguments[0].click();", stage);

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		WebElement Text = driver
				.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']//div"));

		String message = Text.getAttribute("title");

		if (message.contains("Carol")) {
			System.out.println("Opportunity created message has been verified");
		} else {
			System.out.println("Opportunity is not created");
		}

	}

}
