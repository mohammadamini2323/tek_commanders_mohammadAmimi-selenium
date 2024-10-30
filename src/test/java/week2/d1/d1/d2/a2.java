package week2.d1.d1.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.cssSelector("https://retail.tekschool-students.com/")).sendKeys("keyboard");
        driver.findElement(By.cssSelector("button.search__btn")).click();

    }
}
