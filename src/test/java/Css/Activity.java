package Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) throws InterruptedException {
        //n  Retail app navigate
        // to Sign in and login with valid credentials and after sign in go to account page
        // and print profile email.
        //only use CSS Selector.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.cssSelector("a#signinLink")).click();

        driver.findElement(By.cssSelector("input.login__input")).sendKeys("copypast@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Afghan4321@");
        driver.findElement(By.cssSelector("button.w-full")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a#accountLink")).click();
        String email = driver.findElement(By.cssSelector("div.account__information-detail>h1:nth-child(3)")).getText();
        System.out.println("Email: " + email);
        driver.quit();
    }
}
