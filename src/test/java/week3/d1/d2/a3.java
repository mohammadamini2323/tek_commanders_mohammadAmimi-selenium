package week3.d1.d2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class a3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.findElement(By.id("confirmBtn")).click();
        Alert confirmationAlert = driver.switchTo().alert();
        String CAT =confirmationAlert.getText();
        System.out.println(CAT);
        confirmationAlert.accept();

        System.out.println(driver.findElement(By.id("message")).getText());
        driver.findElement(By.id("confirmBtn")).click();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.dismiss();
        System.out.println(driver.findElement(By.id("message")).getText());
        driver.quit();





    }
}
