package seleniumone;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class testngpractice {
	WebDriver driver;

	@DataProvider(name = "loginData")
	public Object[][] getData() {
	    return new Object[][]{
	        {"user1", "pass1"},
	        {"user2", "pass2"}
	    };
	}
	@Ignore
	@Test(dataProvider = "loginData", priority=1, enabled=true)
	public void loginTest(String username, String password) {
		System.out.println("priority 1");
		System.out.println("I'm inside the Test tag");
	    System.out.println("Logging in with: " + username + " / " + password);
	}
	
	@BeforeMethod
	public void before_method() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void after_method() 
	{
		driver.quit();
	}
	@Test(priority=2)
	public void captureurl() throws InterruptedException
	{
		System.out.println("priority 2");
		driver.navigate().to("https://www.nopcommerce.com/");		
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		
	}
	@Test(priority=3)
	public void capturetitle() throws InterruptedException
	{
		System.out.println("priority 3");
		driver.navigate().to("https://www.orangehrm.com/");		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
	}
	@Test (priority=-4)
	public void captureFacebook() throws InterruptedException
	{
		System.out.println("priority -4");
		driver.navigate().to("https://www.facebook.com/");		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println("inside CaptureFacebook method");
		
	} 
	
	@Test (priority=0)
	public void captureTitleSpiceJet() throws InterruptedException
	{
		System.out.println("priority 0");
		driver.navigate().to("https://www.spicejet.com/");		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
	}
	
}
