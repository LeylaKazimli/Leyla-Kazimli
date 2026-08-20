package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class SlidersPage extends BasePage {

    private WebElement temperatureSlider;
    private WebElement temperatureLabel;

    private WebElement volumeSlider;
    private WebElement volumeLabel;

    public SlidersPage(WebDriver driver) {
        super(driver);

        temperatureSlider = driver.findElement(By.id("tempSlider"));
        temperatureLabel = driver.findElement(By.id("tempVal"));

        volumeSlider = driver.findElement(By.id("volSlider"));
        volumeLabel = driver.findElement(By.id("volVal"));
    }

    public String getTemperatureValue() {
        return temperatureLabel.getAttribute("textContent");

    }

    public String getVolumeValue() {
        return volumeLabel.getAttribute("textContent");
    }
    public void increaseTemperature() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[0].value + 1;" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles: true}));",
                temperatureSlider
        );
    }

    public void increaseVolume() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[0].value + 1;" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles: true}));",
                volumeSlider
        );
    }

    public void decreaseTemperature() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[0].value - 1;" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles: true}));",
                temperatureSlider
        );
    }

    public void decreaseVolume() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[0].value - 1;" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles: true}));",
                volumeSlider
        );
    }
}