package com.ecvictor.nebula.PageElemnet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIPage {
    WebDriver driver;

    public  AIPage(WebDriver edriver) {
        driver = edriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"menu\"]/li[1]/a")
    public WebElement about;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a")
    public WebElement strategy;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[3]/a")
    public WebElement technology;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[4]/a")
    public WebElement team;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[5]/a")
    public WebElement advisor;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    public WebElement patners;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[7]/a")
    public WebElement investor;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[8]/a")
    public WebElement contact;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[9]/a")
    public WebElement language;

    @FindBy(xpath = "//*[@id=\"p1-content\"]/ul/li[1]/a/i")
    public WebElement github;
    @FindBy(xpath = "//*[@id=\"p1-content\"]/p[3]/button[2]")
    public WebElement whitePaper;



    @FindBy(xpath = "//*[@id=\"section8\"]/div/div[2]/div[2]/div/iframe")
    public WebElement aboutValidateMessage;
    @FindBy(xpath = "//*[@id=\"section1\"]/div/div/div/div[1]/img")
    public WebElement strategyImg;
    @FindBy(xpath = "//*[@id=\"p3-content\"]/div[2]/div[1]/div[1]/a/img")
    public WebElement technologyImg;
    @FindBy(xpath = "//*[@id=\"section3\"]/div/div/div[1]/div/div[1]/div[1]/img")
    public WebElement caoImg;
    @FindBy(xpath = "//*[@id=\"fullpage\"]/div[6]/div/div/div[1]/div/div[1]/div[1]/img")
    public WebElement advisor1Img;
    @FindBy(xpath = "//*[@id=\"section4\"]/div/div/div/img[1]")
    public WebElement partner1Img;
    @FindBy(xpath = "//*[@id=\"fullpage\"]/div[8]/div/div/div/a[1]/img")
    public WebElement investor1Img;
    @FindBy(xpath = "//*[@id=\"fullpage\"]/div[9]/div/div[4]/a")
    public WebElement contactEmail;




}
