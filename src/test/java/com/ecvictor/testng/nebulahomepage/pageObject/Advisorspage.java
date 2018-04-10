package com.ecvictor.testng.nebulahomepage.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Advisorspage {
    @FindBy(how= How.XPATH, using="//*[@id=\"fullpage\"]/div[6]/div/div/div[2]/div[2]")
    public static WebElement APageTwo;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-xun-shi name\"]")
    public static WebElement XUN_SHI;

    @FindBy(how= How.XPATH, using="//*[@id=\"fullpage\"]/div[6]/div/div/div[2]/div[3]")
    public static WebElement APageThree;

    @FindBy(how= How.XPATH, using="//span[@class=\"translate-name-adam-allouba name\"]")
    public static WebElement ADAM_ALLOUBA;


}
