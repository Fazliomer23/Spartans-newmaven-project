package locators.Other.tek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglrSearch {
    public static void main(String[] args) throws InterruptedException {
        //In google.com search for TekSchool and Click on First Link that have TekSchool.
        //Hint. to click on first link you can use partialLinkText
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("tek school");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.partialLinkText("TEK SCHOOL")).click();
    }
}
