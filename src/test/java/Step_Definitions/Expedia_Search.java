package Step_Definitions;

import Helper.Date_Helper;
import Page_Objects.Expedia_Search_PO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Expedia_Search {

    WebDriver driver;

    private Date_Helper dh = new Date_Helper();

    @Given("^I navigate to the Expedia website$")
    public void i_navigate_to_the_expedia_website() {

        driver = Hooks.driver;

        String url = "https://www.expedia.com/";

        driver.get(url);

        try {

            Assert.assertEquals(url, driver.getCurrentUrl());

            System.out.println("Expedia website is opened correctly");
        }

        catch (Throwable error){
            System.out.println("Didn't navigate to the correct web page");

        }

    }

    @When("^I look for a flight \\+ accommodation from Brussels to New York$")
    public void i_look_for_a_flight_accommodation_from_brussels_to_newyork() {

        WebDriverWait wait = new WebDriverWait(driver,10);

        // navigate to U.S. version of the site
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Expedia_Search_PO.country_us))).click();

        //select the origin & destination
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Expedia_Search_PO.origin))).click();

        driver.findElement(Expedia_Search_PO.origin).sendKeys("BRUSSELS");

        wait.until(ExpectedConditions.elementToBeClickable(Expedia_Search_PO.result_box));

        driver.findElement(Expedia_Search_PO.brussels).click();

        driver.findElement(Expedia_Search_PO.destination).click();

        driver.findElement(Expedia_Search_PO.destination).sendKeys("New York");

        wait.until(ExpectedConditions.elementToBeClickable(Expedia_Search_PO.result_box));

        driver.findElement(Expedia_Search_PO.new_york).click();

        // fill in the  departure date
        WebElement dep_date = driver.findElement(Expedia_Search_PO.departing_date);
        dh.selectDate(driver, dep_date, dh.get_departing_date());

        // fill in the return date
        WebElement return_date = driver.findElement(Expedia_Search_PO.returning_date);
        dh.selectDate(driver, return_date,dh.get_returning_date());

        //fill in the traveller details
        driver.findElement(Expedia_Search_PO.travellers).click();
        driver.findElement(Expedia_Search_PO.adult_count_decrement).click();
        driver.findElement(Expedia_Search_PO.child_count_increment).click();
        driver.findElement(Expedia_Search_PO.child_age).click();
    }

    @Then("^the result page should contain travel option for the chosen destination$")
    public void the_result_page_should_contain_travel_option_for_the_chosen_destination() {

        WebDriverWait wait = new WebDriverWait(driver,30);

        // search for the flight + accommodation
        driver.findElement(Expedia_Search_PO.search).submit();

        wait.until(ExpectedConditions.elementToBeClickable(Expedia_Search_PO.search_result));

        // assertions for the text presence
        String bodyText = driver.findElement(Expedia_Search_PO.search_wizard).getText();
        Assert.assertTrue("Text not found!", bodyText.contains("Brussels"));
        Assert.assertTrue("Text not found!", bodyText.contains("New York"));
        Assert.assertTrue("Text not found!", bodyText.contains("1 adult, 1 child"));

    }
}
