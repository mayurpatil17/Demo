package listeners;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(listeners.Listener.class)
public class Demo extends common{
	
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
	}


	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	WebDriver driver;
	@Test
	public void login()  {
		Assert.fail();
	}

}
