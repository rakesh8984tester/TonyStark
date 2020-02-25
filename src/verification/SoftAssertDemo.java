package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	@Test
	public void verifyTitle()
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="Rakesh";
		String actualTitle=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle);
		Reporter.log("silu",true);
		sa.assertAll();
		Reporter.log("leema", true);//not be execute because assertall().
		
	}
	@Test
	public void Avenger()
	{
		Reporter.log("Tony Stark", true);
	}

}
