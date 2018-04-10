package com.ecvictor.testng.nebulahomepage.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Contactpage {

    @FindBy(how= How.XPATH, using="//*[@id=\"fullpage\"]/div[9]/div/a[1]/img")
    public static WebElement Home;

    @FindBy(how= How.XPATH, using="//a[@class=\"p6-explore-btn translate-p6-explore\"]")
    public static WebElement ExploreNBAI;

    @FindBy(how = How.XPATH, using = "(//a[@href=\"https://github.com/nebulaai\"])[2]")
    public static WebElement Github;

    @FindBy (how = How.XPATH, using = "(//a[@href=\"https://twitter.com/nebula_ai\"])[2]")
    public static WebElement Twitter;

    @FindBy (how = How.XPATH, using = "(//a[@href=\"https://www.facebook.com/NebulaAI/\"])[2]")
    public static WebElement Facebook;

    @FindBy(how = How.XPATH, using = "(//a[@href=\"https://t.me/NebulaAICommunity\"])[2]")
    public static WebElement AICommunity;

    @FindBy(how = How.XPATH, using ="(//a[@href=\"https://www.youtube.com/channel/UCWltsUAyiser4-_eLLGmpdg\"])[2]")
    public static WebElement Youtube;

}
