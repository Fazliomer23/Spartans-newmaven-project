package HandelBrowser.tek;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.getTitle();
        driver.get("https://facebook.com");
        String title =driver.getTitle();
        System.out.println(title);



    }
}
