package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DatePickerPage;
import static org.testng.Assert.assertEquals;

public class DatePickerTest {
    private WebDriver driver;
    private DatePickerPage datePickerPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://anarabbas.com/labs/auto-lab.html");
        datePickerPage = new DatePickerPage(driver);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void verifyDateTimePicker() {
        datePickerPage.setDateTime("2026-08-24T19:00");

        String actualDateTime = datePickerPage.getSelectedDateTime();

        assertEquals(actualDateTime, "2026-08-24T19:00");
    }
}

