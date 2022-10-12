package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }

    @When("user enters Student usenama")
    public void user_enters_student_usenama() {
        System.out.println("user enter student username");
    }
    @When("user enters Student password")
    public void user_enters_student_password() {
        System.out.println("user enter student pasword");
    }


    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enter admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enter admin password");
    }
}
