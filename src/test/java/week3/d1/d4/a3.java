package week3.d1.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class a3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/"));
        Actions actions=new Actions(driver);
        WebElement prime=driver.findElement(By.id("nav-link-amazonprime"));
        actions.moveToElement(prime).contextClick();
    }
}
