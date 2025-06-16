package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import driver.DriverInstance;

public class Dropdown extends DriverInstance {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement fruits = driver.findElementById("fruits");

		Select select = new Select(fruits);

		select.selectByIndex(1);

		select.selectByValue("2");

		select.selectByVisibleText("Pine Apple");

		WebElement heros = driver.findElementById("superheros");

		select = new Select(heros);
		
		select.selectByIndex(0);
		
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());

		List<WebElement> options = select.getOptions();

		for (WebElement webElement : options) {

			String text = webElement.getText();

			System.out.println(text);

		}
		
			
		driver.quit();	

	}
}
