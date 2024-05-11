package Scripts.po.Iteration2;

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

public class OrangeHRMLoginPage {

	@FindBy(name = "username")
	@CacheLookup
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement submit;
	
	private WebDriver driver;
	private String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public String pageTitle = "OrangeHRM";
	
	
	public OrangeHRMLoginPage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		assertEquals(driver.getTitle(),pageTitle,"Application is not Loaded");
		PageFactory.initElements(driver, this);
	}
	
	@Test
	  public void Login(String user, String pass){
		  username.sendKeys(user);
		  username.clear();
		  username.sendKeys(user);
		  password.sendKeys(pass);
		  submit.click();		  
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
