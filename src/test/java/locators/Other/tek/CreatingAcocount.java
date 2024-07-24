package locators.Other.tek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingAcocount {
    public static void main(String[] args) throws InterruptedException {
        //In Retail app go to create new account and create new account.
        //use name, id, linkText or anything that is available.
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By createNewAccount = By.id("newAccountBtn");
        WebElement createNewAccountElement = driver.findElement(createNewAccount);
        createNewAccountElement.click();

        By nameLocator = By.name("name");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("omer");

        By emailInputLocator = By.name("email");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("omerali@gmail.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("afghan3232!");

        By confirmPasswordLocator = By.name("confirmPassword");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("afghan3232!");

        By signUpLocator = By.className("signup__btn");
        WebElement signUpElement = driver.findElement(signUpLocator);
        signUpElement.click();

        Thread.sleep(4000);


        driver.quit();

    }
    }



