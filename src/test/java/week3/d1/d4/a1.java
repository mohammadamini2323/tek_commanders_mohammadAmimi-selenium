package week3.d1.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class a1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement languageSelect=driver.findElement(By.id("programmingLanguageSelect"));
        languageSelect.click();
        Select pl=new Select(languageSelect);
        pl.selectByVisibleText("Java");
        System.out.println(pl.getAllSelectedOptions().toString());

    }
}
