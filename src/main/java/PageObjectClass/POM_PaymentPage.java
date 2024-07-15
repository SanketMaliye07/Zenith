package PageObjectClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_PaymentPage {

	@FindBy(xpath="//button[@method='netbanking']")private WebElement selectNetBank;
	@FindBy(xpath="(//div[@id='bank-item-HDFC'])")private WebElement clickOnBank;
	@FindBy(xpath="//button[@id='redesign-v15-cta']")private WebElement PayNow;
	@FindBy(xpath="//button[@class='success']")private WebElement success;



	public POM_PaymentPage(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	
	public void Forpaymnet(WebDriver driver) throws InterruptedException
	{
		
		  
		
		
		
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
        
        driver.switchTo().frame(iframeElement);
		Thread.sleep(200);

        
		selectNetBank.click();
		Thread.sleep(200);
		
		clickOnBank.click();
		Thread.sleep(200);
		
		PayNow.click();

		Thread.sleep(1000);

	     
	     Set<String> handel = driver.getWindowHandles();
	     
	     Iterator<String> it = handel.iterator();
	     
	     String parantwindow = it.next();
	     String childwindow = it.next();
	     System.out.println("parantwindow :"+parantwindow+"childwindow"+childwindow);
	     driver.switchTo().window(childwindow);
	
	     Thread.sleep(500);
		success.click();	
		Thread.sleep(5000);

		
		
	}
	
	
	
	
}
