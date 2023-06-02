package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumPgm {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        driver.findElement(By.name("username")).sendKeys("swaru");
        driver.findElement(By.name("password")).sendKeys("123");


    }
}
