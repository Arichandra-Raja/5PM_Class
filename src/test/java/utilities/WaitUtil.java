package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;


public class WaitUtil {
	private static WebDriver driver = BrowserUtil.getDriver();

public static void waitForElementToBeClickable(WebElement element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    wait.until(ExpectedConditions.elementToBeClickable(element));
}

public static void waitForElementToBeVisible(WebElement element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    wait.until(ExpectedConditions.visibilityOf(element));
}



public static WebElement fluentWaitForElement(WebElement element, int timeoutInSeconds, int pollingIntervalInSeconds) {
    Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(timeoutInSeconds))
            .pollingEvery(Duration.ofSeconds(pollingIntervalInSeconds))
            .ignoring(NoSuchElementException.class);

    return wait.until(ExpectedConditions.visibilityOf(element));
}

}


