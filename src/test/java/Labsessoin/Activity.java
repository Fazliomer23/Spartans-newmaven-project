package Labsessoin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Open the Retail app
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("copypast@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Afghan4321@");
        driver.findElement(By.id("loginBtn")).click();
        driver.findElement(By.id("accountLink")).click();
        driver.findElement(By.id("personalPhoneInput")).sendKeys("2038503826");
        driver.findElement(By.id("personalUpdateBtn")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popUpMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#vjq7dnc > div.Toastify__toast-body > div:nth-child(2)")));
        boolean popUpMessage = popUpMessageElement.isDisplayed();
        System.out.println("Pop-up Message Displayed: " + popUpMessage);
        driver.quit();
    }
}
