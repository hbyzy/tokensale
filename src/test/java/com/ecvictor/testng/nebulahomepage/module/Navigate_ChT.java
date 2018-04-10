package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Navigate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.ecvictor.testng.nebulahomepage.pageObject.Navigate.LoginPage_Ch;
import static org.testng.Assert.assertEquals;


public  class Navigate_ChT extends BaseTest {
    public static WebDriver driver;
    public static void checkLogin(WebDriver driver) {
        assertEquals(driver.getTitle(), "Nebula AI");
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[10]/a"));
        actions.moveToElement(menu).perform();

        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[2]/a"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertEquals(LoginPage_Ch.getText(), "Nebula AI 是基於人工智能和區塊鏈技術的解決方案提供商.");
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
        Assert.assertEquals(Navigate.AboutPage.getText(),"關於我們");
    }

     public static void clickStrategy(WebDriver driver) throws InterruptedException {
       Navigate.Strategy.click();
       Thread.sleep(2000);
       Assert.assertEquals(Navigate.StrategyPage.getText(),"我們提供的服務");

   }

    public static void clickTechnology(WebDriver driver) throws InterruptedException {
        Navigate.Technology.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.TechnologyPage.getText(),"我們的技術");

    }

    public static void clickTeam(WebDriver driver) throws InterruptedException {
        Navigate.Team.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.TeamPage.getText(),"團隊");

    }

    public static void clickAdvisors(WebDriver driver) throws InterruptedException {
        Navigate.Advisors.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.AdvisorsPage.getText(),"顧問團隊");

    }

    public static void clickPartners(WebDriver driver) throws InterruptedException {
        Navigate.Partners.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.PartnersPage.getText(),"合作夥伴");

    }

    public static void clickInvestors(WebDriver driver) throws InterruptedException {
        Navigate.Investors.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.InvestorsPage.getText(),"戰略投資者");

    }

    public static void clickContact(WebDriver driver) throws InterruptedException {
        Navigate.Contact.click();
        Thread.sleep(2000);
        Assert.assertEquals(Navigate.ContactPage.getText(),"聯系我們");

    }
}
