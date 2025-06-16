package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverInstance;

public class Alert extends DriverInstance {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://letcode.in/alert");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementById("accept").click();

		org.openqa.selenium.Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);

		String text = alert.getText();

		System.out.println(text);

		alert.accept();

		driver.findElementById("prompt").click();

		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();

		alert2.sendKeys("venkatesh");

		alert2.accept();

		String text2 = driver.findElementById("myName").getText();

		System.out.println(text2);

		driver.quit();

	}
}
