package testSuites;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.WesHomePage;

public class TestWithPOM {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wes.org/");
		Thread.sleep(2000);
	}
	
	
	@Test
	public void testLogin() {
		
		WesHomePage hp = PageFactory.initElements(driver, WesHomePage.class);
		hp.login("376198935@qq.com", "900812");
		
	}
		
	@AfterClass
	public void quitPage() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
