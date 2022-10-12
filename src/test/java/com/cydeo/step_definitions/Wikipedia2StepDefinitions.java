package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Wikipedia2StepDefinitions {

    @Given("user is on the wikipedia homepage")
    public void user_is_on_the_wikipedia_homepage() {
        Driver.getDriver().get("https://www.wikipedia.org");
        BrowserUtils.sleep(2);
    }
    @When("user typess {string} in the wiki searck box")
    public void user_typess_in_the_wiki_searck_box(String string) {
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys(string);
        BrowserUtils.sleep(2);
    }
    @When("user clicks the click box")
    public void user_clicks_the_click_box() {
        WebElement click = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        click.click();
        BrowserUtils.sleep(2);
    }
    @Then("user should be able to see the {string} in the title")
    public void user_should_be_able_to_see_the_in_the_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string + "  - Vikipedi";
    }
    @Then("user should be able to see the {string} in the main header")
    public void user_should_be_able_to_see_the_in_the_main_header(String string) {
        WebElement mainHeader = Driver.getDriver().findElement(By.xpath("//span[@class='mw-page-title-main']"));
        Assert.assertTrue(mainHeader.getText().equals(string));
    }


}
