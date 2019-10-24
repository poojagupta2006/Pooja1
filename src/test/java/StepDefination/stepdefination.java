package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefination {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        throw new PendingException();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^Verify that user is succesfully logged in$")
    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
        throw new PendingException();
    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Click on Login link in home page to land on Secure sign in page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
        throw new PendingException();
    }

}