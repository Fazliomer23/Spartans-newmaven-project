package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableActivity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        driver.findElement(By.linkText("Plans")).click();
        List<WebElement> priceElements = driver.findElements(By.xpath("//table//td[contains(@class, 'price')]"));
        for (WebElement priceElement : priceElements) {
            String priceValue = priceElement.getText();
            System.out.println("Price Value: " + priceValue);
        }
        driver.quit();
    }
}
