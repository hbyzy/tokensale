package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Aboutpage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.hamcrest.MatcherAssert.assertThat;


public  class AboutPage extends BaseTest {

    public static void checkAIpage(WebDriver driver) throws InterruptedException {

        String parentHandle = driver.getWindowHandle();

        Aboutpage.AIPage.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)

                Assert.assertEquals(driver.getCurrentUrl(), "http://www.cointime.com/blockchain/10359.html");
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window

    }

     public static void clickSAPage(WebDriver driver) throws InterruptedException {
         String parentHandle = driver.getWindowHandle();

         Aboutpage.SOHUPage.click(); // click some link that opens a new window

         Thread.sleep(3000);
         for (String winHandle : driver.getWindowHandles()) {
             if (!parentHandle.equals(winHandle)) {
                 driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                 Assert.assertEquals(driver.getCurrentUrl(), "http://www.sohu.com/a/222346472_305032");
                 driver.close();
             }
         }// close newly opened window when done with it
         driver.switchTo().window(parentHandle); // switch back to the original window
   }

    public static void clickVedio(WebDriver driver) throws InterruptedException {
        Aboutpage.StartPlayVideo.click(); // click some link that opens a new window
//        driver.get("https://youtu.be/FbvftQ-0odY");
//        driver.execute_script('document.getElementsByTagName("video")[0].play()');

        Thread.sleep(5000);

//        Boolean b = Aboutpage.IFrame.getCssValue("video.video-stream.html5-main-video").startsWith("0");
//        if (b) {
//            driver.switchTo().frame();
//        }

        Aboutpage.PlayButton.click();
        Thread.sleep(2000);

        driver.switchTo().frame(Aboutpage.IFrame);

        String playtime = Aboutpage.VideoTime.getAttribute("innerHTML");

        System.out.println("time:"+playtime);


        Assert.assertNotEquals(playtime, "0.00");

        driver.switchTo().defaultContent();

    }

}
