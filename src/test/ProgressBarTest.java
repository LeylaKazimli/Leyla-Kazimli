package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProgressBarPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ProgressBarTest {

    private WebDriver driver;
    private ProgressBarPage progressBarPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://anarabbas.com/labs/auto-lab.html");
        progressBarPage = new ProgressBarPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifyInitialProgress() {
        progressBarPage.openProgressBar();

        assertEquals(progressBarPage.getProgress(), 0);
    }

    @Test
    public void verifyProgressIncreases() {
        progressBarPage.openProgressBar();

        int initialProgress = progressBarPage.getProgress();

        progressBarPage.startProgress();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(driver ->
                progressBarPage.getProgress() > initialProgress
        );

        assertTrue(progressBarPage.getProgress() > initialProgress);
    }

    @Test
    public void verifyProgressStops() {
        progressBarPage.openProgressBar();

        int initialProgress = progressBarPage.getProgress();

        progressBarPage.startProgress();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(driver ->
                progressBarPage.getProgress() > initialProgress
        );

        progressBarPage.stopProgress();

        int stoppedProgress = progressBarPage.getProgress();

        long startTime = System.currentTimeMillis();

        wait.until(driver -> {
            int currentProgress = progressBarPage.getProgress();

            if (currentProgress != stoppedProgress) {
                return false;
            }

            return System.currentTimeMillis() - startTime >= 2000;
        });

        assertEquals(progressBarPage.getProgress(), stoppedProgress);
    }
    @Test
    public void verifyProgressReset() {

        progressBarPage.openProgressBar();

        int initialProgress = progressBarPage.getProgress();

        progressBarPage.startProgress();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(driver ->
                progressBarPage.getProgress() > initialProgress
        );

        progressBarPage.resetProgress();

        assertEquals(progressBarPage.getProgress(), 0);
    }
}