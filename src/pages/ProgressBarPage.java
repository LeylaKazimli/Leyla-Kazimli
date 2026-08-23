package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressBarPage extends BasePage {

    private By progressBar = By.id("pgBar");
    private By startButton = By.id("pgStart");
    private By stopButton = By.id("pgStop");
    private By resetButton = By.id("pgReset");
    private By progressSection = By.cssSelector("button[data-p='progress']");

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }
    public int getProgress() {
        return Integer.parseInt(
                driver.findElement(progressBar).getAttribute("aria-valuenow")
        );
    }
    public void openProgressBar() {
        driver.findElement(progressSection).click();
    }
    public void startProgress() {
        driver.findElement(startButton).click();
    }
    public void stopProgress() {
        driver.findElement(stopButton).click();
    }
    public void resetProgress() {
        driver.findElement(resetButton).click();
    }
}