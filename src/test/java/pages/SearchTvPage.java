package pages;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import locators.HomePageLocators;
import locators.MainGridLocators;
import locators.SideMenuLocators;

public class SearchTvPage extends BasePage {

	public void clickHambugerMenu() {
		click(HomePageLocators.HAMBURGERMENU);
	}

	public void clickTvAppliancesElectronics() {
		scrollToElement(SideMenuLocators.TV_APPLIANCES_ELECTRONICS);
		click(SideMenuLocators.TV_APPLIANCES_ELECTRONICS);
	}

	public void clickOnTelevisions(String section) {
		click(String.format(SideMenuLocators.SUB_SECTION, section));
	}

	public void filterByBrand(String brand) {
		scrollToElement(SideMenuLocators.BRANDS);
		click(String.format(SideMenuLocators.SELECT_BRAND, brand));
	}

	public void sortPriceHightoLow() {
		selectByText("Price: High to Low");
	}

	public void clickSecondHighestPrice() {
		click(String.format(MainGridLocators.SEARCH_RESULT, 2));
	}

	public void verifyAboutThisItem() {
		boolean isPresent = getElement(MainGridLocators.ABOUT_THIS_ITEM).isDisplayed();
		scrollToElement(MainGridLocators.ABOUT_THIS_ITEM);
		assertTrue("About this item not displayed", isPresent);
		System.out.println(getElement(MainGridLocators.ABOUT_THIS_ITEM + "/following-sibling::ul").getText());
	}

	public void navigateToWindow() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}

}
