package stepDefinitions;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.PropertiesReader;

import java.util.List;

import static hooks.CucumberHooks.driver;

public class LoginPageStepDefinitions {
    @Given("user navigate to google")
    public void user_navigate_to_google() {
        driver.get(PropertiesReader.getURl());
    }
    @When("user is able to see google header")
    public void user_is_able_to_see_google_header() {
        List<WebElement> elements = driver.findElements(By.xpath("//input[@name='btnK'][1]"));
        Assert.assertTrue(elements.get(0).isEnabled());
    }
    @Then("user is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
     List< WebElement> elements = driver.findElements(By.xpath("//input[@name='q']"));
      Assert.assertTrue(elements.get(0).isEnabled());
    }
}
