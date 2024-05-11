package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyTemplateTestNGClass {

	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }

	
	@Test
	  public void LogintoNicheTourism() throws InterruptedException {
		  driver.get("");
		  
		  
	}
	
	@AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
