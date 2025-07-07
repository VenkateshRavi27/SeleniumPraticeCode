package hooks;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import driver.DriverInstance;

public class Hooks extends DriverInstance {

	@Before
	public void beforeScenario(Scenario scr) {

		option = new ChromeOptions();

//		option.addExtensions(new File("./Extensions/AdBlock.crx"));
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver(option);

		driver.get("https://magento.softwaretestingboard.com/");

		wait = new WebDriverWait(driver, 10);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterStep
	public void afterStep(Scenario scr) {

		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);

		scr.embed(screenshotAs, "image/png");

	}

	@After("@CleanUp")

	public void dataCleanUp() {

		driver.findElementByXPath("//a[contains(@class,'action showcart')]").click();

		WebElement cart = driver.findElementByXPath("(//span[@class='counter qty'])[1]");

		String count = cart.getText();

		Pattern pattern = Pattern.compile("\\d+");

		Matcher matcher = pattern.matcher(count);

		int cartCount = 0;
		if (matcher.find()) {
			cartCount = Integer.parseInt(matcher.group());
		}

		System.out.println("Added a product to the cart count is: " + cartCount);

		WebElement del = driver.findElementByXPath("//a[@class='action delete']");

		wait.until(ExpectedConditions.elementToBeClickable(del)).click();

		WebElement okBtn = driver.findElementByXPath("(//button[@data-role='action']//span)[2]");

		wait.until(ExpectedConditions.visibilityOf(okBtn)).click();

		String clearedMsg = driver.findElementByXPath("//strong[@class='subtitle empty']").getText();

		System.out.println(clearedMsg);

		Assert.assertEquals(clearedMsg, "You have no items in your shopping cart.");

	}

	@After(order = 3)
	public void afterScenario() {

		driver.quit();

	}

}
