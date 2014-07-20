package TestModule3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.BrowsersType;

public class TestMutipleThreads {
	
	private WebDriver driver;
	

	@Test 
	public void visitJD(){		
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver = browser.driver;
		driver.get("http://www.jd.com");

		driver.quit();
	}
	
	
	@Test 
	public void visit51buy(){		
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver = browser.driver;
		driver.get("http://www.51buy.com");
		driver.quit();
		
	}
	

}
