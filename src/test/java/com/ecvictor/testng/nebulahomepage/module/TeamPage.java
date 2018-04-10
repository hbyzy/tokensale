package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Teampage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public  class TeamPage extends BaseTest {

    public static void checkEachpage(WebDriver driver) throws InterruptedException {

        Teampage.TPageTwo.click();
        Thread.sleep(3000);
        assertThat(Teampage.YANYAN_LI.getText(), containsString("YANYAN"));

        Teampage.TPageThree.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.KAICHEN_ZHANG.getText(), "KAICHEN ZHANG");

        Teampage.TPageFour.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.CHI_ZHANG.getText(), "CHI ZHANG");

        Teampage.TPageFive.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.ALECSA_TABISAURA.getText(), "ALECSA TABISAURA");

        Teampage.TPageSix.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.YAN_XU.getText(), "YAN XU");

        Teampage.TPageSeventh.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.ZAN_WANG.getText(), "ZAN WANG");


    }

    public static void checkEachpage_ChT(WebDriver driver) throws InterruptedException {

        Teampage.TPageTwo.click();
        Thread.sleep(3000);
        assertThat(Teampage.YANYAN_LI.getText(), containsString("李岩岩"));

        Teampage.TPageThree.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.KAICHEN_ZHANG.getText(), "張愷諶");

        Teampage.TPageFour.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.CHI_ZHANG.getText(), "张弛");

        Teampage.TPageFive.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.ALECSA_TABISAURA.getText(), "ALECSA TABISAURA");

        Teampage.TPageSix.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.YAN_XU.getText(), "徐琰");

        Teampage.TPageSeventh.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.ZAN_WANG.getText(), "王贊");


    }

    public static void checkEachpage_ChS(WebDriver driver) throws InterruptedException {

        Teampage.TPageTwo.click();
        Thread.sleep(3000);
        assertThat(Teampage.YANYAN_LI.getText(), containsString("李岩岩"));

        Teampage.TPageThree.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.KAICHEN_ZHANG.getText(), "张恺谌");

        Teampage.TPageFour.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.CHI_ZHANG.getText(), "张弛");

        Teampage.TPageFive.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.ALECSA_TABISAURA.getText(), "ALECSA TABISAURA");

        Teampage.TPageSix.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.YAN_XU.getText(), "徐琰");

        Teampage.TPageSeventh.click();
        Thread.sleep(3000);
        Assert.assertEquals(Teampage.ZAN_WANG.getText(), "王赞");


    }


}
