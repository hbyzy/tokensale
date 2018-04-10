package com.ecvictor.nebula;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //chose driver type
        String os = (System.getProperty("os.name"));

        if (os.equalsIgnoreCase("Mac OS X"))
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        else System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--kiosk");

        driver = new ChromeDriver(chromeOptions);

        baseUrl = "https://tokensale.nebula-ai.network/#home";

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testIsEmailValid() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"translate-home-login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();

        assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[2]/div/p")).getText(),
                "Email is invalid.");
    }
    @Test
    public void testIsPasswordValid() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"translate-home-login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();

        assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[3]/div/span")).getText(),
                "Password is required");
    }

    @Test
    public void testLoginCancel() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"translate-home-login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[5]/div/div/button[2]")).click();
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"pass\"]"))
                        .getText(),
                "");

    }
    @Test
    public void testForgotPasswordEmailInvalid() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"translate-home-login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"forget-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[1]")).click();
        assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[2]/div/p")).getText(),
                "Email is invalid.");
    }
    @Test
    public void testForgotPasswordCancel() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"translate-home-login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"forget-password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[3]/div/div/button[2]")).click();
        assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[2]/div/p")).getText(),
                "");
    }
    //send button is disabled
    @Test
    public void testForgotPassworSend() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"translate-home-login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"forget-password\"]")).click();
        assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div/div[3]/div/div/button[1]")).getAttribute("disabled")=="disabled");

    }
    @Test
    public void testGithub() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/a[1]/img")).click();
        Thread.sleep(3000);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        assertEquals(driver.getCurrentUrl(),"https://github.com/nebulaai");

    }
    @Test
    public void testTwitter() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/a[2]/img")).click();
        Thread.sleep(3000);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        assertEquals(driver.getCurrentUrl(),"https://twitter.com/Nebula_AI");

    }
    @Test
    public void testTelegram() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/a[3]/img")).click();
        Thread.sleep(3000);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        assertEquals(driver.getCurrentUrl(),"https://t.me/NebulaAICommunity");

    }
    @Test
    public void testWhitePaper() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"translate-home-link1\"]")).click();
        Thread.sleep(3000);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        assertEquals(driver.getCurrentUrl(),"https://nebula-ai.com/whitepaper/NBAI_whitepaper_EN.pdf");

    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}

