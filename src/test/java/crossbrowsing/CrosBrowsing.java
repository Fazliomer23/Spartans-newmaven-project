package crossbrowsing;

import org.openqa.selenium.edge.EdgeDriver;

public class CrosBrowsing {
    public static void main(String[] args) {
        //the first one is crome  browser 99% pepol using
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();



    }
}
