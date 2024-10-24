package week_1_selenium.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondActivity {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        By videoGameLocator=By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div/div[2]/p");
        driver.findElement(videoGameLocator).click();
        By PS5locator=By.xpath("/html/body/div/div/div/div[3]/div/div/img");
        driver.findElement(PS5locator).click();
        By TITILELEMENT=By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/h1");
        String TITLEtext=driver.findElement(TITILELEMENT).getText();
        System.out.println(TITLEtext);

        driver.close();

    }
}
