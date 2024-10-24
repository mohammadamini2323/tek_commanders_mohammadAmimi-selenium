package week_1_selenium.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fiftActivity {
    public static void main(String[] args)throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        By searchLocatorArea=By.name("q");
        driver.findElement(searchLocatorArea).sendKeys("tekschool");
        By searchBotLocator=By.name("btnK");
        driver.findElement(searchBotLocator).click();
        By firstLinkLOCATOR=By.partialLinkText("TEK SCHOOL Modern");
        driver.findElement(firstLinkLOCATOR).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
