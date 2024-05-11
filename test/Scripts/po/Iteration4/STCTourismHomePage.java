package Scripts.po.Iteration4;

import static org.testng.Assert.assertEquals;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.annotations.Test;

public class STCTourismHomePage extends LoadableComponent<STCTourismHomePage>{

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
		PageFactory.initElements(driver, this);
		get();
	}
	
	@Test
	  public MyAccountPage Login(String user, String pass){
		  username.sendKeys(user);
		  username.clear();
		  username.sendKeys(user);
		  password.sendKeys(pass);
		  submit.click();
		  MyAccountPage myAcc = new MyAccountPage(driver);
		  return myAcc;
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

	public WebDriver getDriver() {
		return driver;
	}
	
	@Override
	protected void isLoaded() throws Error {
		assertEquals(driver.getTitle(),pageTitle,"Application is not Loaded");		
	}

	@Override
	protected void load() {
		driver.get(url);		
	}

	public STCTourismHomePage unSuccessfullLogin(String user, String pass) {
		Login(user, pass);
		driver.switchTo().alert().accept();
		return this;
		
	}
	
	
	public MyAccountPage successfullLogin(String user, String pass) {
		Login(user, pass);		
		MyAccountPage myAcc = new MyAccountPage(driver);
		return myAcc;
	}


}
