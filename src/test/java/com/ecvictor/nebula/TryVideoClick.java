package com.ecvictor.nebula;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TryVideoClick {
    public WebDriver driver;
    public TestBase testBase=new TestBase();
    public String BaseUrl="https://nebula-ai.com/";
    @BeforeTest
    public void setup() throws InterruptedException {
        testBase.nubulaTestPrepare(BaseUrl);
        driver=testBase.driver;
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
        Thread.sleep(3000);
    }
    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @Test
    public void testVideo() throws InterruptedException {
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"section8\"]/div/div[2]/div[2]/div/iframe"));
        driver.switchTo().frame(frame);
        WebElement centerButton=driver.findElement(By.xpath("//button[@aria-label=\"Play\"]"));
        centerButton.click();
        Thread.sleep(3000);
        WebElement pauseBUtton=driver.findElement(By.xpath("//button[@aria-label=\"Pause\"]"));
        pauseBUtton.click();
        Thread.sleep(3000);
        WebElement time=driver.findElement(By.xpath("//div/span[@class=\"ytp-time-current\"]"));
        System.out.println(time.getText());
    }
}
