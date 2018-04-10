package com.ecvictor.testng.nebulahomepage.module;

import com.ecvictor.testng.nebulahomepage.BaseTest;
import com.ecvictor.testng.nebulahomepage.pageObject.Technologypage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public  class TechnologyPage extends BaseTest {


    public static void checkAIpage(WebDriver driver) throws InterruptedException {

        String parentHandle = driver.getWindowHandle();

        Technologypage.AIPage.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)

                assertThat(driver.getCurrentUrl(), containsString("http://quantum.nebulahomepage-ai.network/"));
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window

    }

     public static void clickSAPage(WebDriver driver) throws InterruptedException {
         String parentHandle = driver.getWindowHandle();

         Technologypage.SAPage.click(); // click some link that opens a new window

         Thread.sleep(3000);
         for (String winHandle : driver.getWindowHandles()) {
             if (!parentHandle.equals(winHandle)) {
                 driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                 Assert.assertEquals(driver.getCurrentUrl(), "http://sentiment.nebulahomepage-ai.network/");
                 driver.close();
             }
         }// close newly opened window when done with it
         driver.switchTo().window(parentHandle); // switch back to the original window
   }
    public static void clickVideoPage(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Technologypage.Video.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("http://quantum.nebulahomepage-ai.network/"));
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window
    }

}
