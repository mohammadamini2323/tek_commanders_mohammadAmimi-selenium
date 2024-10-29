package week2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class d1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("TV");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div[1]/div[1]/img")).click();
        Thread.sleep(2000);
       String title= driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/h1")).getText();
        System.out.println(title);
        driver.quit();

    }
}
