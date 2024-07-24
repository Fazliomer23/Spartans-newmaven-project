package locators.Other.tek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocaters {
    public static void main(String[] args) {
        // to find how many link in bbc websit
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        By anchorsTagLocator = By.tagName("a");
        List<WebElement> anchorElements = driver.findElements(anchorsTagLocator);
        System.out.println(anchorElements.size());
        for (WebElement element : anchorElements) {
            System.out.println(element.getText());
        }
        //To find how many images in bbc website


        By imagesLocator = By.tagName("img");
        List<WebElement> imageElements = driver.findElements(imagesLocator);

        int numberOfImages = imageElements.size();
        System.out.println("Number of images: " + numberOfImages);
        //to find how many buttons in bbc website

        By buttonsLocator = By.tagName("button");
        List<WebElement> buttonElements = driver.findElements(buttonsLocator);

        System.out.println("Number of buttons: " + buttonElements.size());

        for (WebElement button : buttonElements) {
            System.out.println("Button text: " + button.getText());
        }
    }
}
