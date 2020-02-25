package multipleTestmethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	public WebDriver driver;
	@Test(priority = 2)
	public void openbrowser() 
	{
		
		driver=new FirefoxDriver();
		
	}
	@Test(priority = 1,dependsOnMethods = "openbrowser")
	public void enterurl()
	{
		driver.get("https://www.myntra.com");
	}

}
