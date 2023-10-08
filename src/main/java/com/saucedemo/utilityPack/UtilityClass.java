package com.saucedemo.utilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class UtilityClass 
{
	
	WebDriver driver;
	
	public void screenshot() throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File soursefile = ts.getScreenshotAs(OutputType.FILE);
	File destfile = new File("E:\\ProjectSnap\\SaucedemoSnap\\SauceDemoLoginPage.jpg");
	FileHandler.copy(soursefile, destfile);
			
	}
	public UtilityClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
