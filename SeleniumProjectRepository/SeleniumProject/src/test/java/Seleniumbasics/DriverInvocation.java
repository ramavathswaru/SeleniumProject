package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class DriverInvocation {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        String title=driver.getTitle();
        System.out.println(title);
      driver.findElement(By.id("username")).sendKeys("swaru");
      driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("swaru123");
      driver.findElement(By.name("Login")).click();
       // driver.wait();


    }
}
