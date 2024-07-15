package PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_prodpaymentpage {

	@FindBy(id="creditCardNumber")private WebElement passcreditCardNumber;
	@FindBy(xpath="//select[@id='expiryMonthCreditCard']")private WebElement selctmonth;
	@FindBy(id="expiryYearCreditCard")private WebElement selctyear;
	@FindBy(id="CVVNumberCreditCard")private WebElement PassCvv;
	@FindBy(xpath="//a[@id='SubmitBillShip']")private WebElement Makepayement;
	@FindBy(xpath="//a[@title='Cancel Transaction']")private WebElement cancelpayment;
	@FindBy(xpath="//input[@id='orderBillAddress']")private WebElement AddAdress;
	@FindBy(xpath="//input[@id='orderBillCity']")private WebElement City;
	@FindBy(xpath="//select[@id='orderBillCountry']")private WebElement Country;
	@FindBy(xpath="//input[@type='submit']")private WebElement Submit;







	 
	 
	  
	public POM_prodpaymentpage(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	public void AddAdress(WebDriver driver) throws InterruptedException
	{	
 
		AddAdress.sendKeys("Pune");
		Thread.sleep(100);	
		City.sendKeys("Pune");
		Thread.sleep(100);	
		Thread.sleep(500);
		Country.sendKeys("india");
		Thread.sleep(100);
		Country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(100);
		Country.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	 		
	}
	
	public void passCreditCardNumber(WebDriver driver) throws InterruptedException
	{	
 
		passcreditCardNumber.sendKeys("4242424242424242");
		Thread.sleep(1000);	

	 		
	}
	
	public void selectMonth(WebDriver driver) throws InterruptedException
	{	
 
		  Select select = new Select(selctmonth);
		  //select.selectByIndex(01);
		  select.selectByValue("01");
		  //select.selectByVisibleText("OptionText");
			Thread.sleep(1000);	

	 		
	}
	
	public void selectYear(WebDriver driver) throws InterruptedException
	{	
 
		  Select select = new Select(selctyear);
		  //select.selectByIndex(01);
		  select.selectByValue("2030");
		  //select.selectByVisibleText("OptionText");
			Thread.sleep(1000);	

	 		
	}
	
	public void passCvv(WebDriver driver) throws InterruptedException
	{	
 
		PassCvv.sendKeys("100");
		Thread.sleep(1000);	

	 		
	}
	
	public void makepayement(WebDriver driver) throws InterruptedException
	{	
 
		Makepayement.click();
		Thread.sleep(1000);	

	 		
	}
	
	
	public void ClickOnSubmit(WebDriver driver) throws InterruptedException
	{	
		 WebElement iframeElement = driver.findElement(By.id("redirectTo3ds1Frame"));

	        driver.switchTo().frame(iframeElement);
			Thread.sleep(1000);	

		Submit.click();
		Thread.sleep(10000);	

	 		
	}
}
