package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	
@Test

public void testing()
{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElementById("email").sendKeys("mentorkmnd");
	driver.findElementById("pass").sendKeys("vaisesika");
	driver.quit();
}




	
	
	
	

}
