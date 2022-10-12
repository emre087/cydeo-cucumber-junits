package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CydeoStepDefinition {

    @When("I go to the website of Cydeo")
    public void ı_go_to_the_website_of_cydeo() {
        Driver.getDriver().get("https://www.cydeo.com");
    }

    @Then("I should be able to see title in the web site as Cydeo")
    public void ı_should_be_able_to_see_title_in_the_web_site_as_cydeo() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle ="Cydeo";
        BrowserUtils.sleep(2);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }


    @Then("I should be able to see the title as Cydeo")
    public void ı_should_be_able_to_see_the_title_as_cydeo() {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle ="Cydeo";
        BrowserUtils.sleep(2);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }



}
