package com.saucedemo.Testpack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.saucedemo.POMpack.Loginclass;
import com.saucedemo.utilityPack.UtilityClass;


public class TestBaseClass 
{
   WebDriver driver;
   Logger log = Logger.getLogger("Saucedemo_Projet");
@SuppressWarnings("deprecation")
@BeforeMethod
public void setup() throws InterruptedException, IOException
{
	System.setProperty("Webdriver.chrome.driver",
	"E:\\Chrome\\chromedriver-win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	PropertyConfigurator.configure("log4j.properties");
	
	log.info("Broweser is opened");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	log.info("window is maximized");
	
	driver.get("https://www.saucedemo.com/");
	log.info("URL is Opened");
	Thread.sleep(2000);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Loginclass lc = new Loginclass(driver);
	
	lc.sendusername();
	log.info("Username is Entered");
	Thread.sleep(2000);
	
	lc.sendpassword();
	log.info("Password is Entered");
	Thread.sleep(2000);
	
    lc.clickloginbutton();
    log.info("Click on loginbutton");
	Thread.sleep(2000);
	
	log.info("Home page is opened");
	
	UtilityClass uc = new UtilityClass(driver);
	uc.screenshot();
	log.info("snap is Taken");
}
	
	
@AfterMethod
	public void teardown()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End of Programme");

		
	}
	
		
}
	
	
	
		
	


    
	
	
	



