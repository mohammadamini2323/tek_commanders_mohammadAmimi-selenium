package week3.d1.d2;

import org.openqa.selenium.Alert;

import static week3.d1.d2.methods.*;

public class a4 {
    public static void main(String[] args)throws InterruptedException {
      navigateByChromeTo(alertPage);
      maximizeChromeWindow();
      Thread.sleep(2000);
      findById("promptBtn").click();
        Thread.sleep(2000);
        Alert promptAlert=chromeDriver.switchTo().alert();
        promptAlert.sendKeys("my text");
        Thread.sleep(2000);
        promptAlert.accept();
        Thread.sleep(2000);
        String promptMessage=findById("message").getText();
        System.out.println(promptMessage);
       // methods.wait(3000);
        chromeDriver.quit();



    }
}
