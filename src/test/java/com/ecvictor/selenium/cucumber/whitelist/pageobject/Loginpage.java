package com.ecvictor.selenium.cucumber.whitelist.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage extends BaseClass {

    public Loginpage(WebDriver driver){
        super(driver);
    }


    @FindBy(how= How.XPATH, using="//*[@id=\"crowdsale\"]")
    public static WebElement Homepage;

    @FindBy(how= How.XPATH, using="//*[@id=\"name\"]")
    public static WebElement Name;

    @FindBy(how= How.XPATH, using="//*[@id=\"email\"]")
    public static WebElement Email;

    @FindBy(how= How.XPATH, using="//*[@id=\"emailMsg\"]")
    public static WebElement EmailMsg;


    @FindBy(how= How.XPATH, using="//*[@id=\"confirmEmail\"]")
    public static WebElement ConfirmEmail;

    @FindBy(how= How.XPATH, using="//*[@id=\"confirmEmailMsg\"]")
    public static WebElement ConfirmEmailMsg;


    @FindBy(how= How.XPATH, using="//*[@id=\"ethAmount\"]")
    public static WebElement EthAmount;


    @FindBy(how= How.XPATH, using="//*[@id=\"ethAmountMsg\"]")
    public static WebElement EthAmountMsg;

    @FindBy(how= How.XPATH, using="//*[@id=\"ethereumAddress\"]")
    public static WebElement EthAddress;

    @FindBy(how= How.XPATH, using="//*[@id=\"submitId\"]")
    public static WebElement Submit;


    @FindBy(how= How.XPATH, using="//*[@id=\"messageBox\"]")
    public static WebElement SuccMsg;
}
