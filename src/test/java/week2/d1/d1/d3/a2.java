package week2.d1.d1.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class a2 {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a#signinLink"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("mohammad2536@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("Password@123");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("accountLink"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("personalPhoneInput"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("personalPhoneInput"))).sendKeys("1784567890");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("personalUpdateBtn"))).click();
       WebElement display= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.Toastify__toast")));
        System.out.println(display.isDisplayed());
        driver.quit();



    }
}
