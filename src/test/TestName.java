package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pom.CreateName;
import pom.LogIn;

public class TestName 
{
	@Test 
	public void Createname() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LogIn log= new LogIn(driver);
		log.LoginMethod();	
		
		 CreateName name= new CreateName(driver);
		  name.CustomerMethod();
	}

}
