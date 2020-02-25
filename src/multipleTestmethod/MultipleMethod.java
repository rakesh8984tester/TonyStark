package multipleTestmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import multiplePomClassAndTestMethod.ActiLog;
import multiplePomClassAndTestMethod.Customer;

public class MultipleMethod 
{

	@Test (priority=2)
	public void LoginMultiple() throws InterruptedException
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		ActiLog log= new ActiLog(driver);
		log.LogmultiMethod();		
		
	}
	@Test (priority = 1)
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
