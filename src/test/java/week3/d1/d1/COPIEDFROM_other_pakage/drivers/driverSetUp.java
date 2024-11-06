package week3.d1.d1.COPIEDFROM_other_pakage.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetUp {
    public static WebDriver driver;
    public static void createChroomDriver(){
        driver=new ChromeDriver();
    }
}
