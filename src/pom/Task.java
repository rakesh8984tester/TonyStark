package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task 
{
	@FindBy(id="container_tasks")
	private WebElement ContainertasksLink;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement AddNewLink;
	
	@FindBy(xpath = "//div[.='+ New Tasks']")
	private WebElement newtaskbutton;
	
	@FindBy(xpath ="(//div[@class='dropdownButton'])[16]")
	private WebElement dropdown1;
	
	@FindBy(xpath = "(//div[.='Big Bang Company'])[9]")
	private WebElement bigbagcompanyname;
	
	@FindBy(xpath = "(//div[@class='dropdownButton'])[17]")
	private WebElement dropdown2;
	
	@FindBy(xpath = "//div[.='- ALL ACTIVE PROJECTS -']")
	private WebElement allactivename;
	
	@FindBy(xpath = "(//input[@class='inputFieldWithPlaceholder'])[7]")
	private WebElement tasknametextfield;
	
	@FindBy(xpath = "(//div[.='  Create Tasks'])[1]")
	private WebElement createnewtask;
	
	public Task(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
	}
	
	public void Newtask() throws InterruptedException
	{
		Thread.sleep(6000);
		ContainertasksLink.click();
		Thread.sleep(4000);
		AddNewLink.click();
		Thread.sleep(4000);
		newtaskbutton.click();
		Thread.sleep(4000);
		dropdown1.click();
		Thread.sleep(4000);
		bigbagcompanyname.click();
		Thread.sleep(4000);
		dropdown2.click();
		Thread.sleep(4000);
		allactivename.click();
		Thread.sleep(4000);
		tasknametextfield.sendKeys("runtime");
		createnewtask.click();
		
	
	
	}
}
