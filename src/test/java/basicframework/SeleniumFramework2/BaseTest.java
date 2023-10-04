package basicframework.SeleniumFramework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import basicframework.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public LandingPage lp;
	@BeforeMethod
	public void browserSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		lp = new LandingPage(driver);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
