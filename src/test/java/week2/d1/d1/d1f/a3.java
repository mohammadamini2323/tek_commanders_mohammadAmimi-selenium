package week2.d1.d1.d1f;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class a3 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='newAccountBtn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='signupBtn']")).click();
        Thread.sleep(1000);
        List<WebElement> MESSAGES= driver.findElements(By.className("error"));
        for (WebElement message:MESSAGES){

            System.out.println(message.getText());
        }
        driver.quit();



    }
}
