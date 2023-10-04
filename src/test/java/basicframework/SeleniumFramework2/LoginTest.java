package basicframework.SeleniumFramework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basicframework.pageobjects.LandingPage;

public class LoginTest extends BaseTest{
	public WebDriver driver;
	@Test
	public void testLogin() 
	{
		lp.enterUserEmail("surekhapisale25@gmail.com");
		lp.enterPassword("Surekha@24");
		lp.clickOnSignin();
	}
}
