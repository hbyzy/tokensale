package com.ecvictor.selenium.cucumber.tokensale.pageobject;

import com.ecvictor.selenium.cucumber.tokensale.stepdef.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass{

    public Loginpage(WebDriver driver){
        super(driver);
    }
//    WebDriver driver;
//    public Loginpage(WebDriver edriver){
//        driver=edriver;
//          PageFactory.initElements(driver,this);
//    }

    @FindBy(how= How.XPATH, using="//*[@id=\"translate-home-desc\"]")
    public static WebElement Homepage;

}
