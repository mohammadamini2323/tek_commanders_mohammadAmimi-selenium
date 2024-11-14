package week3.d1.d3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class reviewEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        ((JavascriptExecutor)driver).executeScript("window.open('https://www.facebook.com/','_blank')");
        ((JavascriptExecutor)driver).executeScript("window.open('https://retail.tekschool-students.com/selenium/javascript-alerts','_blank')");
        List<String> tabs =new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(3000);
        driver.quit();






    }
}
