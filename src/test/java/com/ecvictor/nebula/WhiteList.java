package com.ecvictor.nebula;


import com.ecvictor.nebula.PageElemnet.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class WhiteList {
    public WebDriver driver;
    // public WebDriver edriver;
    public String BaseUrl = "https://whitelist.nebula-ai.network/";
    TestBase base;
    HomePage homePage;

    @DataProvider(name = "amount")
    public Object[] loginParameter() {
        Object[] loginData = new Object[6];
        loginData[0] = "0.9999999999";
        loginData[1] = "0.1";
        loginData[2] = "0.2";
        loginData[3] = "49";
        loginData[4] = "50";
        loginData[5] = "51";
        return loginData;
    }

    @BeforeTest
    public void startup() throws InterruptedException {
        base = new TestBase();
        base.nubulaTestPrepare(BaseUrl);
        driver = base.driver;

        driver.get(BaseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        base.rolldown(0, 600);
    }

    @Test
    public void testErrMsg() {
        testNameMsg();
        testEmailMsg();
        testConfirmEmailMsg();
        testAmountMsg();
    }

    @Test
    public void testPOsitive() {
        homePage.name.sendKeys("aa");
        homePage.email.sendKeys("aa@aa.com");
        homePage.confirmEmail.sendKeys("aa@aa.com");
        homePage.wallet.sendKeys("1");
        homePage.submit.click();
        Assert.assertEquals(homePage.submitMessage.getText(), "This email has already used, please choose another email.");
    }

    @Test
    public void testEmailNegtive() {
        homePage.name.sendKeys("aa");
        homePage.email.sendKeys("aa@aa.com");
        homePage.confirmEmail.sendKeys("aa@a.com");
        homePage.wallet.sendKeys("1");
        homePage.submit.click();
        Assert.assertEquals(homePage.submitMessage.getText(), "Emails do not match, please validate your emails");
        //Assert.assertEquals(homePage.submitMessage.getText(), "Succeed.");
    }

    @Test(dataProvider = "amount")
    public void testAmountInput(String amount) {
        homePage.amount.clear();
        ((JavascriptExecutor) driver).executeScript("arguments[0].value=arguments[1]", homePage.amount, Float.parseFloat(amount));

        homePage.submit.click();
        String message = homePage.ethAmountMsg.getText();
        switch (message) {
            case ("Eth amount should be between 0.1 and 50"):
                System.out.println("Error maessage shows with " + amount + " message is :" + homePage.ethAmountMsg.getText());
                break;
            case (""):
                System.out.println("with " + amount + " no message display");
                break;
            default:
                System.out.println("with " + amount + " default");
                break;
        }
    }

    @Test
    public void homeButton() {
        homePage.homeButton.click();
        Boolean result=base.assertPageChange(driver,"Nebula AI" );
        Assert.assertTrue(result);
    }

    @Test
    public void hoverTest() throws InterruptedException, AWTException, IOException {
        Actions actions = new Actions(driver);
        homePage.name.click();
        actions.moveToElement(homePage.name, 3, 3).pause(3000).build().perform();
        Thread.sleep(6000);
        String html=driver.getPageSource();
        File file= new File("whitelisthover.html");
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        bw.write(html);
        bw.flush();
        bw.close();
        Alert alret=driver.switchTo().alert();
        System.out.println(alret.getText());

    }


    public void testNameMsg() {
        homePage.name.click();
        homePage.email.click();
        Assert.assertEquals(homePage.nameMsg.getText(), "Please enter your name");
    }

    public void testEmailMsg() {
        homePage.email.click();
        homePage.confirmEmail.click();
        Assert.assertEquals(homePage.emailMsg.getText(), "Please enter your valid email");
    }

    public void testConfirmEmailMsg() {
        homePage.confirmEmail.click();
        homePage.amount.click();
        Assert.assertEquals(homePage.confirmEmailMsg.getText(), "Please enter your valid email again");
    }

    public void testAmountMsg() {
        homePage.amount.click();
        homePage.wallet.click();
        Assert.assertEquals(homePage.ethAmountMsg.getText(), "Please enter the amount in Ether");
    }


    @AfterTest
    public void tardown() {
        driver.close();
        driver.quit();

    }
}
