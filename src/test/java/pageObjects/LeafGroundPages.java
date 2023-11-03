package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtil;

public class LeafGroundPages {

	WebDriver driver;

	public LeafGroundPages() {
		driver = BrowserUtil.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuform:j_idt40")
	WebElement mainBodyElement;

	@FindBy(id = "menuform:m_input")
	WebElement hrefElement;

	@FindBy(id = "j_idt88:name")
	WebElement textBoxElement;

	public void clickMainBodyElement() throws InterruptedException {
		Thread.sleep(4000);
		mainBodyElement.click();
	}

	public void clickHrefElement() {
		hrefElement.click();
	}

	public void enterText(String text) {

		textBoxElement.sendKeys(text);

	}
}
