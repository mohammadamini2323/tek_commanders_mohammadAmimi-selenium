package week3.d1.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class action_mous {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        WebElement dropdown =driver.findElement(By.xpath("//select[@id='programmingLanguageSelect']"));
        Actions actions=new Actions(driver);
        actions.contextClick(dropdown).perform();
        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }
}
