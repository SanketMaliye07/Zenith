package PageObjectClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
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

public class POM_HomePage {
	
	
	@FindBy(xpath="//button[contains(@type,'submit')]")private WebElement Login;
	@FindBy(xpath="//img[@alt='Logo']")private WebElement logo;
	@FindBy(xpath="//img[@alt='logo']")private WebElement logoOnHomePage;
	@FindBy(xpath="//div[@class='theme5_hotel_search_wid_inputfield__5beH1']")private WebElement Text;
	@FindBy(xpath="//li[normalize-space()='Hotels']")private WebElement Hotel;
	@FindBy(xpath="(//div[@class='theme5_activity_search_column__yvqrR theme5_activity_search_name__8sWPv'])[1]")private WebElement Origin;
	@FindBy(xpath="//span[normalize-space()='© 2023 Elevate Trips DMCC. All Rights Reserved']")private WebElement HomeDownMess;
	@FindBy(xpath="(//span[@class='theme5_dropZ_arrow__O3ECA'])[1]")private WebElement contactUs;
	@FindBy(xpath="//header[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//a[1]//div[1]")private WebElement Mobile;
	@FindBy(xpath="//body//div[@id='__next']//a[contains(@href,'mailto:web@zenithholidays.com')]//div[1]")private WebElement Email;

	@FindBy(xpath="(//a[normalize-space()='Hotels'])[1]")private WebElement HederHotel;
	@FindBy(xpath="//div[@id='hotelList']")private WebElement HotelLIst;
	@FindBy(xpath="(//span[contains(text(),'Sign Up')])[3]")private WebElement sighnUp;
	@FindBy(xpath="//p[normalize-space()='Login Into Your Account']")private WebElement LoginPageText;
	@FindBy(xpath="(//button[normalize-space()='Sign Up'])[1]")private WebElement SighnUpText;
	@FindBy(xpath="//div[normalize-space()='Please Enter Email Id']")private WebElement ErorrEmail;
	@FindBy(xpath="//div[normalize-space()='Please Enter Password']")private WebElement ErorrPass;
	@FindBy(xpath="//div[@class='theme2_email_error_msg__VxyAT']")private WebElement invalidPass;
	@FindBy(xpath="(//img[@alt='google'])[1]")private WebElement GoogleSighnIn;
	@FindBy(xpath="(//span[@class='theme1_forgot_password__Z3Jx1'])[1]")private WebElement ForgotPAss;
	@FindBy(xpath="(//button[normalize-space()='Reset Password'])[1]")private WebElement MessageOnForgotPage;
	@FindBy(xpath="//button[normalize-space()='Reset Password']")private WebElement ResetPassword;
	@FindBy(xpath="(//div[@class='theme1_email_error_msg__tKyij'])[1]")private WebElement MessageResetPassword;
	@FindBy(xpath="(//input[@placeholder='Enter Email ID'])[1]")private WebElement passEmailonForgotePage;
	@FindBy(xpath="(//div[@class='theme1_email_error_msg__tKyij'])[1]")private WebElement MessagepassEmailonForgotePage;
	@FindBy(xpath="(//div[normalize-space()='Reset password email sent successfully !'])[1]")private WebElement validatemessageonmailPopup;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")private WebElement RememberMeCheckBoox;
	@FindBy(xpath="//button[normalize-space()='Sign Up']")private WebElement ClickOnSighnUp;
	@FindBy(xpath="//div[@class='theme1_email_error_msg__tKyij']")private WebElement MessageClickOnSighnUp;
	@FindBy(xpath="(//input[@id='email'])[1]")private WebElement EmailOnSighnUpPAge;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")private WebElement CheckBoxonsighnupPage;
	@FindBy(xpath="(//p[@class='theme1_form_heading_text__7PSz8'])[1]")private WebElement SighnupFormPage;
	@FindBy(xpath="//div[normalize-space()='Please Enter First Name']")private WebElement ErrorMessageforFirstNAme;
	@FindBy(xpath="//div[normalize-space()='Please Enter Last Name']")private WebElement ErrorMessageForLastName;
	@FindBy(xpath="//div[normalize-space()='Please enter ISD code']")private WebElement ErrorMessageForISDcode;
	@FindBy(xpath="//div[normalize-space()='Please Enter Mobile Number']")private WebElement ErrorMessageForMobileNumber;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]")private WebElement ErrrorMessageForNEwPassword;
	@FindBy(xpath="//div[normalize-space()='Please Re-Enter New Password']")private WebElement ErrorMessageForConfirmPassword;
	@FindBy(xpath="//div[normalize-space()='Please Select Nationality']")private WebElement ErrorMessageForNationality;
	@FindBy(xpath="(//input[@id='password'])[1]")private WebElement passNewPassword;
	@FindBy(xpath="(//input[@id='password'])[2]")private WebElement passconfirmpassword;
	@FindBy(xpath="//div[normalize-space()='Passwords Do Not Match']")private WebElement ErrorPasswordDoNotMatch;
	@FindBy(xpath="(//button[normalize-space()=\"Let's Go\"])[1]")private WebElement ClickOnSighupButtopnOnFormPAge;
	@FindBy(xpath="(//input[@placeholder='Enter Your First Name'])[1]")private WebElement EnterYourFirstName;

	@FindBy(xpath="//input[@placeholder='Email Id*']")private WebElement EmailIDFiledONSighnupFormPAge;
	@FindBy(xpath="(//span[normalize-space()='Enter Origin City'])[1]")private WebElement OriginErrorMessage;
	@FindBy(xpath="(//button[normalize-space()='Flight Search'])[1]")private WebElement FlightSearch;

	
	@FindBy(xpath="(//span[normalize-space()='Enter Destination City'])[1]")private WebElement DestinationErrorMessage;
	@FindBy(xpath="(//input[@id='myTextField'])[1]")private WebElement Origin1;
	@FindBy(xpath="(//div[@id='flightData'])[1]")private WebElement OriginName;
	@FindBy(xpath="(//input[@id='myTextField'])[2]")private WebElement Destination;
	@FindBy(xpath="(//div[@id='flightData'])[1]")private WebElement DestinationName;
	@FindBy(xpath="(//input[@id='myTextField'])[2]")private WebElement searchorigin;
	@FindBy(xpath="(//input[@id='myTextField'])[3]")private WebElement SearchDestination;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]")private WebElement ErrorMessagewithSameorgDest;

	@FindBy(xpath="(//span[normalize-space()='Enter Origin City'])[1]")private WebElement ErrorMessageinvalidOrigin;
	@FindBy(xpath="//div[@class='theme5_flight_search_column__A3gFL theme5_flight_search_depart_multicity__W8CPc theme5_fltTo_multicity__nWG8s']//div[3]")private WebElement ErrorMessageinvalidDestination;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[1]")private WebElement swipeButton;
	@FindBy(xpath="(//input[@id='myTextField'])[1]")private WebElement swipeOrigin;
	@FindBy(xpath="(//input[@id='myTextField'])[2]")private WebElement swipeDestination;
	@FindBy(xpath="//label[normalize-space()='Round Trip']")private WebElement SelectRoundWay;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]")private WebElement RetundateSelected;
	@FindBy(xpath="(//*[name()='svg'])[3]")private WebElement CrossButton;
	@FindBy(xpath="(//p[@class='theme5_roundText__bSm2Q'])[1]")private WebElement AddRetun;
	@FindBy(xpath="(//div[contains(text(),'Economy')])[1]")private WebElement Class;
	@FindBy(xpath="//div[normalize-space()='Premium Economy']")private WebElement Premium_Economy;
	@FindBy(xpath="//div[normalize-space()='First Class']")private WebElement First_Class;
	@FindBy(xpath="//div[normalize-space()='Business']")private WebElement Business_Class;
	@FindBy(xpath="(//div[@class='theme5_flt_pasngrFlx__KkydQ'])[1]")private WebElement Passanger;
	@FindBy(xpath="(//*[name()='path'][@fill-rule='evenodd'])[2]")private WebElement Adultmax;
	@FindBy(xpath="(//*[name()='svg'][@class='theme5_buttons_icon__4jYlP'])[1]")private WebElement Adultmin;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/span[1]")private WebElement AdultCount;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[11]")private WebElement child;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[2]/span[1]")private WebElement childCount;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[13]")private WebElement infent;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/span[1]")private WebElement infentCount;
	@FindBy(xpath="(//button[normalize-space()='Flight Search'])[1]")private WebElement HomeFlightSearch;
	@FindBy(xpath="(//img[@alt='feature-banner'])[3]")private WebElement HolidayPackage;
	@FindBy(xpath="//h1[normalize-space()='Azerbaijan - Baku']")private WebElement HolidayPackageONSRP;
	@FindBy(xpath="(//span[normalize-space()='Europe'])[1]")private WebElement Europ;
	@FindBy(xpath="(//div[@class='feature_content'])")private WebElement Validatedetaliesofcard;
	@FindBy(xpath="//input[@id='myTextField']")private WebElement SearchCity;
	@FindBy(xpath="(//label[normalize-space()='City, Property Name Or Location'])[1]")private WebElement SearchCityAreaHotel;
	@FindBy(xpath="//section[@class='special_offer_wrap']//div[4]//img[1]")private WebElement ClickHotelSpecialOffer;
	@FindBy(xpath="(//span[normalize-space()='Enter Destination'])[1]")private WebElement EnterDestination;
	@FindBy(xpath="(//input[@id='myTextField'])[2]")private WebElement SearchCityname;
	@FindBy(xpath="//input[@value='Dubai, United Arab Emirates']")private WebElement HotelNameOnSRP;
	@FindBy(xpath="(//span[@class='theme5_hotel_dropdown__S5lPu '])[1]")private WebElement calander;
	@FindBy(xpath="(//*[name()='svg'])[3]")private WebElement HotelGestRoom;
	@FindBy(xpath="(//span[contains(text(),'2')])[1]")private WebElement DefultAdulte;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[5]")private WebElement AdultHotel;
	@FindBy(xpath="(//*[name()='svg'])[7]")private WebElement childHotel;
	@FindBy(xpath="(//span[normalize-space()='Terms of use'])[1]")private WebElement TermCondition;

	@FindBy(xpath="(//*[name()='svg'])[6]")private WebElement childHotelMinus;
	@FindBy(xpath="(//*[name()='svg'][@id='Layer_1'])[8]")private WebElement Room1chilage1;
	@FindBy(xpath="(//*[name()='svg'])[4]")private WebElement Adultsubtract;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")private WebElement CheckCountForAdultes;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")private WebElement CheckCountForChild;
	@FindBy(xpath="(//input[@value='Apply'])[1]")private WebElement Done;
	@FindBy(xpath="(//span[@class='theme5_err_message_text__Mri_V'])[1]")private WebElement ErrorMessageAfterclickOnDoneButton;
	@FindBy(xpath="(//div[@class='theme2_age_list_ele__CRcn3'])[4]")private WebElement ChildAgeRoom1;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/span[1]/input[1]")private WebElement AgeValidate;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")private WebElement SelectedRoomValidateONSRP;
	@FindBy(xpath="(//*[name()='path'][@fill-rule='evenodd'])[8]")private WebElement AddRoom2;
	@FindBy(xpath="(//div[@class='theme5_hotel_room_remove__Ns0FV'])[1]")private WebElement RemoveButton;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")private WebElement GuestCountOnSRP;
	@FindBy(xpath="//a[normalize-space()='Search']")private WebElement SearchPAge;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/span[1]")private WebElement CheckResulONSRP;
	@FindBy(xpath="//button[normalize-space()='Reset Filter']")private WebElement Reset_Filter;
	@FindBy(xpath="//a[normalize-space()='Home']")private WebElement Home;
	@FindBy(css ="div[class='theme2_hotel_widget__YAhln'] h1")private WebElement CityNameOnSRP;
	@FindBy(xpath ="(//div[@class='theme2_flex_cont_cal__GrtC6'])[1]")private WebElement CheckInDAte;
	@FindBy(xpath ="(//div[@class='theme2_flex_cont_cal__GrtC6'])[2]")private WebElement CheckOUTDAte;
	@FindBy(xpath ="(//div[@class='theme2_flex_cont_cal__Q1RLY'])[1]")private WebElement CheckInDAteSRP;
	@FindBy(xpath ="(//div[@class='theme2_flex_cont_cal__Q1RLY'])[2]")private WebElement CheckOUTDAteSRP;
	@FindBy(xpath="(//button[normalize-space()='Search'])[1]")private WebElement Search;
	@FindBy(xpath="//div[@class='theme2_hotel_cabin_class_name__yG83S']")private WebElement AdulteandgeusteONHome;
	@FindBy(xpath="//div[@class='theme2_adult_room_flex__ztegX']")private WebElement AdulteandgeusteONSRP;























	


	public POM_HomePage(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	
	public void click_On_logo(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, logo, 1);
		
		Thread.sleep(3000);
		
	}
	
	public void Validate_Text(WebDriver driver) throws InterruptedException
	{
		Origin.isDisplayed();

		
	}
	
	public void click_Hotel(WebDriver driver) throws InterruptedException
	{
	
		CommonMethodes.waitForElementToBeVisible(driver, Hotel, 4);
		Thread.sleep(2000);
	}

	public void click_On_HomePage_logo(WebDriver driver) throws InterruptedException
	{
		//CommonMethodes.waitForElementToBeVisible(driver, logoOnHomePage, 1);
		
		Thread.sleep(2000);
		
	}
	
	public void Validate_HolidayHome(WebDriver driver) throws InterruptedException
	{
		Origin.isDisplayed();
	}
	

	
	public void ScrolldownValidateMess(WebDriver driver) throws InterruptedException
	{
		
		
		
		CommonMethodes.scrollDown(driver);
Thread.sleep(500);
        // Validate scrolling down
        if (CommonMethodes.validateScrolling(driver, "down")) {
            System.out.println("Scrolling down is working properly.");
        } else {
            System.out.println("Scrolling down is not working properly.");
        }

	
	}
	
	public void ScrollUpValidateMess(WebDriver driver) throws InterruptedException
	{
		
		
		CommonMethodes.scrollUp(driver);
		Thread.sleep(500);

	        // Validate scrolling up
	        if (CommonMethodes.validateScrolling(driver, "up")) {
	            System.out.println("Scrolling up is working properly.");
	        } else {
	            System.out.println("Scrolling up is not working properly.");
	        }

	
		
	}
	
	

	public void ClickonContactUs(WebDriver driver) throws InterruptedException
	{
		contactUs.click();
        Thread.sleep(1000);

	}
	
	public void validate_MOBILE_Email(WebDriver driver) throws InterruptedException
	{
		String text=Mobile.getText();
		System.out.println(text);
		String text1=Email.getText();
		
		Assert.assertEquals(text, text, "");
		Assert.assertEquals(text1, text1, "");


		
	}
	
	public void ClickOnHederHotel(WebDriver driver) throws InterruptedException
	{
		HederHotel.click();
       Thread.sleep(500);
	}
	
	public void ValidateHotelHome(WebDriver driver) throws InterruptedException
	{
		HotelLIst.isDisplayed();

	}
	
	public void ClickOnSighnUp(WebDriver driver) throws InterruptedException
	{
		sighnUp.click();
		Thread.sleep(300);

	}
	
	public void ValidateLoginpageText(WebDriver driver) throws InterruptedException
	{
		Login.isDisplayed();


	}
	public void ValidateSighnupPAgeText(WebDriver driver) throws InterruptedException
	{
		SighnUpText.isDisplayed();



	}
	
	public void ValidateErorrMessageOnLogin(WebDriver driver) throws InterruptedException
	{
		String Email = ErorrEmail.getText();
		String pass = ErorrPass.getText();
		
		System.out.println("ErorrEmail :"+Email);
		System.out.println("ErorrPass   :"+pass);
		
		Assert.assertEquals(Email, "Please Enter Email Id");
		Assert.assertEquals(pass, "Please Enter Password");


	}
	
	public void Validateinvalidpass(WebDriver driver) throws InterruptedException
	{
		String pass = invalidPass.getText();
		
		System.out.println("ErorrPass   :"+pass);
		
		Assert.assertEquals(pass, "Invalid Password");


	}
	
	public void ClickOnGoogleSighnIn(WebDriver driver) throws InterruptedException
	{
		
		GoogleSighnIn.click();
		


	}
	
	public void ClickonForgetPass(WebDriver driver) throws InterruptedException
	{
		
		ForgotPAss.click();
		MessageOnForgotPage.isDisplayed();
		
		
		


	}
	
	public void clickandvalidatemesageforresegtpass(WebDriver driver) throws InterruptedException
	{
		
		ResetPassword.click();
		String text = MessageResetPassword.getText();
		System.out.println("MessageResetPassword :"+text);
		
		Assert.assertEquals(text, "Please Enter Email Id");
		
		


	}
	
	public void ValidateMessageinvalidEmail(WebDriver driver) throws InterruptedException
	{
		
		passEmailonForgotePage.sendKeys("bsabdkhabkjanbkj");
		ResetPassword.click();

		String text = MessagepassEmailonForgotePage.getText();
		System.out.println("MessagepassEmailonForgotePage :"+text);
		
		Assert.assertEquals(text, "Please Enter Valid Email Id");
		
		


	}
	
	public void ValidatevalidEmailrecivdeemail(WebDriver driver) throws InterruptedException
	{
		
		passEmailonForgotePage.sendKeys("digambar.karande@vernost.in");
		ResetPassword.click();

		
		


	}
	
	public void CheckRememberMeCheckBoox(WebDriver driver) throws InterruptedException
	{
		
		RememberMeCheckBoox.click();
		Thread.sleep(200);
		
		if (RememberMeCheckBoox.isSelected()) {
		    System.out.println("Checkbox is checked!");
		} else {
		    System.out.println("Checkbox is not checked!");
		}
		
		


	}
	
	public void ValidateMessageBlankemailsighnup(WebDriver driver) throws InterruptedException
	{
		
		ClickOnSighnUp.click();
	
		String text = MessageClickOnSighnUp.getText();
		System.out.println("MessageClickOnSighnUpwith Empty email :"+text);
		
		Assert.assertEquals(text, "Please Enter Email Id");


	}
	
	
	public void ValidateMessageinvalidemailsighnup(WebDriver driver) throws InterruptedException
	{
		EmailOnSighnUpPAge.sendKeys("yjgjgjh");
		Thread.sleep(300);
		ClickOnSighnUp.click();
		Thread.sleep(300);

		String text = MessageClickOnSighnUp.getText();
		Thread.sleep(300);

		System.out.println("MessageClickOnSighnUpwith Empty email :"+text);
		
		Assert.assertEquals(text, "Please Enter Valid Email Id");
		Thread.sleep(300);


	}
	
	public void ValidatecheckBoxOnSighnuppage(WebDriver driver) throws InterruptedException
	{
		
		CheckBoxonsighnupPage.click();
		Thread.sleep(200);
		
		if (CheckBoxonsighnupPage.isSelected()) {
		    System.out.println("Checkbox is checked!");
		} else {
		    System.out.println("Checkbox is not checked!");
		}
		
		Thread.sleep(200);



	}
	
	
	public void ValidateMessageExistemailsighnup(WebDriver driver) throws InterruptedException
	{
		EmailOnSighnUpPAge.sendKeys("digambar.karande@vernost.in");
		ClickOnSighnUp.click();
	    Thread.sleep(500);
		String text = MessageClickOnSighnUp.getText();
		System.out.println("MessageClickOnSighnUpwith Empty email :"+text);
		
		Assert.assertEquals(text, "User with this email already exist");


	}
	
	public void PassValidmailforsighupandredirectonformpage(WebDriver driver) throws InterruptedException
	{
		String num = RandomStringUtils.randomNumeric(4);
		String text = RandomStringUtils.randomAlphanumeric(8);
		
		EmailOnSighnUpPAge.sendKeys("d"+text+num+"hh@gmail.com");
		ClickOnSighnUp.click();


	}
	
	public void PassEmailIDForSighnup(WebDriver driver) throws InterruptedException
	{         
		String num = RandomStringUtils.randomNumeric(4);
		String text = RandomStringUtils.randomAlphanumeric(8);
		
		
		System.out.println("RandomStrin :"+text+num);
		EmailOnSighnUpPAge.sendKeys("d"+text+num+"@gmail.com");
		ClickOnSighnUp.click();

		   Thread.sleep(200);


	}
	
	public void ValidateMessagewithoutfilupformandclickonsighnupu(WebDriver driver) throws InterruptedException
	{
		
		
		
		   Thread.sleep(500);

		EnterYourFirstName.sendKeys("Digambar");
		
		
		
		   Thread.sleep(200);
		CommonMethodes.scrollDown(driver);
		   Thread.sleep(200);
        ClickOnSighupButtopnOnFormPAge.click();
		   Thread.sleep(200);
		   
		   CommonMethodes.scrollUp(driver);

		
		String text = ErrorMessageforFirstNAme.getText();
		   Thread.sleep(200);

		String text1=ErrorMessageForLastName.getText();
		   Thread.sleep(200);

		String text2=ErrorMessageForISDcode.getText();
		   Thread.sleep(200);

		String text3=ErrorMessageForMobileNumber.getText();
		   Thread.sleep(200);

		String text4=ErrrorMessageForNEwPassword.getText();
		   Thread.sleep(200);

		String text5=ErrorMessageForConfirmPassword.getText();
		   Thread.sleep(200);

		String text6=ErrorMessageForNationality.getText();
		   Thread.sleep(200);

		
		Assert.assertEquals(text, "Please Enter First Name");
		Assert.assertEquals(text1, "Please Enter Last Name");
		Assert.assertEquals(text2, "Please enter ISD code");
		Assert.assertEquals(text3, "Please Enter Mobile Number");
		Assert.assertEquals(text4, "Password must be between 8-13 characters in length and must comprise of at least 1 lowercase alphabet (a-z), 1 uppercase alphabet (A-Z), 1 number (0-9) and 1 special character");
		Assert.assertEquals(text5, "Please Re-Enter New Password");
		Assert.assertEquals(text6, "Please Select Nationality");


	}
	
	public void validateMessageforpasswordandconfirmpassword(WebDriver driver) throws InterruptedException
	{
		passNewPassword.sendKeys("Digambar@1997");
		passconfirmpassword.sendKeys("digambar@1997");
		   Thread.sleep(200);
		   
			WebElement element1 = ClickOnSighupButtopnOnFormPAge;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);

	        try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        element1.click();
			   Thread.sleep(200);
			   
				String text5=ErrorPasswordDoNotMatch.getText();
				Assert.assertEquals(text5, "Passwords Do Not Match");






	}
	
	public void ValidateEmailIDFiledisEditableornotOnSighnupFormPg(WebDriver driver) throws InterruptedException
	{
		EmailIDFiledONSighnupFormPAge.isSelected();
		String text = EmailIDFiledONSighnupFormPAge.getText();
      System.out.println("Emaile id :"+text);
      
     


	}
	
	public void ValidateOriginandDestinationErrorMessage(WebDriver driver) throws InterruptedException
	{
		
		FlightSearch.click();
		Thread.sleep(500);
		
		String text = OriginErrorMessage.getText();
		String text1 = DestinationErrorMessage.getText();
		
		Assert.assertEquals(text, "Enter Origin City");
		Assert.assertEquals(text1, "Enter Destination City");
		
	}
	
	public void PassOriginAndDestination(WebDriver driver) throws InterruptedException
	{
		
		
		  try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")));

		            popup.findElement(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Origin not visibale");
		        }
	//Origin.click();
	Thread.sleep(1000);		
	searchorigin.sendKeys("Mumbai");
	Thread.sleep(1000);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Origin not visibale");
	        }
	//OriginName.click();
 Thread.sleep(3000);
  
  try {
  	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")));

          popup.findElement(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")).click();
          
      } catch (Exception e) {
          System.out.println("Origin not Destination");
      }
  //Destination.click();
	Thread.sleep(1000);
	SearchDestination.sendKeys("Mumbai");
	Thread.sleep(1000);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Dstination not visiable");
	        }
	//DestinationName.click();
 Thread.sleep(3000);
	
	
	}
	
	
	public void ValidatesameOriginandDestinationErrorMessage(WebDriver driver) throws InterruptedException
	{
		
		
		FlightSearch.click();
		Thread.sleep(500);
		String text = ErrorMessagewithSameorgDest.getText();
		
		Assert.assertEquals(text, "Origin and destination cannot be same","Test Case is fail ");
		
	}
	
	public void PassinvalidOriginAndDestination(WebDriver driver) throws InterruptedException
	{
		
		
		  try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")));

		            popup.findElement(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Origin not visibale");
		        }
	//Origin.click();
	Thread.sleep(1000);		
	searchorigin.sendKeys("jhbxhbhb");
	Thread.sleep(1000);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Origin not visibale");
	        }
	//OriginName.click();
Thread.sleep(3000);

try {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")));

        popup.findElement(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")).click();
        
    } catch (Exception e) {
        System.out.println("Origin not Destination");
    }
//Destination.click();
	Thread.sleep(1000);
	SearchDestination.sendKeys("bhwbkwbkw");
	Thread.sleep(1000);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Dstination not visiable");
	        }
	//DestinationName.click();
Thread.sleep(3000);
	
	
	}
	
	public void ValidateinvalidOriginandDestinationErrorMessage(WebDriver driver) throws InterruptedException
	{
		FlightSearch.click();
		Thread.sleep(500);
		String text = ErrorMessageinvalidOrigin.getText();
		String text1 = ErrorMessageinvalidDestination.getText();

		
		Assert.assertEquals(text, "Enter Origin City");
		Assert.assertEquals(text1, "Enter Destination City");

		
	}
	
	public void PassiOriginAndDestination(WebDriver driver) throws InterruptedException
	{
		
		
		  try {
		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")));

		            popup.findElement(By.xpath("//div[@id='Flight_From_0']//input[@id='myTextField']")).click();
		            
		        } catch (Exception e) {
		            System.out.println("Origin not visibale");
		        }
	//Origin.click();
	Thread.sleep(1000);		
	searchorigin.sendKeys("Mumbai");
	Thread.sleep(1000);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Origin not visibale");
	        }
	//OriginName.click();
Thread.sleep(3000);

try {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")));

        popup.findElement(By.xpath("//div[@id='Flight_To_0']//input[@id='myTextField']")).click();
        
    } catch (Exception e) {
        System.out.println("Origin not Destination");
    }
//Destination.click();
	Thread.sleep(1000);
	SearchDestination.sendKeys("Dubai");
	Thread.sleep(1000);	
	
	  try {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='flightData'])[1]")));

	            popup.findElement(By.xpath("(//div[@id='flightData'])[1]")).click();
	            
	        } catch (Exception e) {
	            System.out.println("Dstination not visiable");
	        }
	//DestinationName.click();
Thread.sleep(3000);
	
	
	}
	
	
	public void ValidateSwipeButton(WebDriver driver) throws InterruptedException
	{
		swipeButton.click();
	
		
	}
	
	public void SelectRoundTrip(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, SelectRoundWay, 4);
		Thread.sleep(100);


		
	}
	
	public void ValidateRetundateSelectedOrNot(WebDriver driver) throws InterruptedException, ParseException
	{
		RetundateSelected.isSelected();
		String text = RetundateSelected.getText();

		
	Assert.assertNotEquals(text, "Save more Book a round trip");	
	}
	
	public void clickOnCrossButton(WebDriver driver) 
	{
		CrossButton.click();
	}
	
	public void ValidateOnewaydisplayornot(WebDriver driver) 
	{
		AddRetun.isDisplayed();
		
	}
	
	public void clickOnTravelerfield(WebDriver driver)
	{
		CommonMethodes.waitForElementToBeVisible(driver, Passanger, 1);

	}
	
	public void AddAdultePassanger(WebDriver driver,int adultmax) 
	{

		 for (int i = 1; i < adultmax; i++) {
				
				CommonMethodes.waitForElementToBeVisible(driver, Adultmax, 10);
				

	        }
		 
//		 String text = AdultCount.getText();
//			String stringadult =text;
//			Integer adult = Integer.valueOf(stringadult);
//		 Assert.assertEquals(adult, 9);
		 
		 

	}
	
	public void AddAdultePassangerMin(WebDriver driver,int adultmin) 
	{
		for (int i = 1; i < adultmin; i++) {
			
			CommonMethodes.waitForElementToBeVisible(driver, Adultmin, 10);
			

        }
	 
//	 String text = AdultCount.getText();
//		String stringadult =text;
//		Integer adult1 = Integer.valueOf(stringadult);
//	 Assert.assertEquals(adult1, 1);
//		
	}
	
	public void Adultadd(WebDriver driver,int adultmax) 
	{

		 for (int i = 1; i < adultmax; i++) {
				
				CommonMethodes.waitForElementToBeVisible(driver, Adultmax, 10);
				

	        }
	 	
	}
	
	public void ValidateChildCountWithAdult(WebDriver driver,int Child) 
	{
		for (int i = 0; i < Child; i++) {
			
				CommonMethodes.waitForElementToBeVisible(driver, child, 10);

	        }
	 
	 String text = childCount.getText();
	 System.out.println("The Child Count IS :"+text);
		String stringadult =text;
		Integer adult1 = Integer.valueOf(stringadult);
	 Assert.assertEquals(adult1, 6);
		
	}
	
	public void ValidateINfentEqualToAdult(WebDriver driver,int Infent) 
	{
		for (int i = 0; i <Infent; i++) {
		
			CommonMethodes.waitForElementToBeVisible(driver, infent, 10);

	        }
	 
	 String text = infentCount.getText();
	 String text1 = AdultCount.getText();

	 
	 System.out.println("The infent Count IS :"+text);
	 System.out.println("The Adult Count IS :"+text1);

		String stringInfent=text;
		Integer InfentCount= Integer.valueOf(stringInfent);
		
		String stringadult =text1;
		Integer adultCount= Integer.valueOf(stringadult);
	
	 Assert.assertEquals(adultCount, InfentCount);
		
	}
	

	public void ValidateelementOnFlightResultPage(WebDriver driver) throws InterruptedException 
	{
		
		Thread.sleep(50000);

		HomeFlightSearch.isDisplayed();
//		   try {
//		    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		    	 WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Flight Search'])[1]")));
//
//		            popup.findElement(By.xpath("(//a[normalize-space()='Flight Search'])[1]")).isDisplayed();
//		            System.out.println("The elemnet is display succfully");
//		            
//		        } catch (Exception e) {
//		            System.out.println("Element not present");
//		        }

	}
	
	public void ClickOnHolidayPackage(WebDriver driver) throws InterruptedException 
	{
		HolidayPackage.click();
		Thread.sleep(1000);

	}
	

	public void ValidateHolidayPAckageOnsrp(WebDriver driver) throws InterruptedException 
	{
		String text = HolidayPackageONSRP.getText();
		Thread.sleep(100);
		System.out.println("My Holiday Package is :"+text);
		Assert.assertEquals(text, "Azerbaijan - Baku");

	}
	public void ScrollUptoEuropeSectionPage(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(1000);
		
		CommonMethodes.ScrollingView(driver, Europ);
        Thread.sleep(500);
	}
	public void ValidatetheEuropdetailes(WebDriver driver) throws InterruptedException 
	{
		String text = Validatedetaliesofcard.getText();
		System.out.println("The Europ Detailes :"+text);
		
		System.out.println("Date Before changing the formate :"+text);	
        String stringWithoutSpaces = text.replaceAll("\\s", "");
		System.out.println("Date After changing the formate :"+stringWithoutSpaces);
		
		
		Assert.assertEquals(stringWithoutSpaces, "Georgia-Kutaisi3Night/4DaysAED1499");
		
	}
	
	public void ValidateHotelsearchwidgetshouldbedisplayed(WebDriver driver)
	{
		String text = SearchCityAreaHotel.getText();
		System.out.println("The Hotel search widget is :"+text);
		Assert.assertEquals(text, "City, Property Name Or Location");
		
		System.out.println("The user should be able to click the Hotels search widget and Hotel search widget is sucessfully  displayed");

		
	}
	
	public void ValidateredirectioninHotelScrolldownandclickSpecialoffersectionandclick(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.refreshPage(driver);
		CommonMethodes.scrollDown(driver);
		Thread.sleep(500);
		ClickHotelSpecialOffer.click();
		 
	}
	
	
	public void ValidateErrorMessageWithoutdestinationPass(WebDriver driver) throws InterruptedException
	{
		
		
		String text = EnterDestination.getText();
		
		System.out.println("The Hotel search widget is :"+text);
		Assert.assertEquals(text, "Enter Destination");
		
		System.out.println("The user successfully get validation error message Enter Destination");

		
	}
	
	
	public void SelectInvalidecityForHotel(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, SearchCity, 10);
		Thread.sleep(1000);
		SearchCityname.sendKeys("hvhvjhvhg njwnjudnw bhsbnwsnwsb 1111");
		Thread.sleep(1000);
		SearchCityname.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		SearchCityname.sendKeys(Keys.ENTER);

	}
	
	public void ValidatethesearchresultonSRP(WebDriver driver)
	{
       String text = HotelNameOnSRP.getText();
		
		System.out.println("The search Hotel Name Is  :"+text);
		Assert.assertEquals(text, "Dubai, United Arab Emirates");
		
		System.out.println("The user successfully search hotel city area in search filed and get result on SRP");


	}
	
	public void ClickOnCalender(WebDriver driver) throws InterruptedException
	{
		//CommonMethodes.waitForElementToBeVisible(driver, calander, 10);
		calander.click();
         Thread.sleep(2000);


	}
	
	public void ValidateCalenderisselectedornotforHotel(WebDriver driver)
	{
		String text = driver.findElement(By.xpath("(//div[@class='theme5_coln_center_week__deTH7'])[1]")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Mon");
		
		System.out.println("The user is successfully open the calendar on hotel search widget");



	}
	
	public void ValidatArrowOncalander(WebDriver driver)
	{
		String month = "DECEMBER 2024";
		
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
				driver.findElement(By.xpath("//div[@class='theme2_calendar_head_right_side__fAS3N']//span[@class='theme2_calendar_head_icon__7hZRd']")).click();
			}
		
		
	
		}
	
	}
	

	public void ClickOnRoomsandGuests(WebDriver driver) throws InterruptedException
	{
		HotelGestRoom.click();
		Thread.sleep(500);
		
	}
	
	public void ValidatethedefaultguestsinHotel(WebDriver driver) throws InterruptedException
	{
		String text = DefultAdulte.getText();
		System.out.println("The Defulte adulte is :"+text);
		
		Assert.assertEquals(text, "2 Guests, 1 Room");
		
		System.out.println("The user  see 2 Adults selected by default in Rooms and Guests Successfully");
		
		
	}
	
	public void ValidateclickontheMinusiconsonRoomsandGuests(WebDriver driver) throws InterruptedException
	{
		
					 Adultsubtract.click();	
					 String text = CheckCountForAdultes.getText();
					 System.out.println("The Adult count is :"+text);
					 
					 Assert.assertEquals(text, "1");
					 Thread.sleep(500);
					 for (int i = 0; i < 5; i++) 
					 {   childHotel.click();  }
					 
					 Thread.sleep(500);		 
					 childHotelMinus.click();
					 String text1 = CheckCountForChild.getText();
					 System.out.println("The Child count is :"+text1);
					 
					 Assert.assertEquals(text1, "4");
System.out.println("The user Successfully click on the  Minus icons on Rooms and Guests. ");			
				        
		
	}
	public void ValidateMaxGuestSelectInHotelBooking(WebDriver driver) throws InterruptedException
	{
		 for (int i= 2; i < 7; i++) 
		 {   AdultHotel.click();  }
		 
		 String text = CheckCountForAdultes.getText();
		 System.out.println("The adding Adult no is 7"+"But Adult count is only:"+text);
		 
 
		 Assert.assertEquals(text, "7");
		 AdultHotel.isEnabled();
		 System.out.println("The user Successfully  add a maximum of  7 Guests in 1 Room ie the combination of Adult and Child in one room should be max 7.");			

		
	}
	
	public void UserAddedChild(WebDriver driver) throws InterruptedException
	{
		 for (int i = 0; i < 1; i++) 
		 {   childHotel.click();  }	
	}
	
	public void UserclickOntermsAndCondition(WebDriver driver) throws InterruptedException
	{
		TermCondition.click();
		
	}
	public void ClickOnDOneButtonAfertSelectingchiildForHotel(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(500);
		WebElement element1 = Done;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(500);
		
	}
	
	public void ValidatetheErrorMessageAfterclickOnDoneWithoutselectageOfChild(WebDriver driver) throws InterruptedException
	{
		
		 String text1 = ErrorMessageAfterclickOnDoneButton.getText();
		 System.out.println("Error Message After click On Done Button Without add child Age :"+text1);
		 
		 Assert.assertEquals(text1, "Please enter valid age");

		 System.out.println("The user Successfully get Errror message is "+text1+"when the user tries to click on Done button without filling the Childs age.");			

		
	}
	
	public void Click_on_Select_Age_Dropdown(WebDriver driver) throws InterruptedException
	{
		Room1chilage1.click();
		Thread.sleep(100);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(300);
		
		 String text1 = AgeValidate.getText();
		 System.out.println("The selected Age of child is "+text1);
		 
		// Assert.assertEquals(text1, "3");

		 System.out.println("The user Successfully  click on Select Age Dropdown.");			

		
	
	}
	
	public void Click_on_Select_Age_Dropdow_And_Child_Age(WebDriver driver) throws InterruptedException
	{
		Room1chilage1.click();
		Thread.sleep(100);
		WebElement element1 = ChildAgeRoom1;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(100);
		element1.click();
		Thread.sleep(300);
		
		 String text1 = AgeValidate.getText();
		 System.out.println("The selected Age of child is "+text1);
		 
		//Assert.assertEquals(text1, "3");

		 System.out.println("The is successfully  click age between 0 to 12 from the  Select Age Dropdown");			

		
	
	}
	
	public void ValidateRommselectedornotasperrequirement(WebDriver driver) throws InterruptedException
	{
	
		 String text1 = SelectedRoomValidateONSRP.getText();
		 System.out.println("The selecte room for hotel is : "+text1);
		 
		Assert.assertEquals(text1, "28 Guests, 4 Rooms");

		 System.out.println("The user is successfully  add 4 rooms maximum in one search");			

		
	 
	}
	
	public void ClickOnAddRoom(WebDriver driver) throws InterruptedException
	{
		AddRoom2.click();	
		System.out.println("User is successfully added room ");
		Thread.sleep(500);

	}
	
	public void ClickOnRemoveButtonForRemoveAddedRoom(WebDriver driver) throws InterruptedException
	{
		RemoveButton.click();	
		System.out.println("User is successfully Remove the added Room");
		Thread.sleep(100);

	}
	
	public void ValidatetheGuestCountOnSRP(WebDriver driver) throws InterruptedException
	{
	
		 String text1 = GuestCountOnSRP.getText();
		 System.out.println("The total guest count is : "+text1);
		 
		Assert.assertEquals(text1, "10 Guests, 2 Rooms");

		 System.out.println("The user is click on Done button after entering Adults and Childs info and the guest count is correct");			
	

	}
	
	public void ValidateUserRedirectedOrNotOnSearchPage(WebDriver driver) throws InterruptedException
	{
	
		 String text1 = SearchPAge.getText();
		 System.out.println("The validation text onsearch page : "+text1);
		 
		Assert.assertEquals(text1, "Search");


		 System.out.println("The user successfully  redirected to Search page");			
	

	}
	
	public void ValidatResultONSRP(WebDriver driver) throws InterruptedException
	{
	
		 String text1 = CheckResulONSRP.getText();
		 System.out.println("The resultes is on SRP from supplier  "+text1);
		 
		//Assert.assertEquals(text1, "Search");


		 System.out.println("The user is successfully  see the results on search page if the results are coming from the supplier");			
	

	}
	
	
	public void ClickOnResetFilterButton(WebDriver driver) throws InterruptedException
	{		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
Thread.sleep(500);
		Reset_Filter.click();

	
		 System.out.println("The user is successfully click on Reset button on No results found popup on the search page if the user doesnt get the response from the supplier.");			
	

	}
	
	public void ClickOnHome(WebDriver driver) throws InterruptedException
	{
		Home.click();
		Thread.sleep(2000);
		String text = Text.getText();
		System.out.println(text);
		
		org.testng.Assert.assertEquals(text,"City, Property Name Or Location");
	
		 System.out.println("The user is successfully Click on Home button and the user should be redirected to Homepage");			
	

	}
	


	public void ValidateCheckINandCheckOutDate(WebDriver driver) throws InterruptedException
	{
		 SimpleDateFormat formateDate=new SimpleDateFormat("dd MMM yyyy");
		 Date date=new Date();
		 String datesystem = formateDate.format(date);
	    String TodayDate = datesystem.replaceAll("\\s", "");

		 
		String text = CheckInDAte.getText();
        String stringWithoutSpaces = text.replaceAll("\\s", "");

		System.out.println("Todays date on calander is :"+stringWithoutSpaces);
		
		org.testng.Assert.assertEquals(stringWithoutSpaces,TodayDate);
	
		 System.out.println("The checkin date should be todays date and the checkout date should be 2 days ahead date is validate successfully");			
	

	}
	
	
	public void ClickNextbuttonOncalender(WebDriver driver) throws InterruptedException
	{
		CommonMethodes.waitForElementToBeVisible(driver, calander, 10);
	

	String month = "JULY 2024";

//		String exp_date="10";
//		String retun_date="12";
		
	
		Thread.sleep(1000);
		while(true)
		{
			
			String text = driver.findElement(By.xpath("//h3")).getText();
			System.out.println(text);
			if(text.equals(month))
			{
				System.out.println("Next Month  is :"+text);
				Assert.assertEquals(text, month);
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//div[@class='theme2_calendar_head_right_side__fAS3N']//span[@class='theme2_calendar_head_icon__7hZRd']")).click();
			}
		
		}}
	
	
		

	public void CheckINOUTDateONSRP(WebDriver driver) throws InterruptedException
	{
		String INDate = CheckInDAte.getText();
		String OUTDate = CheckOUTDAte.getText();
		System.out.println("INDate Home Page:"+INDate);
		System.out.println("OUTDate Home Page:"+OUTDate);

		Thread.sleep(1000);
		CommonMethodes.waitForElementToBeVisible(driver, Search, 10);		
		Thread.sleep(10000);	
		  
		String text = CheckInDAteSRP.getText();
		String text1 = CheckOUTDAteSRP.getText();
		
		System.out.println("INDate SRP Page:"+text);
		System.out.println("OUTDate SRP Page:"+text1);
		
	
		
		Assert.assertEquals(text, INDate);
		Assert.assertEquals(text1, OUTDate);

		
	}
	
	public void Validateuserabletoclickonguestandrooms(WebDriver driver) throws InterruptedException
	{
		String AdulteandgeusteON = AdulteandgeusteONHome.getText();
		System.out.println(" AdulteandgeusteONHome Page:"+AdulteandgeusteON);

		Thread.sleep(1000);
		CommonMethodes.waitForElementToBeVisible(driver, Search, 10);		
		Thread.sleep(10000);	
		  
		String text = AdulteandgeusteONSRP.getText();
		
		System.out.println("AdulteandgeusteONSRP Page:"+text);
		
	
		
		Assert.assertEquals(text, AdulteandgeusteON);

		
	}
	
	
	
	
	
}
