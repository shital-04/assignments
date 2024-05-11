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

public class STCTourismHomePage {

	@FindBy(name = "username")
	@CacheLookup
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//form[@name='loginform']/button")
	private WebElement submit;
	
	private WebDriver driver;
	private String url="https://nichethyself.com/tourism/home.html";
	public String pageTitle = "STC Tourism";
	
	
	public STCTourismHomePage() {
		driver = new ChromeDriver();
		driver.get(url);
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
