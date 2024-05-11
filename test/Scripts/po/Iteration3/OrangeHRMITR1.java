package Scripts.po.Iteration3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRMITR1 {
	
	OrangeHRMLoginPageITR1 loginPage;
	String expectedTitle= "OrangeHRM";
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		loginPage = new OrangeHRMLoginPageITR1();
	}
		
	@Test
	  public void OrangeHRMLoginPageITR1() throws InterruptedException {
		loginPage.Login("Admin", "admin123");   
		assertEquals(loginPage.getTitleAfterLogin(), expectedTitle);
	}
	
	@AfterClass
	  public void afterClass() {
		loginPage.CloseBrowser();		 
	  }
}
