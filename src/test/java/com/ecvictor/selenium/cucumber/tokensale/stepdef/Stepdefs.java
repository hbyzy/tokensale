package com.ecvictor.selenium.cucumber.tokensale.stepdef;

import com.ecvictor.selenium.cucumber.tokensale.modules.SignInAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Stepdefs {
    public  WebDriver driver;

    public Stepdefs() {
        driver = Hooks.driver;
    }

    @Given("^tokensale home page$")
    public void tokensaleHomePage() throws Throwable {
        driver.get("http://tokensale.nebulahomepage-ai.network");
    }

    @Then("^the login page is up$")
    public void theLoginPageIsUp() throws Throwable {

        SignInAction.showLoginPage(driver);
    }
}
