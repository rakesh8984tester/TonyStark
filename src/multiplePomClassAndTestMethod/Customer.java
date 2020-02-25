package multiplePomClassAndTestMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer 
{
	@FindBy(id="container_tasks")
	private WebElement ContainertasksLink;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement AddNewLink;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement CreateNewCustomerLink;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerNameTextfield;
	
	 @FindBy(xpath = "(//div[.='  Create Customer'])[2]")
	 private WebElement CreateCustomerLink;
	 
	 public Customer(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void NameMethod() throws InterruptedException
		{
			 Thread.sleep(6000);
			 ContainertasksLink.click();
			 AddNewLink.click();
			 Thread.sleep(4000);
			 CreateNewCustomerLink.click();
			 Thread.sleep(5000);
			 CustomerNameTextfield.sendKeys("Rakesh Kumar Swain");
			 Thread.sleep(5000);
			 CreateCustomerLink.click();
			 Thread.sleep(10000);
		}


}
