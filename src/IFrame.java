import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://anarabbas.com/labs/auto-lab");

        // iFrame bölməsini aç
        driver.findElement(By.xpath("//button[contains(text(),'iFrame')]")).click();

        // Xarici iframe-ə keç
        driver.switchTo().frame("demoFrame");

        // Frame daxilində input-a yaz
        driver.findElement(By.id("frameInput")).sendKeys("Leyla");

        // Frame daxilindəki düyməyə kliklə
        driver.findElement(By.id("frameBtn")).click();

        // Nested iframe-ə keç
        driver.switchTo().frame("innerFrame");

        // Nested frame daxilindəki düyməyə kliklə
        driver.findElement(By.id("innerFrameBtn")).click();

        // Birbaşa əsas səhifəyə qayıt
        driver.switchTo().defaultContent();

        // Əsas səhifədən element tap və mətnini çap et
        String text = driver.findElement(By.cssSelector("h3")).getText();

        System.out.println("Əsas səhifəyə qayıtdıq: " + text);

        driver.quit();
    }
}