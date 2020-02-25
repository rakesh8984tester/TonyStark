package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitle 
{
	@Test
	public void verify()
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		 
		String expectedTitle="Rakesh";//driver.getTitle();
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Rakesh",true);
	}

}
