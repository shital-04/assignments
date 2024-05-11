package Scripts.po.Iteration3;

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
	private By username = By.name("username");
	private By password = By.name("password");
	private By submit = By.xpath("//form[@name='loginform']/button");
	private String url="https://nichethyself.com/tourism/home.html";
	
	public STCTourismHomePage() {
		driver = new ChromeDriver();
		driver.get(url);
			
	}
	
	@Test
	  public void Login(String user, String pass){
		  driver.findElement(username).sendKeys(user);
		  driver.findElement(password).sendKeys(pass);
		  driver.findElement(submit).click();		  
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
