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

public class SearchGoogleStepDefinition {

    GoogleSearchPage x = new GoogleSearchPage();

    @When("I write {string} in the google search box and clicks the enter key")
    public void ı_write_in_the_google_search_box_and_clicks_the_enter_key(String string) {
        Driver.getDriver().get("https://www.google.com");
        BrowserUtils.sleep(2);
        WebElement accept = Driver.getDriver().findElement(By.xpath("//div[.='Tümünü kabul et']"));
        accept.click();
        BrowserUtils.sleep(2);
        x.googleSearchBox.sendKeys(string + Keys.ENTER);


    }
    @Then("I should be able to see {string} in the title.")
    public void ı_should_be_able_to_see_in_the_title(String string) {
        String expectedTitle = string + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


    }


}
