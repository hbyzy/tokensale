package com.ecvictor.nebula;


import com.ecvictor.nebula.PageElemnet.AIPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AiPageTest {
    public WebDriver driver;
    TestBase base;
    AIPage aiPage;
    String baseUrl = "https://nebula-ai.com/";

    @BeforeTest()
    public void startup() {
        base = new TestBase();
        base.nubulaTestPrepare(baseUrl);
        driver = base.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        aiPage = new AIPage(driver);
    }

    @Test
    public void testTopMenuAbout() {
        aiPage.about.click();
        Assert.assertEquals(aiPage.aboutValidateMessage.getText(), "https://www.youtube.com/embed/FbvftQ-0odY?loop=1&enablejsapi=1");
    }

    @Test
    public void testTopMenuStrategy() throws InterruptedException {
        aiPage.strategy.click();
        Assert.assertEquals(aiPage.strategyImg.getAttribute("src"), "https://nebula-ai.com/imgs/page2-img1.png");
    }

    @Test
    public void testTopMenuTechnology() throws InterruptedException {
        aiPage.technology.click();
        Assert.assertEquals(aiPage.technologyImg.getAttribute("src"), "https://nebula-ai.com/imgs/quantai.png");
    }

    @Test
    public void testTopMenuTeam() throws InterruptedException {
        aiPage.team.click();
        Assert.assertEquals(aiPage.caoImg.getAttribute("src"), "https://nebula-ai.com/imgs/team/charles-cao.jpg");
    }

    @Test
    public void testTopMenuAdvisor() throws InterruptedException {
        aiPage.advisor.click();
        System.out.println(aiPage.advisor1Img.getAttribute("src"));
        Assert.assertEquals(aiPage.advisor1Img.getAttribute("src"), "https://nebula-ai.com/imgs/team/louiscleroux.jpg");
    }

    @Test
    public void testTopMenuPartner() throws InterruptedException {
        aiPage.patners.click();
        System.out.println(aiPage.partner1Img.getAttribute("src"));
        Assert.assertEquals(aiPage.partner1Img.getAttribute("src"), "https://nebula-ai.com/imgs/partners/mcgill-1.png");
    }

    @Test
    public void testTopMenuInvestor() throws InterruptedException {
        aiPage.investor.click();
        System.out.println(aiPage.investor1Img.getAttribute("src"));
        Assert.assertEquals(aiPage.investor1Img.getAttribute("src"), "https://nebula-ai.com/imgs/investors/consensus.png");
    }

    @Test
    public void testTopMenuContact() throws InterruptedException {
        aiPage.contact.click();
        System.out.println(aiPage.contactEmail.getAttribute("href"));
        Assert.assertEquals(aiPage.contactEmail.getAttribute("href"), "mailto:contact@nebula-ai.com");
    }

    @Test
    public void testGithub() throws InterruptedException {
        String handle = driver.getWindowHandle();
        aiPage.github.click();
        Set<String> handles = driver.getWindowHandles();
        base.switchWindows(handle, handles, "https://github.com/nebulaai");
    }

    @Test
    public void testWhitePaper() throws InterruptedException {
        String handle = driver.getWindowHandle();
        aiPage.whitePaper.click();
        Set<String> handles = driver.getWindowHandles();
        base.switchWindows(handle, handles, "https://nebula-ai.com/whitepaper/NBAI_whitepaper_EN.pdf");
    }

    @Test
    public void testTopMenuTranslation() throws InterruptedException {
        //  aiPage.language.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(aiPage.language);
        WebElement lan = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[9]/ul/li[2]/a"));
        actions.click(lan).build().perform();
        Assert.assertEquals(aiPage.contact.getText(), "聯系我們");
        Assert.assertEquals(aiPage.advisor.getText(), "顧問團隊");
    }

    @AfterTest
    public void teatDown() {
        driver.close();
        driver.quit();
    }
}
