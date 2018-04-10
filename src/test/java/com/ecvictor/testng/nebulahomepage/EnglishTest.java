package com.ecvictor.testng.nebulahomepage;


import com.ecvictor.testng.nebulahomepage.module.*;
import com.ecvictor.testng.nebulahomepage.pageObject.*;
import com.ecvictor.testng.nebulahomepage.pageObject.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import static com.ecvictor.testng.nebulahomepage.module.ContactPage.clickHome;
import static com.ecvictor.testng.nebulahomepage.module.Navigate_En.*;
/* Created by caoc on 2/10/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class EnglishTest extends BaseTest {

    public static WebDriver driver;
    @BeforeMethod

    public WebDriver setUp() throws Exception {
        driver = setUpBase();
        return driver;
    }

    @Test
    public void tesPage_En() throws Exception {
        //TitleTest.testOpenHomePage();
        PageFactory.initElements(driver, Homepage.class);
        PageFactory.initElements(driver, Navigate.class);
        PageFactory.initElements(driver, Aboutpage.class);
        PageFactory.initElements(driver, Teampage.class);
        PageFactory.initElements(driver, Technologypage.class);
        PageFactory.initElements(driver, Advisorspage.class);
        PageFactory.initElements(driver, Contactpage.class);

        clickLogin(driver);

        checkLogin(driver);

        HomePage.clickVideo(driver);

        HomePage.clickdemo(driver);

        HomePage.clickGithub(driver);

        HomePage.clickTwitter(driver);

        HomePage.clickFacebook(driver);

        HomePage.checkAICommunity(driver);

        HomePage.clickYoutube(driver);

       // Homepage_En.clicWhitePaper(driver);

        clickAbout(driver);

        AboutPage.checkAIpage(driver);

        AboutPage.clickSAPage(driver);

        AboutPage.clickVedio(driver);

        //clickStrategy(driver);

        clickTechnology(driver);

        TechnologyPage.checkAIpage(driver);

        TechnologyPage.clickSAPage(driver);

        TechnologyPage.clickVideoPage(driver);

        clickTeam(driver);

        TeamPage.checkEachpage(driver);

        clickAdvisors(driver);

        AdvisorsPage.checkEachpage(driver);

        clickPartners(driver);

        clickInvestors(driver);

        clickTokenSale(driver);

        clickContact(driver);

        ContactPage.clickGithub(driver);

        ContactPage.clickTwitter(driver);

        ContactPage.clickFacebook(driver);

        ContactPage.checkAICommunity(driver);

        ContactPage.clickYoutube(driver);
        clickHome(driver);

    }


    @AfterMethod
    public void tearDown() throws Exception {
        tearDownBase(driver);
    }

}
