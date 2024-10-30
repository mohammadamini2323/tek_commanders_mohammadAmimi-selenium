package week2.d1.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(1000);
        WebElement loginButton =driver.findElement(By.xpath("//button[contains  (@class ,'  login__invalid' ) ]"));
        Thread.sleep(1000);
        boolean isEnableButton =loginButton.isEnabled();
        System.out.println(isEnableButton);
        driver.quit();

    }
}
