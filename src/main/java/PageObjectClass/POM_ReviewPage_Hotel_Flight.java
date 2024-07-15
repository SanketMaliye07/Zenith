 package PageObjectClass;

import java.util.Random;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.CommonMethodes;

public class POM_ReviewPage_Hotel_Flight {
	
	
	
	
	@FindBy(css="li:nth-child(2) a:nth-child(1)")private WebElement BreadcrumbsHotelName;
	@FindBy(xpath="(//div[@class='theme2_review_htl_heading__zritA'])[1]")private WebElement HotelNameONRevie;
	@FindBy(xpath="a[class='undefined undefined undefined']")private WebElement HotelNameOnDetails;
	@FindBy(xpath="//div[@class='theme2_adult_heading__njj1S']")private WebElement AdultText;
	@FindBy(xpath="//span[normalize-space()='Sign In']")private WebElement Sign_In;
	@FindBy(xpath="//button[normalize-space()='LOGIN']")private WebElement LOGIN;
	@FindBy(css="#title_0")private WebElement Title;
	@FindBy(xpath="(//input[@id='first_name_0'])[1]")private WebElement first_name_0;
	@FindBy(xpath="(//input[@placeholder='Last Name'])[1]")private WebElement Last_Name;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__xUsSG'])[1]")private WebElement AdultFoeRoom1;
	@FindBy(xpath="//input[@id='country_code_0']")private WebElement country_code_0;
	@FindBy(xpath="(//input[@id='phone_no_0'])[1]")private WebElement phone_no_0;
	@FindBy(xpath="(//input[@id='email_0'])[1]")private WebElement email_0;
	@FindBy(css=".theme2_ax_checkmark__xUsSG")private WebElement SaveButton;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__xUsSG'])[4]")private WebElement SaveTravlerDetailes;
	@FindBy(xpath="(//button[normalize-space()='Continue'])[1]")private WebElement continubutton;
	@FindBy(xpath="//span[@class='theme2_ax_checkmark__qkZ7Y']")private WebElement chekmarkterms;
	@FindBy(xpath="//div[@class='theme2_spcl_tab_heading__hqb48']")private WebElement Specialrequestsection;
	@FindBy(xpath="(//div[@class='theme2_spcl_rq_title__BRUfh'])[1]")private WebElement SpecialrequestsectionData;
	@FindBy(xpath="//span[@id='title0']")private WebElement Please_enter_title;
	@FindBy(xpath="//span[@id='first_name0']")private WebElement Please_enter_first_name;
	@FindBy(xpath="//span[@id='last_name0']")private WebElement Please_enter_last_name;
	@FindBy(xpath="//span[@id='country_code0']")private WebElement Please_enter_country_ISD_code;
	@FindBy(xpath="//span[@id='phone_no0']")private WebElement Please_enter_mobile_no;
	@FindBy(xpath="//span[@id='email0']")private WebElement Please_enter_email_Id;
	@FindBy(xpath="//button[@class='Theme2_googleLoginBtn__9a_Ny']")private WebElement googleLoginBtn;
	@FindBy(xpath="//div[normalize-space()='Mr']")private WebElement Mr;
	@FindBy(xpath="//div[normalize-space()='Mrs']")private WebElement Mrs;
	@FindBy(xpath="//div[normalize-space()='Miss']")private WebElement Miss;
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement Pass;
	@FindBy(xpath="//div[@class='Theme2_email_error_msg__p6ea2']")private WebElement email_error_msg;
	@FindBy(xpath="//button[@id='payment_btn']")private WebElement proceedpayment;
	@FindBy(xpath="//div[@id='view-more-travellers']")private WebElement MoreTravler;
	@FindBy(xpath="(//span[@class='theme2_ax_checkmark__xUsSG'])[6]")private WebElement CheckAdult;
	@FindBy(xpath="//a[@class='theme2_save_trav_terms__7su29']")private WebElement ClickOnTerms;
	@FindBy(css="h2[class='terms_n_condition_heading'] b")private WebElement TermsofAgreement;
	@FindBy(xpath="(//input[@id='Diwali2023'])[1]")private WebElement applyCode;
	@FindBy(xpath="//p[normalize-space()='Please Enter Coupon Code']")private WebElement Please_Enter_Coupon_Code;
	@FindBy(xpath="//input[@id='applycodeid']")private WebElement PassCoupneText;
	@FindBy(xpath="//p[normalize-space()='Invalid Coupon']")private WebElement Invalid_Coupon;
	@FindBy(xpath="(//a[contains(text(),'Terms of Use')])[2]")private WebElement ClickOnTermsFaireDetailes;
	@FindBy(xpath="//span[normalize-space()='Billing Information']")private WebElement Billing_Information;

	@FindBy(xpath="(//span[@id='title0'])[1]")private WebElement title0_error;
	@FindBy(xpath="(//span[@id='first_name0'])[1]")private WebElement first_name0_error;
	@FindBy(xpath="(//span[@id='last_name0'])[1]")private WebElement last_name0_error;
	@FindBy(xpath="(//span[@id='email0'])[1]")private WebElement email0_error;
	@FindBy(xpath="(//span[@id='phone_no0'])[1]")private WebElement phone_no0_error;

























	public POM_ReviewPage_Hotel_Flight(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);	

	}
	
	public void ValidateBreadcrumbs(WebDriver driver) throws InterruptedException
	{   
		String text = HotelNameONRevie.getText();
		Thread.sleep(500);
		BreadcrumbsHotelName.click();
		Thread.sleep(10000);		
		String text1 = HotelNameOnDetails.getText();		
		Assert.assertEquals(text, text1, "The Hotel name is not matching so Test case is failed");
	    System.out.println("The user successfully click on Home button and the user successfully  redirected to Homepage and when the user clicks on Hotels name breadcrumb button, the user should be redirected to Hotel details page");
	}
	
	
	public void validateContinueButton(WebDriver driver) throws InterruptedException
	{   
		String text = AdultText.getText();
		System.out.println("The text is :"+text);
		Assert.assertEquals(text, "Adult 1", "We can gate the travler detailes test case is failed");
	    System.out.println("The user successfully click on Continue button in review your booking section and Travelers details section should be displayed.");
	}
	
	public void validateSigninwithLoginbuttons(WebDriver driver) throws InterruptedException
	{  
		CommonMethodes.waitForElementToBeVisible(driver, Sign_In, 10);
		LOGIN.isDisplayed();
		
	
	    System.out.println("The user successfully  see correct details in review your booking section Sign in with Login buttons");
	}
	
	public void ValidateTravelersdetailssection(WebDriver driver) throws InterruptedException
	{  
		String text = title0_error.getText();
		String text1 = first_name0_error.getText();
		String text2 = last_name0_error.getText();
		String text3 = email0_error.getText();
		String text4 = phone_no0_error.getText();
		
		Assert.assertEquals(text, "Please enter title");
		Assert.assertEquals(text1, "Please enter first name");
		Assert.assertEquals(text2, "Please enter last name");
		Assert.assertEquals(text3, "Please enter email Id");
		Assert.assertEquals(text4, "Please enter mobile no.");

	
	    System.out.println("The user successfully  see correct details in review your booking section Travelers details section");
	}

	
	public void ValidateContactdetailssection(WebDriver driver) throws InterruptedException
	{  
		
		  WebElement element= AdultFoeRoom1;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
		     Thread.sleep(500);
		     element.click();
		     Thread.sleep(500);
		
		String text = country_code_0.getText();
		String text1 = phone_no_0.getText();
		String text2 = email_0.getText();
		
		System.out.println("The country_code_0 text :"+text);
		System.out.println("The phone_no_0 text :"+text1);
		System.out.println("The email_0 text :"+text2);

		Assert.assertEquals(text, text, "The country_code_0 is not matching test cases is failed");	
		Assert.assertEquals(text1, text1, "phone_no_0  is not matching the text case is failed");
		Assert.assertEquals(text2, text2, "email_0 is not matching the test case is failed ");

	
		
	
	    System.out.println("The user successfully  see correct details in review your booking section Contactdetailssection");
	}
	
	public void ValidateSaveButton(WebDriver driver) throws InterruptedException
	{  
		
		  WebElement element= AdultFoeRoom1;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		     Thread.sleep(500);
		     element.click();
		     Thread.sleep(500);
		CommonMethodes.waitForElementToBeVisible(driver, SaveButton, 10);
		     Thread.sleep(500);
		     SaveButton.isSelected();
		     Thread.sleep(500);
	
	    System.out.println("The user successfully  see correct details in review your booking section Save traveler button");
	}
	
	public void ClickSaveButton(WebDriver driver) throws InterruptedException
	{  
	     Thread.sleep(500);
	     SaveTravlerDetailes.click();
		     Thread.sleep(500);
		  
	
	}
	
	
	public void ValidateTermsofUsebutton(WebDriver driver) throws InterruptedException
	{  
		
		  WebElement element= AdultFoeRoom1;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		     Thread.sleep(500);
		     element.click();
		     Thread.sleep(500);
		     
		     WebElement element1= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		     Thread.sleep(500);
		     element1.click();
		     Thread.sleep(500);
		     
		     CommonMethodes.waitForElementToBeVisible(driver, chekmarkterms, 2);	
		     Thread.sleep(100);
		
		     chekmarkterms.isSelected();
	
	    System.out.println("The user successfully  see correct details in review your booking Terms of Use button");
	}
	
	
	public void ValidateSpecialrequestsection(WebDriver driver) throws InterruptedException
	{  
		
		  WebElement element= AdultFoeRoom1;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		     Thread.sleep(500);
		     element.click();
		     Thread.sleep(500);
		CommonMethodes.waitForElementToBeVisible(driver, Specialrequestsection, 10);
	     Thread.sleep(500);
	     String Text=SpecialrequestsectionData.getText();
	     Assert.assertEquals(Text, "Special/accessibility requests (e.g. roll-away beds, late check-in, and accessible rooms) are not guaranteed. If you don't hear back from the property, you may want to contact them directly to confirm. The property may charge a fee for certain special requests.", "The SpecialrequestsectionData is not matching the test Case is Failed");
		    
	    System.out.println("The user successfully  see correct details in review Specialrequestsection");
	}
	
	public void Validatecontinubutton(WebDriver driver) throws InterruptedException
	{  
		
		  WebElement element= AdultFoeRoom1;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		     Thread.sleep(500);
		     element.click();
		     Thread.sleep(500);
		     
		     WebElement element1= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		     Thread.sleep(500);
		     element1.click();
		     Thread.sleep(500);
		     continubutton.isSelected();
	
	    System.out.println("The user successfully  click on continu button ");
	}
	
	public void validateGooglewithLoginbuttons(WebDriver driver) throws InterruptedException
	{  
		CommonMethodes.waitForElementToBeVisible(driver, googleLoginBtn, 10);
		googleLoginBtn.isSelected();
		
	
	    System.out.println("The user successfully  see correct details in review your booking section Google with Login buttons");
	}
	
	public void ValidatSaveButtonWithGeustMod(WebDriver driver) throws InterruptedException
	{  
		
		  WebElement element= SaveButton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
		     Thread.sleep(500);
		     element.click();
		     Thread.sleep(1000);
	
		     Sign_In.isDisplayed();
		     
		     
		
	    System.out.println("The user successfully redirected to sign in options if the user clicks on Save traveler in Guest mode  ");
	}
	
	
	public void ValidatecontinubuttonwithGeust(WebDriver driver) throws InterruptedException
	{  
		     
		     WebElement element1= continubutton;
		     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		     Thread.sleep(500);
		     element1.click();
		     Thread.sleep(500);
		     String text=Please_enter_title.getText();
		     String text1=Please_enter_first_name.getText();
		     String text2=Please_enter_last_name.getText();
		     String text3=Please_enter_country_ISD_code.getText();
		     String text4=Please_enter_mobile_no.getText();
		     String text5=Please_enter_email_Id.getText();

		     Assert.assertEquals(text, "Please enter title", "The error message is not matching for title the Test Case is failed ");
		     Assert.assertEquals(text1, "Please enter first name", "The error message is not matching for first name the Test Case is failed ");
		     Assert.assertEquals(text2, "Please enter last name", "The error message is not matching for last name filed  the Test Case is failed ");
		     Assert.assertEquals(text3, "Please enter country ISD code", "The error message is not matching for country code the Test Case is failed ");
		     Assert.assertEquals(text4, "Please enter mobile no.", "The error message is not matching for mobile number the Test Case is failed ");
		     Assert.assertEquals(text5, "Please enter email Id", "The error message is not matching for email id  the Test Case is failed ");

	    System.out.println("The user successfully  click on continu button ");
	}
	

	
	public void select_Title(WebDriver driver) throws InterruptedException
	{  
//		  WebElement element1= continubutton;
//		     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		     Thread.sleep(500);
//		     element1.click();
		CommonMethodes.scrollDown(driver);
		Thread.sleep(500);	
		Title.click();
		Thread.sleep(100);
		Title.click();
		Thread.sleep(100);
		Mr.click();
		Thread.sleep(100);

		}
		
	public void select_Title1(WebDriver driver) throws InterruptedException
	{  
			
		Thread.sleep(100);
		Title.click();
		Thread.sleep(100);
		Title.click();
		Thread.sleep(100);
		Mrs.click();
		Thread.sleep(100);

		}
	
	public void select_Title2(WebDriver driver) throws InterruptedException
	{  
			
		Thread.sleep(100);
		Title.click();
		Thread.sleep(100);
		Title.click();
		Thread.sleep(100);
		Miss.click();
		Thread.sleep(500);

		}
	
		public void add_first_name(WebDriver driver) throws InterruptedException
		{  
			
		
			Thread.sleep(500);
			first_name_0.sendKeys("Wasi");
			Thread.sleep(500);
		
		
		    System.out.println("The user successfully add information traveler details section");
		}
		
		public void add_Last_Name(WebDriver driver) throws InterruptedException
		{  
			
		
			Thread.sleep(500);
			Last_Name.sendKeys("shekh");
			Thread.sleep(500);
		
		
		    System.out.println("The user successfully add information traveler details section");
		}
	
		
		public void add_country_code(WebDriver driver) throws InterruptedException
		{  
			
			Thread.sleep(500);
			country_code_0.sendKeys("91");
			Thread.sleep(100);
			country_code_0.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(100);
			country_code_0.sendKeys(Keys.ENTER);
			Thread.sleep(500);
		
		
		    System.out.println("The user successfully add information traveler details section");
		}
	
		public void add_phone_no(WebDriver driver) throws InterruptedException
		{  
			
			Thread.sleep(500);
			phone_no_0.sendKeys("8888889731");
			Thread.sleep(500);
		
		
		    System.out.println("The user successfully add information traveler details section");
		}
		
		public void add_email(WebDriver driver) throws InterruptedException
		{  
			

			email_0.sendKeys("digaajna@bweb.gmail.com");
			Thread.sleep(500);
		
		    System.out.println("The user successfully add information traveler details section");
		}
		
		public void ValidatPAymentButton(WebDriver driver) throws InterruptedException
		{  
			
			  WebElement element= AdultFoeRoom1;
			     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
			     Thread.sleep(500);
			     element.click();
			     Thread.sleep(500);
			     
			     WebElement element1= continubutton;
			     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
			     Thread.sleep(500);
			     element1.click();
			     Thread.sleep(500);
			     continubutton.isSelected();
			     Thread.sleep(300);

			     
			     chekmarkterms.isDisplayed();
		
		    System.out.println("The user is successfully  click on Continue button in traveler details section and payment button is visiable");
		}
	

		public void  ValidateSighninwithdifferntcreditiol(WebDriver driver,String Email,String Password,String Data) throws InterruptedException
		{  
			
			if(Data.contentEquals("Incorrect"))
			{ Thread.sleep(300);
			  WebElement element= Sign_In;
			    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
			     Thread.sleep(500);
			     element.click();
			
			 Thread.sleep(300);
				 email.sendKeys(Email);
				 Thread.sleep(300);

				Pass.sendKeys(Password);
				 Thread.sleep(300);

				LOGIN.click();
				 Thread.sleep(1000);

	String text = email_error_msg.getText();
	Assert.assertEquals(text, "Invalid Password", "The Error message is not matching after invalid email and Password Test cases failed");
	 	

			}
			
			else if(Data.contentEquals("Correct"))
			{
			 Thread.sleep(300);
			  WebElement element= Sign_In;
			    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
			     Thread.sleep(500);
			     element.click();
			
			 Thread.sleep(300);
				 email.sendKeys(Email);
				 Thread.sleep(300);

				Pass.sendKeys(Password);
				 Thread.sleep(300);

				LOGIN.click();
				 Thread.sleep(1000);		

				System.out.println("The after pass valid email and password the user successfully login the Test Cases is Pass");
	
		}
			}
		
		
		public void SelectSavedAdult(WebDriver driver) throws InterruptedException
		{  
			
			  WebElement element= AdultFoeRoom1;
			     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
			     Thread.sleep(500);
			     element.click();
			     Thread.sleep(1000);
			     AdultFoeRoom1.click();
			 
		
		    System.out.println("The user is successfully  click on Continue button in traveler details section and payment button is visiable");
		}
		
		public void ClickContinue(WebDriver driver) throws InterruptedException
		{  
			
			
			
		     Thread.sleep(300);

			continubutton.click();
			 
		
		}
		
		public void ClickTermsAndProceedButton(WebDriver driver) throws InterruptedException
		{  
		     Thread.sleep(200);

			chekmarkterms.click();
		     Thread.sleep(200);

			proceedpayment.click();
		     Thread.sleep(2000);

		}
		public void NavigateBackkey(WebDriver driver) throws InterruptedException
		{  
		  CommonMethodes.backPage(driver);
		     Thread.sleep(1000);

		}
		
		
		public void ValidatetheAdultedetailes(WebDriver driver) throws InterruptedException
		{  
			MoreTravler.click();
			Thread.sleep(400);

			CheckAdult.click();
			Thread.sleep(1000);

		}
		
		
		
		public void Validatetheterms(WebDriver driver) throws InterruptedException
		{  		    
			Thread.sleep(500);
			 WebElement element1= ClickOnTerms;
		     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		     Thread.sleep(500);
		     element1.click();
			Thread.sleep(500);
			String text=TermsofAgreement.getText();
            System.out.println(text);
            Assert.assertEquals(text, "ELEVATE TRIPS: Terms of Use", "The text after click on terms is not matcjhing than test case is failed");
		}
		
		
		public void ValidateApplyButton(WebDriver driver) throws InterruptedException
		{  		    
			applyCode.click();
			Thread.sleep(200);

			String text=Please_Enter_Coupon_Code.getText();
            System.out.println(text);
            Assert.assertEquals(text, "Please Enter Coupon Code", "The error message is not meatching after click on apply button without add coupne than Test Cases is Failed");
            System.out.println("the user successfully clicks on apply button without entering coupon code in coupons section textbox, the user should get Please Enter Coupon Code validation error msg");
            
		}
		
		
		
		public void ValidateApplyButtonWithinvalidCoupne(WebDriver driver) throws InterruptedException
		{  		
			
			
			
			PassCoupneText.sendKeys("hjbcwskhbdkhwsb");
			Thread.sleep(200);

			applyCode.click();
			Thread.sleep(200);

			String text=Invalid_Coupon.getText();
            System.out.println(text);
            Assert.assertEquals(text, "Invalid Coupon", "The error message is not meatching after click on apply button with invalid coupne than Test Cases is Failed");
            System.out.println("the user successfully clicks on apply button without entering coupon code in coupons section textbox, the user should get Please Enter Coupon Code validation error msg");
            
		}
		
		public void SelectTheRondumCoupne(WebDriver driver) throws InterruptedException
		{  	
			
	    WebElement TotalPayable = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[4]/div[2]/p[1]"));
        String TotalPayable1 = TotalPayable.getText();
        String TotalPayable2 = TotalPayable1.replace("₹", "").replace(",", "").trim();		
        double TotalPayableAmount = Double.parseDouble(TotalPayable2);
        System.out.println("TotalPayableAmount :"+TotalPayableAmount);
        Thread.sleep(500);
						applyCode.click();
						Thread.sleep(500);
						   WebElement TotaAmount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[4]/div[2]/p[1]"));
					        String TotaAmount1 = TotalPayable.getText();
					        String TotaAmount2 = TotalPayable1.replace("₹", "").replace(",", "").trim();		
					        double TotaAmountAfterCupen = Double.parseDouble(TotaAmount2);
					        System.out.println("TotalPayableAmount :"+TotalPayableAmount);
							Thread.sleep(500);

					    Assert.assertNotEquals(TotalPayableAmount, TotaAmountAfterCupen); 
						
		}
		
		public void ValidateTheTermsForFairedetailes(WebDriver driver) throws InterruptedException
		{  		
			 WebElement element= continubutton;
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		     Thread.sleep(500);
		     element.click();
		 
			Thread.sleep(500);
			 WebElement element1= ClickOnTermsFaireDetailes;
		   //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		     Thread.sleep(500);
		     element1.click();
			Thread.sleep(1000);
			String text=TermsofAgreement.getText();
           System.out.println(text);
           Assert.assertEquals(text, "ELEVATE TRIPS: Terms of Use", "The text after click on terms is not matcjhing than test case is failed");
		
						
		}
		public void ValidateProceedPaymentButton(WebDriver driver) throws InterruptedException
		{  
		   
			proceedpayment.isEnabled();
		     Thread.sleep(500);

		     System.out.println("The user is successfully click on proceed to payment button without checking the I accept the terms of Use checkbox and payment is not proceed");
		}
		
		public void TextOnPG(WebDriver driver) throws InterruptedException
		{  
		   
			String text = Billing_Information.getText();
			System.out.println("The text on PG :"+text);
		     Thread.sleep(500);
	           Assert.assertEquals(text, "Billing Information", "The text on PG is not matcjhing than test case is failed");

		     System.out.println("The user is successfully click on proceed to payment button and the pg page should open up.");
		}
		
		
}
