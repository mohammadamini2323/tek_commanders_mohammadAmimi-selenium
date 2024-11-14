package week2.d1.d1.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class a2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.min-w-fit >button.ant-btn-default"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Don't have account yet, register here"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName"))).sendKeys("MOHAMMAD");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lastName"))).sendKeys("AMINI");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("mohammad10912@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("mykpakdjkf@!!@");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("confirmPassword"))).sendKeys("mykpakdjkf@!!@");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ant-btn-primary"))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("mohammad10912@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("mykpakdjkf@!!@");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.ant-flex >button.ant-btn-primary"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ant-btn-circle"))).click();
        String textOFaccountName =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.ant-dropdown-menu-title-content>div.ant-space-gap-col-small >div.ant-space-item"))).getText();
        System.out.println(textOFaccountName);
        System.out.println(textOFaccountName.equals("MOHAMMAD AMINI"));
        driver.quit();



    }
}
