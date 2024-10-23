package week_1_selenium.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstActivity {
    public static void main(String[] args)throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        By signInLocator=By.id("signinLink");
        driver.findElement(signInLocator).click();
        By emailBorderLocator=By.id("email");
        driver.findElement(emailBorderLocator).sendKeys("myemsislkdk@gmail.com");
        By passaBorderLocator=By.id("password");
        driver.findElement(passaBorderLocator).sendKeys("passkjfklkkgl;s");
        By logInLocatorBOTTON=By.id("loginBtn");
        driver.findElement(logInLocatorBOTTON).click();
        Thread.sleep(1000);
        By messageLocator=By.className("error");
        String messagTAEXT=driver.findElement(messageLocator).getText();
        System.out.println(messagTAEXT);
        driver.quit();


    }
}
