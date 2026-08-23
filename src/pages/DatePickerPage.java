package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DatePickerPage extends BasePage {

    private By datePicker = By.id("datePicker");
    private By dateNote = By.id("dateNote");
    private By dateTimePicker = By.id("dateTimePicker");
    private By dateTimeValue = By.id("dateTimeValue");

    public DatePickerPage(WebDriver driver) {
        super(driver);
    }
    public void setDate(String date) {
        driver.findElement(datePicker).sendKeys(date);
    }
    public void setDateTime(String dateTime) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('change', {bubbles: true}));",
                driver.findElement(dateTimePicker),
                dateTime
        );
    }
    public String getSelectedDateTime() {
        return driver.findElement(dateTimeValue).getAttribute("textContent");
    }
    public String getSelectedDate() {
        return driver.findElement(dateNote).getText();
    }
}