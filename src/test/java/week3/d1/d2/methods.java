package week3.d1.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class methods {
       public final static WebDriver chromeDriver=new ChromeDriver();
      // public final static WebDriver edgeDriver=new EdgeDriver();
       public final static String oldRetailApp="https://retail.tekschool-students.com/";
       public final static String newRetailApp="https://dev.retail.tekschool-students.com/";
       public final static String alertPage="https://retail.tekschool-students.com/selenium/javascript-alerts";

    public static void wait(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }
    public static void navigateByChromeTo (String url){
        chromeDriver.get(url);
    }

   /* public static void navigateByEdgeTo(String url){
        edgeDriver.get(url);
    }*/
    public static void maximizeChromeWindow(){
        chromeDriver.manage().window().maximize();
    }
    public static WebElement findById(String id){
        return chromeDriver.findElement(By.id(id));
    }

}
