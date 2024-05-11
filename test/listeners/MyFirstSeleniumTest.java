package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest {
	
	private WebDriver original_driver, driver;//This WebDriver does not fire the events
	   
	MyListener_new myListener1;
    @BeforeMethod
	public void setUp() throws Exception {
        original_driver = new FirefoxDriver(); //This does not fire events 
        myListener1 = new MyListener_new();
        driver = new EventFiringDecorator(myListener1).decorate(original_driver);
    }

	@Test
    public void ListenerTest() {
		
		driver.navigate().to("https://nichethyself.com/tourism/home.html");
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		
		user.click();
		
		driver.quit();
	}

}
