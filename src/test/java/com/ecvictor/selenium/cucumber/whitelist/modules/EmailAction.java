package com.ecvictor.selenium.cucumber.whitelist.modules;

import com.ecvictor.selenium.cucumber.whitelist.helpers.Log;
import com.ecvictor.selenium.cucumber.whitelist.pageobject.Loginpage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EmailAction {
    public static void validEmail(WebDriver driver, String email, String isvalid) throws InterruptedException {

        System.out.println(email);

        Loginpage.Name.sendKeys(new String[]{email});

        Loginpage.Email.sendKeys(email);
        Loginpage.ConfirmEmail.sendKeys(email);

        if (isvalid.equals("Yes"))
            Assert.assertEquals(Loginpage.EmailMsg.getText(), "");
        else
            Assert.assertEquals(Loginpage.EmailMsg.getText(), "Please enter your valid email");

        Log.info("Authentication failed Found");

        Reporter.log("Validation is performed");
    }
}
