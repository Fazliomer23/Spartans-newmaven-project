package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Accessories']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Logitech MK270 Wireless Keyboard And Mouse Combo']"))).click();

        WebElement qtyInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-quantity")));
        qtyInput.clear();
        qtyInput.sendKeys("5");

        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-cart")));
        addToCartButton.click();

        driver.quit();
    }
    }

