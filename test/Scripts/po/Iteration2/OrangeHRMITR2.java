package Scripts.po.Iteration2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRMITR2 {
	
	OrangeHRMLoginPage loginPage;
	String expectedTitle= "OrangeHRM";
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		loginPage = new OrangeHRMLoginPage();
	}
		
	@Test
	  public void OrangeHRMLoginPage() throws InterruptedException {
		loginPage.Login("Admin", "admin123");   
		assertEquals(loginPage.getTitleAfterLogin(), expectedTitle);
	}
	
	@AfterClass
	  public void afterClass() {
		loginPage.CloseBrowser();		 
	  }
}
