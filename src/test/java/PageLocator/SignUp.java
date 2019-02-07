package PageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

	WebDriver driver;

	public SignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div//li//a[.='Sign Up']")
	public WebElement SignUp;

	// @FindBy(xpath = "//a[contains(text(), 'Sign Up')]")

	@FindBy(xpath = "//select[@id='payment_plan_id']")
	public WebElement Eddition;

	@FindBy(name = "first_name")
	public WebElement name;

	@FindBy(name = "surname")
	public WebElement lastName;

	@FindBy(name = "email")
	public WebElement email;

	@FindBy(name = "email_confirm")
	public WebElement emailConfirm;

	@FindBy(name = "username")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "passwordconfirm")
	public WebElement passConfirm;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkBox;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitBn;

	@FindBy(id = "company_name")
	public WebElement companyName;

	@FindBy(id = "phone")
	public WebElement phone;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Continue;

	@FindBy(xpath = "//button[@name='finish']")
	public WebElement finish;

	public void login(String firstName, String LastName) {
		// loginLink.click();
		// Page.sleep(3000);
		name.sendKeys(firstName);
		lastName.sendKeys(LastName);

	}
}
