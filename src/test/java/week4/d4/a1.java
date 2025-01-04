package week4.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class a1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions actions=new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/"));
        WebElement helloSinInBtn=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        actions.moveToElement(helloSinInBtn).perform();
        Thread.sleep(2000);
        WebElement sinbtn=driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
        wait.until(ExpectedConditions.elementToBeClickable(sinbtn));
        actions.click(sinbtn).perform();
        Thread.sleep(5000);
//        actions.moveToElement(helloSinInBtn,100,0);
//        Thread.sleep(5000);
        driver.close();
        driver.quit();




    }
}
