package week2.d1.d1.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mohammad2536@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@123");
        driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
        Thread.sleep(2000);
        Boolean logeIn= driver.findElement(By.xpath("//BUTTON[@ID='logoutBtn']")).isDisplayed();
        Thread.sleep(1000);
        System.out.println(logeIn);
        if (logeIn){
            System.out.println("passed");

        }else System.out.println("fail");
        driver.findElement(By.id("searchInput")).sendKeys("keyboard");
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='products']/div[1]/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addToCartBtn")).click();
        Thread.sleep(1000);
        boolean added=driver.findElement(By.id("cartQuantity")).isDisplayed();
        if (added){
            System.out.println("added first item ");

        }else System.out.println("card is empty");
        driver.quit();



    }
}
