package PageObjectClass;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.CommonMethodes;

public class POM_Hotel_Exceldata {
	

	@FindBy(xpath="(//span[normalize-space()='My Account'])[1]")private WebElement Myaccount;
	@FindBy(xpath="(//span[normalize-space()='Sign In'])[1]")private WebElement SighIn;
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	@FindBy(xpath="(//button[normalize-space()='LOGIN'])[1]")private WebElement Login;
	@FindBy(xpath="//div[@class='Desktop_widget_parent__sY2sG']//li[2]")private WebElement clickHotel;
	@FindBy(xpath="(//input[@id='myTextField'])[1]")private WebElement SearchCity;
	@FindBy(xpath="(//input[@id='myTextField'])[2]")private WebElement SearchCityname;
	@FindBy(xpath="(//div[@id='hotelData'])[1]")private WebElement selectCity;
	@FindBy(xpath="(//div[@class='theme5_flex_cont_cal__kqk_F'])[1]")private WebElement calander;
	
	
	@FindBy(xpath="//div[@class='theme5_hotel_guestCont__1wFc7']//div[@class='theme5_drop_wrap__WRZx4']//span[1]//*[name()='svg']")private WebElement Passanger;	


	@FindBy(xpath="//div[@class='theme5_hotel_adult_accomodation__v_vsU']//span[2]//*[name()='svg']")private WebElement Adult;
	@FindBy(xpath="//div[@class='theme5_hotel_adult_accomodation__v_vsU']//div[@class='theme5_hotel_accomodation_conf__iJiHe']//span[1]//*[name()='svg']")private WebElement Adultsubtract;
    @FindBy(xpath="(//*[name()='path'][@fill-rule='evenodd'])[7]")private WebElement child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[1]")private WebElement Room1chilage1;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[2]")private WebElement Room1chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[3]")private WebElement Room1chilage3;
	@FindBy(xpath="(//div[@class='theme5_age_list_ele__xy8s7'])[4]")private WebElement ChildAgeRoom1;
	
    
	@FindBy(xpath="//div[@class='theme5_paxPlus_icon__FLx4q']//*[name()='svg']")private WebElement AddRoom2;
	@FindBy(xpath="//div[@class='theme5_hotel_room_list__N9v4W']//div[2]//div[2]//div[1]//div[2]//span[2]//*[name()='svg']")private WebElement Room2Adult;
	@FindBy(xpath="//div[@class='theme5_hotel_room_list__N9v4W']//div[2]//div[2]//div[2]//div[2]//span[2]//*[name()='svg']")private WebElement Room2child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[4]")private WebElement Room2chilage1;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[5]")private WebElement Room2chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[6]")private WebElement Room2chilage3;
	@FindBy(xpath="(//div[@class='theme5_age_list_ele__xy8s7'])[4]")private WebElement Room2selectAge;
	
	
	@FindBy(xpath="//div[@class='theme5_paxPlus_icon__FLx4q']//*[name()='svg']")private WebElement AddRoom3;
	@FindBy(xpath="//div[@class='theme5_hotel_guestCont__1wFc7']//div[3]//div[2]//div[1]//div[2]//span[2]//*[name()='svg']")private WebElement Room3Adult;
	@FindBy(xpath="//div[@class='theme5_hotel_guestCont__1wFc7']//div[3]//div[2]//div[2]//div[2]//span[2]//*[name()='svg']")private WebElement Room3child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[7]")private WebElement Room3chilage1;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[8]")private WebElement Room3chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[9]")private WebElement Room3chilage3;
	@FindBy(xpath="(//div[@class='theme5_age_list_ele__xy8s7'])[4]")private WebElement Room3selectAge;
	
	 
	@FindBy(xpath="//div[@class='theme5_paxPlus_icon__FLx4q']//*[name()='svg']")private WebElement AddRoom4;
	@FindBy(xpath="//div[4]//div[2]//div[1]//div[2]//span[2]//*[name()='svg']")private WebElement Room4Adult;
	@FindBy(xpath="//div[4]//div[2]//div[2]//div[2]//span[2]//*[name()='svg']")private WebElement Room4child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[10]")private WebElement Room4chilage1;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[11]")private WebElement Room4chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[12]")private WebElement Room4chilage3;
	@FindBy(xpath="(//div[@class='theme5_age_list_ele__xy8s7'])[4]")private WebElement Room4selectAge;
	
	@FindBy(xpath="(//p[normalize-space()='ADD ROOM'])[1]")private WebElement AddRoom5;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[31]")private WebElement Room5Adult;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[33]")private WebElement Room5child;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[34]")private WebElement Room5chilage1;
    @FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[35]")private WebElement Room5chilage2;	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[36]")private WebElement Room5chilage3;
	@FindBy(xpath="(//div[@class='theme2_age_list_ele__CRcn3'])[4]")private WebElement Room5selectAge;

	
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[8]")private WebElement selectchaildAge2;
	@FindBy(xpath="(//div[@class='theme2_age_list_ele__CRcn3'])[4]")private WebElement ChildAge2;


	@FindBy(xpath="(//input[@value='Apply'])[1]")private WebElement Done;
	@FindBy(xpath="(//button[normalize-space()='Hotels Search'])[1]")private WebElement Search;
	
	@FindBy(xpath="(//button[@class='theme5_srp_desktop_btn__UGouK theme5_srp_tab_btn__FUsF7'][normalize-space()='View Room'])[1]")private WebElement selectHotel;
	@FindBy(xpath="(//button[@class='theme5_backgroundbutton__Jygz7'])[1]")private WebElement selectRoom;
	
	@FindBy(xpath="(//button[normalize-space()='Continue'])[1]")private WebElement Continue_Booking;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")private WebElement continubutton;
	@FindBy(xpath="//span[@class='theme2_ax_checkmark__qkZ7Y']")private WebElement chekmarkterms;
	@FindBy(xpath="//button[@id='payment_btn']")private WebElement proceedpayment;
	
	
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[1]")private WebElement AdultFoeRoom1;
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[2]")private WebElement AdultFoeRoom2;
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[3]")private WebElement AdultFoeRoom3;
	@FindBy(xpath="(//input[@placeholder='Select Traveller'])[4]")private WebElement AdultFoeRoom4;
	
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[1]")private WebElement SelectAdult1;
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[2]")private WebElement SelectAdult2;
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[3]")private WebElement SelectAdult3;
	@FindBy(xpath="(//div[@class='theme5_name_contbx__3LUKU'])[4]")private WebElement SelectAdult4;
	
	@FindBy(xpath="(//input[@id='pan_no_0'])[1]")private WebElement PassPAN1;
	@FindBy(xpath="(//input[@id='pan_no_1'])[1]")private WebElement PassPAN2;
	@FindBy(xpath="(//input[@id='pan_no_2'])[1]")private WebElement PassPAN3;
	@FindBy(xpath="(//input[@id='pan_no_3'])[1]")private WebElement PassPAN4;


	@FindBy(xpath="(//img[@class='theme5_dropimg_traveller__ejmfq'])[1]")private WebElement Title1;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr1;
	@FindBy(xpath="(//input[@id='first_name_0'])[1]")private WebElement first_name_01;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[1]")private WebElement LastName1;
	@FindBy(xpath="(//input[@id='email_0'])[1]")private WebElement email_01;
	@FindBy(xpath="(//input[@id='phone_no_0'])[1]")private WebElement phone_no_01;
	@FindBy(xpath="(//input[@id='pan_no_0'])[1]")private WebElement pan_no_01;


	@FindBy(xpath="(//img[@class='theme5_dropimg_traveller__ejmfq'])[3]")private WebElement Title2;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr2;
	@FindBy(xpath="(//input[@id='first_name_1'])[1]")private WebElement first_name_02;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[2]")private WebElement LastName2;
	@FindBy(xpath="(//input[@id='email_1'])[1]")private WebElement email_02;
	@FindBy(xpath="(//input[@id='phone_no_1'])[1]")private WebElement phone_no_02;
	@FindBy(xpath="(//input[@id='pan_no_1'])[1]")private WebElement pan_no_02;


	@FindBy(xpath="(//img[@class='theme5_dropimg_traveller__ejmfq'])[5]")private WebElement Title3;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr3;
	@FindBy(xpath="(//input[@id='first_name_2'])[1]")private WebElement first_name_03;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[3]")private WebElement LastName3;
	@FindBy(xpath="(//input[@id='email_2'])[1]")private WebElement email_03;
	@FindBy(xpath="(//input[@id='phone_no_2'])[1]")private WebElement phone_no_03;
	@FindBy(xpath="(//input[@id='pan_no_2'])[1]")private WebElement pan_no_03;
	
	@FindBy(xpath="(//img[@class='theme5_dropimg_traveller__ejmfq'])[7]")private WebElement Title4;
	@FindBy(xpath="(//div[normalize-space()='Mr'])[1]")private WebElement Mr4;
	@FindBy(xpath="(//input[@id='first_name_3'])[1]")private WebElement first_name_04;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[4]")private WebElement LastName4;
	@FindBy(xpath="(//input[@id='email_3'])[1]")private WebElement email_04;
	@FindBy(xpath="(//input[@id='phone_no_3'])[1]")private WebElement phone_no_04;
	@FindBy(xpath="(//input[@id='pan_no_3'])[1]")private WebElement pan_no_04;
	
	@FindBy(xpath="(//button[contains(text(),'Continue')])[1]")private WebElement ContinueAlertButton;



	public POM_Hotel_Exceldata(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	
	 
	public void click_On_Myaccount(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, Myaccount, 1);
		
	}

	public void click_On_SighIn(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, SighIn, 1);

	
		
	}
	
	public void Pass_email(WebDriver driver,String Email) throws InterruptedException, IOException
	{
		
		CommonMethodes.waitForElementToBeVisible(driver, email,10);
		Thread.sleep(500);
		email.sendKeys(Email);
		Thread.sleep(500);

	}

	public void pass_pass(String Pass) throws InterruptedException, IOException
	{
		pass.sendKeys(Pass);
		Thread.sleep(500);
	}

	public void click_On_Login(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, Login, 1);
		Thread.sleep(500);
		
	}
	
	
	public void clickOnHotel(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		clickHotel.click();
		Thread.sleep(1000);
	}
	
	
	public void Search_selectCity(WebDriver driver,String city) throws InterruptedException
	{
		SearchCity.click();
		Thread.sleep(1000);
		SearchCityname.sendKeys(city);
		Thread.sleep(2000);
		SearchCityname.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SearchCityname.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	
	}
	
	
	
	 
	

	public void select_Date(WebDriver driver,String month,String exp_date,String retun_date) throws InterruptedException
	{
		Thread.sleep(1000);

		CommonMethodes.waitForElementToBeVisible(driver, calander, 10);
		Random random = new Random();

		int min = 1;
		int max = 15;
		int min1 = 16;
		int max1 = 30;
		int randomNumberInRange = random.nextInt(max - min) + min;
		int randomNumberInRange1 = random.nextInt(max1 - min1) + min1;
		
		String strNumber = String.valueOf(randomNumberInRange);
		String strNumber1 = String.valueOf(randomNumberInRange1);

		System.out.println("Departure date :"+strNumber+"Return Date :"+strNumber1);
	
	while(true)
	{		
		String text = driver.findElement(By.xpath("//h3")).getText();
 		System.out.println(text);
		if(text.equals("August 2024"))
		{break;}
		else 
		{
			driver.findElement(By.xpath("//div[@class='theme5_calendar_head_right_side__zOtPL']//span[@class='theme5_calendar_head_icon__uKsKf']//*[name()='svg']")).click();
		}
		
	}
	
	
     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
     
		Thread.sleep(100);

	List<WebElement> alldata = driver.findElements(By.xpath("(//div[@class='theme5_calendar_day_list__nvtqB'])//div[@class='theme5_day_cell_center__2VDSA']"));
	
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

	}
	
	Thread.sleep(100);

	
	for(WebElement ele1:alldata)
	{
		String Text_Date1 = ele1.getText();
		
		//System.out.println(Text_Date);
	//System.out.println(exp_date);
	
		if(Text_Date1.contentEquals(strNumber1))
		{
			
			ele1.click();
			break;
		}
		
	}
	
		 
    CommonMethodes.wait1(driver, 10);

	}
	
	

	
	public void Select_1Room_1Pass(WebDriver driver,String AdultString,String childString,String RoomString) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, Passanger, 1);
		String stringadult =AdultString;
		Integer adult = Integer.valueOf(stringadult);
		
		String stringchild = childString;
		Integer Child = Integer.valueOf(stringchild);
		
		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		
		
		if(Room==1)
		{
			
		if(adult<=1)
		{for (int i = 0; i < adult; i++) 
		{
						 Adultsubtract.click();	
							
				        }}
		
	 else if(adult>=2)
	{for (int i = 0; i < adult-2; i++) 
					 {
						 Adult.click();	
							
				        }}
		
		for (int i = 0; i < Child; i++) {
		child.click(); 
			
        }
		
		if(Child==1)
		{
			Room1chilage1.click();
			Thread.sleep(100);
			WebElement element1 = ChildAgeRoom1;
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(300);
			
		}
		else if(Child==2)
		{
			Room1chilage1.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();
			Thread.sleep(100);
			Room1chilage2.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();
			
		}
		else if(Child==3)
		{
			WebElement element1 = Room1chilage1;
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();
			Thread.sleep(100);
			Room1chilage2.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();
			Thread.sleep(100);
			Room1chilage3.click();
			Thread.sleep(100);
			ChildAgeRoom1.click();

		}
		
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(100);
		
		}
			
		else if(Room==2)
		{
			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-2; i++) 
		{Adult.click();	}}
			Thread.sleep(200);

			for (int i = 0; i < Child; i++) 
			{
			child.click(); 
			Thread.sleep(200);
}
			
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(300);				
			}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{			
				//((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme2_hotel_room_list__zPnr1\"]').scrollTop=300");
				WebElement element = Room1chilage1;
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(100);
				element.click();
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);


 
			}	
			
			AddRoom2.click();
			
		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
			
			Room2child.click();
			
			Thread.sleep(100);			

	        }

	   if(Child==1)
		{
			
	
	
		
			
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");
		Room2chilage1.click();
		Thread.sleep(300);			

			
			WebElement element1 = Room2selectAge;
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(100);
			element1.click();
			Thread.sleep(300);			
		}
		else if(Child==2)
		{	
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");
		Thread.sleep(100);

			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			
		}
		else if(Child==3)
		{			
			
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");

			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage3.click();
			Thread.sleep(100);
			Room2selectAge.click();

		}	
	   
		Thread.sleep(500);
		WebElement element1 = Done;
	//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(100);
		
	   
		}
		else if(Room==3)
		{

			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-2; i++) 
						 {
							 Adult.click();	
								
					        }}
			
			for (int i = 0; i < Child; i++) {
			child.click(); 
				
	        }
			
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				WebElement element1 = ChildAgeRoom1;
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(300);				}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{
				WebElement element1 = Room1chilage1;
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();

			}	
			
			AddRoom2.click();
			
		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
		   Room2child.click(); 
				
	        }
			
	   if(Child==1)
		{
		   Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
		}
		else if(Child==2)
		{
			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			
		}
		else if(Child==3)
		{			
			
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");

			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage3.click();
			Thread.sleep(100);
			Room2selectAge.click();

		}	
	   
		AddRoom3.click();
		
		
	for (int i = 0; i < adult-1; i++) 
					 {
		Room3Adult.click();	
							
				        }
		
  for (int i = 0; i < Child; i++) {
	   Room3child.click(); 
			
       }
		
  if(Child==1)
	{
	   Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
	}
	else if(Child==2)
	{
		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		
	}
	else if(Child==3)
	{			
		
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");

		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage3.click();
		Thread.sleep(100);
		Room3selectAge.click();

	}	
	   
	   
	   
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(100);
		
	   
		
			
			
		}
		else if(Room==4)
		{


			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-2; i++) 
						 {
							 Adult.click();	
								
					        }}
			
			for (int i = 0; i < Child; i++) {
			child.click(); 
				
	        }
			
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
			}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{

				WebElement element1 = Room1chilage1;
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(100);
				element1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();				
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
			}	
			
			AddRoom2.click();
			
		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
		   Room2child.click(); 
		Thread.sleep(100);		
	        }
			
	   if(Child==1)
		{
		   Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
		}
		else if(Child==2)
		{
			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			
		}
		else if(Child==3)
		{
			((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");

	
			Room2chilage1.click();
			Thread.sleep(500);
			Room2selectAge.click();
			Thread.sleep(500);
			Room2chilage2.click();
			Thread.sleep(500);
			Room2selectAge.click();
			Thread.sleep(500);
			Room2chilage3.click();			
			Thread.sleep(500);
			Room2selectAge.click();
			Thread.sleep(500);
		}	
	   
		AddRoom3.click();
		
		
	for (int i = 0; i < adult-1; i++) 
					 {
		Room3Adult.click();	
							
				        }
		
  for (int i = 0; i < Child; i++) {
	   Room3child.click(); 
			
       }
		
  if(Child==1)
	{
	   Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
	}
	else if(Child==2)
	{
		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		
	}
	else if(Child==3)
	{
		//((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme2_hotel_room_list__zPnr1\"]').scrollTop=300");
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");
		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage3.click();
		Thread.sleep(100);
		Room3selectAge.click();

	}	
	   
	AddRoom4.click();
	
	
for (int i = 0; i < adult-1; i++) 
				 {
	Room4Adult.click();	
						
			        }
	
for (int i = 0; i < Child; i++) {
 Room4child.click(); 
		
 }
	
if(Child==1)
{
 Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
}
else if(Child==2)
{
	Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage2.click();
	Thread.sleep(100);
	Room4selectAge.click();
	
}
else if(Child==3)
{
	((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"theme5_hotel_room_list__N9v4W\"]').scrollTop=300");

	Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage2.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage3.click();
	Thread.sleep(100);
	Room4selectAge.click();

} 
	   
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(100);
		
	   
		
			
			
		
		}
		else if(Room==5)
		{



			if(adult<=1)
			{for (int i = 0; i < adult; i++) 
			{
							 Adultsubtract.click();	
								
					        }}
			
		 else if(adult>=2)
		{for (int i = 0; i < adult-2; i++) 
						 {
							 Adult.click();	
								
					        }}
			
			for (int i = 0; i < Child; i++) {
			child.click(); 
				
	        }
			
			if(Child==1)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
			}
			else if(Child==2)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				
			}
			else if(Child==3)
			{
				Room1chilage1.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage2.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();
				Thread.sleep(100);
				Room1chilage3.click();
				Thread.sleep(100);
				ChildAgeRoom1.click();

			}	
			
			AddRoom2.click();
			
		
		for (int i = 0; i < adult-1; i++) 
						 {
			Room2Adult.click();	
								
					        }
			
	   for (int i = 0; i < Child; i++) {
		   Room2child.click(); 
				
	        }
			
	   if(Child==1)
		{
		   Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
		}
		else if(Child==2)
		{
			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			
		}
		else if(Child==3)
		{
			Room2chilage1.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage2.click();
			Thread.sleep(100);
			Room2selectAge.click();
			Thread.sleep(100);
			Room2chilage3.click();
			Thread.sleep(100);
			Room2selectAge.click();

		}	
	   
		AddRoom3.click();
		
		
	for (int i = 0; i < adult-1; i++) 
					 {
		Room3Adult.click();	
							
				        }
		
  for (int i = 0; i < Child; i++) {
	   Room3child.click(); 
			
       }
		
  if(Child==1)
	{
	   Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
	}
	else if(Child==2)
	{
		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		
	}
	else if(Child==3)
	{
		Room3chilage1.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage2.click();
		Thread.sleep(100);
		Room3selectAge.click();
		Thread.sleep(100);
		Room3chilage3.click();
		Thread.sleep(100);
		Room3selectAge.click();

	}	
	   
	AddRoom4.click();
	
	
for (int i = 0; i < adult-1; i++) 
				 {
	Room4Adult.click();	
						
			        }
	
for (int i = 0; i < Child; i++) {
 Room4child.click(); 
		
 }
	
if(Child==1)
{
 Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
}
else if(Child==2)
{
	Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage2.click();
	Thread.sleep(100);
	Room4selectAge.click();
	
}
else if(Child==3)
{
	Room4chilage1.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage2.click();
	Thread.sleep(100);
	Room4selectAge.click();
	Thread.sleep(100);
	Room4chilage3.click();
	Thread.sleep(100);
	Room4selectAge.click();

} 
	   
AddRoom5.click();


for (int i = 0; i < adult-1; i++) 
			 {
Room5Adult.click();	
					
		        }

for (int i = 0; i < Child; i++) {
Room5child.click(); 
	
}

if(Child==1)
{
Room5chilage1.click();
Thread.sleep(100);
Room5selectAge.click();
}
else if(Child==2)
{
Room5chilage1.click();
Thread.sleep(100);
Room5selectAge.click();
Thread.sleep(100);
Room5chilage2.click();
Thread.sleep(100);
Room5selectAge.click();

}
else if(Child==3)
{
Room5chilage1.click();
Thread.sleep(100);
Room5selectAge.click();
Thread.sleep(100);
Room5chilage2.click();
Thread.sleep(100);
Room5selectAge.click();
Thread.sleep(100);
Room5chilage3.click();
Thread.sleep(100);
Room5selectAge.click();

} 
		Thread.sleep(500);
		WebElement element1 = Done;
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(100);
		
	   
		
			
			
		
			
		}
		
	
  
	}
	
	
	
	
	
	
	
	
	
	

	public void click_Search(WebDriver driver) throws InterruptedException
	{
		Search.click();
		Thread.sleep(20000);	
		  
	}
	
	
	
	public void click_Search_For_Rounttrip(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, Search, 1);		
		Thread.sleep(5000);	 
		  
	}
	
	public void selectHotel(WebDriver driver) throws InterruptedException
	{


 
			WebElement element1 = selectHotel;
		     Thread.sleep(1000);
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		     Thread.sleep(1000);

		     element1.click();
			
		
	        
		     Thread.sleep(5000);
	     
	     Set<String> handel = driver.getWindowHandles();
	     
	     Iterator<String> it = handel.iterator();
	     
	     String parantwindow = it.next();
	     String childwindow = it.next();
	     
	     driver.switchTo().window(childwindow);
	     
	     //CommonMethodes.wait1(driver, 10);
	     Thread.sleep(5000);

	     
	     
		
	}

	public void selectRoom(WebDriver driver) throws InterruptedException
	{	     Thread.sleep(15000);	 

		WebElement element1 = selectRoom;	
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
	     Thread.sleep(100);
	     element1.click();
	     Thread.sleep(10000);	
	    
	     
	}
	
	public void Calculate_the_AmountOnReviewPage(WebDriver driver) throws InterruptedException
	{
		
		WebElement AdultCharges = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]"));
        String adultCharges = AdultCharges.getText();
        String adultCharges1 = adultCharges.replace("₹", "").replace(",", "").trim();		
        double AdultTotalAmount = Double.parseDouble(adultCharges1);
        System.out.println("AdultTotalAmount :"+AdultTotalAmount);
        
        Thread.sleep(500);
        
        WebElement ChildCharges = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/p[1]"));
        String childCharges = ChildCharges.getText();
        String childCharges1 = childCharges.replace("₹", "").replace(",", "").trim();		
        double ChildTotalAmount = Double.parseDouble(childCharges1);
        System.out.println("ChildTotalAmount :"+ChildTotalAmount);
        
        Thread.sleep(500);
        
        
        WebElement InfantsCharges = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/p[1]"));
        String infantsCharges = InfantsCharges.getText();
        String infantsCharges1 = infantsCharges.replace("₹", "").replace(",", "").trim();		
        double InfantsTotalAmount = Double.parseDouble(infantsCharges1);
        System.out.println("InfantsTotalAmount :"+InfantsTotalAmount);
        
        Thread.sleep(500);
        
    	WebElement Taxes = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/p[1]"));
        String Taxes1 = Taxes.getText();
        String Taxes2 = Taxes1.replace("₹", "").replace(",", "").trim();		
        double TaxesTotalAmount = Double.parseDouble(Taxes2);
        System.out.println("TaxesTotalAmount :"+TaxesTotalAmount);

        Thread.sleep(1000);

        
        WebElement TotalPrice = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[2]/p[1]/b[1]"));
        String TotalPrice1= TotalPrice.getText();
        String TotalPrice2 = TotalPrice1.replace("₹", "").replace(",", "").trim();		
        double TotalPriceAmount = Double.parseDouble(TotalPrice2);
        System.out.println("TotalPriceAmount :"+TotalPriceAmount);
  
        Thread.sleep(1000);

        
       double TotalAmount = AdultTotalAmount + ChildTotalAmount +InfantsTotalAmount+TaxesTotalAmount ;
       System.out.println("TotalAmount :"+TotalAmount);
       Thread.sleep(1000);

       
       Assert.assertEquals(TotalAmount, TotalPriceAmount);
       
        
		

	}
	
	public void Calculate_the_AmountOn_ConformationPage(WebDriver driver) throws InterruptedException
	{
		
		WebElement RoomCharges = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/span[2]"));
        String roomCharges = RoomCharges.getText();
        String roomCharges1 = roomCharges.replace("₹", "").replace(",", "").trim();		
        double RoomAmount = Double.parseDouble(roomCharges1);
        System.out.println("RoomAmount :"+RoomAmount);
        
        Thread.sleep(1000);
        
    	WebElement Taxes = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/span[2]"));
        String Taxes1 = Taxes.getText();
        String Taxes2 = Taxes1.replace("₹", "").replace(",", "").trim();		
        double TaxesAmount = Double.parseDouble(Taxes2);
        System.out.println("TaxesAmount :"+TaxesAmount);

        Thread.sleep(1000);

        
        WebElement TotalPayable = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[5]/div[1]/div[1]/div[2]/span[2]"));
        String TotalPayable1 = TotalPayable.getText();
        String TotalPayable2 = TotalPayable1.replace("₹", "").replace(",", "").trim();		
        double TotalPayableAmount = Double.parseDouble(TotalPayable2);
        System.out.println("TotalPayableAmount :"+TotalPayableAmount);
  
        Thread.sleep(1000);

        
       double TotalAmount = RoomAmount + TaxesAmount ;
       System.out.println("TotalAmount :"+TotalAmount);
       Thread.sleep(1000);

       
       Assert.assertEquals(TotalAmount, TotalPayableAmount);
       
        
		

	}
	
	
	
	public void selectadultforRoom(WebDriver driver,String RoomString) throws InterruptedException
	{
		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		
		  
		   try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='theme5_alertbutton__AHGSE']")));

		            popup.findElement(By.xpath("//div[@class='theme5_alertbutton__AHGSE']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		
		
		
		if(Room==1) {
			CommonMethodes.scrollDown(driver);
			Thread.sleep(300);

		  WebElement element= AdultFoeRoom1;
		     Thread.sleep(100);
		     element.click();
		     Thread.sleep(100);
		     SelectAdult1.click();
		 

		}
		
		else if(Room==2) 
			
		{			CommonMethodes.scrollDown(driver);
	     Thread.sleep(300);

			WebElement element= AdultFoeRoom1;
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(100);
	     SelectAdult1.click();
	     Thread.sleep(100);
	     PassPAN1.sendKeys("HHJPK4757B");
	     Thread.sleep(300);
	     WebElement element1= AdultFoeRoom2;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element1.click();
	     Thread.sleep(100);
	     SelectAdult2.click();
	     Thread.sleep(100);
	     PassPAN2.sendKeys("HHJPK4757C");
	     Thread.sleep(500);
		}
		
		else if(Room==3) 
		
		{			CommonMethodes.scrollDown(driver);
	     Thread.sleep(300);

			WebElement element= AdultFoeRoom1;
		     //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(100);
	     SelectAdult1.click();
	     Thread.sleep(100);
	     PassPAN1.sendKeys("HHJPK4757B");
	     Thread.sleep(300);
	     WebElement element1= AdultFoeRoom2;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element1.click();
	     Thread.sleep(100);
	     SelectAdult2.click();
	     Thread.sleep(100);
	     PassPAN2.sendKeys("HHJPK4757C");
	     Thread.sleep(300);
	     WebElement element2= AdultFoeRoom3;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element2.click();
	     Thread.sleep(100);
	     SelectAdult3.click();
	     Thread.sleep(100);
	     PassPAN3.sendKeys("HHJPK4757D");
	     Thread.sleep(500);
}
		
		else if(Room==4) 
		
		{ 			CommonMethodes.scrollDown(driver);
	     Thread.sleep(300);

			WebElement element= AdultFoeRoom1;
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(100);
	     SelectAdult1.click();
	     Thread.sleep(100);
	     PassPAN1.sendKeys("HHJPK4757B");
	     Thread.sleep(300);
	     WebElement element1= AdultFoeRoom2;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element1.click();
	     Thread.sleep(100);
	     SelectAdult2.click();
	     Thread.sleep(100);
	     PassPAN2.sendKeys("HHJPK4757D");
	     Thread.sleep(300);
	     WebElement element2= AdultFoeRoom3;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element2.click();
	     Thread.sleep(100);
	     SelectAdult3.click();
	     Thread.sleep(100);
	     PassPAN3.sendKeys("HHJPK4757E");
	     Thread.sleep(300);
	     WebElement element3= AdultFoeRoom4;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
	     Thread.sleep(500);
	     element3.click();
	     Thread.sleep(100);
	     SelectAdult4.click();
	     Thread.sleep(100);
	     PassPAN4.sendKeys("HHJPK4757F");
	     Thread.sleep(500);
}

			 
	}
	
	public void selectadultforRoomwithoutLogin(WebDriver driver,String RoomString) throws InterruptedException
	{
		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		
		if(Room==1) {
			CommonMethodes.scrollDown(driver);
			Thread.sleep(500);
			Title1.click();
			Thread.sleep(300);
			Mr1.click();
			Thread.sleep(300);
			first_name_01.sendKeys("Digambar");
			Thread.sleep(300);
			LastName1.sendKeys("Karande");
			Thread.sleep(300);
			email_01.sendKeys("bhwbdbwwb@gmail.com");
			Thread.sleep(300);
			phone_no_01.sendKeys("1561485648451");
			Thread.sleep(300);
			pan_no_01.sendKeys("HHJPK4959B");
			Thread.sleep(500);


		}
		
		else if(Room==2) 
			
		{	
			CommonMethodes.scrollDown(driver);
		Thread.sleep(300);
		Title1.click();
		Thread.sleep(100);
		Mr1.click();
		Thread.sleep(100);
		first_name_01.sendKeys("Digambar");
		Thread.sleep(100);
		LastName1.sendKeys("Karande");
		Thread.sleep(100);
		email_01.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_01.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_01.sendKeys("HHJPK4959B");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(500);
		Title2.click();
		Thread.sleep(100);
		Mr2.click();
		Thread.sleep(100);
		first_name_02.sendKeys("omkar");
		Thread.sleep(100);
		LastName2.sendKeys("Karande");
		Thread.sleep(100);
		email_02.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_02.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_02.sendKeys("HHJPK4959C");
		Thread.sleep(300);
		
	     
		
}
		
		else if(Room==3) 
		
		{					CommonMethodes.scrollDown(driver);
		Thread.sleep(500);
		Title1.click();
		Thread.sleep(100);
		Mr1.click();
		Thread.sleep(100);
		first_name_01.sendKeys("Digambar");
		Thread.sleep(100);
		LastName1.sendKeys("Karande");
		Thread.sleep(100);
		email_01.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_01.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_01.sendKeys("HHJPK4959D");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(500);
		Title2.click();
		Thread.sleep(100);
		Mr2.click();
		Thread.sleep(100);
		first_name_02.sendKeys("omkar");
		Thread.sleep(100);
		LastName2.sendKeys("Karande");
		Thread.sleep(100);
		email_02.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_02.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_02.sendKeys("HHJPK4959E");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(500);
			Title3.click();
			Thread.sleep(100);
			Mr3.click();
			Thread.sleep(100);
			first_name_03.sendKeys("Vinod");
			Thread.sleep(100);
			LastName3.sendKeys("Karande");
			Thread.sleep(100);
			email_03.sendKeys("bhwbdbwwb@gmail.com");
			Thread.sleep(100);
			phone_no_03.sendKeys("1561485648451");
			Thread.sleep(100);
			pan_no_03.sendKeys("HHJPK4959F");
			Thread.sleep(300);
	
}
		
		else if(Room==4) 
		
		{ 			CommonMethodes.scrollDown(driver);
		Thread.sleep(500);
		Title1.click();
		Thread.sleep(100);
		Mr1.click();
		Thread.sleep(100);
		first_name_01.sendKeys("Digambar");
		Thread.sleep(100);
		LastName1.sendKeys("Karande");
		Thread.sleep(100);
		email_01.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_01.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_01.sendKeys("HHJPK4959B");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(500);
		Title2.click();
		Thread.sleep(100);
		Mr2.click();
		Thread.sleep(100);
		first_name_02.sendKeys("Omkar");
		Thread.sleep(100);
		LastName2.sendKeys("Karande");
		Thread.sleep(100);
		email_02.sendKeys("bhwbdbwwb@gmail.com");
		Thread.sleep(100);
		phone_no_02.sendKeys("1561485648451");
		Thread.sleep(100);
		pan_no_02.sendKeys("HHJPK4959C");
		Thread.sleep(300);
		
	     
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(500);
			Title3.click();
			Thread.sleep(100);
			Mr3.click();
			Thread.sleep(100);
			first_name_03.sendKeys("Vinod");
			Thread.sleep(100);
			LastName3.sendKeys("Karande");
			Thread.sleep(100);
			email_03.sendKeys("bhwbdbwwb@gmail.com");
			Thread.sleep(100);
			phone_no_03.sendKeys("1561485648451");
			Thread.sleep(100);
			pan_no_03.sendKeys("HHJPK4959D");
			Thread.sleep(300);
			
		     
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
				Thread.sleep(500);
				Title4.click();
				Thread.sleep(100);
				Mr4.click();
				Thread.sleep(100);
				first_name_04.sendKeys("Vinyak");
				Thread.sleep(100);
				LastName4.sendKeys("Karande");
				Thread.sleep(100);
				email_04.sendKeys("bhwbdbwwb@gmail.com");
				Thread.sleep(100);
				phone_no_04.sendKeys("1561485648451");
				Thread.sleep(100);
				pan_no_04.sendKeys("HHJPK4959E");
				Thread.sleep(300);
}

			 
	}
	
	public void clickoncontinuebutton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(500);

	CommonMethodes.scrollDown(driver);
	Thread.sleep(500);
	CommonMethodes.scrollDown(driver);
	//Thread.sleep(500);

	//CommonMethodes.waitForElementToBeVisible(driver, Continue_Booking, 20);
		Continue_Booking.click();	
		Thread.sleep(500);

			 
	}
	
	public void  clickcontinuebuttonAndProccedpayment(WebDriver driver,String RoomString) throws InterruptedException
	{
		
		String stringRoom=RoomString;
		Integer Room = Integer.valueOf(stringRoom);
		Thread.sleep(500);
		
		if(Room==1) {
			Thread.sleep(500);

		CommonMethodes.scrollDown2(driver);
		Thread.sleep(500);

		     continubutton.click();

			
		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     
		     Thread.sleep(15000);		
		}
		
		else if(Room==2) {
			
			
			WebElement element= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		     Thread.sleep(500);
		     element.click();

		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     Thread.sleep(15000);	
			
		}
		
		else if (Room==3)
		{
			WebElement element= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		     Thread.sleep(500);
		     element.click();

		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     Thread.sleep(15000);
		}
		else if(Room==4)
		{
			WebElement element= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		     Thread.sleep(500);
		     element.click();

		     try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'Continue')])[1]")));

		            popup.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Pop-up not present");
		        }
		     Thread.sleep(15000);

		}
		
		

	}
	

	
	
	
	
	
	
	
	
	

}
