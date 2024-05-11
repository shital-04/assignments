package Scripts.po.Iteration4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MyAccountPage extends LoadableComponent<MyAccountPage> {
	
	
	@FindBy(xpath = "//a[@href='home.html']")
	private WebElement signOut;
	
	@FindBy(xpath = "//button[text()='Contact us!']")
	private WebElement contactUs;
	
	private WebDriver driver;
	private String pageTitle = "My account";
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		}
	
	public STCTourismHomePage SignOut() {	
		signOut.click();
		return new STCTourismHomePage();
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertEquals(driver.getTitle(),pageTitle, "My Account page not loaded");
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		//Empty as the page is loaded automatically after successful login.
	}

}
