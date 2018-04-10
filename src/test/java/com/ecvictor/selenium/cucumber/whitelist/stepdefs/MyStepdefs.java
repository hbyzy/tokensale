package com.ecvictor.selenium.cucumber.whitelist.stepdefs;

import com.ecvictor.selenium.cucumber.whitelist.modules.EmailAction;
import com.ecvictor.selenium.cucumber.whitelist.modules.EthAction;
import com.ecvictor.selenium.cucumber.whitelist.modules.GenerateEmail;
import com.ecvictor.selenium.cucumber.whitelist.modules.SignInAction;
import com.ecvictor.selenium.cucumber.whitelist.pageobject.Loginpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStepdefs {
    public WebDriver driver;

    public MyStepdefs() {
        driver = Hooks.driver;
    }

    @Given("^whitelist home page$")
    public void whitelistHomePage() throws Throwable {
        driver.get("https://whitelist.nebulahomepage-ai.network/");
        Thread.sleep(3000);
    }


    @And("^the whitelist page is up$")
    public void theWhitelistPageIsUp() throws Throwable {
        PageFactory.initElements(driver, Loginpage.class);
        SignInAction.showLoginPage(driver);
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String email, String isvalid) throws Throwable {
        EmailAction.validEmail(driver, email, isvalid);

    }

//    @And("^Input a valid EthAmount$")
//    public void inputOtherFields() throws Throwable {
//        EthAction.validEthAmount(driver);
//    }


    @When("^I generate a valid email$")
    public String iGenerateAValidEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        return GenerateEmail.getEmailString();
    }

    @When("^Input a valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAmount(String amount, String isvalid) throws Throwable {
        String email = iGenerateAValidEmail();
        EthAction.validEthAmount(driver, email, amount, isvalid);

    }

}