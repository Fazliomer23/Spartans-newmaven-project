package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookActivity {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser in maximized mode

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Navigate to Facebook
        driver.get("https://www.facebook.com");

        // Click on 'Create New Account'
        WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
        createAccountButton.click();

        // Fill in the form
        driver.findElement(By.name("firstname")).sendKeys("Omer");
        driver.findElement(By.name("lastname")).sendKeys("Ali");
        driver.findElement(By.name("reg_email__")).sendKeys("omralikhan@gmnail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("omerali32");

        // Select Date of Birth
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));

        day.sendKeys("2");
        month.sendKeys("Jan");
        year.sendKeys("2001");

        // Select Gender (assuming male gender)
        WebElement maleGender = driver.findElement(By.xpath("//input[@value='2']"));
        maleGender.click();

        // Do NOT click on Sign Up (as per instructions)

        // Close the browser
        driver.quit();

    }
    }

