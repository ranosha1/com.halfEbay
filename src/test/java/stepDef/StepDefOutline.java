package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageLocator.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Config;
import utilities.Driver;

public class StepDefOutline {

	WebDriver driver;
	SignUp sign;

	@Before
	public void setUp() {
		driver = Driver.getInstance();
	}

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		driver.get(Config.getProperty("url"));
	}

	@When("^User clicks on Sign Up tab$")
	public void user_clicks_on_Sign_Up_tab() throws Throwable {
		Thread.sleep(5000);
		sign = new SignUp(driver);
		sign.SignUp.click();
	}

	@Then("^User enters select Eddition from dropdown$")
	public void user_enters_select_Eddition_from_dropdown() throws Throwable {
		Select se = new Select(sign.Eddition);
		se.selectByVisibleText("Free Edition");
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String FirstName, String LastName) throws Throwable {
		Thread.sleep(5000);
		sign.name.sendKeys(FirstName);

		sign.lastName.sendKeys(LastName);
		Thread.sleep(5000);
	}

	@Then("^User submits \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_submits_and(String Email, String ConfirmEmail) throws Throwable {
		sign.email.sendKeys(Email);
		sign.emailConfirm.sendKeys(ConfirmEmail);
	}

	@Then("^User enter \"([^\"]*)\"$")
	public void user_enter(String username) throws Throwable {
		sign.username.sendKeys(username);

	}

	@Then("^User write \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_write_and(String Password, String PasswordConfirm) throws Throwable {
		sign.password.sendKeys(Password);
		sign.passConfirm.sendKeys(PasswordConfirm);
	}

	@Then("^User select checkbox$")
	public void user_select_checkbox() throws Throwable {
		sign.checkBox.click();
	}

	@Then("^User clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
		sign.submitBn.click();
	}

	@Then("^User type \"([^\"]*)\"$")
	public void user_type(String companyName) throws Throwable {
		Thread.sleep(5000);
		sign.companyName.sendKeys(companyName);
	}

	@Then("^User dial \"([^\"]*)\"$")
	public void user_dial(String phone) throws Throwable {
		Thread.sleep(4000);
		sign.phone.sendKeys(phone);
	}

	@Then("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
		sign.Continue.click();
	}

	@Then("^User clicks on Finish button$")
	public void user_clicks_on_Finish_button() throws Throwable {
		sign.finish.click();

	}
}
