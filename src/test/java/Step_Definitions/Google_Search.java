package Step_Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import java.io.IOException;

public class Google_Search {

    WebDriver driver;

    @Given("^Browser is opened to navigate to google$")
    public void browser_is_opened_to_navigate_to_google() {

        driver = Hooks.driver;

        String url = "https://www.google.com/";

        driver.get(url);

        try {

            Assert.assertEquals(url, driver.getCurrentUrl());

            System.out.println("Google Page is opened correctly");
        }

        catch (Throwable error){
            System.out.println("Didn't navigate to the correct web page");

        }
    }

    @When("^user searches for \"([^\"]*)\"$")
    public void user_searches_for(String phrase) {

        WebDriverWait wait = new WebDriverWait(driver,5);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Page_Objects.Google_Search.search)));

        driver.findElement(Page_Objects.Google_Search.search).sendKeys(phrase);

        driver.findElement(Page_Objects.Google_Search.search).submit();

        System.out.println("Search is started");

    }

    @Then("^the search result for \"([^\"]*)\" must be shown$")
    public void the_search_result_for_must_be_shown(String phrase) {

        Assert.assertTrue(driver.getPageSource().contains(phrase));

        System.out.println("Result Page is displayed successfully");

    }

    @And("^the screenshot must be taken of the result$")
    public void the_screenshot_must_be_taken_of_the_result() {

        // take screenshot in file format
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {

            // copy it to desired location

            FileUtils.copyFile(screenshot, new File("target/cucumber/screenshots" + System.currentTimeMillis() + ".png"));

            System.out.println("Screenshot is taken successfully");

        }

        catch (IOException e)

        {
            System.out.println("Screenshot failed");
        }
    }
}
