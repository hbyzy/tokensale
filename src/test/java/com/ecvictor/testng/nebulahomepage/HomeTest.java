package com.ecvictor.testng.nebulahomepage;

import com.ecvictor.testng.nebulahomepage.module.*;
import com.ecvictor.testng.nebulahomepage.pageObject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.ecvictor.testng.nebulahomepage.module.ContactPage.clickHome;
import static com.ecvictor.testng.nebulahomepage.module.Navigate_En.*;
/* Created by caoc on 2/10/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class HomeTest extends BaseTest {
    public static WebDriver driver;

    @BeforeTest
    public WebDriver setUp() throws Exception {
        driver = setUpBase();
        return driver;

    }

    @Test
    public void tesPage_En() throws Exception {
        //TitleTest.testOpenHomePage();
       PageFactory.initElements(driver, Homepage.class);
        PageFactory.initElements(driver, Navigate.class);
        PageFactory.initElements(driver, Contactpage.class);
        clickContact(driver);

        ContactPage.clickExploreNBAI(driver);

        ContactPage.clickGithub(driver);

        ContactPage.clickTwitter(driver);

        ContactPage.clickFacebook(driver);

        ContactPage.checkAICommunity(driver);

        ContactPage.clickYoutube(driver);

        clickHome(driver);

    }

    @AfterTest
    public void tearDown() throws Exception {
        tearDownBase(driver);
    }

}
