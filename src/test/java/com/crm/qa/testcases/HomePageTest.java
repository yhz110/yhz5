package com.crm.qa.testcases;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() throws InterruptedException{
		homePage.userLogin();
		Thread.sleep(10000);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
			//String xyz = driver.switchTo().alert().getText();
			//System.out.println("Alert text: "+xyz);
			Thread.sleep(3000);
			//driver.switchTo().alert().accept();
		String afretLoginTitle = driver.getTitle();
		System.out.println("Page title after login is: "+afretLoginTitle);
		//Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
	}
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
}
