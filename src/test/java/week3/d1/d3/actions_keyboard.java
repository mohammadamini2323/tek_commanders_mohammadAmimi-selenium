package week3.d1.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class actions_keyboard {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions action=new Actions(driver);
        driver.manage().window().maximize();
        WebElement userName= driver.findElement(By.id("email"));
        WebElement pas= driver.findElement(By.id("pass"));
        action.click(userName).perform();
        action.keyDown(Keys.SHIFT).perform();
        for (char charecters:"hello humans".toCharArray()){
            action.sendKeys(String.valueOf(charecters)).perform();
            Thread.sleep(200);

        }
        action.keyUp(Keys.SHIFT).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyUp(Keys.TAB).perform();
        for (char charecters:"hello humans".toCharArray()){
            action.sendKeys(String.valueOf(charecters)).perform();
            Thread.sleep(200);}
        action.keyDown(Keys.TAB).perform();
        action.keyUp(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyUp(Keys.TAB).perform();
        Thread.sleep(5000);
////        WebElement logINbutton=driver.findElement(By.xpath("//button[@name='login' ]"));
////        action.moveToElement(logINbutton).perform();
//        Thread.sleep(5000);
//        action.click(logINbutton).perform();
        action.keyDown(Keys.ENTER).perform();
        action.keyUp(Keys.ENTER).perform();
        Thread.sleep(5000);


        driver.quit();


    }
}
