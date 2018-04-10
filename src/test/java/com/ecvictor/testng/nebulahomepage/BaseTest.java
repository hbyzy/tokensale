package com.ecvictor.testng.nebulahomepage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.testng.Assert.fail;


public class BaseTest{

    public WebDriver setUpBase() throws Exception {
        String baseUrl;

        WebDriver driver;
        String os = (System.getProperty("os.name"));

        if (os.equalsIgnoreCase("Mac OS X"))
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        else System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--kiosk");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        baseUrl = "https://www.nebulahomepage-ai.com/";
        driver.get(baseUrl);
        return driver;
    }

    public void tearDownBase(WebDriver driver) throws Exception {
//        for (String handle : driver.getWindowHandles()) {
//            driver.switchTo().window(handle);
//            driver.close();
//        }
        driver.close();
        driver.quit();
            //driver.close();

            //driver.quit();

            StringBuffer verificationErrors = new StringBuffer();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
    }
}
