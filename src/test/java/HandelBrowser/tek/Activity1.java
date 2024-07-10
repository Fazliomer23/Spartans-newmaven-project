package HandelBrowser.tek;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://dev.insurance.tekschool-students.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}
