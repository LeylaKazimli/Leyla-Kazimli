import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class textBox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://anarabbas.com/labs/auto-lab");
        driver.findElement(By.id("fullName")).sendKeys("Leyla");
        driver.findElement(By.id("userEmail")).sendKeys("leyla@test.com");
        driver.findElement(By.id("passField")).sendKeys("123456");
    }
}