import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GecikenElement {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://anarabbas.com/labs/auto-lab");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Dynamic Elements bölməsini aç
        WebElement dynamicElements = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[contains(text(),'Dynamic Elements')]")
                )
        );

        dynamicElements.click();

        // Gecikən elementi açan düyməyə klik
        WebElement gecikBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("delayBtn")
                )
        );

        gecikBtn.click();

        // Vaxtı ölçməyə başla
        long baslangic = System.currentTimeMillis();

        // 2 saniyə sonra gələn elementi gözlə
        WebElement gecikmis = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[data-testid='delayed']")
                )
        );

        // Keçən vaxtı hesabla
        long kecen = System.currentTimeMillis() - baslangic;

        System.out.println("Element " + kecen + " ms sonra gorundu");
        System.out.println("Metn: " + gecikmis.getText());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}