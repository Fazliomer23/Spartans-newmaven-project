package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ativity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        WebElement languageDropdown = driver.findElement(By.id("language-dropdown-id"));
        Select select = new Select(languageDropdown);
        select.selectByIndex(select.getOptions().size() - 1);
        driver.quit();
    }
    }

