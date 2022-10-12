package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepdefinition {

    int actualResult;

    @Given("calculator is open")
    public void calculator_is_open() {
        System.out.println("This is from Given");
    }
    @When("I add {int} with {int}")
    public void ı_add_with(int num1, int  num2) {
        System.out.println("When I add " + num1 + "with " + num2);
        actualResult = num1 + num2;
    }
    @Then("I should get {int}")
    public void ı_should_get(int ecpectedResult) {
        System.out.println("Then I should get " + ecpectedResult);
        Assert.assertEquals(actualResult,ecpectedResult);
    }



}
