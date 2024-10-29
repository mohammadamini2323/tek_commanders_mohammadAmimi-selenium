package week2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("TV");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='search__btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://tek-retail-api.azurewebsites.net/images/products/6_1.jpg']")).click();
        Thread.sleep(2000);
        String title= driver.findElement(By.xpath("//h1[@class='product__name']")).getText();
        System.out.println(title);
        driver.quit();

    }
}
