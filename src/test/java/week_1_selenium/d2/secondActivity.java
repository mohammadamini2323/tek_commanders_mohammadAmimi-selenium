package week_1_selenium.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondActivity {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        By EMAIL=By.id("email");
        driver.findElement(EMAIL).sendKeys("myemail@TRY");
        By PASSWORD=By.name("pass");
        driver.findElement(PASSWORD).sendKeys("mypass123");
        driver.quit();


    }
}
