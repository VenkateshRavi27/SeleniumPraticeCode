package StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverInstance;

public class AddToCart extends DriverInstance {

	@Given("User clicks on the create an login link")
	public void userClicksOnTheCreateAnLoginLink() {

		driver.findElementByLinkText("Sign In").click();

	}

	@And("User enters the {string} and {string}")
	public void userEntersTheAnd(String email, String pass) {

		driver.findElementById("email").sendKeys(email);
		driver.findElementById("pass").sendKeys(pass);
		driver.findElementByXPath("(//button[@type=\"submit\"])[2]").click();

		WebElement usrName = driver.findElementByXPath("(//span[@class='logged-in'])[1]");
		System.out.println(usrName.getText());
		wait.until(ExpectedConditions.visibilityOf(usrName));

	}

	@And("User search the men {string}")
	public void userSearchTheMen(String string) throws InterruptedException {

		WebElement product = driver.findElementByName("q");
		product.sendKeys("Ajax Full-Zip Sweatshirt");
		wait.until(ExpectedConditions.visibilityOf(product));

	}

	@When("User add the hoodie to the cart")
	public void userAddTheHoodieToTheCart() throws InterruptedException {

		driver.findElementById("qs-option-0").click();
		driver.findElementByXPath("(//div[@index='2'])[1]").click();
		driver.findElementByXPath("(//div[@aria-label='Blue'])[1]").click();
		WebElement cart = driver.findElementByXPath("(//button[@title=\"Add to Cart\"])[1]");
		wait.until(ExpectedConditions.visibilityOf(cart)).click();

	}

	@Then("Cart badge should be updated")
	public void cartBadgeShouldBeUpdated() {

		WebElement badgeCount = driver.findElementByClassName("counter-number");
		wait.until(ExpectedConditions.textToBePresentInElement(badgeCount, "1"));
		String badgeResult = badgeCount.getText();
		Integer.parseInt(badgeResult);
		Assert.assertEquals(Integer.parseInt(badgeResult) > 0, true);

	}

}
