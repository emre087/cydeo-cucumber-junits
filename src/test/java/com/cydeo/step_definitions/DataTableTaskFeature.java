package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataTableTaskFeature {
    @Given("user in on the dropdown page")
    public void user_in_on_the_dropdown_page() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("user should see below info in the dropdown")
    public void user_should_see_below_info_in_the_dropdown(List<String> list) {



        List<String> list2 = new LinkedList<>();


        Select monthDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='month']")));
        for (WebElement each : monthDropDown.getOptions()) {
            list2.add(each.getText());
        }


        BrowserUtils.sleep(3);

        Assert.assertTrue(list.equals(list2));

    }
}
