package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Data2 {

    @When("user is on the month dropdown page")
    public void user_is_on_the_month_dropdown_page() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> map) {
        

    }
    @Then("user should be able to see that url contains the order")
    public void user_should_be_able_to_see_that_url_contains_the_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
