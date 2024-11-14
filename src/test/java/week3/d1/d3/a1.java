package week3.d1.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class a1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Actions action=new Actions(driver);
        WebElement userNameField=driver.findElement(By.id("email"));
        WebElement passwordField=driver.findElement(By.id("pass"));
        action.click(userNameField).perform();



        }
    }
