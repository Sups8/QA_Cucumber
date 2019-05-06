package Page_Objects;

import org.openqa.selenium.By;

public class Expedia_Search_PO {

    public static By country_us = By.cssSelector("#global-sites-links > li:nth-child(40) > a");

    public static By result_box = By.xpath("//ul[@id=\"typeaheadDataPlain\"]//child::li");

    public static By origin = By.id("package-origin-hp-package");

    public static By brussels = By.id("aria-option-0");

    public static By new_york = By.id("aria-option-2");

    public static By destination = By.id("package-destination-hp-package");

    public static By departing_date = By.id("package-departing-hp-package");

    public static By returning_date = By.id("package-returning-hp-package");

    public static By travellers = By.cssSelector("#traveler-selector-hp-package > div > ul > li > button");

    public static By adult_count_decrement = By.xpath("/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[3]/form[1]/section[1]/div[4]/div[8]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]/*");

    public static By child_count_increment = By.xpath("/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[3]/form[1]/section[1]/div[4]/div[8]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/button[1]/span[1]");

    public static By child_age = By.xpath("/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[3]/form[1]/section[1]/div[4]/div[8]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[3]/div[2]/label[1]/select[1]/option[3]");

    public static By search = By.id("search-button-hp-package");

    public static By search_result = By.cssSelector("#sortContainer > div > div > div:nth-child(2) > div > fieldset > ul");

    public static By search_wizard = By.cssSelector("#searchWizard");
}
