package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	private static WebDriver driver;
	private static boolean isHeadless = true; // Set default mode to headless

	public static WebDriver launchBrowser() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();

			// Configure ChromeOptions based on isHeadless flag
			ChromeOptions options = new ChromeOptions();
			if (isHeadless) {
				options.addArguments("--headless");
			}

			driver = new ChromeDriver(options);
			driver.get("https://www.leafground.com/dashboard.xhtml");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}

	public static void setHeadless(boolean headless) {
		isHeadless = headless;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void closeBrowser() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
