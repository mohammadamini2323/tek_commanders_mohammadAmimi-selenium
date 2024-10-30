package week2.d1.d1.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("a#signinLink")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input#email")).sendKeys("JSDHKJFHAJHDJ@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("sdifjj@##$kd2312");
        driver.findElement(By.cssSelector("button#loginBtn")).click();
        Thread.sleep(1500);
         String     messageText=driver.findElement(By.cssSelector("div.error")).getText();
        System.out.println(messageText);
        driver.quit();

    }
}
