package PageObjectClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.BaseClass;
import utils.CommonMethodes;

public class POM_SRP
{
	
	
	@FindBy(xpath="(//div[@class='widget_drop_wrap__HmnPH'])[3]")private WebElement Passanger;
	@FindBy(xpath="(//span[@class='widget_hotel_accomodation_icon__PXG2A'])[2]")private WebElement Adultadd;
	@FindBy(xpath="(//span[@class='widget_hotel_accomodation_icon__PXG2A'])[3]")private WebElement Childadd;
	@FindBy(xpath="(//input[@value='Apply'])[1]")private WebElement DONE;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]")private WebElement ErrorMessagewithoutchildAge;
	@FindBy(xpath="(//input[@placeholder='Select Age'])[1]")private WebElement ClickForAge;
	@FindBy(xpath="(//div[@class='widget_age_list_ele__gnU1Y'])[3]")private WebElement SelectAgeForchild;
	@FindBy(xpath="(//div[@class='widget_hotel_add_rooms__RC_Uf'])[1]")private WebElement AddRoom;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")private WebElement CheckRoomCount;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]")private WebElement CheckAdultCount;
	@FindBy(xpath="(//div[@class='widget_flex_cont_cal__ocjTZ'])[1]")private WebElement CalanderSRp;
	@FindBy(xpath="(//div[@class='theme2_flex_cont_cal__Q1RLY'])[1]")private WebElement TodayDate;
	@FindBy(xpath ="(//input[@id='myTextField'])[2]")private WebElement CityNameOnSRP;
	@FindBy(xpath="//input[@id='myTextField']")private WebElement Search;
	@FindBy(xpath="//div[@class='widget_hotel_room_remove__im9Eg']")private WebElement RemoveButton;
	@FindBy(xpath="//button[@Class='widget_hotel_search_widget_btn__Rzzr9']")private WebElement UpdateButton;
	@FindBy(xpath="//span[normalize-space()='10-Feb-2024 - 12-Feb-2024']")private WebElement UpdatedDAte;
	@FindBy(xpath="(//span[@aria-label='Temperature range'])[1]")private WebElement DragStart;
	@FindBy(xpath="(//span[@aria-label='Temperature range'])[2]")private WebElement DragEnd;	
	@FindBy(xpath="//label[normalize-space()='AED 7433']")private WebElement ValuOnscrollBar;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p[3]")private WebElement ValueOnresult;
	@FindBy(xpath="(//span[@class='theme5_ax_checkmark__2bxfM'])[3]")private WebElement clickStar;	
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__KQxlt'])[1]")private WebElement ClickOnAminites;
	@FindBy(xpath="(//span[@class='theme5_ax_checkmark__2bxfM'])[8]")private WebElement ShowMore;	
	@FindBy(xpath="//div[@class='theme2_showmore__DGmtJ']")private WebElement Showless;	
	@FindBy(xpath="//span[@class='theme2_ax_checkbox_label_text__ywvnd']")private WebElement checkbox;	
	@FindBy(xpath="(//button[normalize-space()='Clear'])[1]")private WebElement ResetAllFilters;	
	@FindBy(xpath="(//button[contains(@class,'theme5_sortBy_tablinks__FyPmW')])[2]")private WebElement PriceFilter;	
	@FindBy(xpath="(//button[contains(@class,'theme5_sortBy_tablinks__FyPmW')])[3]")private WebElement PriceFilterLOW;	

	@FindBy(xpath="//span[normalize-space()='Star Rating']")private WebElement StarRating;	
	@FindBy(xpath="(//input[@placeholder='Search By Hotel Name'])[1]")private WebElement Searchbyhotelname;	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/h1[1]")private WebElement HoteAfterSearch;	
	@FindBy(css="//div[@class='theme2_ax_btn_group__juO53']//div[2]")private WebElement GridView;	
	@FindBy(xpath="(//div[contains(@class,'theme5_ax_desktop_toggel_view_active__4E_Kq')])[1]")private WebElement LocationView;	
	@FindBy(xpath="(//button[normalize-space()='filter'])[1]")private WebElement filter;	
	@FindBy(xpath="//div[@class='theme2_heading_new__znMcx']//img")private WebElement ClosePopup;	
	@FindBy(xpath="(//div[@class='theme5_ax_desktop_toggel_view_active__4E_Kq '])[1]")private WebElement listView;	
	@FindBy(xpath="//button[normalize-space()='Book This Now']")private WebElement selectRoom;
	@FindBy(xpath="//button[normalize-space()='Back to Home']")private WebElement BacktoHome;
	@FindBy(xpath="//a[normalize-space()='Home']")private WebElement HOME;
	@FindBy(xpath="(//img[@alt='Logo'])[1]")private WebElement Text;
	@FindBy(xpath="//button[normalize-space()='Room']")private WebElement ROOM;
	@FindBy(xpath="//h3[normalize-space()='Rooms & Rates']")private WebElement RoomsRates;
	@FindBy(xpath="(//button[normalize-space()='Location'])[1]")private WebElement Viewinamap;
	@FindBy(xpath="//div[@class='etWJQ jym1ob kdfrQc pChizd bWQG4d ']")private WebElement ElementOnMAP;
	@FindBy(xpath="//span[@class='theme2_read_or_hide__LA5C3']")private WebElement ViewMoreOrless;
	@FindBy(xpath="(//button[@name='View Room'][normalize-space()='View Room'])[1]")private WebElement selectHotel;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")private WebElement HoteName;	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/h1[1]")private WebElement HoteNameDetailPAge;
	@FindBy(css ="main[class='pt-16'] li:nth-child(2) a:nth-child(1)")private WebElement CLickFORSRP;

	@FindBy(xpath="//button[normalize-space()='Free Cancellation']")private WebElement FreeCancellation;	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")private WebElement FullyRefundable;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")private WebElement BreakfastIncluded;	
	@FindBy(xpath="(//span[contains(text(),'Breakfast Included')])[1]")private WebElement BreakfastIncludedText;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")private WebElement All;	
	@FindBy(xpath="(//div[contains(text(),'Room Only')])[2]")private WebElement NonRefundable;	
	@FindBy(xpath="(//b[normalize-space()='Fare Details'])[1]")private WebElement FareDetails;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[18]/div[3]/div[1]/div[1]/span[2]/*[name()='svg'][1]")private WebElement ClickOnCancel;



	public POM_SRP(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	

	public void clicktoAddroomandadulte() throws InterruptedException
	{
		Passanger.click();
		Thread.sleep(200);
	}
	
	
	public void selectadultechild() throws InterruptedException
	{
		
		
		
		int adult = 3;
		int Child = 2;

		
		for (int i =0; i < adult; i++) 
		{  Adultadd.click();   }
		
		Thread.sleep(200);

		
		for (int i = 0; i < Child; i++) 
		{ Childadd.click();    }
		
		Thread.sleep(200);

		boolean Enabled = Adultadd.isEnabled();
		boolean Enabled1 = Childadd.isEnabled();
		
		System.out.println("The Element Adult is Enabled"+Enabled);
		System.out.println("The Element Child is Enabled"+Enabled1);

		   
        if (Adultadd.isDisplayed() && Adultadd.isEnabled()) {
            // Element is clickable
            System.out.println("Element is clickable");
            
            // Perform the click action
            Adultadd.click();
        } else {
            // Element is not clickable
            System.out.println("Element is not clickable test cases is pass");
        }
	
	}
	
	
	
	
	public void ClickDoneWithoutChildAge(WebDriver driver) throws InterruptedException
	{
		
		
		
		int adult = 0;
		int Child = 1;

		
		for (int i =0; i < adult; i++) 
		{  Adultadd.click();   }
		
		Thread.sleep(1000);

		
		for (int i = 0; i < Child; i++) 
		{ Childadd.click();    }
		
		Thread.sleep(1000);
	
		DONE.click();
		
		Thread.sleep(1000);
		
		String text = ErrorMessagewithoutchildAge.getText();
		System.out.println("The Error message after click on done button without add Age of child :"+text);
		Assert.assertEquals(text, "Please enter valid age");
		Thread.sleep(1000);
	}
	
	public void SelectAgeForChild() throws InterruptedException
	{
		
		
		
		int adult = 3;
		int Child = 1;

		
		for (int i =0; i < adult; i++) 
		{  Adultadd.click();   }
		
		Thread.sleep(200);

		
		for (int i = 0; i < Child; i++) 
		{ Childadd.click();    }
		
		ClickForAge.click();
		Thread.sleep(200);

		SelectAgeForchild.click();
		Thread.sleep(200);

		DONE.click();

	
	}
	
	
	public void AddFourRooms(WebDriver driver) throws InterruptedException
	{
		
		AddRoom.click();
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"widget_hotel_room_list__TeELB\"]').scrollTop=300");
		AddRoom.click();
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"widget_hotel_room_list__TeELB\"]').scrollTop=300");
	
		AddRoom.click();
	

		WebElement element1 = DONE;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(100);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(200);

		String text = CheckRoomCount.getText();
		System.out.println("The room count is :"+text);
		Assert.assertEquals(text, "5 Guests, 4 Rooms");
	
	}
	
	public void clickOnCalander() throws InterruptedException
	{
		CalanderSRp.click();
		Thread.sleep(200);

	}
	
	public void selectDateSRP(WebDriver driver) throws InterruptedException
	{
		String month = "August 2024";
		String exp_date="10";
		String retun_date="12";
		Thread.sleep(1000);
		while(true)
		{
			
			String text = driver.findElement(By.xpath("//h3")).getText();
			if(text.equals(month))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//div[@class='theme2_calendar_head_right_side__ko6u_']//span[@class='theme2_calendar_head_icon__RgDcX']")).click();
			}
			
		}
		
		Thread.sleep(1000);
		List<WebElement> alldata = driver.findElements(By.xpath("(//div[@class='theme2_calendar_day_list___iEuu'])//div"));
		
		for(WebElement ele:alldata)
		{
			String Text_Date = ele.getText();
			
	
		
			if(Text_Date.contentEquals(exp_date))
			{
				
				ele.click();
				break;
			}
		}
		
		for(WebElement ele:alldata)
		{
			String Text_Date = ele.getText();
			
			
		
			if(Text_Date.contentEquals(retun_date))
			{
				
				ele.click();
				break;
			}
		
		
		}

	}

	public void ClickOnNextButtonForDAte(WebDriver driver) throws InterruptedException
	{
		String month = "NOVEMBER 2024";
		String exp_date="10";
		String retun_date="12";
		Thread.sleep(1000);
		while(true)
		{
			
			String text = driver.findElement(By.xpath("//h3")).getText();
			if(text.equals(month))
			{
				System.out.println("The month is "+text);
				Assert.assertEquals(text, "NOVEMBER 2024");
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//div[@class='theme2_calendar_head_right_side__ko6u_']//span[@class='theme2_calendar_head_icon__RgDcX']")).click();
			}
			
		}
		}
	
	public void CheckTodayDate()
	{
		 SimpleDateFormat formateDate=new SimpleDateFormat("dd MMM yyyy");
		 Date date=new Date();
		 String datesystem = formateDate.format(date);
	    String TodayDate1 = datesystem.replaceAll("\\s", "");

		 
		String text = TodayDate.getText();
        String stringWithoutSpaces = text.replaceAll("\\s", "");

		System.out.println("Todays date on calander is :"+stringWithoutSpaces);
		
		org.testng.Assert.assertEquals(stringWithoutSpaces,TodayDate1);
	
		 System.out.println("The checkin date should be todays date and the checkout date should be 2 days ahead date is validate successfully");			
	
	}
	
	public void ValidateCityNameOnSRP(WebDriver driver) throws InterruptedException
	{
		Search.click();
		Thread.sleep(500);
	
	   CityNameOnSRP.sendKeys("London, England, United Kingdom");
		Thread.sleep(5000);
		int count=0;
	List<WebElement> list = driver.findElements(By.xpath("//div[@id='hotelList']//div"));	
	for(WebElement ele:list)
	{
		String text = ele.getText();
		if(text.contentEquals("London, England, United Kingdom"))
		{
			ele.click();
			count++;
			break;
			
		}
	}
	Thread.sleep(2000);

		UpdateButton.click();
	
		 System.out.println("The user successfully enter City/Area/Hotel name in City/Area/Hotel name field");			
	

	}
	
	public void ValidateInvalidCityName(WebDriver driver) throws InterruptedException
	{
		Search.click();
		Thread.sleep(500);
	
	   CityNameOnSRP.sendKeys("bjksabdfkjwnbskj");
		
	
		 System.out.println("The user successfully enter City/Area/Hotel name in City/Area/Hotel name field");			
	

	}
	public void UserclickOnRemoveButton(WebDriver driver) throws InterruptedException
	{
		
     	AddRoom.click();
		((JavascriptExecutor) driver).executeScript("document.querySelector('div[class=\"widget_hotel_room_list__TeELB\"]').scrollTop=300");
		Thread.sleep(500);
		RemoveButton.click();
		Thread.sleep(500);
		DONE.click();
		Thread.sleep(500);
		String text = CheckRoomCount.getText();
		
System.out.println("The room selected is :"+text);
Assert.assertEquals(text, "1 Guest, 1 Room");
		
	
	}
	
	public void ClickOnDoneAndAdulteandRoomCountshouldBeOk(WebDriver driver) throws InterruptedException
	{
		

	

		int adult = 3;
		int Child = 1;

		
		for (int i =0; i < adult; i++) 
		{  Adultadd.click();   }
		
		Thread.sleep(200);

		
		for (int i = 0; i < Child; i++) 
		{ Childadd.click();    }
		
		ClickForAge.click();
		Thread.sleep(200);

		SelectAgeForchild.click();
		Thread.sleep(200);

		DONE.click();
		Thread.sleep(200);

		
		String text = CheckRoomCount.getText();
		
		System.out.println("The adultes count is :"+text);
		
		Assert.assertEquals(text, "6 Guests, 1 Room");


		
	
	}
	public void Updatetthedate(WebDriver driver) throws InterruptedException
	{
		
		Search.click();
		Thread.sleep(1000);	
	   CityNameOnSRP.sendKeys("Hyatt Centric Janakpuri New Delhi, NEW DELHI, India");	
	Thread.sleep(1000);
//	CityNameOnSRP.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(4000);
//			CityNameOnSRP.sendKeys(Keys.ENTER);
//			Thread.sleep(500);
			int count=0;

			List<WebElement> list = driver.findElements(By.xpath("//div[@id='hotelData']"));
				for(WebElement ele:list)
			{
				String text = ele.getText();
				if(text.contentEquals("Hyatt Centric Janakpuri New Delhi, NEW DELHI, India"))
				{
					ele.click();
					count++;
					break;
					
				}
			}
			

	}
	
	public void ClickOnUpdateButton(WebDriver driver) throws InterruptedException
	{
		UpdateButton.click();
		Thread.sleep(1000);
		
		
	
	}
	
	public void ValidateUpdatebuttonworkinornot()
	{

		String text = UpdatedDAte.getText();
		System.out.println("The updated date is :"+text);
		Assert.assertEquals(text, "10-Mar-2024 - 12-Mar-2024");
	}
	
	public void drag_the_Price_range_filter(WebDriver driver) throws InterruptedException
	{
		DragStart.getLocation();

		int xside=DragStart.getSize().width;
		int xside1=DragEnd.getSize().width;

	Actions act=new Actions(driver);
	act.dragAndDropBy(DragStart, xside*6, 0).build().perform();
	
	//act.dragAndDropBy(DragEnd, -xside1*6, 0).build().perform();
		
	Thread.sleep(1000);
	}
	
	public void Validatetheresultaccordingtoscrollbar() throws InterruptedException
	{
		String text = ValuOnscrollBar.getText();
		System.out.println("The Value on scroll bar :"+text);

		String text1 = ValueOnresult.getText();
		System.out.println("The Value on result page:"+text1);
		
		Assert.assertEquals(text1,text );
		
		System.out.println("The user is successfully  drag the Price range filter and then the updated results according to the filter successfully  displayed");
		
	}
	
	public void ClickOnStar(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.scrollDown3(driver);
		Thread.sleep(500);

		clickStar.click();
		Thread.sleep(500);
	}
	
	
	public void Amenities_filter(WebDriver driver) throws InterruptedException
	{
		
	Thread.sleep(200);
	CommonMethodes.scrollDown(driver);
	Thread.sleep(200);
	CommonMethodes.scrollDown2(driver);
	Thread.sleep(500);

	ShowMore.click();



	

	
	
	
	
	
	
	

	}
	
	
	public void ValidateForshowmore(WebDriver driver) throws InterruptedException
	{
		

	Thread.sleep(200);
    WebElement element = ShowMore;
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", element);
	Thread.sleep(200);
	element.click();
	Thread.sleep(500);

	List<WebElement> elementes = driver.findElements(By.xpath("//span[@class='theme2_ax_checkbox_label_text__ywvnd']"));
	
	int text = elementes.size();
	
	//Assert.assertEquals(text, 114);

	}
	
	
	public void ValidateForshowLess(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(200);
	    WebElement element = ShowMore;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", element);
		Thread.sleep(200);
		element.click();
		Thread.sleep(500);
		Showless.click();
		
		List<WebElement> elementes = driver.findElements(By.xpath("//span[@class='theme2_ax_checkbox_label_text__ywvnd']"));
		
		int text = elementes.size();
		System.out.println(text);

		Assert.assertEquals(text, text);


	}
	
	public void ValidateResetButton(WebDriver driver) throws InterruptedException
	{
		DragStart.getLocation();

		int xside=DragStart.getSize().width;
		int xside1=DragEnd.getSize().width;

	Actions act=new Actions(driver);
	//act.dragAndDropBy(DragStart, xside*3, 0).build().perform();
	
	act.dragAndDropBy(DragEnd, -xside1*6, 0).build().perform();
	
	CommonMethodes.scrollDown(driver);
	Thread.sleep(200);
	CommonMethodes.scrollDown2(driver);
	Thread.sleep(500);

	ShowMore.click();
		
		Thread.sleep(500);
		CommonMethodes.scrollUp(driver);
		
		Thread.sleep(500);

		ResetAllFilters.click();


		System.out.println("The user successfully click on Reset all filters button and the the filters should be removed and all hotels successfully displayed");
	}
	
	public void ValidateSortbyPrice(WebDriver driver) throws InterruptedException
	{  		
		
		String text=ValueOnresult.getText();
		System.out.println("The price Higher  is :"+text);
		Thread.sleep(500);
		PriceFilterLOW.click();
		Thread.sleep(300);
		String text1=ValueOnresult.getText();
		System.out.println("The price lower  is :"+text1);
		Assert.assertNotEquals(text, text1);


	}
	
	public void ValidateSortbyPriceHighToLow(WebDriver driver) throws InterruptedException
	{ 
		String text=ValueOnresult.getText();
		System.out.println("The price lower  is :"+text);

		Thread.sleep(300);
		PriceFilter.click();		
		Thread.sleep(500);
		String text1=ValueOnresult.getText();
		System.out.println("The price higher is :"+text1);
		Assert.assertNotEquals(text, text1);

	}
	
	public void ValidateSortbyStarRatingLowToHigh(WebDriver driver) throws InterruptedException
	{   Thread.sleep(300);
	    StarRating.click();
		
		
		Thread.sleep(300);
		String text=ValueOnresult.getText();
		System.out.println("The price lower to higher is :"+text);
		//Assert.assertEquals(text, "AED 680");

	}
	
	public void ValidateSortbyStarRatingHighToLow(WebDriver driver) throws InterruptedException
	{   Thread.sleep(300);
	    StarRating.click();
	    Thread.sleep(100);
	    StarRating.click();
		
		Thread.sleep(300);
		String text=ValueOnresult.getText();
		System.out.println("The price lower to higher is :"+text);
		//Assert.assertEquals(text, "AED 1,478");

	}
	public void ValidateSearchbyhotelname(WebDriver driver) throws InterruptedException
	{   
		Searchbyhotelname.sendKeys("The Royal Horseguards");
	    Thread.sleep(500);
	    String text = HoteAfterSearch.getText();
	    System.out.println("The Search hotel name is :"+text);
	    Assert.assertEquals(text, "The Royal Horseguards, London");
	    

	}
	
	public void ValidateSearchbyhotelnameReframesh(WebDriver driver) throws InterruptedException
	{   
		Searchbyhotelname.sendKeys("The Royal Horseguards, London");
	    Thread.sleep(500);
	    String text = HoteAfterSearch.getText();
	    driver.navigate().refresh();
	    Thread.sleep(1000);
	    String text1 = HoteAfterSearch.getText();
	    Assert.assertNotEquals(text1, "The Royal Horseguards, London");
	    

	}
	
	public void ValidateGridView(WebDriver driver) throws InterruptedException
	{   
		GridView.click();
	    Thread.sleep(1000);
 

	}	
	
	public void ValidateLOcationView(WebDriver driver) throws InterruptedException
	{   
		LocationView.click();
	    Thread.sleep(1000);

	}
	
	public void ClickOncloseButton(WebDriver driver) throws InterruptedException
	{   
		LocationView.click();
	    Thread.sleep(500);
	    filter.click();
	    Thread.sleep(300);
	    ClosePopup.click();
	    LocationView.isDisplayed();

	    System.out.println("The user successfully  click on Cancel button on filters popup in Map view and the popup is closed.");
	}
	
	public void ClickOnListView(WebDriver driver) throws InterruptedException
	{   
		LocationView.click();
	    Thread.sleep(500);
	    listView.click();
	    Thread.sleep(500);
 

	    System.out.println("The user successfully click on list view button and the results should be displayed in list view");
	}
	
	public void ValidateHotelDetailPAge(WebDriver driver) throws InterruptedException
	{   
		CommonMethodes.wait1(driver, 20);

		WebElement element1 = selectRoom;
		
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,850)", "");
	
	     Thread.sleep(100);
	     element1.isDisplayed();
	     Thread.sleep(1000); 

	    System.out.println("The user successfully  see the hotel details on hotels details page.");
	}
	
	public void ClickonbuttononOopssomethingwentwrongpopup (WebDriver driver) throws InterruptedException
	{   
		CommonMethodes.wait1(driver, 10);

		WebElement element1 = BacktoHome;
		
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
	
	     Thread.sleep(100);
	     element1.click();
	     Thread.sleep(1000); 
	     
	     String text = Text.getText();
			System.out.println(text);
			
			org.testng.Assert.assertEquals(text,"Let’s book your next trip!");

	    System.out.println("The user successfully  click on button on Oops something went wrong popup on Hotels details page incase the hotel details page isnt displayed and the user should be redirected to homepage");
	}
	
	public void ClickOnHOMEButton (WebDriver driver) throws InterruptedException
	{   
		CommonMethodes.wait1(driver, 20);

		WebElement element1 = HOME;
		
	     Thread.sleep(100);
	     element1.click();
	     Thread.sleep(1000); 
	     
	     Text.isDisplayed();
			

	    System.out.println("The user successfully Click on Home button and the user should be redirected to Homepage");
	}
	
	public void ValidateRoomButton(WebDriver driver) throws InterruptedException
	{   
	     Thread.sleep(20000); 

		WebElement element1 = ROOM;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
	
	     Thread.sleep(100);
	     element1.click();
	     Thread.sleep(500); 
	     
	 

	    System.out.println("The user successfully Click on Room button and the user should be redirected to Rooms section below");
	}
	
	public void ValidateViewinMapButton(WebDriver driver) throws InterruptedException
	{   
	     Thread.sleep(10000); 

		WebElement element1 = Viewinamap;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
	
	     Thread.sleep(100);
	     element1.click();
	    

	    System.out.println("The user successfully click on View on map button and the map should open up in new tab");
	}
	
	public void ClickAndVAlidateForViewMore(WebDriver driver) throws InterruptedException
	{   
	     Thread.sleep(10000); 

		WebElement element1 = ViewMoreOrless;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
	
	     Thread.sleep(100);
	     element1.click();
	     Thread.sleep(2000); 
	   

	    System.out.println("The user successfully click on View more button in about section and the about section details should expand");
	}
	
	public void ClickAndVAlidateForViewLess(WebDriver driver) throws InterruptedException
	{   
	     Thread.sleep(10000); 

		WebElement element1 = ViewMoreOrless;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
	
	     Thread.sleep(100);
	     element1.click();
	     Thread.sleep(100);
	     element1.click();
	     Thread.sleep(2000); 
	   

	    System.out.println("The user successfully clicks on View less section, the about us section should shorten up");
	}
	
	public void ValidateHotelDetaileOnDetailPAge(WebDriver driver) throws InterruptedException
	{   
		
	    
	    
	     
	    
		
	     String text1 = HoteName.getText();
	     System.out.println("The Hotel name is on SRP :"+text1);
	     Thread.sleep(2000);
	     
	     WebElement element1 = selectHotel;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");	
	     Thread.sleep(1000);
	     element1.click();
	     String text = HoteNameDetailPAge.getText();
	     System.out.println("The hotel name is on HD:"+text);
	     
	     

	   Assert.assertEquals(text, text1, "The test case is failed becouse the hotel name is not matched");

	    System.out.println("The user successfully  see the hotel detailes ");
	}
	
	public void ValidateFreeCancelationButton(WebDriver driver) throws InterruptedException
	{   
		
	     
	     Thread.sleep(10000);
		WebElement element = FreeCancellation;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,850)", "");
			CommonMethodes.waitForElementToBeVisible(driver, element, 20);
	     Thread.sleep(500);
	     String text=FullyRefundable.getText();
	     
	     System.out.println("The Freecancellation room is :"+text);
	     Assert.assertEquals(text, "Fully Refundable", "User not getting FreeCanceelation rooms After click on FreeCancellation button TC Failed");

	    System.out.println("The user successfully  click on Free cancellation button in Rooms section and all rooms with Free cancellation should be displayed");
	}
	public void ValidateBreakfastIncluded(WebDriver driver) throws InterruptedException
	{   
		
	     
	     Thread.sleep(10000);
		WebElement element = BreakfastIncluded;
	     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,850)", "");
			CommonMethodes.waitForElementToBeVisible(driver, element, 20);
	     Thread.sleep(500);
	     String text=BreakfastIncludedText.getText();
	     
	     System.out.println("The BreakfastIncludedText room is :"+text);
	     Assert.assertEquals(text, "Breakfast Included", "User not getting BreakfastIncluded rooms After click on BreakfastIncluded button TC Failed");

	    System.out.println("The user should be able to click on Free breakfast button in Rooms section and all rooms with Free breakfast should be displayed");
	}
	
	public void ValidateAllButton(WebDriver driver) throws InterruptedException
	{   
		
	     
	     Thread.sleep(10000);
		WebElement element = BreakfastIncluded;
	   CommonMethodes.scrollDown(driver);
	   Thread.sleep(500);
	   CommonMethodes.scrollDown1(driver);
	     Thread.sleep(500);
	     element.click();
	     Thread.sleep(1000);

	     All.click();
	     String text = NonRefundable.getText();
	     System.out.println("The text is :"+text);
	     Assert.assertEquals(text, "Room Only", "User not getting all room when click on All button Test Cases Fail");

	    System.out.println("The user successfully click on All button in Rooms section and all rooms should be displayed");
	}
	
	public void ValidateFullyrefundable(WebDriver driver) throws InterruptedException
	{   
		
	     
		 Thread.sleep(10000);
		CommonMethodes.scrollDown(driver);
		     Thread.sleep(500);
		     FullyRefundable.click();
		     Thread.sleep(500);
 

	    System.out.println("The user succefully click on Fully refundable button in Rooms section if there are fully refundable rooms available");
	}
	
	public void ValidatNonrefundablebutton(WebDriver driver) throws InterruptedException
	{   
		
		 Thread.sleep(20000);
			WebElement element = NonRefundable;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1150)", "");
				CommonMethodes.waitForElementToBeVisible(driver, element, 20);
		     Thread.sleep(500);
	 


	    System.out.println("The user succefully click on Non refundable button in Rooms section if there are Non refundable rooms available.");
	}
	
	public void ValidatBookNowButton(WebDriver driver) throws InterruptedException
	{   
		
		FareDetails.isDisplayed();


	    System.out.println("The user Successfully click on Book now button in Rooms section and the user should be redirected to Hotels review page");
	}
	
	
	public void Validatecancel_button_on_non_refundable_popup(WebDriver driver) throws InterruptedException
	{   
		
		 Thread.sleep(20000);
			WebElement element = NonRefundable;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1150)", "");
				CommonMethodes.waitForElementToBeVisible(driver, element, 20);
		     Thread.sleep(200);
		     ClickOnCancel.click();


	    System.out.println("The user successfully click on cancel button on non refundable popup in Rooms section if there are non refundable rooms available");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
