package com.saucedemo.Testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazzon {
  @Test
  public void amazonnTest() 
  {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\Chrome\\chromedriver-win32\\chromedriver.exe" );
	  Reporter.log("Opening Amazone Browser ", true);
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.quit();
  }
}
