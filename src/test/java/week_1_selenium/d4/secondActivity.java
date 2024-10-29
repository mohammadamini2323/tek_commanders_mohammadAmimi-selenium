package week_1_selenium.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class secondActivity {
    public static void main(String[] args)throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();
        By searchLocator=By.id("searchInput");
        driver.findElement(searchLocator).sendKeys("apple");
        By searchbtnLOCATOR=By.className("ant-btn-icon-only");
        driver.findElement(searchbtnLOCATOR).click();
        Thread.sleep(1000);
        By APPLEtextlocator=By.xpath("/html/body/main/div/div[2]/div");
        List<WebElement> threeELEMENTS=driver.findElements(APPLEtextlocator);
        //System.out.println(threeELEMENTS.toString());
        System.out.println(threeELEMENTS.size());
        driver.quit();


    }
}
