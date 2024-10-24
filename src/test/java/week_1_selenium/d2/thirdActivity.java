package week_1_selenium.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirdActivity {
    public static void main(String[] args) {

        ChromeDriver cdriver = new ChromeDriver();
        cdriver.get("https://retail.tekschool-students.com/");
        cdriver.manage().window().maximize();
        By classnamet=By.className("top-nav__logo active");
        WebElement TEXTELEMENT=  cdriver.findElement(classnamet);
        String TEXT =TEXTELEMENT.getText();
        System.out.println(TEXT);


        cdriver.quit();
    }
}
