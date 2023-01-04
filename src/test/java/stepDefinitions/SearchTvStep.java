package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.SearchTvPage;

public class SearchTvStep {
	private BasePage basePage = new BasePage();
	private SearchTvPage searchPage = new SearchTvPage();

	@Given("user opens {string} in {string} browser")
	public void user_opens_in_browser(String url, String browser) {
		basePage.initBrowser(browser);
		basePage.openUrl(url);
	}

	@When("Click on the hamburger menu in the top left corner")
	public void click_on_the_hamburger_menu_in_the_top_left_corner() {
		searchPage.clickHambugerMenu();
	}

	@When("Click on the TV, Appliances and Electronics link under Shop by Department section")
	public void click_on_the_tv_appliances_and_electronics_link_under_shop_by_department_section() {
		searchPage.clickTvAppliancesElectronics();
	}

	@When("Click on {string} under Tv, Audio & Cameras sub section")
	public void click_on_televisions_under_tv_audio_cameras_sub_section(String section) {
		searchPage.clickOnTelevisions(section);
	}

	@When("Filter the results by Brand {string}")
	public void filter_the_results_by_brand_samsung(String brand) {
		searchPage.filterByBrand(brand);
	}

	@When("Sort the Samsung results with price High to Low")
	public void sort_the_samsung_results_with_price_high_to_low() {
		searchPage.sortPriceHightoLow();
	}

	@When("Click on the second highest priced item")
	public void click_on_the_second_highest_priced_item() {
		searchPage.clickSecondHighestPrice();
		searchPage.navigateToWindow();
	}

	@Then("Assert that “About this item” section is present and log this section text to console\\/report")
	public void assert_that_about_this_item_section_is_present_and_log_this_section_text_to_console_report() {
		searchPage.verifyAboutThisItem();
	}

}
