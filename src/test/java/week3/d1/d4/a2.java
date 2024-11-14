package week3.d1.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class a2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/selenium/links");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("same tab"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(" new tab with html"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("new window with js"))).click();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for (WebElement link : links){
            System.out.println(link.getText());
        }
        driver.close();
        driver.quit();
    }
}
