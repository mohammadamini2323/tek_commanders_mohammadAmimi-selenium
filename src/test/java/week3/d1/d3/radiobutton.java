package week3.d1.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class radiobutton {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/radio");
      WebElement htmlRadio= driver.findElement(By.id("html"));
      htmlRadio.click();
        System.out.println(htmlRadio.isEnabled());
        System.out.println(htmlRadio.isSelected());
        driver.quit();
    }
}
