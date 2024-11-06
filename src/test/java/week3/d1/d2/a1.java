package week3.d1.d2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.findElement(By.id("alertBtn")).click();
        Alert simpleAlert=driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        driver.quit();

    }
}
