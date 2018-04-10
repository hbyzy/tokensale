package com.ecvictor.testng.nebulahomepage.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Teampage {
    @FindBy(how= How.XPATH, using="//*[@id=\"section3\"]/div/div/div[2]/div[2]")
    public static WebElement TPageTwo;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-yanyan-li name\"]")
    public static WebElement YANYAN_LI;

    @FindBy(how= How.XPATH, using="//*[@id=\"section3\"]/div/div/div[2]/div[3]")
    public static WebElement TPageThree;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-kaichen-zhang name\"]")
    public static WebElement KAICHEN_ZHANG;

    @FindBy(how= How.XPATH, using="//*[@id=\"section3\"]/div/div/div[2]/div[4]")
    public static WebElement TPageFour;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-chi-zhang name\"]")
    public static WebElement CHI_ZHANG;

    @FindBy(how= How.XPATH, using="//*[@id=\"section3\"]/div/div/div[2]/div[5]")
    public static WebElement TPageFive;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-alecsa-tabisaura name\"]")
    public static WebElement ALECSA_TABISAURA;

    @FindBy(how= How.XPATH, using="//*[@id=\"section3\"]/div/div/div[2]/div[6]")
    public static WebElement TPageSix;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-yan-xu name\"]")
    public static WebElement YAN_XU;

    @FindBy(how= How.XPATH, using="//*[@id=\"section3\"]/div/div/div[2]/div[7]")
    public static WebElement TPageSeventh;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-zan-wang name\"]")
    public static WebElement ZAN_WANG;


}
