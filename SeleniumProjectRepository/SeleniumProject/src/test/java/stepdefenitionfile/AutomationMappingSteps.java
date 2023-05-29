package stepdefenitionfile;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class AutomationMappingSteps {

    public static void main(String[] args) {

    }
    WebDriver driver=new EdgeDriver();
    WebElement  CurrencyElement;

    @Given("User Lunch the browser and navigate to the URL")
        public void lunchBrowser () {

        driver.get("https://book.spicejet.com/");

        driver.manage().window().maximize();
        }

    @Then("click the login button")
    public void clickTheLoginButton() {
        driver.findElement(By.name("Login")).click();
    }

    @And("validate the error message")
    public void validateTheErrorMessage() {
       String ErrorMessage= driver.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(ErrorMessage);
    }



    @And("Validate whether user able to login homepage")
    public void validateWhetherUserAbleToLoginHomepage() {
        System.out.println("user able to login homepage");

    }

    @When("enter the username {string} and password {string}")
    public void enterTheUsernameAndPassword(String username, String password) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }


    @When("User select specific drop down values")
    public void handleDropDown() {

      CurrencyElement = driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']"));

        Select CurrencyDropDown = new Select(CurrencyElement);
       // CurrencyDropDown.selectByIndex(3);
       // CurrencyDropDown.selectByVisibleText("EUR");
        CurrencyDropDown.selectByValue("AED");
        driver.findElement(By.id("divpaxinfo")).click();
        WebElement AdultElement= driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select AdultDropDown=new Select(AdultElement);
        AdultDropDown.selectByIndex(3);
    }


    @And("User iterate the multiple values")
    public void iterateDropDownValues() {
      int SizeofDropDown=  CurrencyElement.findElements(By.tagName("option")).size();
      for(int i=0;i<SizeofDropDown;i++) {
         String Value= CurrencyElement.findElements(By.tagName("option")).get(i).getText();
          System.out.println(Value);
      }

    }
}
