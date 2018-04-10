package com.ecvictor.testng.nebulahomepage.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Navigate {
    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-login aLink\"]")
    public static WebElement Login;

    @FindBy(how= How.XPATH, using="/html/body/div[3]/div/div/div/form/div/div[1]")
    public static WebElement LoginPage;

    @FindBy(how= How.XPATH, using="//*[@id=\"p1-first-line\"]")
    public static WebElement LoginPage_Ch;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-about aLink\"]")
    public static WebElement About;

    @FindBy(how= How.XPATH, using="//*[@id=\"section8\"]/div/div[2]/div[1]/p")
    public static WebElement AboutPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-strategy aLink\"]")
    public static WebElement Strategy;

    @FindBy(how= How.XPATH, using="//*[@id=\"p2-title\"]")
    public static WebElement StrategyPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-tech aLink\"]")
    public static WebElement Technology;

    @FindBy(how= How.XPATH, using="//*[@id=\"p3-title\"]")
    public static WebElement TechnologyPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-team aLink\"]")
    public static WebElement Team;

    @FindBy(how= How.XPATH, using="//*[@id=\"section3\"]/div/div/p")
    public static WebElement TeamPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-advisors aLink\"]")
    public static WebElement Advisors;


    @FindBy(how= How.XPATH, using="//*[@id=\"fullpage\"]/div[6]/div/div/p")
    public static WebElement AdvisorsPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-partners aLink\"]")
    public static WebElement Partners;

    @FindBy(how= How.XPATH, using="//*[@id=\"section4\"]/div/div/p")
    public static WebElement PartnersPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-investors aLink\"]")
    public static WebElement Investors;


    @FindBy(how= How.XPATH, using="//*[@id=\"fullpage\"]/div[8]/div/div/p")
    public static WebElement InvestorsPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-token aLink\"]")
    public static WebElement Tokensale;


    @FindBy(how= How.XPATH, using="//*[@id=\"translate-countdown-sale\"]")
    public static WebElement TokensalePage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-contact aLink\"]")
    public static WebElement Contact;

    @FindBy(how= How.XPATH, using="//div[@class=\"p6-contactus-label translate-p6-contactus\"]")
    public static WebElement ContactPage;

    @FindBy(how= How.XPATH, using="//a[@class=\"translate-menu-language aLink\"]")
    public static WebElement Language;

    @FindBy(how= How.XPATH, using="//a[@href=\"javascript:setContent('ch')\"]")
    public static WebElement SimpleChinese;

    @FindBy(how= How.XPATH, using="//a[@href=\"javascript:setContent('tc')\"]")
    public static WebElement TraditionChinese;

    @FindBy(how= How.XPATH, using="//a[@href=\"javascript:setContent('en')\"]")
    public static WebElement English;

}
