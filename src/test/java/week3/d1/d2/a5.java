package week3.d1.d2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class a5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get(methods.oldRetailApp);
        driver.manage().window().maximize();
        Thread.sleep(3000);
       ((JavascriptExecutor) driver).executeScript("window.open('"+methods.newRetailApp+"','_blank')");
       Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("window.open('https://retail.tekschool-students.com/selenium/javascript-alerts','_blank')");
        Thread.sleep(3000);
        List<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        //System.out.println(tabs.get(1));

        driver.quit();
    }
}
