package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks {
    
    @After
    public void afterScenario(Scenario scenario) {
//        if (scenario.isFailed()) {
          // Take a screenshot...
          final byte[] screenshot = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES);
       // embed it in the report.
          scenario.attach(screenshot, "image/png", scenario.getName());
//        }
    }

    @AfterAll
    public static void after_all() {
        BasePage.driver.quit();
    }
}
