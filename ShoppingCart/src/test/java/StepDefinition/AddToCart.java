package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverInstance;

public class AddToCart extends DriverInstance {

	Actions action = new Actions(driver);

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
	public void userSearchTheMen(String prod) throws InterruptedException {

		WebElement product = driver.findElementByName("q");
		product.sendKeys(prod);
		wait.until(ExpectedConditions.visibilityOf(product));

	}

	@And("User add the hoodie to the cart")
	public void userAddTheHoodieToTheCart() throws InterruptedException {

		WebElement searchProduct = driver.findElementById("qs-option-0");
		wait.until(ExpectedConditions.visibilityOf(searchProduct)).click();
		
		driver.findElementByXPath("(//img[@class='product-image-photo'])[1]").click();
		
		WebElement hoodie = driver.findElementByXPath("(//div[@option-label='S'])[1]");
		wait.until(ExpectedConditions.elementToBeClickable(hoodie)).click();
		
		driver.findElementByXPath("(//div[@aria-label='Blue'])[1]").click();
		WebElement cart = driver.findElementByXPath("(//button[@title='Add to Cart']//span)[1]");
		wait.until(ExpectedConditions.visibilityOf(cart)).click();

	}

	@And("Cart badge should be updated")
	public void cartBadgeShouldBeUpdated() {

		WebElement badgeCount = driver.findElementByClassName("counter-number");
		wait.until(ExpectedConditions.textToBePresentInElement(badgeCount, "1"));
		String badgeResult = badgeCount.getText();
		Integer.parseInt(badgeResult);
		Assert.assertEquals(Integer.parseInt(badgeResult) > 0, true);

	}

	@And("User clicks the badge button")
	public void userClicksTheBadgeButton() {

		driver.findElementByXPath("//a[@class='action showcart']").click();

	}

	@And("User clicks the checkout button")
	public void userClicksTheCheckoutButton() {

		WebElement dialogBox = driver.findElementByXPath("//div[@role='dialog']");
		wait.until(ExpectedConditions.visibilityOf(dialogBox));
		if (dialogBox.isDisplayed()) {

			driver.findElementById("top-cart-btn-checkout").click();

		}

	}

	@And("User clicks next button for address selection")
	public void userClicksNextButtonForAddressSelection() {

		driver.findElementByName("ko_unique_1").click();

		WebElement nextBtn = driver.findElementByXPath("(//button[@type='submit'])[2]");

		wait.until(ExpectedConditions.visibilityOf(nextBtn));

		if (nextBtn.isDisplayed()) {

			nextBtn.click();

		}

	}

	@When("User clicks the place and order button")
	public void userClicksThePlaceAndOrderButton() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1. Wait for any blocking overlays to disappear (customize selector if needed)
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".checkout-billing-address")));
		} catch (TimeoutException e) {
			System.out.println("Blocking element '.checkout-billing-address' still visible after timeout.");
		}

		// 2. Locate the button
		By placeOrderBy = By.xpath("//button[@title='Place Order']");
		WebElement placeOrderBtn = wait.until(ExpectedConditions.presenceOfElementLocated(placeOrderBy));

		// 3. Scroll into view
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", placeOrderBtn);

		// 4. Wait again until it's clickable
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderBy));

		// 5. Click using JavaScript to avoid native click interception
		js.executeScript("arguments[0].click();", placeOrderBtn);

	}

	@Then("verify the thank you message")
	public void verifyTheThankYouMessage() {

		String sucessMsg = driver.findElementByXPath("//span[text()='Thank you for your purchase!']").getText();

		Assert.assertEquals(sucessMsg, "Thank you for your purchase!");

	}

}
