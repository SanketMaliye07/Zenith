package StepDefinitions;

import BaseClass.BaseClass;
import PageObjectClass.POM_BookingConformationPage;
import io.cucumber.java.en.And;

public class BookingConformationPage extends BaseClass{
	
POM_BookingConformationPage Booking;

	  @And("Validate the message on booking confirm page")
	    public void ValidateBookingConfirmmess() throws InterruptedException {
		  Booking=new POM_BookingConformationPage(driver);
		  Booking.ValidateConformBookingMessage();

	    } 
	 
	  @And("share the ticket to mail")
	    public void shareTickettomail() throws InterruptedException {
		 
		  Booking=new POM_BookingConformationPage(driver);
		  Booking.sharemail(driver);
	    }
	  @And("close the popup")
	    public void closePoup() throws InterruptedException {
		 
		  Booking=new POM_BookingConformationPage(driver);
		  Booking.closePoup(driver);
		  
	    }
	  
	  @And("User confirm the booking on Manage Booking")
	    public void User_confirm_the_booking_on_Manage_Booking() throws InterruptedException {
		 
		  Booking=new POM_BookingConformationPage(driver);
		  Booking.Validatethebooking(driver);
		  
	    }
	  
	  
}  
