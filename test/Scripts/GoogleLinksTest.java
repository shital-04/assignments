package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleLinksTest {
	
	
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }

	
	@Test
	  public void LogintoNicheTourism() throws InterruptedException {
		  driver.get("http://www.google.com");
		  List<WebElement> allGoogleLinks = driver.findElements(By.xpath("//a"));
		  System.out.println("Total links on Google.com are- " +allGoogleLinks.size());
		  
		  for(WebElement oneElement:allGoogleLinks) {
			  
			  System.out.println(oneElement.getText() + " " +oneElement.getAttribute("href"));
		  }
	}
	
	@AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
