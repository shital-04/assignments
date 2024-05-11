package Scripts.po.Iteration1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNgTestBeforePO {
	WebDriver driver;
	
	@Test
	public void GoogleTest() {
		driver.get("http://www.google.com");
		
	}
	
  @Test
  public void LogintoNicheTourism() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/home.html");
	    WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		
		user.submit();
		
		String expectedPageTitleAfterLogin="My account";
		Thread.sleep(3000);
		String actualPageTitleAfterLogin=driver.getTitle();
		
		/*
		 * if(expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {
		 * 
		 * System.out.println("Login successful"); }else {
		 * System.out.println(actualPageTitleAfterLogin);
		 * System.out.println("Login failed"); }
		 */
		//assertEquals(actualPageTitleAfterLogin,expectedPageTitleAfterLogin );
		assertEquals(actualPageTitleAfterLogin,expectedPageTitleAfterLogin, "Seems the page title is not Correct. May be the login was not successful" );
	  
  }
  @BeforeMethod
  public void beforeMethod() { 
	  
		
		
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() {
	//driver = new ChromeDriver();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
