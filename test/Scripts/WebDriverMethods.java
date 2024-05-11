package Scripts;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverMethods {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }

	
	@Test
	  public void LogintoNicheTourism() throws InterruptedException {
		  driver.get("https://nichethyself.com/tourism/home.html");
		  Thread.sleep(3000);
		  driver.navigate().to("http://www.google.com");
		  Thread.sleep(3000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  String currentURL = driver.getCurrentUrl();
		  Thread.sleep(3000);
		  System.out.println(currentURL);
		  Thread.sleep(3000);
		  assertEquals(driver.getCurrentUrl(), "https://nichethyself.com/tourism/home.html");
	}
	
	@AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	
	
}
