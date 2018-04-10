package com.ecvictor.nebula;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class TokenSaleEn {
    public WebDriver driver;
    public TestBase testBase;
    public String BaseUrl = "https://tokensale.nebula-ai.network/";

    @BeforeTest
    public void setup() {
        testBase = new TestBase();
        testBase.nubulaTestPrepare(BaseUrl);
        driver = testBase.driver;
        WebElement lan = driver.findElement(By.xpath("//*[@id='translate']"));
        String language = lan.getText();
        System.out.println(language);
        if (!language.equals("中文"))
            lan.click();
    }

    @Test
    public void testLoginMenu() {
        WebElement loginMenu = (WebElement) driver.findElement(By.xpath("//*[@id='translate-home-login']"));
        String buttonText = loginMenu.getText();
        Assert.assertEquals(buttonText, "Login");

        loginMenu.click();
        String title = "https://whitelist.nebula-ai.network/kyc/#/login";
        Boolean result = testBase.assertPageChangeUrl(driver, title);
        Assert.assertTrue(result);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }


    @Test
    public void testTokenSaleMenu() {
        System.out.println("here is bug");
    }

    @Test
    public void testAboutMenu() {
        WebElement aboutMenu = driver.findElement(By.xpath("//*[@id=\"translate-home-about\"]"));
        String buttonText = aboutMenu.getText();
        Assert.assertEquals(buttonText, "About");

        aboutMenu.click();
        String title = "https://tokensale.nebula-ai.network/#about";
        Boolean result = testBase.assertPageChangeUrl(driver, title);
        Assert.assertTrue(result);
    }

    @Test
    public void testUseCaseMenu() {
        WebElement useCaseMenu = driver.findElement(By.xpath("//*[@id=\"translate-home-use-case\"]"));
        String buttonText = useCaseMenu.getText();
        Assert.assertEquals(buttonText, "Use Case");

        useCaseMenu.click();
        String title = "https://tokensale.nebula-ai.network/#use-case";
        Boolean result = testBase.assertPageChangeUrl(driver, title);
        Assert.assertTrue(result);
    }

    @Test
    public void testTeamMenu() {
        WebElement teamMenu = driver.findElement(By.xpath("//*[@id=\"translate-home-team\"]"));
        String buttonText = teamMenu.getText();
        Assert.assertEquals(buttonText, "Team");

        teamMenu.click();
        String title = "https://tokensale.nebula-ai.network/#team";
        Boolean result = testBase.assertPageChangeUrl(driver, title);
        Assert.assertTrue(result);
    }

    @Test
    public void testFaqMenu() {
        WebElement faqMenu = driver.findElement(By.xpath("//*[@id=\"translate-home-faq\"]"));
        String buttonText = faqMenu.getText();
        Assert.assertEquals(buttonText, "FAQ");

        faqMenu.click();
        String title = "https://tokensale.nebula-ai.network/#faq";
        Boolean result = testBase.assertPageChangeUrl(driver, title);
        Assert.assertTrue(result);
    }
    @Test
    public void testWhiteListButton(){
        WebElement faqMenu = driver.findElement(By.xpath("//*[@id=\"countdown\"]/div[2]/div[7]/a[1]"));
        faqMenu.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://whitelist.nebula-ai.network/");
    }
    @Test
    public void testKycButton(){
        WebElement faqMenu = driver.findElement(By.xpath("//*[@id=\"countdown\"]/div[2]/div[7]/a[2]"));
        faqMenu.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://whitelist.nebula-ai.network/kyc/#/login");
    }
    @Test
    public void testTokenSaleButton(){
        WebElement faqMenu = driver.findElement(By.xpath("//*[@id=\"countdown\"]/div[2]/div[7]/a[3]"));
        String cHandle=driver.getWindowHandle();
        faqMenu.click();
        Set<String> handles = driver.getWindowHandles();
        String newUrl="https://medium.com/@ccao/nbai-token-sale-instructions-b023c93be202";
        testBase.switchWindows(cHandle,handles,newUrl);
    }

    @Test(dependsOnMethods = {"testAboutMenu"})
    public void testAboutPage() {
        WebElement menuPng = driver.findElement(By.xpath("/html/body/div[1]/img[2]"));
        String pngStyle = menuPng.getAttribute("style");
        Assert.assertTrue(pngStyle.contains("block;"));

        WebElement introducing = driver.findElement(By.xpath("//*[@id=\"translate-about-intro\"]"));
        Assert.assertEquals(introducing.getText(), "INTRODUCING");
    }

    @Test(dependsOnMethods = {"testUseCaseMenu"})
    public void testUseCasePage() {
        WebElement menuPng = driver.findElement(By.xpath("/html/body/div[1]/img[2]"));
        String pngStyle = menuPng.getAttribute("style");
        Assert.assertTrue(pngStyle.contains("block;"));//page tag setting is wrong

        WebElement introducing = driver.findElement(By.xpath("//*[@id=\"translate-use-case-title\"]"));
        Assert.assertEquals(introducing.getText(), "QUANT AI");
    }

    @Test(dependsOnMethods = {"testTeamMenu"})
    public void testTeamPage() {
        WebElement menuPng = driver.findElement(By.xpath("/html/body/div[1]/img[2]"));
        String pngStyle = menuPng.getAttribute("style");
        Assert.assertTrue(pngStyle.contains("block;"));//test if page tag setting is good,is the picture shows or not

        WebElement introducing = driver.findElement(By.xpath("//*[@id=\"team\"]/div/div[2]/div/div[2]/div[1]/img"));
        Assert.assertEquals(introducing.getAttribute("src"), "https://nebula-ai.com/imgs/team/qinhui-lin.jpg");
    }

    @Test(dependsOnMethods = {"testFaqMenu"})
    public void testFaqPage() {
        WebElement menuPng = driver.findElement(By.xpath("/html/body/div[1]/img[2]"));
        String pngStyle = menuPng.getAttribute("style");
//        Assert.assertTrue(pngStyle.contains("block;"));//page tag setting is wrong

        WebElement introducing = driver.findElement(By.xpath("//*[@id=\"translate-faq-title\"]"));
        Assert.assertEquals(introducing.getText(), "Frequently Asked Questions");
    }
}
