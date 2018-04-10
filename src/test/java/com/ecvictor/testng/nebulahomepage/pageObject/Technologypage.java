package com.ecvictor.testng.nebulahomepage.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Technologypage {
    @FindBy(how= How.XPATH, using="//*[@id=\"p3-content\"]/div[2]/div[1]/div[1]/a/img")
    public static WebElement AIPage;


    @FindBy(how= How.XPATH, using="//*[@id=\"p3-content\"]/div[2]/div[2]/div[1]/a/img")
    public static WebElement SAPage;

    @FindBy(how= How.XPATH, using="//*[@id=\"p3-button\"]/span")
    public static WebElement Video;



}
