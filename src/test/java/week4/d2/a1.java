package week4.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class a1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/radio");
        List<WebElement> tshirts=driver.findElements(By.xpath("//input[@name='tshirt']/following-sibling::label"));
        for (WebElement TSHIRT:tshirts){
            System.out.println(TSHIRT.getText());
        }
        driver.findElement(By.id("large")).click();
        Thread.sleep(4000);




        driver.close();
        driver.quit();

    }
}
