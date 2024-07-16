package locators.Other.tek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activty12 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("TekSchool");
        driver.findElement(By.name("q")).submit();

        driver.findElement(By.partialLinkText("TekSchool")).click();
        driver.quit();
    }
}
