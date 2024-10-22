package week_1_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class openBrowser {
    public static void main(String[] args) {
       // ChromeDriver obj= new ChromeDriver();
       // obj.get("https://www.facebook.com/");
        EdgeDriver driver =new EdgeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();
        String pagetitle=driver.getTitle();
        System.out.println(pagetitle);
        driver.quit();

    }
}
