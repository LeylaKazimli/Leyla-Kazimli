import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsModal {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://anarabbas.com/labs/auto-lab");

        WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(10)
        );

        // Alerts & Modal bölməsini aç
        WebElement alertsModal = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[contains(text(),'Alerts & Modal')]")
                )
        );

        alertsModal.click();


        // 1. Simple Alert
        driver.findElement(By.id("alertBtn")).click();

        Alert alert = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Simple Alert: " + alert.getText());

        alert.accept();


        // 2. Confirm Alert
        driver.findElement(By.id("confirmBtn")).click();

        alert = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Confirm Alert: " + alert.getText());

        alert.dismiss();


        // 3. Prompt Alert
        driver.findElement(By.id("promptBtn")).click();

        alert = wait.until(
                ExpectedConditions.alertIsPresent()
        );

        System.out.println("Prompt Alert: " + alert.getText());

        alert.sendKeys("Leyla");

        alert.accept();


        // 4. Saxta Modal
        // switchTo().alert() istifadə etmirik
        driver.findElement(By.id("openModal")).click();

        // Modalın içindəki mətn sahəsinə yaz
        driver.findElement(By.id("modalInput"))
                .sendKeys("Leyla");

        // Təsdiq düyməsinə kliklə
        driver.findElement(By.id("modalSubmit")).click();

        driver.quit();
    }
}
