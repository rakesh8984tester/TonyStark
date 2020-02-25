package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.LogIn;
import pom.Task;

public class TestTask 
{
	@Test 
	public void taskActi() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LogIn log= new LogIn(driver);
		log.LoginMethod();	
		
		Task tk=new Task(driver);
		tk.Newtask();

}
	}
