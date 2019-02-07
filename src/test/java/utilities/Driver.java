package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getInstance() {
		if (driver == null)
			switch (Config.getProperty("browser")) {
			case "chrome":

				System.setProperty("webdriver.chrome.driver",
						"/Users/Rano/Documents/Libraries/drivers/chromedriver.exe");

				driver = new ChromeDriver();

				break;

			case "firefox":

				System.setProperty("webdriver.chrome.driver",
						"/Users/Rano/Documents/Libraries/drivers/chromedriver.exe");

				driver = new FirefoxDriver();

				break;

			case "ie":

				System.setProperty("webdriver.chrome.driver",
						"/Users/Rano/Documents/Libraries/drivers/chromedriver.exe");

				driver = new InternetExplorerDriver();

				break;

			case "safari":

				driver = new SafariDriver();

				break;

			}

		return driver;

	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}