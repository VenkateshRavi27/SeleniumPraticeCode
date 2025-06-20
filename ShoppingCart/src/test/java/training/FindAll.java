package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverInstance;

public class FindAll extends DriverInstance {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		wait = new WebDriverWait(driver, 10);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement searchProudct = driver.findElementByXPath("//input[@placeholder='Search Amazon.in']");

		wait.until(ExpectedConditions.visibilityOf(searchProudct)).sendKeys("iphone", Keys.ENTER);

		List<WebElement> iphoneName = driver.findElementsByTagName("h2");

		for (WebElement result : iphoneName) {

			System.out.println(result.getText());

		}

		driver.quit();

	}

}
