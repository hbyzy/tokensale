package com.ecvictor.nebula.PageElemnet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public  HomePage(WebDriver edriver) {
        driver = edriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//*[@id='confirmEmail']")
    public WebElement confirmEmail;
    @FindBy(xpath = "//*[@id=\"telegramId\"]")
    public WebElement weChat;
    @FindBy(xpath = "//*[@id=\"ethAmount\"]")
    public WebElement amount;
    @FindBy(xpath = "//*[@id=\"ethereumAddress\"]")
    public WebElement wallet;
    @FindBy(xpath = "//*[@id=\"comments\"]")
    public WebElement comments;

    @FindBy(xpath = "//*[@id=\"nameMsg\"]")
    public WebElement nameMsg;
    @FindBy(xpath = "//*[@id=\"emailMsg\"]")
    public WebElement emailMsg;
    @FindBy(xpath = "//*[@id=\"confirmEmailMsg\"]")
    public WebElement confirmEmailMsg;
    @FindBy(xpath = "//*[@id=\"ethAmountMsg\"]")
    public WebElement ethAmountMsg;
    @FindBy(xpath = "//*[@id=\"messageBox\"]")
    public WebElement messageBox;
    @FindBy(xpath = "//*[@id=\"messageBox\"]")
    public WebElement submitMessage;

    @FindBy(xpath = "//*[@id=\"submitId\"]")
    public WebElement submit;

    @FindBy(xpath = "//*[@id=\"homeButton\"]/button")
    public WebElement homeButton;




}
