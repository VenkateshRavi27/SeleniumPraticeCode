package training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver.DriverInstance;

public class Calender extends DriverInstance {

	@Test
	public void CalanderHandle() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElementById("Icon Trigger").click();

		driver.findElementByXPath("(//a[@class='close_img'])[3]").click();

		Thread.sleep(3000);

		WebElement innerFrame = driver.findElementByXPath("(//iframe[@class='demo-frame lazyloaded'])[2]");

		driver.switchTo().frame(innerFrame);

		driver.findElementByXPath("//img[@alt='Select date']").click();

		String selectedDate = null;

		while (true) {

			selectedDate = driver.findElementByClassName("ui-datepicker-title").getText();

			if (selectedDate.equalsIgnoreCase("August 2024")) {

				break;
			}

			driver.findElementByXPath("//a[@title='Next']//span[1]").click();
			driver.findElementByXPath("//a[@title='Prev']//span[1]").click();

		}
		driver.findElementByXPath("//table[@class='ui-datepicker-calendar']/tbody[1]/tr[3]/td[6]/a[1]").click();

		driver.quit();
	}

}
