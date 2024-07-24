package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/img")).click();
    }
}
