package com.ecvictor.selenium.cucumber.whitelist.modules;

import com.ecvictor.selenium.cucumber.whitelist.helpers.Log;
import com.ecvictor.selenium.cucumber.whitelist.pageobject.Loginpage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import static org.hamcrest.Matchers.anyOf;


public class EthAction {
    public static void validEthAmount(WebDriver driver, String email, String amount, String isvalid) throws InterruptedException {

        System.out.println("Amount"+amount);
        Loginpage.Name.sendKeys(new String[]{email});

        Loginpage.Email.sendKeys(email);
        Loginpage.ConfirmEmail.sendKeys(email);
     
        Loginpage.EthAmount.sendKeys(amount);
        Loginpage.Submit.click();

        Thread.sleep(2000);
        if (isvalid.equals("Yes"))
            Assert.assertEquals(Loginpage.SuccMsg.getText(), "Succeed.");
        else
            //Assert.assertEquals(Loginpage.EthAmountMsg.getText(), "Eth amount should be between 0.1 and 50" || "[Please enter the amount in Ether]");
            Assert.assertTrue(Loginpage.EthAmountMsg.getText().equals("Eth amount should be between 0.1 and 50") ||
                    Loginpage.EthAmountMsg.getText().equals("[Please enter the amount in Ether]"));


        Log.info("Authentication failed Found");

        Reporter.log("Validation is performed");
    }
}
