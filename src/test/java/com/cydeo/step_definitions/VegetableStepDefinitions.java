package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class VegetableStepDefinitions {

    @Then("I should be able to see the vegetables I like in a list")
    public void ı_should_be_able_to_see_the_vegetables_ı_like_in_a_list(List<String> vegetableList) {
        System.out.println(vegetableList);
    }

}
