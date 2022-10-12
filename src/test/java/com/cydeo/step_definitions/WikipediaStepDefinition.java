package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WikipediaStepDefinition {

    @Given("user is on the wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
        BrowserUtils.sleep(2);
    }
    @When("user types {string} in the wiki searck box")
    public void user_types_in_the_wiki_searck_box(String string) {
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys(string);
        BrowserUtils.sleep(2);

    }
    @When("user clikcs the wiki button")
    public void user_clikcs_the_wiki_button() {
       WebElement click = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
       click.click();
       BrowserUtils.sleep(2);
    }
    @Then("then user should be able to see {string} in the title")
    public void then_user_should_be_able_to_see_in_the_title(String string) {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle = string + "  - Vikipedi";
    }


    @Then("user should be able to see {string} in the main header")
    public void user_should_be_able_to_see_in_the_main_header(String string) {
        WebElement mainHeader = Driver.getDriver().findElement(By.xpath("//span[.='Steve Jobs']"));
       Assert.assertTrue(mainHeader.getText().equals(string));

    }

    @Then("User sees {string} in the image header")
    public void user_sees_in_the_image_header(String string) {
        WebElement imageHeader = Driver.getDriver().findElement(By.xpath("//div[.='Steven Paul Jobs']"));
        Assert.assertTrue(imageHeader.getText().equals(string));
    }


    @Then("user should be able to see {string}in the title")
    public void userShouldBeAbleToSeeInTheTitle(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string + "  - Vikipedi";
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }
}
