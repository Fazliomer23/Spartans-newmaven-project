package week1Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class ac1copy2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By createNewAccountLocator = By.linkText("Create New Account");
        WebElement createNewAccountElement = driver.findElement(createNewAccountLocator);
        createNewAccountElement.click();

        By inputNameLocator = By.id("nameInput");
        WebElement inputNameElement = driver.findElement(inputNameLocator);
        inputNameElement.sendKeys("omer");

        By inputEmailLocator = By.id("emailInput");
        WebElement inputEmailElement = driver.findElement(inputEmailLocator);
        inputEmailElement.sendKeys("omerali@gmail.com");

        By inputPasswordLocator = By.id("passwordInput");
        WebElement inputPasswordElement = driver.findElement(inputPasswordLocator);
        inputPasswordElement.sendKeys("Afghanali32@!");

        By confirmPasswordInputLocator = By.id("confirmPasswordInput");
        WebElement confirmPasswordInputElement = driver.findElement(confirmPasswordInputLocator);
        confirmPasswordInputElement.sendKeys("Afghanali32@!");

        By signupBtnLocator = By.id("signupBtn");
        WebElement signupBtnElement = driver.findElement(signupBtnLocator);
        signupBtnElement.click();

        Thread.sleep(3000);
        By profileImageLocator = By.id("profileImage");

        WebElement profileImageElement = driver.findElement(profileImageLocator);
        profileImageElement.isDisplayed();

        driver.quit();




    }

    }
