package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethodes;

import java.time.Duration;
import java.util.List;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;


public class POM_ReviewPage {
    
	@FindBy(css="img[alt='selectreview']")private WebElement selectreview;
	@FindBy(xpath="(//div[@class='theme5_travel_toggle_click__bCOJx'])[1]")private WebElement TravlerDetailes;

	@FindBy(xpath="(//div//ul//li)[13]")private WebElement AddAdult1;
	@FindBy(xpath="(//div//ul//li)[14]")private WebElement AddAdult2;
	@FindBy(xpath="(//div//ul//li)[15]")private WebElement AddAdult3;
	@FindBy(xpath="(//div//ul//li)[16]")private WebElement AddAdult4;
	@FindBy(xpath="(//div//ul//li)[17]")private WebElement AddAdult5;

	
	@FindBy(xpath="(//div[@class='theme5_trav_barup1_click__0Sx_b'])[1]")private WebElement Closereview;
	
	@FindBy(xpath ="//div[@class='theme5_left_travller_section__DiwTG']//div[3]//span[1]")private WebElement childreview;
	@FindBy(css ="img[alt='selectreview']")private WebElement selectreviewchild;
	@FindBy(xpath="(//div//ul//li)[13]")private WebElement AddChild1;
	@FindBy(xpath="(//div//ul//li)[14]")private WebElement AddChild2;
	@FindBy(xpath="(//div//ul//li)[15]")private WebElement AddChild3;
	@FindBy(xpath="(//div//ul//li)[16]")private WebElement AddChild4;
	@FindBy(xpath="(//div//ul//li)[17]")private WebElement AddChild5;

	
	@FindBy(xpath ="//a[normalize-space()='+ Infant']")private WebElement Infantreview;
	@FindBy(xpath ="//img[@alt='selectreview']")private WebElement selectreviewInfant;
	@FindBy(xpath="(//div//ul//li)[12]")private WebElement AddInfent1;
	@FindBy(xpath="(//div//ul//li)[13]")private WebElement AddInfent2;
	@FindBy(xpath="(//div//ul//li)[14]")private WebElement AddInfent3;
	@FindBy(xpath="(//div//ul//li)[15]")private WebElement AddInfent4;
	@FindBy(xpath="(//div//ul//li)[16]")private WebElement AddInfent5;

	
	
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[2]")private WebElement OpenBoxForAdult2;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[3]")private WebElement OpenBoxForAdult3;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[4]")private WebElement OpenBoxForAdult4;


	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[4]")private WebElement OpenBoxchild1;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[5]")private WebElement OpenBoxchild2;

	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[5]")private WebElement Child1select1;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[6]")private WebElement Child1select2;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[7]")private WebElement Child1select3;


	
	
	
	
	
	
	
	

	@FindBy(xpath="(//button[normalize-space()='Continue Booking'])[1]")private WebElement ContinueBooking;
	
	@FindBy(linkText = "Add Meals")private WebElement Add_Meals;
	@FindBy(linkText = "Add Baggage")private WebElement Add_Baggage;

	
	
	
	
	
	
	
	
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[6]")private WebElement selectAdult2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[11]")private WebElement selectAdult3;
	@FindBy(xpath="//div[11]//div[2]//button[1]")private WebElement morepassbutton;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[16]")private WebElement selectAdult4;
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[5]")private WebElement select1child;

	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[13]")private WebElement selectchild;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[18]")private WebElement selectchild1;
	
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[20]")private WebElement selectchild2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[25]")private WebElement selectchild3;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[30]")private WebElement selectchild4;
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[9]")private WebElement selectchild5th1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[14]")private WebElement selectchild5th2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[19]")private WebElement selectchild5th3;
	@FindBy(xpath="(//button[contains(text(),'View 2 More Travellers')])[4]")private WebElement morechild5th1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[24]")private WebElement selectchild5th4;
	@FindBy(xpath="(//button[contains(text(),'View 2 More Travellers')])[4]")private WebElement morechild5th2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[31]")private WebElement selectchild5th5;
	

	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[9]")private WebElement selectInfent;
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[21]")private WebElement select1Infent;
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[32]")private WebElement selectInfent1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[37]")private WebElement selectInfent2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[42]")private WebElement selectInfent3;
	@FindBy(xpath="(//button[contains(text(),'View 1 More Travellers')])[4]")private WebElement morepassbutton1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[47]")private WebElement selectInfent4;
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[33]")private WebElement selectInfent2nd1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[38]")private WebElement selectInfent2nd2;
	
	
	@FindBy(xpath="//button[@class='theme2_book_now_continue_btn__AmQux']")private WebElement Clickcontinue;
	@FindBy(name="Continue Booking")private WebElement continuebooking2;
	@FindBy(className="theme2_ax_checkmark__ksVgf")private WebElement checkmark;
	@FindBy(className="theme2_proceed_to_payment_btn__DbC7G")private WebElement ProceedPayment;
	
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[1]")private WebElement select5Adult1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[6]")private WebElement select5Adult2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[11]")private WebElement select5Adult3;
	@FindBy(xpath="(//button[contains(text(),'View 3 More Travellers')])[4]")private WebElement more5adultes1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[16]")private WebElement select5Adult4;
	@FindBy(xpath="(//button[contains(text(),'View 3 More Travellers')])[4]")private WebElement more5adultes2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[24]")private WebElement select5Adult5;
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[27]")private WebElement select4child1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[32]")private WebElement select4child2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[37]")private WebElement select4child3;
	@FindBy(xpath="(//button[contains(text(),'View 2 More Travellers')])[4]")private WebElement more4child1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[42]")private WebElement select4child4;
	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[45]")private WebElement select4Infent1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[50]")private WebElement select4Infent2;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[55]")private WebElement select4Infent3;
	@FindBy(xpath="(//button[contains(text(),'View 1 More Travellers')])[4]")private WebElement more4infent1;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__ksVgf'])[60]")private WebElement select4Infent4;
	
	@FindBy(css="#title_0")private WebElement Title;
	@FindBy(xpath="//input[@id='firstName']")private WebElement firstName;
	@FindBy(xpath="//input[@id='lastName']")private WebElement lastName;
	@FindBy(xpath="//input[@id='countryISDInput']")private WebElement countryISDInput;
	@FindBy(xpath="//input[@id='phoneNumber']")private WebElement phoneNumber;
	@FindBy(xpath="//input[@id='emailId']")private WebElement emailId;
	
	
	

	
	
	@FindBy(xpath="(//p[@id='title'])[1]")private WebElement Mr;
	@FindBy(xpath="//div[normalize-space()='Mrs']")private WebElement Mrs;
	@FindBy(xpath="//div[normalize-space()='Miss']")private WebElement Miss;
	@FindBy(xpath="//div[@aria-label='Choose Sunday, July 1st, 2012']")private WebElement SelectDateOfBirth;
	@FindBy(xpath="//div[@aria-label='Choose Friday, January 31st, 2025']")private WebElement selectPassportExpiryDate;
	@FindBy(xpath="//div[@class='theme5_alertbutton__z0E3L']")private WebElement AlertPopup;

	@FindBy(xpath="(//input[@value='Title*'])[1]")private WebElement ClickTitle;
	@FindBy(xpath="//div[@class='theme5_divider_sec__Bbxdr theme5_select_travel_div__di_SA']//p[1]")private WebElement MR;
	@FindBy(xpath="//input[@id='firstName']")private WebElement firstName_Adult;
	@FindBy(xpath="//input[@id='lastName']")private WebElement lastName_Adult;
	@FindBy(xpath="//input[@id='phoneNumber']")private WebElement PhoneNumber;
	@FindBy(xpath="//input[@id='emailId']")private WebElement EmailId;

	
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[2]")private WebElement Adult2;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[3]")private WebElement Adult3;

	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[4]")private WebElement Child1;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[5]")private WebElement Child2;

	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[6]")private WebElement Infent1;
	
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[7]")private WebElement Infent2;
	
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[8]")private WebElement Infent3;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[9]")private WebElement Infent4;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[10]")private WebElement Infent5;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[11]")private WebElement Infent6;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[12]")private WebElement Infent7;
	@FindBy(xpath="(//div[@class='theme5_trav_barup1__kOvgm'])[13]")private WebElement Infent8;



	@FindBy(xpath="//input[@id='passportNumber']")private WebElement passportNumber;
	@FindBy(xpath="//input[@id='nationalityname']")private WebElement nationalityname;	
	@FindBy(xpath="//button[normalize-space()='Date Of Birth (dd/mm/yyy)*']")private WebElement DateOfBirth;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")private WebElement selectDateOfBirth;
	
	@FindBy(xpath="//button[normalize-space()='DD/MM/YYYY']")private WebElement PassportExpiryDate;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[4]/div[5]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[7]")private WebElement SelectPassportExpiryDate;

	@FindBy(xpath="(//input[@id='passport_issuing_country'])")private WebElement passport_issuing_country;
	@FindBy(xpath="(//li[@id='passport_country'])[2]")private WebElement passport_country;








	
	
 
 
  
	public POM_ReviewPage(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	
	public void SelectTitle(WebDriver driver) throws InterruptedException
	{
		 WebElement element1= Clickcontinue;
	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	     Thread.sleep(500);
	     element1.click();
	Thread.sleep(500);	
	Title.click();
	Thread.sleep(100);
	Title.click();
	Thread.sleep(100);
	Mr.click();
	Thread.sleep(100);
	}
	
	public void SelectfirstName(WebDriver driver) throws InterruptedException
	{
		firstName.sendKeys("Digambar");
		Thread.sleep(100);

	}
	
	
	public void SelectlastName(WebDriver driver) throws InterruptedException
	{
		lastName.sendKeys("karande");
		Thread.sleep(100);

	}
	
	public void SelectcountryISDInput(WebDriver driver) throws InterruptedException
	{
		countryISDInput.sendKeys("91");
		Thread.sleep(100);
		Thread.sleep(100);
		countryISDInput.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(100);
		countryISDInput.sendKeys(Keys.ENTER);
		Thread.sleep(500);

	}
	
	public void SelectphoneNumber(WebDriver driver) throws InterruptedException
	{
		phoneNumber.sendKeys("7349127399");
		Thread.sleep(500);


	}
	
	public void SelectemailId(WebDriver driver) throws InterruptedException
	{
		emailId.sendKeys("digambar@vernost.in");
		

	}
	
	public void SelectpassportNumber(WebDriver driver) throws InterruptedException
	{
		passportNumber.sendKeys("fnhwshfoiuqwjh098uj2083urti");
		

	}
	
	public void Selectnationalityname(WebDriver driver) throws InterruptedException
	{
		nationalityname.sendKeys("India");
		Thread.sleep(100);
		Thread.sleep(100);
		nationalityname.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(100);
		nationalityname.sendKeys(Keys.ENTER);
		Thread.sleep(500);		

	}
	
	public void SelectDateOfBirth(WebDriver driver) throws InterruptedException
	{
		DateOfBirth.click();
		Thread.sleep(100);
		SelectDateOfBirth.click();
		Thread.sleep(100);

	}
	
	public void SelectPassportExpiryDate(WebDriver driver) throws InterruptedException
	{
		PassportExpiryDate.click();
		Thread.sleep(100);
		selectPassportExpiryDate.click();
		Thread.sleep(500);
		

	}
	
	
public void SelectPassangerDynamicData(WebDriver driver,String AdultString,String childString,String InfentString) throws InterruptedException
	
	{
  	  
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='theme5_modal_content__bY8HC'])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue Booking')])[2]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		   
	     Thread.sleep(100);
	    
		     Thread.sleep(100);     
		 	WebElement element =Closereview;
	   	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		     Thread.sleep(500);
	   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
		     Thread.sleep(500);
		     element.click();
		     Thread.sleep(500);     			
     
	 List<WebElement> numberOfAdults = driver.findElements(By.xpath("(//div[@class='theme5_trav_barup1__kOvgm'])"));

    System.out.println("Total Number of Adults: " + numberOfAdults.size());
    int countAdult = 1;
    int countChild = 1;
    int countInfant = 0;
 for (int i = 0; i <numberOfAdults.size(); i++) 
 {
	 
	    CommonMethodes.scrollUp2(driver);
	    Thread.sleep(300);
    WebElement webElement = numberOfAdults.get(i);
    webElement.click();
    String travelerType = webElement.getText();
    System.out.println("The Adult number is :"+webElement.getText());
    Thread.sleep(300);
    
    CommonMethodes.scrollUp2(driver);
    Thread.sleep(300);

    WebElement selectAdult = driver.findElement(By.xpath("(//div[@class='theme5_saved_travFlx__O2V77'])"));
    selectAdult.click();
    Thread.sleep(300);

    List<WebElement> travelerOptions = driver.findElements(By.xpath("(//div//ul)[6]//li"));
  

    
    if (travelerType.contains("+ Adult")) {
        WebElement adultOption = travelerOptions.get(countAdult++);
        adultOption.click();
    } else if (travelerType.contains("+ Child")) {
        WebElement childOption = travelerOptions.get(countChild++);
        childOption.click();
    } else if (travelerType.contains("+ Infant")) {
        WebElement infantOption = travelerOptions.get(countInfant++);
        infantOption.click();
    }
  
    
    webElement.click();
    Thread.sleep(300);

}

}
		
public void SelectPassangerWithoutLogin(WebDriver driver,String AdultString,String childString,String InfentString,String Flight) throws InterruptedException
	
	{
  	  

	  
	   try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='theme5_modal_content__bY8HC'])[1]")));

	            popup.findElement(By.xpath("(//button[contains(text(),'Continue Booking')])[2]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Pop-up not present");
	        }
	   
  Thread.sleep(100);
 
	     Thread.sleep(100);     
	 	WebElement element =Closereview;
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	     Thread.sleep(500);
	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(500);     			

List<WebElement> numberOfAdults = driver.findElements(By.xpath("(//div[@class='theme5_trav_barup1__kOvgm'])"));

System.out.println("Total Number of Adults: " + numberOfAdults.size());
int countAdult = 1;
int countChild = 1;
int countInfant = 0;
for (int i = 0; i <numberOfAdults.size(); i++) 
{

 CommonMethodes.scrollUp2(driver);
 Thread.sleep(300);
WebElement webElement = numberOfAdults.get(i);
webElement.click();
String travelerType = webElement.getText();
System.out.println("The Adult number is :"+webElement.getText());
Thread.sleep(300);

CommonMethodes.scrollUp2(driver);
Thread.sleep(300);


if(Flight.contentEquals("Domestic")) {
ClickTitle.click();
Thread.sleep(100);
MR.click();
Thread.sleep(100);
firstName_Adult.sendKeys("Digambar");
Thread.sleep(100);
lastName_Adult.sendKeys("Karande");
Thread.sleep(100);}
else{
	ClickTitle.click();
	Thread.sleep(100);
	MR.click();
	Thread.sleep(100);
	firstName_Adult.sendKeys("Digambar");
	Thread.sleep(100);
	lastName_Adult.sendKeys("Karande");
	Thread.sleep(100);
	passportNumber.sendKeys("vsgqstfqt6567");
	Thread.sleep(100);
	nationalityname.sendKeys("Indian");
	Thread.sleep(200);
	DateOfBirth.click();
	Thread.sleep(200);
	selectDateOfBirth.click();
	Thread.sleep(200);
	PassportExpiryDate.click();
	Thread.sleep(200);
	SelectPassportExpiryDate.click();
	Thread.sleep(200);
	passport_issuing_country.sendKeys("India");
	Thread.sleep(200);
	passport_country.click();
	Thread.sleep(1000);


	
	
}





webElement.click();
Thread.sleep(300);

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	     try {
//	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='theme5_modal_content__bY8HC'])[1]")));
//
//	            popup.findElement(By.xpath("(//button[contains(text(),'Continue Booking')])[2]")).click();
//	            
//	        } catch (Exception e) {
//	            System.out.println("Pop-up not present");
//	        }
//		
//		String stringadult =AdultString;
//		Integer adult = Integer.valueOf(stringadult);
//		
//		String stringchild = childString;
//		Integer Child = Integer.valueOf(stringchild);
//		
//		String stringinfent=InfentString;
//		Integer Infent = Integer.valueOf(stringinfent);
//		Thread.sleep(500);
//		if(adult==1||Child==1||Infent==1)
//		{
//		     Thread.sleep(1000);
//
//			CommonMethodes.scrollDown(driver);
//		     Thread.sleep(100);
//
//			WebElement element = ClickTitle;
//	  	    //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
//		     Thread.sleep(100);
//
//	   	 element.click();
//		     Thread.sleep(100);
//		     MR.click();
//		     Thread.sleep(100);
//		     firstName_Adult.sendKeys("Digambar");
//		     Thread.sleep(100);
//		     lastName_Adult.sendKeys("Karande");
//		     Thread.sleep(100);
//		 	Closereview.click();
//		     Thread.sleep(500);
//				     
//		  	 	WebElement element1 = childreview;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element1.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Omkar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//		  		childreview.click();
//		  	     Thread.sleep(500);
//		  	     
//		  		
//		  	     WebElement element2 = Infantreview;
//		  		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//
//		  		     Thread.sleep(100);
//		  		     element2.click();
//		  	     Thread.sleep(500);
//		    	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)", "");
//		    	    ClickTitle.click();
//				     Thread.sleep(100);
//				     MR.click();
//				     Thread.sleep(100);
//				     firstName_Adult.sendKeys("Ladu");
//				     Thread.sleep(100);
//				     lastName_Adult.sendKeys("Karande");
//				     Thread.sleep(100);
//
//		  		Infantreview.click();
//		  	     Thread.sleep(500);
//
//		}
//		else  if(adult==3||Child==2||Infent==1){
//			
//		     Thread.sleep(1000);
//
//			CommonMethodes.scrollDown(driver);
//		     Thread.sleep(500);
//
//			WebElement element = ClickTitle;
//	  	    //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
//		     Thread.sleep(100);
//	   	 element.click();
//		     Thread.sleep(100);
//		     MR.click();
//		     Thread.sleep(100);
//		     firstName_Adult.sendKeys("Digambar");
//		     Thread.sleep(100);
//		     lastName_Adult.sendKeys("Karande");
//		     Thread.sleep(100);
//		 	Closereview.click();
//		     Thread.sleep(500);
//		       
//			 	WebElement element1 = Adult2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element1.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult2.click();
//		  	     Thread.sleep(500);
//		     
//		  		WebElement element2 = Adult3;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element2.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult3.click();
//		  	     Thread.sleep(500);    
//		  	   
//		  		WebElement element3 = Child1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element3.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Aatherv");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child1.click();
//		  	     Thread.sleep(500);
//		  	     
//		  		WebElement element4 = Child2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element4.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Rajkumar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child2.click();
//		  	     Thread.sleep(500);
//		  	   
//		  	   
//		  	 WebElement element5 = Infent1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element4.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Mahesh");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Infent1.click();
//		  	     Thread.sleep(500);
//		  	     
//		}
//		else if(adult==4||Child==3||Infent==4){ 
//			Thread.sleep(1000);
//
//			CommonMethodes.scrollDown(driver);
//		     Thread.sleep(500);
//
//			WebElement element = ClickTitle;
//	  	    //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
//		     Thread.sleep(100);
//	   	 element.click();
//		     Thread.sleep(100);
//		     MR.click();
//		     Thread.sleep(100);
//		     firstName_Adult.sendKeys("Digambar");
//		     Thread.sleep(100);
//		     lastName_Adult.sendKeys("Karande");
//		     Thread.sleep(100);
//		 	Closereview.click();
//		     Thread.sleep(500);
//		       
//			 	WebElement element1 = Adult2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element1.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult2.click();
//		  	     Thread.sleep(500);
//		     
//		  		WebElement element2 = Adult3;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element2.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult3.click();
//		  	     Thread.sleep(500);    
//		  	   
//		  		WebElement element3 = Child1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element3.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Aatherv");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child1.click();
//		  	     Thread.sleep(500);
//		  	     
//		  		WebElement element4 = Child2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element4.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Rajkumar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child2.click();
//		  	     Thread.sleep(500);
//		  	   
//		  	   
//		  	 WebElement element5 = Infent1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element5.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Mahesh");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Infent1.click();
//		  	     Thread.sleep(500);
//		  	    
//		  		 WebElement element6 = Infent2;
//			  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//			  	     Thread.sleep(100);
//			  	     element6.click();
//			  	     Thread.sleep(500);
//			   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//			  	     Thread.sleep(100);
//			  	     ClickTitle.click();
//				     Thread.sleep(100);
//				     MR.click();
//				     Thread.sleep(100);
//				     firstName_Adult.sendKeys("APPA");
//				     Thread.sleep(100);
//				     lastName_Adult.sendKeys("Karande");
//				     Thread.sleep(100);
//				     Infent2.click();
//			  	     Thread.sleep(500);
//			  	     
//			  		 WebElement element7 = Infent3;
//				  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//				  	     Thread.sleep(100);
//				  	     element7.click();
//				  	     Thread.sleep(500);
//				   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//				  	     Thread.sleep(100);
//				  	     ClickTitle.click();
//					     Thread.sleep(100);
//					     MR.click();
//					     Thread.sleep(100);
//					     firstName_Adult.sendKeys("Mahesh");
//					     Thread.sleep(100);
//					     lastName_Adult.sendKeys("Karande");
//					     Thread.sleep(100);
//					     Infent3.click();
//				  	     Thread.sleep(500);
//				  	     
//				  		 WebElement element8 = Infent4;
//					  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//					  	     Thread.sleep(100);
//					  	     element8.click();
//					  	     Thread.sleep(500);
//					   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//					  	     Thread.sleep(100);
//					  	     ClickTitle.click();
//						     Thread.sleep(100);
//						     MR.click();
//						     Thread.sleep(100);
//						     firstName_Adult.sendKeys("Mahesh");
//						     Thread.sleep(100);
//						     lastName_Adult.sendKeys("Karande");
//						     Thread.sleep(100);
//						     Infent4.click();
//					  	     Thread.sleep(500);
//					  	     
//					  		 WebElement element9 = Infent5;
//						  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//						  	     Thread.sleep(100);
//						  	     element9.click();
//						  	     Thread.sleep(500);
//						   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//						  	     Thread.sleep(100);
//						  	     ClickTitle.click();
//							     Thread.sleep(100);
//							     MR.click();
//							     Thread.sleep(100);
//							     firstName_Adult.sendKeys("Mahesh");
//							     Thread.sleep(100);
//							     lastName_Adult.sendKeys("Karande");
//							     Thread.sleep(100);
//							     Infent5.click();
//						  	     Thread.sleep(1000);
//		  	     
//						  		 WebElement element10 = Infent6;
//							  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//							  	     Thread.sleep(100);
//							  	     element10.click();
//							  	     Thread.sleep(500);
//							   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//							  	     Thread.sleep(100);
//							  	     ClickTitle.click();
//								     Thread.sleep(100);
//								     MR.click();
//								     Thread.sleep(100);
//								     firstName_Adult.sendKeys("Mahesh");
//								     Thread.sleep(100);
//								     lastName_Adult.sendKeys("Karande");
//								     Thread.sleep(100);
//								     Infent6.click();
//							  	     Thread.sleep(1000); 
//	    }
//		else if(adult==2||Child==5||Infent==2){  
//			Thread.sleep(1000);
//
//			CommonMethodes.scrollDown(driver);
//		     Thread.sleep(500);
//
//			WebElement element = ClickTitle;
//	  	    //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
//		     Thread.sleep(100);
//	   	 element.click();
//		     Thread.sleep(100);
//		     MR.click();
//		     Thread.sleep(100);
//		     firstName_Adult.sendKeys("Digambar");
//		     Thread.sleep(100);
//		     lastName_Adult.sendKeys("Karande");
//		     Thread.sleep(100);
//		 	Closereview.click();
//		     Thread.sleep(500);
//		       
//			 	WebElement element1 = Adult2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element1.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult2.click();
//		  	     Thread.sleep(500);
//		     
//		  		WebElement element2 = Adult3;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element2.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult3.click();
//		  	     Thread.sleep(500);    
//		  	   
//		  		WebElement element3 = Child1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element3.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Aatherv");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child1.click();
//		  	     Thread.sleep(500);
//		  	     
//		  		WebElement element4 = Child2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element4.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Rajkumar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child2.click();
//		  	     Thread.sleep(500);
//		  	   
//		  	   
//		  	 WebElement element5 = Infent1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element5.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Mahesh");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Infent1.click();
//		  	     Thread.sleep(500);
//		  	    
//		  		 WebElement element6 = Infent2;
//			  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//			  	     Thread.sleep(100);
//			  	     element6.click();
//			  	     Thread.sleep(500);
//			   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//			  	     Thread.sleep(100);
//			  	     ClickTitle.click();
//				     Thread.sleep(100);
//				     MR.click();
//				     Thread.sleep(100);
//				     firstName_Adult.sendKeys("APPA");
//				     Thread.sleep(100);
//				     lastName_Adult.sendKeys("Karande");
//				     Thread.sleep(100);
//				     Infent2.click();
//			  	     Thread.sleep(500);
//			  	     
//			  		 WebElement element7 = Infent3;
//				  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//				  	     Thread.sleep(100);
//				  	     element7.click();
//				  	     Thread.sleep(500);
//				   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//				  	     Thread.sleep(100);
//				  	     ClickTitle.click();
//					     Thread.sleep(100);
//					     MR.click();
//					     Thread.sleep(100);
//					     firstName_Adult.sendKeys("Mahesh");
//					     Thread.sleep(100);
//					     lastName_Adult.sendKeys("Karande");
//					     Thread.sleep(100);
//					     Infent3.click();
//				  	     Thread.sleep(500);
//				  	     
//				  	   WebElement element8 = Infent4;
//				  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//				  	     Thread.sleep(100);
//				  	     element8.click();
//				  	     Thread.sleep(500);
//				   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//				  	     Thread.sleep(100);
//				  	     ClickTitle.click();
//					     Thread.sleep(100);
//					     MR.click();
//					     Thread.sleep(100);
//					     firstName_Adult.sendKeys("Mahesh");
//					     Thread.sleep(100);
//					     lastName_Adult.sendKeys("Karande");
//					     Thread.sleep(100);
//					     Infent4.click();
//				  	     Thread.sleep(1000);
//		}
//		else if(adult==5||Child==4||Infent==4){
//			Thread.sleep(1000);
//
//			CommonMethodes.scrollDown(driver);
//		     Thread.sleep(500);
//
//			WebElement element = ClickTitle;
//	  	    //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
//		     Thread.sleep(100);
//	   	 element.click();
//		     Thread.sleep(100);
//		     MR.click();
//		     Thread.sleep(100);
//		     firstName_Adult.sendKeys("Digambar");
//		     Thread.sleep(100);
//		     lastName_Adult.sendKeys("Karande");
//		     Thread.sleep(100);
//		 	Closereview.click();
//		     Thread.sleep(500);
//		       
//			 	WebElement element1 = Adult2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element1.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult2.click();
//		  	     Thread.sleep(500);
//		     
//		  		WebElement element2 = Adult3;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element2.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Digambar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Adult3.click();
//		  	     Thread.sleep(500);    
//		  	   
//		  		WebElement element3 = Child1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element3.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Aatherv");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child1.click();
//		  	     Thread.sleep(500);
//		  	     
//		  		WebElement element4 = Child2;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element4.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Rajkumar");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Child2.click();
//		  	     Thread.sleep(500);
//		  	   
//		  	   
//		  	 WebElement element5 = Infent1;
//		  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//		  	     Thread.sleep(100);
//		  	     element5.click();
//		  	     Thread.sleep(500);
//		   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//		  	     Thread.sleep(100);
//		  	     ClickTitle.click();
//			     Thread.sleep(100);
//			     MR.click();
//			     Thread.sleep(100);
//			     firstName_Adult.sendKeys("Mahesh");
//			     Thread.sleep(100);
//			     lastName_Adult.sendKeys("Karande");
//			     Thread.sleep(100);
//			     Infent1.click();
//		  	     Thread.sleep(500);
//		  	    
//		  		 WebElement element6 = Infent2;
//			  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//			  	     Thread.sleep(100);
//			  	     element6.click();
//			  	     Thread.sleep(500);
//			   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//			  	     Thread.sleep(100);
//			  	     ClickTitle.click();
//				     Thread.sleep(100);
//				     MR.click();
//				     Thread.sleep(100);
//				     firstName_Adult.sendKeys("APPA");
//				     Thread.sleep(100);
//				     lastName_Adult.sendKeys("Karande");
//				     Thread.sleep(100);
//				     Infent2.click();
//			  	     Thread.sleep(500);
//			  	     
//			  		 WebElement element7 = Infent3;
//				  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//				  	     Thread.sleep(100);
//				  	     element7.click();
//				  	     Thread.sleep(500);
//				   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//				  	     Thread.sleep(100);
//				  	     ClickTitle.click();
//					     Thread.sleep(100);
//					     MR.click();
//					     Thread.sleep(100);
//					     firstName_Adult.sendKeys("Mahesh");
//					     Thread.sleep(100);
//					     lastName_Adult.sendKeys("Karande");
//					     Thread.sleep(100);
//					     Infent3.click();
//				  	     Thread.sleep(500);
//				  	     
//				  		 WebElement element8 = Infent4;
//					  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//					  	     Thread.sleep(100);
//					  	     element8.click();
//					  	     Thread.sleep(500);
//					   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//					  	     Thread.sleep(100);
//					  	     ClickTitle.click();
//						     Thread.sleep(100);
//						     MR.click();
//						     Thread.sleep(100);
//						     firstName_Adult.sendKeys("Mahesh");
//						     Thread.sleep(100);
//						     lastName_Adult.sendKeys("Karande");
//						     Thread.sleep(100);
//						     Infent4.click();
//					  	     Thread.sleep(500);
//					  	     
//					  		 WebElement element9 = Infent5;
//						  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//						  	     Thread.sleep(100);
//						  	     element9.click();
//						  	     Thread.sleep(500);
//						   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//						  	     Thread.sleep(100);
//						  	     ClickTitle.click();
//							     Thread.sleep(100);
//							     MR.click();
//							     Thread.sleep(100);
//							     firstName_Adult.sendKeys("Mahesh");
//							     Thread.sleep(100);
//							     lastName_Adult.sendKeys("Karande");
//							     Thread.sleep(100);
//							     Infent5.click();
//						  	     Thread.sleep(1000);
//		  	     
//						  		 WebElement element10 = Infent6;
//							  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//							  	     Thread.sleep(100);
//							  	     element10.click();
//							  	     Thread.sleep(500);
//							   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//							  	     Thread.sleep(100);
//							  	     ClickTitle.click();
//								     Thread.sleep(100);
//								     MR.click();
//								     Thread.sleep(100);
//								     firstName_Adult.sendKeys("Mahesh");
//								     Thread.sleep(100);
//								     lastName_Adult.sendKeys("Karande");
//								     Thread.sleep(100);
//								     Infent6.click();
//							  	     Thread.sleep(500); 
//							  	     
//							  		 WebElement element11 = Infent7;
//								  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//								  	     Thread.sleep(100);
//								  	     element11.click();
//								  	     Thread.sleep(500);
//								   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//								  	     Thread.sleep(100);
//								  	     ClickTitle.click();
//									     Thread.sleep(100);
//									     MR.click();
//									     Thread.sleep(100);
//									     firstName_Adult.sendKeys("Mahesh");
//									     Thread.sleep(100);
//									     lastName_Adult.sendKeys("Karande");
//									     Thread.sleep(100);
//									     Infent7.click();
//								  	     Thread.sleep(500); 
//								  	     
//								  		 WebElement element12 = Infent8;
//									  	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
//									  	     Thread.sleep(100);
//									  	     element12.click();
//									  	     Thread.sleep(500);
//									   	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
//									  	     Thread.sleep(100);
//									  	     ClickTitle.click();
//										     Thread.sleep(100);
//										     MR.click();
//										     Thread.sleep(100);
//										     firstName_Adult.sendKeys("Mahesh");
//										     Thread.sleep(100);
//										     lastName_Adult.sendKeys("Karande");
//										     Thread.sleep(100);
//										     Infent8.click();
//									  	     Thread.sleep(500); 
//							  	     
//	    }
		

	}

public void PassMobileAndEmailForBooking(WebDriver driver) throws InterruptedException
{	
	PhoneNumber.sendKeys("48454545454");
    Thread.sleep(100);
    EmailId.sendKeys("dsndjsndkjnj@gmail.com");
    Thread.sleep(200);

}

	

	public void ClickContBooking(WebDriver driver) throws InterruptedException
	{	
	
		     ContinueBooking.click();
		     Thread.sleep(300);
 
		     Add_Meals.click();
		     Thread.sleep(300);
   
		     Add_Baggage.click();
		     Thread.sleep(300); 
		     
			  WebElement element= ContinueBooking;
			    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
			     Thread.sleep(100);
			     element.click();
		 
			     Thread.sleep(10000); 
	     
		     
		     
	}
	 
	public void ClickOnContinueForGestMod(WebDriver driver) throws InterruptedException
	{	
		  WebElement element= Clickcontinue;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		     Thread.sleep(1000);
		     element.click();
	 
	}
	
	
	 
	
	public void ClickContBooking1(WebDriver driver) throws InterruptedException
	{	

		  WebElement element= continuebooking2;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
		     Thread.sleep(1000);
		     element.click();
		     
		 
	}
	public void Chekmark(WebDriver driver) throws InterruptedException
	{		
		WebElement element= checkmark;
		
		
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)", "");
    Thread.sleep(500);
    element.click();
		
    
		
		



	}
	
	public void ProceedPayment(WebDriver driver) throws InterruptedException
	{	
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		CommonMethodes.waitForElementToBeVisible(driver, ProceedPayment, 2);


	}
	
	
	
	
	
	
	
	
	
}
