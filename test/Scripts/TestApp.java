package Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

@Test
public class TestApp {
	WebDriver driver;
	
	
  public void LogintoApp() throws InterruptedException {
	   
	 driver.get("https://single-page-application-ui.uopeople.edu/");
	 System.out.println("The titel of the page is" + driver.getTitle());
	 System.out.println("The URL is: " + driver.getCurrentUrl());
	 Thread.sleep(3000);
		
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mangeshtest@test.com");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	 driver.findElement(By.className("login-btn")).click();
	 Thread.sleep(6000);
	 
	 //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/header/div/nav/div[2]/div/div/div/nav[1]/nav[3]/div/div[2]/span")).click();
	 driver.findElement(By.cssSelector("#root > div.MuiStack-root.css-1di8e2t > header > div > nav > div.PrivateHiddenCss-root.PrivateHiddenCss-xsDown.css-1ngybwz > div > div > div > nav:nth-child(2) > nav:nth-child(3) > div > div.MuiListItemText-root.css-gk9o36 > span")).click();
	 
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
