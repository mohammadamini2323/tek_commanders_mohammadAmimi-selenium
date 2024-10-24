package week_1_selenium.d4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class first1activity {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("for chrome driver inter 1   and   for edge driver inter 2");
        int userInput =scanner.nextInt();
        if (userInput==1){
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://dev.retail.tekschool-students.com/");
        String Chrometitle= chromeDriver.getTitle();
        System.out.println(Chrometitle);
            System.out.println("it was chrome");

        chromeDriver.quit();} else if (userInput==2) {



        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://dev.retail.tekschool-students.com/");
        String egedrivertitle=edgeDriver.getTitle();
        System.out.println(egedrivertitle);
            System.out.println("it was edge");
        edgeDriver.quit();}else {
            System.out.println("wrong enteery");}

    }
}
