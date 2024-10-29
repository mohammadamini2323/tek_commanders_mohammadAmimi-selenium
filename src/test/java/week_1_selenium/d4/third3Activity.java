package week_1_selenium.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class third3Activity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        Thread.sleep(2000);
        By signInLocator=By.linkText("Sign in");
        driver.findElement(signInLocator).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("myemail@email.com");
        driver.findElement(By.id("password")).sendKeys("THJDJJIJKE374O80E@2");
        driver.findElement(By.className("ant-btn-primary")).click();
        Thread.sleep(2000);
        String MESSAGEtext=driver.findElement(By.className("ant-alert-message")).getText();
        System.out.println(MESSAGEtext);
        driver.quit();

    }
}
