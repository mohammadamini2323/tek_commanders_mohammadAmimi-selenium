package week_1_selenium.d4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first1activity {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://dev.retail.tekschool-students.com/");
        chromeDriver.quit();
        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://dev.retail.tekschool-students.com/");
        edgeDriver.quit();

    }
}
