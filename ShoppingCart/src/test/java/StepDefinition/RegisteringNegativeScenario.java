package StepDefinition;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverInstance;

public class RegisteringNegativeScenario extends DriverInstance {

	@And("User clicks the Registration link")
	public void userClicksTheRegistrationLink() {

		driver.findElementByLinkText("Create an Account").click();

	}

	@When("User clicks the submit button without fill the form values")
	public void userClicksTheSubmitButtonWithoutFillTheFormValues() {

		driver.findElementByXPath("//button[@title='Create an Account']").click();
	}

	@Then("User can get the FirstName error message")
	public void userCanGetTheFirstNameErrorMessage() {

		String fname_err = driver.findElementById("firstname-error").getText();

		Assert.assertEquals(fname_err, "This is a required field.");

	}

	@And("User can get the LastName error message")
	public void userCanGetTheLastNameErrorMessage() {

		String Sname_err = driver.findElementById("lastname-error").getText();

		Assert.assertEquals(Sname_err, "This is a required field.");

	}

	@And("User can get the Email error message")
	public void userCanGetTheEmailErrorMessage() {

		String email_err = driver.findElementById("email_address-error").getText();

		Assert.assertEquals(email_err, "This is a required field.");

		driver.findElementByXPath("(//input[@type='email'])[1]").sendKeys("test", Keys.ENTER);

		String email_err1 = driver
				.findElementByXPath("//div[text()='Please enter a valid email address (Ex: johndoe@domain.com).']")
				.getText();

		Assert.assertEquals(email_err1, "Please enter a valid email address (Ex: johndoe@domain.com).");

	}

	@And("User can get the Password error message")
	public void userCanGetThePasswordErrorMessage() {

		String pass_err = driver.findElementById("password-error").getText();

		Assert.assertEquals(pass_err, "This is a required field.");

		driver.findElementByXPath("(//input[@type='password'])[1]").sendKeys("Mars");

		String pass_err1 = driver.findElementById("password-strength-meter-label").getText();

		Assert.assertEquals(pass_err1, "Weak");

		driver.findElementByXPath("(//input[@type='password'])[1]").clear();

		driver.findElementByXPath("(//input[@type='password'])[1]").sendKeys("Earth123");

		String pass_err2 = driver.findElementById("password-strength-meter-label").getText();

		Assert.assertEquals(pass_err2, "Medium");

		driver.findElementByXPath("(//input[@type='password'])[1]").clear();

		driver.findElementByXPath("(//input[@type='password'])[1]").sendKeys("Earth@12345");

	}

	@And("User can get the ConPass error message")
	public void userCanGetTheConPassErrorMessage() {

		String con_pass_err = driver.findElementById("password-confirmation-error").getText();

		Assert.assertEquals(con_pass_err, "This is a required field.");

		driver.findElementByXPath("(//input[@type='password'])[2]").sendKeys("Earth", Keys.ENTER);

		String con_pass_err1 = driver.findElementById("password-confirmation-error").getText();

		Assert.assertEquals(con_pass_err1, "Please enter the same value again.");

	}

}
