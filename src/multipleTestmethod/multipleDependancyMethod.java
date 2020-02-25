package multipleTestmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import multiplePomClassAndTestMethod.ActiLog;
import multiplePomClassAndTestMethod.Customer;
import multiplePomClassAndTestMethod.DeleteCustomer1;

public class multipleDependancyMethod 
{
	public WebDriver  driver;
	
	@Test 
	public void loginMultiple() throws InterruptedException
	{

		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		ActiLog log= new ActiLog(driver);
		log.LogmultiMethod();		
		
	}
	@Test (dependsOnMethods = "loginMultiple")
	public void customerInActi() throws InterruptedException
	{
	
		 Customer name= new Customer(driver);
		  name.NameMethod();
	}
	
	@Test(dependsOnMethods = {"loginMultiple","customerInActi"})
	public void permntDelete() throws InterruptedException
	{
		
		
		DeleteCustomer1 del=new DeleteCustomer1(driver);
		del.NewcustomerDelete();
	}
	


}
