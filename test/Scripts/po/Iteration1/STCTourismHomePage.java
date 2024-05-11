package Scripts.po.Iteration1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class STCTourismHomePage {

	private WebDriver driver;
	private WebElement username;
	private WebElement password;
	private WebElement submit;
	private String url="https://nichethyself.com/tourism/home.html";
	
	public STCTourismHomePage() {
		driver = new ChromeDriver();
		driver.get(url);
		username = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));
		submit=driver.findElement(By.xpath("//form[@name='loginform']/button"));		
	}
	
	@Test
	  public void Login(String user, String pass){
		  username.sendKeys(user);
		  password.sendKeys(pass);
		  submit.click();		  
	}
	
	@Test
	public void CloseBrowser()
	{
		driver.quit();
	}
			
	@BeforeClass
	  public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }	
	
	@AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
