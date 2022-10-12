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

public class Google2 {

    GoogleSearchPage x = new GoogleSearchPage();

    @When("user types a {string} in the google search box")
    public void user_types_a_in_the_google_search_box(String string) {
        Driver.getDriver().get("https://www.google.com");
        BrowserUtils.sleep(2);
        WebElement accept = Driver.getDriver().findElement(By.xpath("//div[.='Tümünü kabul et']"));
        accept.click();
        BrowserUtils.sleep(2);
        string = "elma";
        x.googleSearchBox.sendKeys(string + Keys.ENTER);
    }
    @Then("user should be ablo to see that {string} in the title")
    public void user_should_be_ablo_to_see_that_in_the_title(String string) {
        string = "elma";
      BrowserUtils.sleep(2);
        String expectedTitle = string + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
