package com.ecvictor.selenium.cucumber.tokensale.modules;

import com.ecvictor.selenium.cucumber.tokensale.helpers.Log;
import com.ecvictor.selenium.cucumber.tokensale.pageobject.Loginpage;
import com.ecvictor.selenium.cucumber.tokensale.helpers.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInAction{

    public static void showLoginPage(WebDriver driver) throws InterruptedException {
        //Assert.assertEquals("3rd Generation Blockchain - Decentralized AI blockchain", driver.findElement(By.xpath("//*[@id=\"translate-home-desc\"]")).getText());
       // Loginpage LoginPage = new Loginpage(driver);

        PageFactory.initElements(driver, Loginpage.class);


        Assert.assertEquals(Loginpage.Homepage.getText(), "3rd Generation Blockchain - Decentralized AI blockchain");

        Log.info("Authentication failed Found");

        Reporter.log("Validation is performed");
    }
}
