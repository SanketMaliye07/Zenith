package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import BaseClass.BaseClass;
import PageObjectClass.POM_Hotel_Exceldata;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethodes;
import utils.ExcelReader;

public class SD_Hotel_Excel extends BaseClass{
	 
	
	POM_Hotel_Exceldata HOME;
	ExcelReader reder;
	List<Map<String, String>> testData;
	 public int row;
	 
	 @Given("User is on Elevate Trip Landing page for Hotel Booking with the {string} environment")
	    public void userIsOnElevateTripLandingPageforHotelbooking(String env) throws InterruptedException, IOException {
	        
	    	LounchBrowser(env); 
	    } 
	 
	    @When("User SighnIn with username and password for Hotel Booking")
	    public void userLoginforHotel() throws InterruptedException, IOException {

	    	HOME=new POM_Hotel_Exceldata(driver);
	    	HOME.click_On_Myaccount(driver);
	    	HOME.click_On_SighIn(driver);
	    	HOME.Pass_email(driver, CommonMethodes.readDataFromPropertyFile("username1"));
	    	HOME.pass_pass(CommonMethodes.readDataFromPropertyFile("pass1"));
	    	HOME.click_On_Login(driver);


	    }
	    
	    @Then("User selct the Hotel option on home page")
	    public void userSelectsHotelOption() throws InterruptedException {
	    	HOME=new POM_Hotel_Exceldata(driver);
	    	HOME.clickOnHotel(driver);
	    }
	
	    
	@Then("^User pass the cityname for hotlbooking from given sheetName (.+) and rowNumber (.+)$")
	public void user_pass_the_cityname_for_hotlbooking_from_given_sheet_name_and_row_number(Integer SheetNumber, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		 
		  reder=new ExcelReader();
		 	 testData=reder.getData(CommonMethodes.Excelpath(), SheetNumber);
		 	 
		 	 
		 	row=RowNumber;
		 	
		 	String AREA_NAME = testData.get(row).get("HOTEL_NAME");
		 	
		 	HOME.Search_selectCity(driver, AREA_NAME);
		
	}
	
	@Then("User select the date for hotle booking INdate and Outdate")
	public void user_select_the_date_for_hotle_booking_i_ndate_and_outdate() throws InterruptedException {
	 
	 	String MONT_YEAR = testData.get(row).get("MONT&YEAR");
	 	String IN_DATE = testData.get(row).get("IN_DATE");
	 	String OUT_DATE = testData.get(row).get("OUT_DATE");

	 	
	 	
	 	HOME.select_Date(driver, MONT_YEAR, IN_DATE, OUT_DATE);

	}
	
	@Then("User select the Adult and child and room as per requirment")
	public void user_select_the_adult_and_child_and_room_as_per_requirment() throws InterruptedException {
		String ADULT_PAX = testData.get(row).get("ADULT_PAX");
	 	String CHILD_PAX = testData.get(row).get("CHILD_PAX");
	 	String ROOM_PAX = testData.get(row).get("ROOM_PAX");
	 	
	 	HOME.Select_1Room_1Pass(driver, ADULT_PAX, CHILD_PAX, ROOM_PAX);
		
		
		
	}
	
	  @And("User clicks on the search button")
	    public void userClicksOnSearchButton() throws InterruptedException {

	    	 HOME.click_Search(driver);


	    }
	
	  @Then("User selects the hotel")
	    public void userSelectsHotel() throws InterruptedException {
	    	HOME.selectHotel(driver);
	    }
	
	   @And("User selects the room")
	    public void userSelectsRoom() throws InterruptedException {
	    	HOME.selectRoom(driver);
	    }
	   
	   @Then("Calculate_the_AmountOnReviewPage")
	    public void Calculate_the_AmountOnReviewPage() throws InterruptedException {
		   
	    	HOME=new POM_Hotel_Exceldata(driver);
	    	HOME.Calculate_the_AmountOnReviewPage(driver); 
	    }
	   
	   @Then("Calculate_the_AmountOn_ConformationPage")
	    public void Calculate_the_AmountOn_ConformationPage() throws InterruptedException {
	    	HOME.Calculate_the_AmountOnReviewPage(driver);
	    }
	   
	   @And("User clicks on the continue button")
	    public void clickContinueBooking() throws InterruptedException {
		   HOME.clickoncontinuebutton(driver);
	    }
	
	   @And("User selects the adult for as room")
	    public void whenUserSelectsAdultForRoom() throws InterruptedException 
	   {
		 	String ROOM_PAX = testData.get(row).get("ROOM_PAX");

		   HOME.selectadultforRoom(driver, ROOM_PAX);
	    
	    }
	   
	   @And("User selects the adult for room without login")
	    public void User_selects_the_adult_for_room_without_login() throws InterruptedException 
	   {
		 	String ROOM_PAX = testData.get(row).get("ROOM_PAX");

		   HOME.selectadultforRoomwithoutLogin(driver, ROOM_PAX);
	    
	    }
	   
		@Then("I click on continue booking for hotel accept the terms of use for Hotel")
		public void clickcontinueandproceedforpayment() throws InterruptedException
		{
		 	String ROOM_PAX = testData.get(row).get("ROOM_PAX");

			HOME.clickcontinuebuttonAndProccedpayment(driver, ROOM_PAX);
		}

	
	
	

}
