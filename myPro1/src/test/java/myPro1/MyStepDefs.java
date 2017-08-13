package myPro1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



/**
 * Created by user-pc on 12/08/2017.
 */
public class MyStepDefs {

    @Given("^user in homepage$")
    public void user_in_homepage() throws Throwable {
       // driver.get("http://demo.nopcommerce.com/");
    }

    @When("^user enter valid <username> as \"([^\"]*)\" and <password> \"([^\"]*)\"$")
    public void user_enter_valid_username_as_and_password(String arg1, String arg2) throws Throwable {

    }

    @Then("^user should login successfully$")
    public void user_should_login_successfully() throws Throwable {

    }




}
