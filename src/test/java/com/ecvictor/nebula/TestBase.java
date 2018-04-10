package com.ecvictor.nebula;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import java.util.Set;

public class TestBase {
    public WebDriver driver;
//    public EventFiringWebDriver driver;
    String baseUrl;
    int timeout = 5000;
    int interval = 500;

    public void nubulaTestPrepare(String Url) {
        String osName = (System.getProperty("os.name"));
        if (osName.equalsIgnoreCase("Mac OS X"))
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        else System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        System.out.println("driver choice ");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--kiosk");

        driver = new ChromeDriver(chromeOptions);
//        driver = new EventFiringWebDriver(edriver);
//        DriverListener handler = new DriverListener();
//        driver.register(handler);
        driver.get(Url);
    }

    public void rolldown(int x, int y) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("windows.scrollby(0.250)","");
        // String jsstr="'windows.scrollby('+x+','+y)";
        String jsstr = "scroll(" + x + ',' + y + ")";
        jse.executeScript(jsstr);
  //      Robot robot=new Robot();
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }

    public Boolean assertPageChange(WebDriver driver, String newTitle){
        int time=5000;
        int interval=500;
        while(time>0){
            if(newTitle.equals(driver.getTitle()))
            return true;
            else
                time-=interval;
        }
        return false;
    }
    public Boolean assertPageChangeUrl(WebDriver driver, String newUrl){
        int time=5000;
        int interval=500;
        while(time>0){
            if(newUrl.equals(driver.getCurrentUrl()))
            return true;
            else
                time-=interval;
        }
        return false;
    }

    public void switchWindows(String handle, Set<String>handles,String url){
        for(String h:handles){
            if(!h.equals(handle)){
                driver.switchTo().window(h);
                Assert.assertEquals(driver.getCurrentUrl(), url);
                driver.close();
                driver.switchTo().window(handle);
                break;
            }
        }
    }
}