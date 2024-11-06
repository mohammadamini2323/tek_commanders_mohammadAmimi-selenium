package week3.d1.d2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement simpleAlert=driver.findElement(By.xpath("//button[@id='alertBtn']"));
        simpleAlert.click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        String alertText=alert.getText();
        System.out.println(alertText);
        alert.accept();
        Thread.sleep(2000);
        driver.quit();


    }
}
