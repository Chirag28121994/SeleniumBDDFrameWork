package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import pages.GooglePage;
import utils.PropertiesReader;

import static hooks.CucumberHooks.driver;
import static hooks.CucumberHooks.logger;

public class LoginPageStepDefinitions {
    GooglePage googlePage = new GooglePage(driver);

    @Given("user navigate to google")
    public void user_navigate_to_google() {
        driver.get(PropertiesReader.getURl());
    }

    @When("user is able to see google header")
    public void user_is_able_to_see_google_header() {
        logger.entering(LoginPageStepDefinitions.class.getName(), "user_is_able_to_see_google_header ()");
        googlePage.verifyVisibilityOfGoogleHeader();
    }

    @Then("user is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
        logger.entering(LoginPageStepDefinitions.class.getName(), "user_is_able_to_see_the_search_box ()");
        googlePage.verifyVisibilityOfSearchBox();
    }

    @And("user search something invalid")
    public void userSearchSomethingInvalid() {

    }
}
