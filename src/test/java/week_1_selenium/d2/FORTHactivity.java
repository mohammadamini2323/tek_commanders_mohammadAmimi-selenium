package week_1_selenium.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FORTHactivity { public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.bbc.com/");
    By linkB=new By.ByLinkText("Business");
    driver.findElement(linkB).click();
    By TITLECLASS=new By.ByClassName("sc-66cb3400-2 juQBdA");
   String TITLEtext =driver.findElement(TITLECLASS).getText();
    System.out.println(TITLEtext);
    driver.quit();


}
}
