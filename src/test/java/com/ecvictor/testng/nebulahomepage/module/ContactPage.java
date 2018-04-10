package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Contactpage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public  class ContactPage extends BaseTest {

    public static void clickHome(WebDriver driver) throws InterruptedException {
        Contactpage.Home.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.nebulahomepage-ai.com/#Home");
        driver.navigate().back();
    }

    public static void checkAICommunity(WebDriver driver) throws InterruptedException {

        String parentHandle = driver.getWindowHandle();

        Contactpage.AICommunity.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)

                Assert.assertEquals(driver.getCurrentUrl(), "https://t.me/NebulaAICommunity");
                driver.close(); // close newly opened window when done with it
            }
        }
        driver.switchTo().window(parentHandle); // switch back to the original window

    }


     public static void clickExploreNBAI(WebDriver driver) throws InterruptedException {
         String parentHandle = driver.getWindowHandle();

         Contactpage.ExploreNBAI.click(); // click some link that opens a new window

         Thread.sleep(3000);
         for (String winHandle : driver.getWindowHandles()) {
             if (!parentHandle.equals(winHandle)) {
                 driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                 assertThat(driver.getCurrentUrl(), containsString("https://tokensale.nebulahomepage-ai.network/"));
                 driver.close();
             }
         }// close newly opened window when done with it
         driver.switchTo().window(parentHandle); // switch back to the original window
   }

    public static void clickGithub(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Contactpage.Github.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://github.com/nebulaai"));
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window
    }

    public static void clickTwitter(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Contactpage.Twitter.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://twitter.com/nebula_ai"));
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window
    }

    public static void clickYoutube(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Contactpage.Youtube.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://www.youtube.com/channel/"));
                driver.close(); // close newly opened window when done with it
            }
        }
        driver.switchTo().window(parentHandle); // switch back to the original window
    }

    public static void clickFacebook(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Contactpage.Facebook.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://www.facebook.com/NebulaAI/"));
                driver.close(); // close newly opened window when done with it
            }
        }
        driver.switchTo().window(parentHandle); // switch back to the original window
    }

}
