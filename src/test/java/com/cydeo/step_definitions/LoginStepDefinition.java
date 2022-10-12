package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class LoginStepDefinition {

    @Given("I am on chrome browser")
    public void ı_am_on_chrome_browser() {
        Driver.getDriver();

    }
    @When("I go to log in page")
    public void ı_go_to_log_in_page() {
       Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("enter username as {string}")
    public void enter_username_as(String username) {
        WebElement usernameInput = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        usernameInput.sendKeys(username);
        BrowserUtils.sleep(3);
    }
    @When("enter password as {string}")
    public void enter_password_as(String password) {
       WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
       passwordInput.sendKeys(password);
        BrowserUtils.sleep(2);
    }
    @Then("I should be able to have a url that ends with {string}")
    public void ı_should_be_able_to_have_a_url_that_ends_with(String string) {


    }

}
