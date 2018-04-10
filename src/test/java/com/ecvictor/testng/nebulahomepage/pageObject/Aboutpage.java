package com.ecvictor.testng.nebulahomepage.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Aboutpage {

    @FindBy(how= How.XPATH, using="//A[@href='http://www.cointime.com/blockchain/10359.html']")
    public static WebElement AIPage;


    @FindBy(how= How.XPATH, using="//*[@id=\"section8\"]/div/div[2]/div[1]/div[2]/p[4]/a[2]")
    public static WebElement SOHUPage;

    @FindBy(how= How.XPATH, using="//*[@id=\"section8\"]/div/div[2]/div[2]/div")
    public static WebElement StartPlayVideo;

    @FindBy(how= How.XPATH, using="//span[@class=\"ytp-time-current\"]")
    public static WebElement VideoTime;


    @FindBy(how= How.XPATH, using="//*[@id=\"section8\"]/div/div[2]/div[2]/div/iframe")
    public static WebElement IFrame;

    @FindBy(how= How.XPATH, using="//*[@id=\"section8\"]/div/div[2]/div[2]/div/iframe")
    public static WebElement PlayButton;


}
