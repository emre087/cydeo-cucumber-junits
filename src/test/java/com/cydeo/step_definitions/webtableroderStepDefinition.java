package com.cydeo.step_definitions;

import com.cydeo.pages.WebTables;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class webtableroderStepDefinition {

    WebTables x = new WebTables(); // This is my POM file object

    @Given("user is already on web table orders page")
    public void user_is_already_on_web_table_orders_page() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/orders");
        BrowserUtils.sleep(2);
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Test");
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Tester");
        BrowserUtils.sleep(2);
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[.='Login']"));
        loginButton.click();
        x.orderButton.click();
        BrowserUtils.sleep(1);
    }

    @When("user enters appropriate product {string}")
    public void user_enters_appropriate_product(String product) {
        Select productDropdown = new Select(x.productButton);
        productDropdown.selectByVisibleText(product);
    }

    @When("user enters appropriate quantity {string}")
    public void user_enters_appropriate_quantity(String quantity) {
        BrowserUtils.sleep(2);
        x.Quantity.sendKeys(quantity);
    }


    @When("user enters appropriate customer name\"Marie Curie\"")
    public void user_enters_appropriate_customer_name_marie_curie(String name) {
        x.Name.sendKeys(name);
    }


    @When("user enters appropriate street\"Alfa\"")
    public void user_enters_appropriate_street_alfa(String street) {
        x.Street.sendKeys(street);
    }

    @When("user enters appropriate city {string}")
    public void user_enters_appropriate_city(String city) {
        x.City.sendKeys(city);
    }


    @When("user enters appropriate state {string}")
    public void user_enters_appropriate_state(String state) {
        x.state.sendKeys(state);
    }

    @When("user enters appropriate zip code\"{int}\"")
    public void user_enters_appropriate_zip_code(String zip) {
        x.Zip.sendKeys(zip);
    }

    @When("user enters appropriate card type {string}")
    public void user_enters_appropriate_card_type(String card) {
        x.Card.click();
    }


    @When("user enters appropriate card no\"{int}\"")
    public void user_enters_appropriate_card_no(String cardNo) {
        x.cardNo.sendKeys(cardNo);
    }

    @When("user enters appropriate expire date {string}")
    public void user_enters_appropriate_expire_date(String expireDate) {
        x.exprireDate.sendKeys(expireDate);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        x.processOrder.click();
    }



    @Then("user should see new order in the table on “View all orders” page")
    public void user_should_see_new_order_in_the_table_on_view_all_orders_page() {

    }

}
