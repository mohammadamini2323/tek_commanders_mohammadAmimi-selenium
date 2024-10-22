package week_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class openBrowser {
    public static void main(String[] args) {
        ChromeDriver cdriver= new ChromeDriver();
        cdriver.get("https://retail.tekschool-students.com/");
        cdriver.manage().window().maximize();
        By signINid= By.id("signinLink");
        WebElement signInELEMENT= cdriver.findElement(signINid);
        signInELEMENT.click();
       // Thread.sleep(2000);
        cdriver.close();

/*EdgeDriver driver =new EdgeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();
        String pagetitle=driver.getTitle();
        System.out.println(pagetitle);
        driver.quit();*/


    }
}
