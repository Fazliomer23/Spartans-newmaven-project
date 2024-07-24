package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity {
    public static void main(String[] args) {
        //From the page https://retail.tekschool-students.com/selenium/dropdown
        //Select website's language drop down select last option
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        WebElement languageDropdown = driver.findElement(By.id("language-dropdown-id"));
        Select select = new Select(languageDropdown);
        select.selectByIndex(select.getOptions().size() - 1);
        driver.quit();
    }
}
