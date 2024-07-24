package Mypractec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
public class Test101 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");
        String Title = webDriver.getTitle();
        System.out.println(Title);
        By SignIn = By.id("signinLink");
        WebElement Signin = webDriver.findElement(SignIn);
        Signin.click();
        Random random = new Random();
        int x = random.nextInt(100);
        String email="Omeralikhan123";
        String AutoEmail =email+x +"@gmai;.com";
        System.out.println(AutoEmail);
        By EnterEmail = By.id("email");
        WebElement enter = webDriver.findElement(EnterEmail);
        enter.sendKeys("lordaltaf@gmail.com");
        By Password = By.id("password");
        WebElement password = webDriver.findElement(Password);
        password.sendKeys("Kabul123@");
        By login = By.id("loginBtn");
        WebElement log = webDriver.findElement(login);
        log.click();
        WebElement driver;
        boolean isProfileImageDisplayed = webDriver.findElement(By.id("profileImage")).isDisplayed();
        if (isProfileImageDisplayed) {
            System.out.println("Test passed and account has been successfully created!");
        } else {
            System.out.println("Test failed and account has not been created successfully");
        }
    }
    }