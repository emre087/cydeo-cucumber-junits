package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTables {


    public WebTables() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//a[@href='/create-order']")
    public WebElement orderButton;

    @FindBy (xpath = "//label[.='Product *']")
    public WebElement productButton;

    @FindBy (xpath = "//input[@name='quantity']")
    public WebElement Quantity;


    @FindBy (xpath = "//input[@name='name']")
    public WebElement Name;

    @FindBy (xpath = "//input[@name='street']")
    public WebElement Street;


    @FindBy (xpath = "//input[@name='city']")
    public WebElement City;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement Zip;


    @FindBy (xpath = "(//input[@name='card'])[1]")
    public WebElement Card;

    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement cardNo;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement exprireDate;


    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrder;




}
