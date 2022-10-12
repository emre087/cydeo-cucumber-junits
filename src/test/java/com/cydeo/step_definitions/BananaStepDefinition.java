package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BananaStepDefinition {

    @Given("{string} is so much hungry")
    public void is_so_much_hungry(String name) {

        System.out.println(name + " is so much hungry");
    }
    @When("He eats some {string}")
    public void he_eats_some(String fruit) {
        System.out.println("He is eating some " + fruit);
    }
    @Then("He should be able to be full")
    public void he_should_be_able_to_be_full() {
        System.out.println("He is gonna be full");
    }

}
