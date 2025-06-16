package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverInstance;

public class RegisterSteps extends DriverInstance {

	@Given("User should navigate to the application")
	public void userShouldNavigateToTheApplication() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@And("User clicks on the create an account link")
	public void userClicksOnTheCreateAnAccountLink() {

		driver.findElementByLinkText("Create an Account").click();

	}

	@And("User enter the First Name as {string}")
	public void userEnterTheFirstNameAs(String FirstName) {

		driver.findElementById("firstname").sendKeys(FirstName);

	}

	@And("User enter the Last Name as {string}")
	public void userEnterTheLastNameAs(String LastName) {

		driver.findElementByName("lastname").sendKeys(LastName);

	}

	@And("User enter the Email as {string}")
	public void userEnterTheEmailAs(String email) {

		driver.findElementByXPath("(//input[@type='email'])[1]").sendKeys(email);

	}

	@And("User enter the Password as {string}")
	public void userEnterThePasswordAs(String password) {

		driver.findElementByXPath("(//input[@type='password'])[1]").sendKeys(password);

	}

	@And("User enter the Confirm Password as {string}")
	public void userEnterTheConfirmPasswordAs(String conPass) {

		driver.findElementByXPath("(//input[@type='password'])[2]").sendKeys(conPass);

	}

	@When("user click the Create an Account")
	public void userClickTheCreateAnAccount() {

		driver.findElementByXPath("//button[@title='Create an Account']").click();

	}

	@Then("login should be success")
	public void loginShouldBeSuccess() {

		String successMsg = driver.findElementByXPath("//div[@data-ui-id='message-success']//div[1]").getText();

		Assert.assertEquals(successMsg, "Thank you for registering with Main Website Store.");

		driver.quit();

	}

}
