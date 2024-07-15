package PageObjectClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM_BookingConformationPage {


	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[2]")private WebElement ConformBookingMessage;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]")private WebElement sharemail;
	@FindBy(xpath="//div[@class='ModalPopupComponent_modal_close__fOtZP']//*[name()='svg']")private WebElement closePoup;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[4]")private WebElement BookingRefNo;
	@FindBy(xpath="//button[normalize-space()='My Booking']")private WebElement My_Booking;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]")private WebElement BookingRefNoOnManageBooking;
	@FindBy(xpath="//div[@class='theme2_status_type__VF2Nj']")private WebElement ConfirmMesage;



	public POM_BookingConformationPage(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	
	public void ValidateConformBookingMessage() throws InterruptedException
	{
		WebElement message = ConformBookingMessage;
		String mess = message.getText();
		System.out.println("Conformation message is :"+mess);
		
		
	}
	public void sharemail(WebDriver driver) throws InterruptedException
	{
		WebElement element =sharemail;
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		Thread.sleep(10000);
		 
	}
	
	public void closePoup(WebDriver driver) throws InterruptedException
	{
		WebElement element =closePoup;
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		Thread.sleep(10000);
		
		driver.close();
		
		
		 
	}
	
	public void Validatethebooking(WebDriver driver) throws InterruptedException
	{		
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		String text = BookingRefNo.getText();
		System.out.println(text);
		Thread.sleep(100);
		WebElement element =My_Booking;
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");

		element.click();
		Thread.sleep(1000);
		
		String text1 = BookingRefNoOnManageBooking.getText();
		System.out.println(text1);
		Assert.assertEquals(text, text1, "The Confirmation ID is not matching on both pages the Test Case is Failed");
		Thread.sleep(100);

		String TEXT = ConfirmMesage.getText();
		 Assert.assertEquals(TEXT, "CONFIRMED", "We are not gettting mesage as CONFIRMED than Test Case is Failed");
			Thread.sleep(1000);

	}
}
