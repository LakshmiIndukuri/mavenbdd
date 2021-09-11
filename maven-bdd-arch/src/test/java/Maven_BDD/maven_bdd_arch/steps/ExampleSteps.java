package Maven_BDD.maven_bdd_arch.steps;

import javax.inject.Inject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;

public class ExampleSteps {
	 @Inject
    private WebDriver webDriver;
   
    @Given("^I search for \"(.*)\" and \"(.*)\"$")
    public void i_search_for(String arg1, String s2) {
    	webDriver.get("https://www.google.com/");
    	webDriver.findElement(By.xpath("//input[@title='Search']")).sendKeys(arg1);
    	webDriver.findElement(By.xpath("//input[@title='Search']")).sendKeys(s2);
    	//webDriver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
    }

    @Then("^I google should show me results!$")
    public void i_google_should_show_me_results() {
    	//webDriver.findElement(By.xpath("//*[text()='All']")).isDisplayed();
    	//webDriver.close();
    	
    }
}