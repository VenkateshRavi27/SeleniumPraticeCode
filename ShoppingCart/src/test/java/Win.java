import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverInstance;

public class Win extends DriverInstance {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://letcode.in/window");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//button[text()='Muiltiple windows']").click();

		String mainWindow = driver.getWindowHandle();

		System.out.println("Main Window ID : " + mainWindow);

		Set<String> allWindows = driver.getWindowHandles();

		for (String wins : allWindows) {

			if (!wins.equals(mainWindow)) {

				driver.switchTo().window(wins);

				break;

			}
		}
		
		driver.switchTo().window(mainWindow);

	}

}
