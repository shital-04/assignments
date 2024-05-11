package Scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestYourSetup{

	WebDriver driver;

	@Test
	public void loginToNicheThyselfTourism() {
		driver.get("https://nichethyself.com/tourism/home.html");
	}

	//@Test
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver = new ChromeDriver();
	}

}
