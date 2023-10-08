package com.saucedemo.Testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01Login extends TestBaseClass
{
@Test
public void veryfyLoginFunctionality()

{
	log.info("apply verification");
	String expectedresult = "Swag Labs";
	String actualresult = driver.getTitle();
	
	Assert.assertEquals(actualresult, expectedresult, actualresult);
}
}
