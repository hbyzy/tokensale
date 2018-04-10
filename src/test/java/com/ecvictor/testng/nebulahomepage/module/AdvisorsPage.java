package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Advisorspage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public  class AdvisorsPage extends BaseTest {

    public static void checkEachpage(WebDriver driver) throws InterruptedException {

        Advisorspage.APageTwo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.XUN_SHI.getText(), "DR. XUN SHI");

        Advisorspage.APageThree.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.ADAM_ALLOUBA.getText(), "ADAM ALLOUBA");
    }

    public static void checkEachpage_ChT(WebDriver driver) throws InterruptedException {

        Advisorspage.APageTwo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.XUN_SHI.getText(), "史遜博士");

        Advisorspage.APageThree.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.ADAM_ALLOUBA.getText(), "ADAM ALLOUBA");
    }

    public static void checkEachpage_ChS(WebDriver driver) throws InterruptedException {

        Advisorspage.APageTwo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.XUN_SHI.getText(), "史逊博士");

        Advisorspage.APageThree.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.ADAM_ALLOUBA.getText(), "ADAM ALLOUBA");
    }

}
