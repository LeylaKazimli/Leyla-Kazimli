package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SlidersPage;

public class SlidersTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://anarabbas.com/labs/auto-lab.html");
    }

    // Test 1 — Default Dəyərlər
    @Test
    public void testDefaultValues() {

        SlidersPage slidersPage = new SlidersPage(driver);

        Assert.assertEquals(slidersPage.getTemperatureValue(), "50°C");
        Assert.assertEquals(slidersPage.getVolumeValue(), "75%");
    }

    // Test 2 — Temperature Dəyişikliyi
    @Test
    public void testTemperatureChange() {

        SlidersPage slidersPage = new SlidersPage(driver);

        for (int i = 0; i < 25; i++) {
            slidersPage.decreaseTemperature();
        }

        Assert.assertEquals(slidersPage.getTemperatureValue(), "25°C");
    }

    // Test 3 — Volume Dəyişikliyi
    @Test
    public void testVolumeChange() {

        SlidersPage slidersPage = new SlidersPage(driver);

        for (int i = 0; i < 35; i++) {
            slidersPage.decreaseVolume();
        }

        Assert.assertEquals(slidersPage.getVolumeValue(), "40%");
    }
    // Test 4 — Temperature Sərhədləri
    @Test
    public void testTemperatureBoundaries() {

        SlidersPage slidersPage = new SlidersPage(driver);

        // 50°C-dən 0°C-yə
        for (int i = 0; i < 50; i++) {
            slidersPage.decreaseTemperature();
        }

        Assert.assertEquals(slidersPage.getTemperatureValue(), "0°C");

        // 0°C-dən 100°C-yə
        for (int i = 0; i < 100; i++) {
            slidersPage.increaseTemperature();
        }

        Assert.assertEquals(slidersPage.getTemperatureValue(), "100°C");
    }
    // Test 5 — Volume Sərhədləri
    @Test
    public void testVolumeBoundaries() {

        SlidersPage slidersPage = new SlidersPage(driver);

        // 75%-dən 0%-ə
        for (int i = 0; i < 75; i++) {
            slidersPage.decreaseVolume();
        }

        Assert.assertEquals(slidersPage.getVolumeValue(), "0%");

        // 0%-dən 100%-ə
        for (int i = 0; i < 100; i++) {
            slidersPage.increaseVolume();
        }

        Assert.assertEquals(slidersPage.getVolumeValue(), "100%");
    }
}