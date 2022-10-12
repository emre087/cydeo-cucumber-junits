package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleGmailStepDefinitions {


    @When("user is in google page")
    public void user_is_in_google_page() {
        Driver.getDriver().get("https://www.google.com");
        BrowserUtils.sleep(2);
        // pop up için
    Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[1]")).click();
    }
    @When("user clicks the Gmail link")
    public void user_clicks_the_gmail_link() {
        BrowserUtils.sleep(3);
        WebElement gmailLink =Driver.getDriver().findElement(By.xpath("(//a[@class='gb_d'])[1]"));
        gmailLink.click();

    }
    @Then("user should be able to see the title as {string}")
    public void user_should_be_able_to_see_the_title_as(String string) {
        BrowserUtils.sleep(3);
      String actualTitle = Driver.getDriver().getTitle();
      String expectedTitle = "Gmail";
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        Driver.closeDriver();

    }




}
