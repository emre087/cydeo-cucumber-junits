package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InternetHaberStepDefinition {

    @When("I am on internethaber web page")
    public void ı_am_on_internethaber_web_page() {
        Driver.getDriver().get("https://www.internethaber.com");
    }
    @Then("I should be able to see the title as {string}")
    public void ı_should_be_able_to_see_the_title_as(String string) {
        BrowserUtils.sleep(3);
       String actualTitle = Driver.getDriver().getTitle();
       String ecpectedTitle = "Haber, Haberler, Son Dakika Haberler";
        Assert.assertTrue(actualTitle.equals(ecpectedTitle));
    }

}
