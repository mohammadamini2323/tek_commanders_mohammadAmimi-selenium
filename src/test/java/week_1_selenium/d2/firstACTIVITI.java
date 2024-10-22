package week_1_selenium.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstACTIVITI {
    public static void main(String[] args) {

        ChromeDriver cdriver = new ChromeDriver();
        cdriver.get("https://retail.tekschool-students.com/");can
        cdriver.manage().window().maximize();
        By signINid = By.id("signinLink");
        WebElement signInELEMENT = cdriver.findElement(signINid);
        signInELEMENT.click();
        By creatAcountId=By.id("newAccountBtn");
        WebElement creatAccount=cdriver.findElement(creatAcountId);
        creatAccount.click();
        // Thread.sleep(2000);
        cdriver.close();
        cdriver.quit();
    }

}
