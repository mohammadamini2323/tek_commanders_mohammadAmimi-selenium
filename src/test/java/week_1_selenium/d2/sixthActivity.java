package week_1_selenium.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sixthActivity {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.bbc.com/");
        By taglocator=By.tagName("a");
        List<WebElement> allH2tags= driver.findElements(taglocator);
        for (WebElement eachelement:allH2tags){
            String TEXT= eachelement.getText();
        System.out.println(TEXT);}
       // driver.quit();
    }
}
