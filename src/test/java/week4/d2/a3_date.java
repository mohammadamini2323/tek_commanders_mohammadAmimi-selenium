package week4.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class a3_date {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // driver.manage().window().maximize();
        LocalDate date=LocalDate.now();
        System.out.println(date);
        driver.get("https://retail.tekschool-students.com/selenium/inputs");
        WebElement DATE= driver.findElement(By.id("dateInput"));
        Actions actions=new Actions(driver);
        actions.sendKeys(DATE,"11/12/2024").perform();
        Thread.sleep(2000);
        WebElement rang = driver.findElement(By.id("rangeInput"));
//        actions.moveToElement(rang,1000,1000).perform();
//       Thread.sleep(4000);
       actions.dragAndDropBy(rang,-100,0).perform();
       DATE.clear();
       String correctFormat=date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(correctFormat);
       Thread.sleep(5000);
//        actions.dragAndDrop(rang,rang).perform();
//        actions.moveToElement(rang,0,10).perform();
//        Thread.sleep(4000);
//        actions.
//        Thread.sleep(4000);




        driver.close();
        driver.quit();
    }
}
