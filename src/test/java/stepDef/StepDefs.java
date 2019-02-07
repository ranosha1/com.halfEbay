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

public class StepDefs {
	// public static void main(String[] args) {

	WebDriver driver;
	static SignUp sign;

	@Before
	public void setUp() {
		driver = Driver.getInstance();
	}

	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Config.getProperty("url"));

	}

	@When("^user clicks on Sign Up tab$")
	public void user_clicks_on_Sign_Up_tab() throws Throwable {
		Thread.sleep(5000);
		sign = new SignUp(driver);
		sign.SignUp.click();
	}

	@Then("^user enters select Eddition from dropdown$")
	public void user_enters_select_Eddition_from_dropdown() throws Throwable {
		Select se = new Select(sign.Eddition);
		se.selectByVisibleText("Free Edition");
	}

	@Then("^user enters First Name and Last Name$")
	public void user_enters_First_Name_and_Last_Name() throws Throwable {
		sign.name.sendKeys("John");
		sign.lastName.sendKeys("Taylor");
	}

	@Then("^user enters Email and Confirm Email$")
	public void user_enters_Email_and_Confirm_Email() throws Throwable {
		sign.email.sendKeys("rano.bek@gmail.com");
		sign.emailConfirm.sendKeys("rano.bek@gmail.com");
	}

	@Then("^user enter username$")
	public void user_enter_username() throws Throwable {
		sign.username.sendKeys("Asilbek15");

	}

	@Then("^user enters Password and Password corfirm$")
	public void user_enters_Password_and_Password_corfirm() throws Throwable {
		sign.password.sendKeys("Test123");
		sign.passConfirm.sendKeys("Test123");
	}

	@Then("^user select checkbox$")
	public void user_select_checkbox() throws Throwable {
		sign.checkBox.click();
		boolean q = sign.checkBox.isSelected(); // Assert.assertTrue(sign.checkBox.isSelected());
		System.out.println(q);
	}

	@Then("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
		sign.submitBn.click();
	}

	@Then("^user enters company name$")
	public void user_enters_company_name() throws Throwable {
		sign.companyName.sendKeys("Cybertek");
	}

	@Then("^user enters phone$")
	public void user_enters_phone() throws Throwable {
		sign.phone.sendKeys("666-555-2525");
	}

	@Then("^user clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
		sign.Continue.click();
	}

	@Then("^user clicks on Finish button$")
	public void user_clicks_on_Finish_button() throws Throwable {
		sign.finish.click();
	}

}