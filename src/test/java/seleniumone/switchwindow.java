package seleniumone;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WindowType;  
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {
	
	    public static void main(String[] args) throws InterruptedException {  
	        WebDriver driver = new ChromeDriver();  
	        driver.get("https://facebook.com");  
	        System.out.println(driver.getCurrentUrl());
	        // Open a new window  
	        driver.switchTo().newWindow(WindowType.TAB);  
	        Thread.sleep(3000);
	        // Navigate to a different URL in the new window  
	        driver.get("https://instagram.com");
	        System.out.println(driver.getCurrentUrl());
	        // Switch back to the original window if needed  
	        driver.switchTo().window(driver.getWindowHandles().iterator().next());  	        
	        System.out.println(driver.getCurrentUrl());	        
	        // Clean up  
	        driver.quit();  
	    }  
	

}
