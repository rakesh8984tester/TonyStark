package multiplePomClassAndTestMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer1
{
	 @FindBy(xpath = "(//div[.='Rakesh Kumar Swain']/../..)[2]//div[@class='editButton']")
		private WebElement Editbutton;
		
		@FindBy(xpath = "(//div[.='ACTIONS'])[1]")
		private WebElement ActionLink;
		
		@FindBy(xpath = "(//div[contains(text(),'Delete')])[2]")
		private WebElement DeleteButton;
		
		@FindBy(xpath = "//span[.='Delete permanently']")
		private WebElement PermanentlyDel;
		
		public DeleteCustomer1(WebDriver driver)
		{
			 PageFactory.initElements(driver, this);
		}
		
		public void NewcustomerDelete() throws InterruptedException
		{
			 
			Thread.sleep(5000);
			Editbutton.click();
			Thread.sleep(3000);
			ActionLink.click();
			Thread.sleep(3000);
			DeleteButton.click();
			Thread.sleep(8000);
			PermanentlyDel.click();
			Thread.sleep(3000);
			
			
		}

}
