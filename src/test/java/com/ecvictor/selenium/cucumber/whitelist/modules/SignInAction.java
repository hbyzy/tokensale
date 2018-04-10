package com.ecvictor.selenium.cucumber.whitelist.modules;

import com.ecvictor.selenium.cucumber.whitelist.helpers.Log;
import com.ecvictor.selenium.cucumber.whitelist.pageobject.Loginpage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInAction {
    public static void showLoginPage(WebDriver driver) throws InterruptedException {

        Assert.assertEquals(Loginpage.Homepage.getText(), "CROWDSALE WHITELIST");

        Log.info("Authentication failed Found");

        Reporter.log("Validation is performed");
    }
}
