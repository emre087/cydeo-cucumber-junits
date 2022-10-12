package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingStepDefinition {
    @Given("{string} is hungry")
    public void is_hungry(String name) {
        System.out.println(name + " is hungry");
    }
    @When("He eats {string}")
    public void he_eats(String food) {
        System.out.println(food + " is eaten");
    }
    @Then("He will be full")
    public void he_will_be_full() {
        System.out.println("then he will be full");
    }

}
