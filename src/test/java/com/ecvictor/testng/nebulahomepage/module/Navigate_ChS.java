package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.pageObject.Navigate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static com.ecvictor.testng.nebulahomepage.pageObject.Navigate.*;
import static org.testng.Assert.assertEquals;


public  class Navigate_ChS {

    public static void checkLogin(WebDriver driver) throws InterruptedException {
        assertEquals(driver.getTitle(), "Nebula AI");
        Actions actions = new Actions(driver);
        actions.moveToElement(Language).perform();


        actions.moveToElement(SimpleChinese);
        actions.click().build().perform();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        assertEquals(LoginPage_Ch.getText(), "Nebula AI 是基于人工智能和区块链技术的解决方案提供商.");
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
        Assert.assertEquals(Navigate.AboutPage.getText(),"关于我们");
    }

     public static void clickStrategy(WebDriver driver) throws InterruptedException {
         Navigate.Strategy.click();
       Thread.sleep(2000);
       Assert.assertEquals(Navigate.StrategyPage.getText(),"我们提供的服务");

   }

    public static void clickTechnology(WebDriver driver) throws InterruptedException {
        Navigate.Technology.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.TechnologyPage.getText(),"我们的技术");

    }

    public static void clickTeam(WebDriver driver) throws InterruptedException {
        Navigate.Team.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.TeamPage.getText(),"我们的团队");

    }

    public static void clickAdvisors(WebDriver driver) throws InterruptedException {
        Navigate.Advisors.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.AdvisorsPage.getText(),"顾问团队");

    }

    public static void clickPartners(WebDriver driver) throws InterruptedException {
        Navigate.Partners.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.PartnersPage.getText(),"合作伙伴");

    }

    public static void clickInvestors(WebDriver driver) throws InterruptedException {
        Navigate.Investors.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.InvestorsPage.getText(),"战略投资者");

    }

    public static void clickContact(WebDriver driver) throws InterruptedException {
        Navigate.Contact.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.ContactPage.getText(),"联系我们");

    }
}
