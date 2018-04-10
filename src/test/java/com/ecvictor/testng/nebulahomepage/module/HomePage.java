package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public  class HomePage extends BaseTest {

    public static void clickVideo(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Homepage.ViewVideo.click(); // click some link that opens a new window
        Thread.sleep(1000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://www.youtube.com/watch"));
                driver.close(); // close newly opened window when done with it
            }
        }
        driver.switchTo().window(parentHandle); // switch back to the original window;
    }

     public static void clickdemo(WebDriver driver) throws InterruptedException {
         String parentHandle = driver.getWindowHandle();

         Homepage.ViewDemo.click(); // click some link that opens a new window
         Thread.sleep(1000);
         for(String winHandle : driver.getWindowHandles()){
             driver.switchTo().window(winHandle);
             //driver.navigate().refresh();
         }
         // switch focus of WebDriver to the next found window handle (that's your newly opened window)

                    assertThat(driver.getCurrentUrl(), containsString("http://quantum.nebulahomepage-ai.network/"));
                    driver.close();
                    // close newly opened window when done with it
         driver.switchTo().window(parentHandle); // switch back to the original window;
   }

    public static void clicWhitePaper(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Homepage.WhitePaper.click(); // click some link that opens a new window
        Thread.sleep(1000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://nebulahomepage-ai.com/whitepaper/NBAI_whitepaper_EN.pdf"));
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window;
    }
    public static void clickGithub(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Homepage.Github.click(); // click some link that opens a new window

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

        Homepage.Twitter.click(); // click some link that opens a new window

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

        Homepage.Youtube.click(); // click some link that opens a new window

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

        Homepage.Facebook.click(); // click some link that opens a new window

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
    public static void checkAICommunity(WebDriver driver) throws InterruptedException {

        String parentHandle = driver.getWindowHandle();

        Homepage.AICommunity.click(); // click some link that opens a new window

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

}
