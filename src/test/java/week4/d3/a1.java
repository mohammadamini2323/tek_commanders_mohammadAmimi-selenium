package week4.d3;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class a1 {
    public static void main(String[] args) throws InterruptedException {
        //step1
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        Actions actions=new Actions(driver);

        //easy way
        driver.get("https://retail.tekschool-students.com/");
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink"))).click();
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/auth/login"));
        // difficult way
        WebElement createNewAccountBtn= driver.findElement(By.cssSelector("#newAccountBtn"));
        wait.until(ExpectedConditions.elementToBeClickable(createNewAccountBtn));
        actions.click(createNewAccountBtn).perform();
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/auth/sign-up"));
        WebElement nameInput=driver.findElement(By.id("nameInput"));
        WebElement emailInput=driver.findElement(By.id("emailInput"));
        WebElement passwordInput=driver.findElement(By.id("passwordInput"));
        WebElement confirmPasswordInput=driver.findElement(By.id("confirmPasswordInput"));
        WebElement signupBtn=driver.findElement(By.id("signupBtn"));
        wait.until(ExpectedConditions.elementToBeClickable(nameInput));
        actions.click(nameInput).perform();
        actions.sendKeys("mohammadAMIN").perform();
        wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        actions.click(emailInput).perform();
        actions.sendKeys("MAHAmmadkdf1254@gmail.com").perform();
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
        actions.click(passwordInput).perform();
        actions.sendKeys("myPasssWORD.COM2@").perform();
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordInput));
        actions.click(confirmPasswordInput).perform();
        actions.sendKeys("myPasssWORD.COM2@").perform();
        wait.until(ExpectedConditions.elementToBeClickable(signupBtn));
        actions.click(signupBtn).perform();
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/profile"));
        //NEVER MIND
        WebElement nameinput=driver.findElement(By.cssSelector("#nameInput"));
        wait.until(ExpectedConditions.elementToBeClickable(nameinput));
        actions.click(nameinput).perform();
        actions.click(nameinput).perform();
        actions.keyDown(Keys.BACK_SPACE).perform();
        actions.keyUp(Keys.BACK_SPACE).perform();
        WebElement monthDropDOWN=driver.findElement(By.id("expirationMonthInput"));
        Select select=new Select(monthDropDOWN);
        wait.until(ExpectedConditions.elementToBeClickable(monthDropDOWN)).click();
        select.selectByVisibleText("12");

        Thread.sleep(4000);
        driver.quit();


    }
}
