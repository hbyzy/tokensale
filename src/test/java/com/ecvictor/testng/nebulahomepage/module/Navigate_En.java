package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public  class Navigate_En extends BaseTest {

    public static WebDriver driver;
    public static void checkLogin(WebDriver driver) {
        assertEquals(driver.getTitle(), "Nebula AI");
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[10]/a"));
        actions.moveToElement(menu).perform();

        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[1]/a"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

     public static void clickLogin(WebDriver driver) throws InterruptedException {
       Navigate.Login.click();
       Thread.sleep(2000);
       Assert.assertEquals(Navigate.LoginPage.getText(), "LOG IN");
       driver.navigate().back();
   }

    public static void clickAbout(WebDriver driver) throws InterruptedException {
        Navigate.About.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.AboutPage.getText(),"ABOUT US");
    }

     public static void clickStrategy(WebDriver driver) throws InterruptedException {
       Navigate.Strategy.click();
       Thread.sleep(2000);
       Assert.assertEquals(Navigate.StrategyPage.getText(),"WHAT WE DO");

   }

    public static void clickTechnology(WebDriver driver) throws InterruptedException {
        Navigate.Technology.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.TechnologyPage.getText(),"Our Technology");

    }

    public static void clickTeam(WebDriver driver) throws InterruptedException {
        Navigate.Team.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.TeamPage.getText(),"OUR TEAM");

    }

    public static void clickAdvisors(WebDriver driver) throws InterruptedException {
        Navigate.Advisors.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.AdvisorsPage.getText(),"OUR ADVISORS");

    }

    public static void clickPartners(WebDriver driver) throws InterruptedException {
        Navigate.Partners.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.PartnersPage.getText(),"OUR PARTNERS");

    }

    public static void clickInvestors(WebDriver driver) throws InterruptedException {
        Navigate.Investors.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.InvestorsPage.getText(),"Strategic Investors");

    }
    public static void clickTokenSale(WebDriver driver) throws InterruptedException {

        String parentHandle = driver.getWindowHandle();

        Navigate.Tokensale.click(); // click some link that opens a new window

        Thread.sleep(2000);
        Assert.assertEquals(Navigate.TokensalePage.getText(), "TOKEN SALE");
        driver.navigate().back();

    }

    public static void clickContact(WebDriver driver) throws InterruptedException {
        Navigate.Contact.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.ContactPage.getText(),"CONTACT US");

    }
}
