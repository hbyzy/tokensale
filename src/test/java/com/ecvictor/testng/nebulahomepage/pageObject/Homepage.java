package com.ecvictor.testng.nebulahomepage.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {

    @FindBy(how= How.XPATH, using="//*[@id=\"p1-content\"]/p[3]/button[1]/span")
    public static WebElement ViewVideo;

    @FindBy(how= How.XPATH, using="//*[@id=\"p1-content\"]/p[3]/button[2]/span")
    public static WebElement ViewDemo;

    @FindBy(how= How.XPATH, using="//*[@id=\"p1-content\"]/p[3]/button[2]")
    public static WebElement WhitePaper;

    @FindBy(how = How.XPATH, using = "(//a[@href=\"https://github.com/nebulaai\"])[1]")
    public static WebElement Github;

    @FindBy (how = How.XPATH, using = "(//a[@href=\"https://twitter.com/nebula_ai\"])[1]")
    public static WebElement Twitter;

    @FindBy (how = How.XPATH, using = "(//a[@href=\"https://www.facebook.com/NebulaAI/\"])[1]")
    public static WebElement Facebook;

    @FindBy(how = How.XPATH, using = "(//a[@href=\"https://t.me/NebulaAICommunity\"])[1]")
    public static WebElement AICommunity;

    @FindBy(how = How.XPATH, using ="(//a[@href=\"https://www.youtube.com/channel/UCWltsUAyiser4-_eLLGmpdg\"])[1]")
    public static WebElement Youtube;


}
