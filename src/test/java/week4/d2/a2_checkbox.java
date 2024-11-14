package week4.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class a2_checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://retail.tekschool-students.com/selenium/checkbox");
        List<WebElement> interests=new ArrayList<>(driver.findElements(By.xpath("//fieldset//input[@type='checkbox']")));
        List<WebElement> interestlabels=new ArrayList<>(driver.findElements(By.xpath("//fieldset//input[@type='checkbox']/following-sibling::label")));
        for (WebElement INTTREST:interests){
            INTTREST.click();
            Thread.sleep(2000);
        }
        for (WebElement label:interestlabels){
            System.out.println(label.getText());
            Thread.sleep(2000);
        }

        System.out.println("i have found "+interests.size()+" chekboxes");
        driver.quit();
    }
}
