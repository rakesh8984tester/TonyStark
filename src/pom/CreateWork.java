package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateWork 
{
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[1]")
	private WebElement SettingButton;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement TypesofworkLink;
	
	@FindBy(id = "ext-gen7")
	private WebElement CreateTypeofworkLink;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement NameTextfield;
	
	@FindBy(xpath = "//select[@name='active']")
	private WebElement statusDropdown;
	
	
	
	@FindBy(xpath = "//input[@id='billingRate_input']")
	private WebElement BillingrateTextfield;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement CreateWorkLink;
	
	public CreateWork(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
	}
	public void TypesOfWork() throws InterruptedException
	{
		Thread.sleep(5000);
		 SettingButton.click();
		 Thread.sleep(8000);
		 TypesofworkLink.click();
		 Thread.sleep(8000);
		 CreateTypeofworkLink.click();
		 Thread.sleep(5000);
		 NameTextfield.sendKeys("Testing2");
		 Thread.sleep(5000);
		 
		 Select sl=new Select(statusDropdown);		 
		 sl.selectByIndex(1);
		 Thread.sleep(6000);
		 
		 BillingrateTextfield.sendKeys("400");
		 Thread.sleep(5000);
		 CreateWorkLink.click();
		
	}
	

}
