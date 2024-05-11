package Scripts.po.Iteration3;

import static org.testng.Assert.assertEquals;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OrangeHRMLoginPageITR1 {

	private WebElement username;
	private WebElement password;	
	private WebElement login;	
	private WebDriver driver;
	private String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public String pageTitle = "OrangeHRM";
	
	
	public OrangeHRMLoginPageITR1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		username= driver.findElement(By.name("username"));
		password=driver.findElement(By.name("password"));
		login=driver.findElement(By.xpath("//button[@type='submit']"));
		assertEquals(driver.getTitle(),pageTitle,"Application is not Loaded");
		
	}
	
	@Test
	  public void Login(String user, String pass){
		  username.sendKeys(user);
		  password.sendKeys(pass);
		  login.click();		  
	}
	
	@Test
	public void CloseBrowser()
	{
		driver.quit();
	}

	public Object getTitleAfterLogin() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
}
