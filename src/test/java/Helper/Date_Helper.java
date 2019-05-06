package Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Helper {

    private LocalDateTime depart_date;

    public String get_departing_date() {

        LocalDateTime today = LocalDateTime.now();

        depart_date = today.plusMonths(3);

        return DateTimeFormatter.ofPattern("MM/dd/yyyy").format(depart_date);
    }

    public String get_returning_date() {

        LocalDateTime return_date = depart_date.plusWeeks(1);

        return DateTimeFormatter.ofPattern("MM/dd/yyyy").format(return_date);
    }

    public void selectDate(WebDriver driver, WebElement element, String dateVal){

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('value', '"+dateVal+"');", element);
    }
}
