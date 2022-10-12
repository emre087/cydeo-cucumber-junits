package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class wiki3StepDefinitions {

    @Given("I ama in the wikipedia home page")
    public void ı_ama_in_the_wikipedia_home_page() {
       Driver.getDriver().get("https://www.wikipedia.org");
       BrowserUtils.sleep(2);
    }

    @When("I type {string} in the wiki search box")
    public void ı_type_in_the_wiki_search_box(String name) {
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys(name);
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();


    }

    @Then("I should be able to see {string} in the main header")
    public void ı_should_be_able_to_see_in_the_main_header(String string) {
        WebElement firstHeading= Driver.getDriver().findElement(By.xpath("//h1[@id='firstHeading']"));
        Assert.assertTrue(firstHeading.getText().equals(string));

    }

}