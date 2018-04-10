package com.ecvictor.selenium.cucumber.whitelist.pageobject;

import org.openqa.selenium.WebDriver;

public abstract class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;

	public BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

}
