package multiplePomClassAndTestMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test (invocationCount =2)
	public void LoginMultiple() throws InterruptedException
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		ActiLog log= new ActiLog(driver);
		log.LogmultiMethod();		
		
	}
	@Test  (invocationCount =3)
	public void nameInActi() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		ActiLog log= new ActiLog(driver);
		log.LogmultiMethod();;	
		
		 Customer name= new Customer(driver);
		  name.NameMethod();
	}


}
