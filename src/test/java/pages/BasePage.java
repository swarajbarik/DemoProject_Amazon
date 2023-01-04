package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.MainGridLocators;

public class BasePage {
	public static WebDriver driver;

	public void initBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void click(String locator) {
		getElement(locator).click();
	}

	public void scrollToElement(String locator) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getElement(locator));
	}
	
	public void selectByText(String text) {
		Select sortSelection = new Select(getElement(MainGridLocators.SORT_DROP_DOWN_LIST));
		sortSelection.selectByVisibleText(text);
	}

	public WebElement getElement(String locator) {
		WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(driver -> driver.findElement(By.xpath(locator)));
		return ele;
	}
}
