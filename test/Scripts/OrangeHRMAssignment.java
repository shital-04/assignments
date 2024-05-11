package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

@Test
public class OrangeHRMAssignment {
	
	WebDriver driver;
	
	@BeforeClass
	public void BeforeClass() {
	
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
		public void OrangeHRMTest() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		user.submit();
		
		String expectedPageTitleAfterLogin="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String actualPageTitleAfterLogin=driver.getTitle();
		
		if(expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {
			
			System.out.println("Login successful");
		}else {
			System.out.println(actualPageTitleAfterLogin);
			System.out.println("Login failed");
		}
		}
		@AfterClass
		public void afterClass() {
			  driver.quit();
		  }
		
	}
