package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pom.LogIn;

public class TestLogIn
{
	@Test 
	public void ActiLogin() throws InterruptedException
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LogIn log= new LogIn(driver);
		log.LoginMethod();		
		
	}

}
