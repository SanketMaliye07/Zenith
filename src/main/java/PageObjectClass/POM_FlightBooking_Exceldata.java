package PageObjectClass;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.CommonMethodes;

public class POM_FlightBooking_Exceldata {
	

	@FindBy(xpath="(//button[contains(@class,'theme5_login_button__9DoON')][normalize-space()='Sign In'])[2]")private WebElement SighIn;
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	@FindBy(xpath="//button[contains(@type,'submit')]")private WebElement Login;
	@FindBy(xpath="//div[@class='Desktop_widget_parent__sY2sG']//li[1]")private WebElement ClickFlight;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")private WebElement Class;

	
	
	@FindBy(xpath="//div[@id='Flight_From_0']//input[@id='myTextField']")private WebElement Origin;
	@FindBy(xpath="(//input[@id='myTextField'])[2]")private WebElement searchorigin;
	@FindBy(xpath="//div[@id='Flight_To_0']//input[@id='myTextField']")private WebElement Destination;
	@FindBy(xpath="(//input[@id='myTextField'])[3]")private WebElement SearchDestination;
	@FindBy(xpath="(//div[@id='flightData'])[1]")private WebElement OriginName;
	@FindBy(xpath="(//div[@id='flightData'])[1]")private WebElement DestinationName;
	@FindBy(xpath="(//div[@class='theme2_flight_autocomplete_name__Cj0JV'])[1]")private WebElement Internationaldestination;
	@FindBy(xpath="(//input[@id='myTextField'])[3]")private WebElement calander;
	@FindBy(xpath="(//input[@id='myTextField'])[4]")private WebElement calander1;
	@FindBy(xpath="(//span[contains(text(),'26')])[1]")private WebElement selectDate;
	@FindBy(xpath="(//span[normalize-space()='30'])[1]")private WebElement selectRetunDate;
	
	
	@FindBy(xpath="(//*[name()='svg'][@class='h-5 w-5'])[1]")private WebElement navigateoncalender;
	@FindBy(xpath="//button[normalize-space()='Apply']")private WebElement Apply;
	@FindBy(id="Premium Economy")private WebElement Premium_Economy;
	@FindBy(xpath="//input[@id='First Class']")private WebElement First_Class;
	@FindBy(xpath="//input[@id='Business']")private WebElement Business_Class;
	@FindBy(xpath="(//div[normalize-space()='Premium Economy'])[2]")private WebElement Premium_Economy1;
	@FindBy(xpath="(//div[normalize-space()='First Class'])[2]")private WebElement First_Class1;
	@FindBy(xpath="(//div[normalize-space()='Business'])[2]")private WebElement Business_Class1;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]")private WebElement Passanger;
	@FindBy(xpath="(//*[name()='svg'][@class='theme5_buttons_icon__4jYlP'])[2]")private WebElement Adult;
	@FindBy(xpath="(//*[name()='svg'][@class='theme5_buttons_icon__4jYlP'])[4]")private WebElement child;
	@FindBy(xpath="(//*[name()='svg'][@class='theme5_buttons_icon__4jYlP'])[6]")private WebElement infent;
	@FindBy(xpath="//button[normalize-space()='Flight Search']")private WebElement Flight_Search;
	@FindBy(xpath="//label[normalize-space()='Round Trip']")private WebElement SelectRoundWay;
	@FindBy(css="div[class='theme5_flt_pasngrFlx__KkydQ'] div[class='theme5_flt_trav_label__kc5Sd']")private WebElement ValidateClass;
	@FindBy(xpath="(//button[@class='theme5_btn_primary__8T2j1 theme5_booknow_btn_mg__7EiXE'][normalize-space()='Book'])[1]")private WebElement Book;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]")private WebElement Stopes;
	@FindBy(name ="Continue Booking")private WebElement ContinuBook;
	
	@FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")private WebElement OneWayFlight;
	@FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")private WebElement RoundWayFlight;
	@FindBy(xpath="//button[normalize-space()='Book']")private WebElement BookRoundTrip;
	@FindBy(xpath="(//a[normalize-space()='Flight Search'])[1]")private WebElement FlighSearch;








	public POM_FlightBooking_Exceldata(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}


	public void click_On_SighIn(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, SighIn, 1);

		Thread.sleep(500);

		
	}
	
	public void Pass_email(WebDriver driver,String Email) throws InterruptedException, IOException
	{
		
		email.sendKeys(Email);
		Thread.sleep(200);

	}

	public void pass_pass(String Pass) throws InterruptedException, IOException
	{
		pass.sendKeys(Pass);
		Thread.sleep(100);

	}

	public void click_On_Login(WebDriver driver) throws InterruptedException
	{
		Login.click();
		Thread.sleep(10000);


	}
	
	public void ClickFlightModule(WebDriver driver) throws InterruptedException
	{
		ClickFlight.click();
		Thread.sleep(4000);

	}
	

	public void Selecttrippassoriginanddestination(WebDriver driver,String way,String origin,String destination) throws InterruptedException
	{
		if(way.contentEquals("Round-Way")) {
			
			Thread.sleep(500);
			SelectRoundWay.click();
			
		Thread.sleep(500);	

		
		  try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")));

		            popup.findElement(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Origin not visibale");
		        }
	//Origin.click();
	Thread.sleep(500);		
	searchorigin.sendKeys(origin);
	//Thread.sleep(2000);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Origin not visibale");
	        }
	//OriginName.click();
 Thread.sleep(500);
  
  try {
  	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")));

          popup.findElement(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")).click();
          
      } catch (Exception e) {
          System.out.println("Origin not Destination");
      }
  //Destination.click();
	Thread.sleep(500);
	SearchDestination.sendKeys(destination);
	Thread.sleep(500);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Dstination not visiable");
	        }
	//DestinationName.click();
 Thread.sleep(500);
	
	
	}
		else if(way.equals("One-Way"))
		{
			
			  try {
			    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")));

			            popup.findElement(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")).click();
			            
			        } catch (Exception e) {
			            System.out.println("Origin not visibale");
			        }
		//Origin.click();
		Thread.sleep(500);		
		searchorigin.sendKeys(origin);
		//Thread.sleep(2000);	
		
		  try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

		            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Origin not visibale");
		        }
		//OriginName.click();
       Thread.sleep(500);
        
        try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")));

	            popup.findElement(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Origin not Destination");
	        }
        //Destination.click();
		Thread.sleep(500);
		SearchDestination.sendKeys(destination);
		Thread.sleep(500);	
		
		  try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

		            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Dstination not visiable");
		        }
		//DestinationName.click();
       Thread.sleep(500);
		
		
		}}
	
	public void SelectDatefortrip(WebDriver driver,String way,String month,String exp_date,String retun_date) throws InterruptedException
	{
		

		
		  Random random = new Random();

			int min = 1;
			int max = 15;
			int min1 = 16;
			int max1 = 30;
			int randomNumberInRange = random.nextInt(max - min) + min;
			int randomNumberInRange1 = random.nextInt(max1 - min1) + min1;
			
			String strNumber = String.valueOf(randomNumberInRange);
			String strNumber1 = String.valueOf(randomNumberInRange1);
//			
//			String strNumber ="11";
//			String strNumber1 ="14";
			System.out.println("Departure date :"+strNumber+"Return Date :"+strNumber1);
		if(way.contentEquals("Round-Way"))
		{
			
			CommonMethodes.waitForElementToBeVisible(driver, calander, 1);
		Thread.sleep(100);	
		while(true)
		{		
			String text = driver.findElement(By.xpath("//h3")).getText();
     		//System.out.println(text);
			if(text.equals(month))
			{break;}
			else 
			{
				driver.findElement(By.xpath("//div[@class='theme5_calendar_head_right_side__Vj7ia']//span[@class='theme5_calendar_head_icon__KqBkN']//*[name()='svg']")).click();
			}
			
		}
		
		
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");

	       Thread.sleep(1000);
		List<WebElement> alldata = driver.findElements(By.xpath("(//div[@class='theme5_calendar_day_list__mMWD0'])//div[@class='theme5_day_cell_center__69Df6']"));
		
		for(WebElement ele:alldata)
		{
			String Text_Date = ele.getText();
			
			//System.out.println(Text_Date);
		//System.out.println(exp_date);
		
			if(Text_Date.contentEquals(strNumber))
			{
				
				ele.click();
				break;
			}
			if(Text_Date.contentEquals(strNumber1))
			{
				
				ele.click();
				break;
			}
			
		}
		
		Thread.sleep(500);

		
		CommonMethodes.waitForElementToBeVisible(driver, calander1, 10);

		while(true)
		{		
			String text = driver.findElement(By.xpath("//h3")).getText();
     		System.out.println(text);
			if(text.equals(month))
			{break;}
			else 
			{
				driver.findElement(By.xpath("//div[@class='theme5_calendar_head_right_side__Vj7ia']//span[@class='theme5_calendar_head_icon__KqBkN']//*[name()='svg']")).click();
			}
			
		}
		
		
		Thread.sleep(100);
		List<WebElement> data = driver.findElements(By.xpath("(//div[@class='theme5_calendar_day_list__mMWD0'])//div[@class='theme5_day_cell_center__69Df6']"));
		
		for(WebElement ele:data)
		{
			String Text_Date = ele.getText();
			
			System.out.println(Text_Date);
		System.out.println(exp_date);
		
			if(Text_Date.contentEquals(strNumber1))
			{
				
				ele.click();
				break;
			}
			
		}
		}
		
		else if(way.equals("One-Way"))
		{ CommonMethodes.waitForElementToBeVisible(driver, calander, 1);
		Thread.sleep(100);
		while(true)
		{
			
			String text = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(text);
			if(text.equals(month))
			{
				
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//div[@class='theme5_calendar_head_right_side__Vj7ia']//span[@class='theme5_calendar_head_icon__KqBkN']//*[name()='svg']")).click();
			}
			
		}
		
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");

		
		Thread.sleep(1000);
		List<WebElement> alldata = driver.findElements(By.xpath("(//div[@class='theme5_calendar_day_list__mMWD0'])//div[@class='theme5_day_cell_center__69Df6']"));
		
		for(WebElement ele:alldata)
		{
			String Text_Date = ele.getText();
			
//		System.out.println(Text_Date);
//		System.out.println(exp_date);
		
			if(Text_Date.contentEquals(strNumber))
			{
				
				ele.click();
				break;
			}
			
	
		}
		
		}
		
		Thread.sleep(1000);

	}
	
	public void selectClassforTrip(WebDriver driver,String way,String Classess)
	{
		if(way.contentEquals("Round-Way"))
		{
			if(Classess.equalsIgnoreCase("Economy")) {
				System.out.println("we select  Economy class");

			}
			else if(Classess.equalsIgnoreCase("Business")) {
				Business_Class.click();

				System.out.println("The selected Class is :"+Business_Class);

			}
			else if (Classess.equalsIgnoreCase("First Class")) {
				First_Class.click();

				System.out.println("The selected Class is :"+First_Class);

			
			}
			else if(Classess.equalsIgnoreCase("Premium Economy")) {
				Premium_Economy.click();

				System.out.println("The selected Class is :"+Premium_Economy);
				
			}
		}
		else if(way.equals("One-Way")) {
		if(Classess.equalsIgnoreCase("Economy")) {
			System.out.println("we select  Economy class");

		}
		else if(Classess.equalsIgnoreCase("Business")) {
			Business_Class.click();

			System.out.println("The selected Class is :"+Business_Class);

		}
		else if (Classess.equalsIgnoreCase("First Class")) {
			First_Class.click();

			System.out.println("The selected Class is :"+First_Class);

		
		}
		else if(Classess.equalsIgnoreCase("Premium Economy")) {
			Premium_Economy.click();

			System.out.println("The selected Class is :"+Premium_Economy);
			
		}
			}
		
		
	}
	
	public void selectClassforTripandValidaetheclass(WebDriver driver,String way,String Classess) throws InterruptedException
	{
		if(way.contentEquals("Round-Way"))
		{
			if(Classess.equalsIgnoreCase("Economy")) {
				System.out.println("we select  Economy class");

			}
			else if(Classess.equalsIgnoreCase("Business")) {
				Business_Class.click();

				System.out.println("The selected Class is :"+Business_Class);

			}
			else if (Classess.equalsIgnoreCase("First Class")) {
				First_Class.click();


				System.out.println("The selected Class is :"+First_Class);

			
			}
			else if(Classess.equalsIgnoreCase("Premium Economy")) {
				Premium_Economy.click();


				System.out.println("The selected Class is :"+Premium_Economy);
				
			}
		}
		else if(way.equals("One-Way")) {
		if(Classess.equalsIgnoreCase("Economy")) {
			CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
			System.out.println("we select  Economy class");
			
			Flight_Search.click();
			Thread.sleep(4000);

			String text = Class.getText();
			Assert.assertEquals(text,"Economy");

		}
		else if(Classess.equalsIgnoreCase("Business")) {
			Business_Class.click();
			CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
			Flight_Search.click();

			Thread.sleep(4000);

			System.out.println("The selected Class is :"+Business_Class);
			String text = Class.getText();
			Assert.assertEquals(text,"Business");

		}
		else if (Classess.equalsIgnoreCase("First Class")) {
			First_Class.click();
			CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
			Flight_Search.click();

			Thread.sleep(4000);

			System.out.println("The selected Class is :"+First_Class);
			String text = Class.getText();
			Assert.assertEquals(text,"First Class");
		
		}
		else if(Classess.equalsIgnoreCase("Premium Economy")) {
			Premium_Economy.click();
			CommonMethodes.waitForElementToBeVisible(driver, Apply, 2);
			Flight_Search.click();

			Thread.sleep(4000);
			System.out.println("The selected Class is :"+Premium_Economy);
			String text = Class.getText();
			Assert.assertEquals(text,"Premium Economy");
		}
			}
		
		
	}
	public void Selectpassangerfortrip(WebDriver driver,String AdultString,String childString,String InfentString) throws InterruptedException
	{
		
CommonMethodes.waitForElementToBeVisible(driver, Passanger, 1);
		
		String stringadult =AdultString;
		Integer adult = Integer.valueOf(stringadult);
		
		String stringchild = childString;
		Integer Child = Integer.valueOf(stringchild);
		
		String stringinfent=InfentString;
		Integer Infent = Integer.valueOf(stringinfent);
		Thread.sleep(500);
		
		 for (int i = 1; i < adult; i++) {
			
				CommonMethodes.waitForElementToBeVisible(driver, Adult, 10);

	        }
		Thread.sleep(500);
		for (int i = 0; i < Child; i++) {
			
				CommonMethodes.waitForElementToBeVisible(driver, child, 10);

	        }
		Thread.sleep(500);
		for (int i = 0; i <Infent; i++) {
		
			CommonMethodes.waitForElementToBeVisible(driver, infent, 10);

	        }
		Thread.sleep(1000);
		
		
		
		
	}
	
	public void click_Search(WebDriver driver,String way) throws InterruptedException
	{
		if(way.contentEquals("Round-Way"))
		{
			
		CommonMethodes.waitForElementToBeVisible(driver, Flight_Search, 1);		
		Thread.sleep(40000);	}
		
		else if(way.equals("One-Way")) 
		{CommonMethodes.waitForElementToBeVisible(driver, Flight_Search, 1);		
		Thread.sleep(10000);}
	
		
	}
	
	public void clickBook(WebDriver driver,String way,String Flight) throws InterruptedException
	{


		if(way.contentEquals("Round-Way"))
		{
			   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");		
			    Thread.sleep(1000);	


			  try {
			    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='theme5_btn_primary__8T2j1 theme5_booknow_btn_mg__7EiXE'][normalize-space()='Book'])[1]")));

			            popup.findElement(By.xpath("(//button[@class='theme5_btn_primary__8T2j1 theme5_booknow_btn_mg__7EiXE'][normalize-space()='Book'])[1]")).click();
			            
			        } catch (Exception e) {
			            System.out.println("Origin not visibale");
			        }
				OneWayFlight.click();
				Thread.sleep(200);	
				RoundWayFlight.click();
				Thread.sleep(200);	
				BookRoundTrip.click();
				Thread.sleep(10000);
//			
//	
//			if(Flight.contentEquals("Domestic")) 
//			{
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		        js.executeScript("window.scrollBy(0, 300);");
//		        Thread.sleep(200);	
//			OneWayFlight.click();
//			Thread.sleep(200);	
//			RoundWayFlight.click();
//			Thread.sleep(200);	
//			BookRoundTrip.click();
//			Thread.sleep(10000);	}
//			
//		
//		   if(Flight.contentEquals("International")) 
//		{
//
//				
//			   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");		
//				CommonMethodes.waitForElementToBeVisible(driver, Book, 10);
//				Thread.sleep(10000);
//				
//		}
		   
		}
		else if(way.equals("One-Way")) 
		{

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");		
		CommonMethodes.waitForElementToBeVisible(driver, Book, 10);
		
		Thread.sleep(5000);	
           
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
