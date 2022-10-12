package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {

   GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types {string} in the search box and click the enter key")
    public void user_types_in_the_search_box_and_click_the_enter_key(String string) {
        string = "elma";
        googleSearchPage.googleSearchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("user should be able to see {string} in the title")
    public void userShouldBeAbleToSeeInTheTitle(String string) {
        String expectedTitle = string + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }









    @When("user is on google webpage")
    public void user_is_on_google_webpage() {

        Driver.getDriver().get("https://www.google.com");
        BrowserUtils.sleep(2);
        WebElement accept = Driver.getDriver().findElement(By.xpath("//div[.='Tümünü kabul et']"));
        accept.click();

    }


    @Then("user should see title as google")
    public void user_should_see_title_as_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Then("user should be able to see apple in the title")
    public void user_should_be_able_to_see_apple_in_the_title() {
        BrowserUtils.sleep(3);
        String expectedTitle ="apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
