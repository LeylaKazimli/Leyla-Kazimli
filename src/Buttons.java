import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://anarabbas.com/labs/auto-lab");

        driver.findElement(By.cssSelector("button[data-p='btn']")).click();

        driver.findElement(By.id("clickBtn")).click();

        var el = driver.findElement(By.id("dblBtn"));
        new Actions(driver).doubleClick(el).perform();
        var rightClick = driver.findElement(By.id("rcBtn"));
        new Actions(driver).contextClick(rightClick).perform();
        driver.findElement(By.xpath("//button[@class='pg-btn' and @disabled and text()='Disabled']"));
    }
}