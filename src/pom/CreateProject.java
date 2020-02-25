package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProject
{
	@FindBy(id="container_tasks")
	private WebElement ContainertasksLink;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement AddNewLink;
	
	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement NewProjectLink;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement EnterProjectNameTextfield;
	
	@FindBy(xpath = " ( //div[.='  Create Project'])[2]")
	private WebElement CreateProjectLink;
	
	public CreateProject(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);

	}
	public void NewProj() throws InterruptedException
	{
		Thread.sleep(6000);
		ContainertasksLink.click();
		Thread.sleep(4000);
		AddNewLink.click();
		Thread.sleep(4000);
		NewProjectLink.click();
		Thread.sleep(4000);
		EnterProjectNameTextfield.sendKeys("Zomato");
		Thread.sleep(4000);
		
		CreateProjectLink.click();
		Thread.sleep(8000);
	}


}
