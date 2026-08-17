import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IFrame {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://anarabbas.com/labs/auto-lab");

        WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(10)
        );

        // iFrame bölməsini aç
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[contains(text(),'iFrame')]")
                )
        ).click();

        // Xarici iframe-ə keç
        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        "demoFrame"
                )
        );

        // Frame daxilində input-a yaz
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("frameInput")
                )
        ).sendKeys("Leyla");

        // Frame daxilindəki düyməyə kliklə
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("frameBtn")
                )
        ).click();

        // Nested iframe-ə keç
        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        "innerFrame"
                )
        );

        // Nested frame daxilindəki düyməyə kliklə
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("innerFrameBtn")
                )
        ).click();

        // Birbaşa əsas səhifəyə qayıt
        driver.switchTo().defaultContent();

        // Əsas səhifədə elementin görünməsini gözlə
        String text = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("h3")
                )
        ).getText();

        System.out.println("Əsas səhifəyə qayıtdıq: " + text);

        driver.quit();
    }
}