package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import BaseClass.BaseClass;
import PageObjectClass.POM_FlightBooking_Exceldata;
import PageObjectClass.POM_ReviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethodes;
import utils.ExcelReader;

public class SD_FlightBooking_Excel extends BaseClass
{
	POM_FlightBooking_Exceldata HOME;
	ExcelReader reder;
	List<Map<String, String>> testData;
	POM_ReviewPage Reviewpage;
	 public int row;
	 
	 @Given("User is on zenith Landing page with the {string} environment")
	    public void userIsOnzenithLandingPage(String environment) throws InterruptedException, IOException {
	        
	    	LounchBrowser(environment); 
	    } 
	  
	   @When("User SighnIn with username and password")
	    public void userLogin() throws InterruptedException, IOException {

		   HOME=new POM_FlightBooking_Exceldata(driver);
		   HOME.click_On_SighIn(driver);
		   HOME.Pass_email(driver, CommonMethodes.readDataFromPropertyFile("username1"));
		   HOME.pass_pass(CommonMethodes.readDataFromPropertyFile("pass1"));
		   HOME.click_On_Login(driver);


	    }
		@Then("User is Click On Flight")
		public void User_is_Click_On_Flight() throws InterruptedException
		{		   HOME=new POM_FlightBooking_Exceldata(driver);

			   HOME.ClickFlightModule(driver);

			
			
		}
	   
	@Then("^User select the trip and pass origin and destination from given sheetName (.+) and rowNumber (.+)$")
	public void user_select_the_trip_and_pass_origin_and_destination_from_given_sheet_name_and_row_number(Integer Sheet, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		  reder=new ExcelReader();
		 	 testData=reder.getData(CommonMethodes.Excelpath(), Sheet);
		 	 
		 	row=rowNumber;
		 	 
		 	 String TRIP_TYPE = testData.get(rowNumber).get("TRIP TYPE");
			 String ORIGIN = testData.get(rowNumber).get("ORIGIN");
			 String DESTINATION = testData.get(rowNumber).get("DESTINATION");
			   HOME=new POM_FlightBooking_Exceldata(driver);

			   System.out.println("ORIGIN :"+ORIGIN);
			   System.out.println("DESTINATION :"+DESTINATION);
			   System.out.println("TRIP_TYPE :"+TRIP_TYPE);

			 HOME.Selecttrippassoriginanddestination(driver, TRIP_TYPE, ORIGIN, DESTINATION);
		 
		
	}
	@Then("select the date for trip")
	public void select_the_date_for_trip() throws InterruptedException {
	 	 String TRIP_TYPE = testData.get(row).get("TRIP TYPE");
		 String IN_DATE = testData.get(row).get("IN_DATE");
		 String RETURN_DATE = testData.get(row).get("RETURN_DATE");
		 String MONT_YEAR = testData.get(row).get("MONT&YEAR");
		 
		 HOME.SelectDatefortrip(driver, TRIP_TYPE, MONT_YEAR, IN_DATE, RETURN_DATE);
		 
		
	}
	@Then("select the class for trip")
	public void select_the_class_for_trip() {
	 	 String TRIP_TYPE = testData.get(row).get("TRIP TYPE");  
		 String CLASS = testData.get(row).get("CLASS");
		 
		 HOME.selectClassforTrip(driver, TRIP_TYPE, CLASS);
	}
	
	@Then("The user should able to select Business , First Class ,Premium Economy cabin class details")
	public void The_user_should_able_to_select_Business_First_Class_Premium_Economycabinclassdetails() throws InterruptedException {
	 	 String TRIP_TYPE = testData.get(row).get("TRIP TYPE");  
		 String CLASS = testData.get(row).get("CLASS");
		 
		 HOME.selectClassforTripandValidaetheclass(driver, TRIP_TYPE, CLASS);
	}
	
	
	@Then("User select the passanger for trip")
	public void user_select_the_passanger_for_trip() throws InterruptedException {
	    
		 String ADULTPAX = testData.get(row).get("ADULT_PAX");
		 String CHILDPAX = testData.get(row).get("CHILD_PAX");
		 String INFANTSPAX = testData.get(row).get("INFANTS_PAX");
		 
		 HOME.Selectpassangerfortrip(driver, ADULTPAX, CHILDPAX, INFANTSPAX);
		
	}
	

	
	@And("User clicks on the search button for flight")
    public void userClicksOnSearchButtonforFlight() throws InterruptedException {
		   HOME=new POM_FlightBooking_Exceldata(driver);
		 	 String TRIP_TYPE = testData.get(row).get("TRIP TYPE");

    	   HOME.click_Search(driver,TRIP_TYPE);

 
    }
	
	 @Then("select the Flight and click on book")
	    public void thenUserClicksOnBookButton() throws InterruptedException {
		 
	 	 String TRIP_TYPE = testData.get(row).get("TRIP TYPE");
	 	 String FLIGHT_TYPE = testData.get(row).get("FLIGHT_TYPE");

 
		 HOME.clickBook(driver,TRIP_TYPE,FLIGHT_TYPE);
			

	    }
	
	  @When("User selct adult child and infant")
	    public void User_selct_adult_child_and_infant() throws InterruptedException {
		
		  Reviewpage=new POM_ReviewPage(driver);
			 String ADULTPAX = testData.get(row).get("ADULT_PAX");
			 String CHILDPAX = testData.get(row).get("CHILD_PAX");
			 String INFANTSPAX = testData.get(row).get("INFANTS_PAX");
		 // Reviewpage.SelectPassanger(driver,ADULTPAX,CHILDPAX,INFANTSPAX);
		  //SelectPassangerDynamicData
		  Reviewpage.SelectPassangerDynamicData(driver,ADULTPAX,CHILDPAX,INFANTSPAX);

		  
	    }
	
	  @When("User selct adult child and infant without login")
	    public void User_selct_adult_child_and_infant_without_login() throws InterruptedException {
		
		  Reviewpage=new POM_ReviewPage(driver);
			 String ADULTPAX = testData.get(row).get("ADULT_PAX");
			 String CHILDPAX = testData.get(row).get("CHILD_PAX");
			 String INFANTSPAX = testData.get(row).get("INFANTS_PAX");
		 	 String FLIGHT_TYPE = testData.get(row).get("FLIGHT_TYPE");

			 
		  Reviewpage.SelectPassangerWithoutLogin(driver,ADULTPAX,CHILDPAX,INFANTSPAX,FLIGHT_TYPE);
		  
		  
	    }
	  
	  @When("I select the adult")
	    public void I_select_the_adult() throws InterruptedException {
		
		  Reviewpage=new POM_ReviewPage(driver);
			 String ADULTPAX = testData.get(row).get("ADULT_PAX");

		  //Reviewpage.SelectAdult(driver,ADULTPAX);
	    }
	  
	  @When("I select the child")
	    public void I_select_the_child() throws InterruptedException {
		
		  Reviewpage=new POM_ReviewPage(driver);
		 // Reviewpage.SelectChild(driver);
	    }
	  @When("I select the infant")
	    public void I_select_the_infant() throws InterruptedException {
		
			 
		  Reviewpage=new POM_ReviewPage(driver);
		 // Reviewpage.SelectInfent(driver);
	    }
	  
	  
	  
	  
	 
	    @Then("User pass the Mobile number and EmailID")
	    public void User_pass_the_Mobile_number_and_EmailID() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
			 Reviewpage.PassMobileAndEmailForBooking(driver);
	    	
	    
	    }
	    
	    
	    
		 
	    @Then("I click on continue booking")
	    public void clickContinueBooking() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 Reviewpage.ClickContBooking(driver);
	    	
	    
	    }
	    
	    
	    @Then("Click On Continue Button For Flight Booking")
	    public void Click_On_Continue_Button_For_Flight_Booking() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 Reviewpage.ClickOnContinueForGestMod(driver);
	    	
	    
	    }
	    
	    @Then("Again click on continue booking")
	    public void AgainclickContinueBooking() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 Reviewpage.ClickContBooking1(driver);
	    	
	    
	    }
	    
	    @When("I accept the terms of use")
	    public void acceptTermsOfUse() throws InterruptedException {
	    	
	    	 Reviewpage=new POM_ReviewPage(driver);
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
			 Reviewpage.Chekmark(driver);
	    } 
	    
	    @And("click on proceed to payment")
	    public void clickProceedToPayment() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
			 Reviewpage.ProceedPayment(driver);
             Thread.sleep(40000);
	    }
	
	    @And("User Pass the new user detailes for Flight")
	    public void User_Pass_the_new_user_detailes_for_Flight() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
			 Reviewpage.SelectTitle(driver);
			 Reviewpage.SelectfirstName(driver);
			 Reviewpage.SelectlastName(driver);
			 Reviewpage.SelectcountryISDInput(driver);
			 Reviewpage.SelectphoneNumber(driver);
			 Reviewpage.SelectphoneNumber(driver);
			 Reviewpage.SelectemailId(driver);
			 Reviewpage.SelectpassportNumber(driver);
			 Reviewpage.Selectnationalityname(driver);
			 Reviewpage.SelectDateOfBirth(driver);
			 Reviewpage.SelectPassportExpiryDate(driver);
			 Reviewpage.ClickOnContinueForGestMod(driver);



	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
