package Mypractec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practc102 {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

 WebDriver driver = new ChromeDriver();

driver.get("https://fireflyworlds.com/games/stronghold/");



WebElement username = driver.findElement(By.id("username"));

WebElement password = driver.findElement(By.id("password"));

WebElement loginButton = driver.findElement(By.id("loginButton"));



username.sendKeys("testuser");

password.sendKeys("password");

loginButton.click();



// Assert login success

WebElement profile = driver.findElement(By.id("profile"));

 assert(profile.isDisplayed());



driver.quit();

}
}

