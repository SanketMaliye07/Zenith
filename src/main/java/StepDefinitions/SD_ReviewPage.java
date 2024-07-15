package StepDefinitions;



import BaseClass.BaseClass;
import PageObjectClass.POM_ReviewPage_Hotel_Flight;
import io.cucumber.java.en.And;

public class SD_ReviewPage extends BaseClass {

	POM_ReviewPage_Hotel_Flight REVIEW;

	
	
	   @And("Validate the user clicks on Hotels name breadcrumb button, the user should be redirected to Hotel details page")
	    public void Validate_the_user_clicks_on_Hotels_name_breadcrumb_button_the_user_should_be_redirected_to_Hotel_details_page() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidateBreadcrumbs(driver);
	    }
	
	   @And("Validate the user should be able to click on Continue button in review your booking section and Travelers details section should be displayed")
	    public void Validate_the_user_should_be_able_to_click_on_Continue_button_in_review_your_booking_section_and_Travelers_details_section_should_be_displayed() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.validateContinueButton(driver);
	    }
	
	   @And("Validate The user should be able to see correct details in review your booking section Sign in with Login buttons")
	    public void Validate_the_user_should_be_able_to_see_correct_details_in_review_your_booking_section_Sign_in_with_Login_buttons() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.validateSigninwithLoginbuttons(driver);
	    }
	
	   @And("Validate The user should be able to see correct details Travelers details section")
	    public void Validate_the_user_should_be_able_to_see_correct_details_Travelers_details_section() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidateTravelersdetailssection(driver);
	    }
	   
	   @And("Validate The user should be able to see correct details Contact details section")
	    public void Validate_The_user_should_be_able_to_see_correct_details_Contact_details_section() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidateContactdetailssection(driver);
	    }
	   
	   @And("Validate The user should be able to see working Save traveler button")
	    public void Validate_the_user_should_be_able_to_see_working_Save_traveler_button() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidateSaveButton(driver);
	    }
	   
	   
	   
	   @And("Validate The user should be able to see working Terms of Use button")
	    public void Validate_The_user_should_be_able_to_see_working_Terms_of_Use_button() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidateTermsofUsebutton(driver);
	    }
	   
	   @And("Validate The user should be able to see correct details Special request section")
	    public void Validate_The_user_should_be_able_to_see_correct_details_Special_request_section() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidateSpecialrequestsection(driver);
	    }
	   
	   @And("Validate The user should be able to click on Continue button")
	    public void Validate_The_user_should_be_able_to_click_on_Continue_button() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.Validatecontinubutton(driver);
	    }
	   
	   @And("Validate the user should be able to click on Google for account")
	    public void Validate_the_user_should_able_to_click_on_Google_for_account() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.validateGooglewithLoginbuttons(driver);
	    }
	   
	   
	   @And("Validate the user should be redirected to sign in options if the user clicks on Save traveler in Guest mode")
	    public void Validate_the_user_should_be_redirected_to_sign_in_options_if_the_user_clicks_on_Save_traveler_in_Guest_mode() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidatSaveButtonWithGeustMod(driver);
	    }
	   
	   
	   @And("Validate error message when the user is click on Continue button without filling details")
	    public void Validate_error_message_when_the_user_is_click_on_Continue_button_without_filling_details() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidatecontinubuttonwithGeust(driver);
	    }
	   
	   @And("Validate to check if the user can add information traveler details section")
	    public void Validate_to_check_if_the_user_can_add_information_traveler_details_section() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.select_Title(driver);
		   REVIEW.add_first_name(driver);
		   REVIEW.add_Last_Name(driver);
		   REVIEW.add_country_code(driver);
		   REVIEW.add_phone_no(driver);
		   REVIEW.add_email(driver);
		   
		   
		

	    }
	   
	   @And("Validate the user should be able to click on Continue button and the proceed to payment button should be visible")
	    public void Validate_the_user_should_be_able_to_click_on_Continue_button_and_the_proceed_to_payment_button_should_be_visible() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidatPAymentButton(driver);
	    }
	   
	   @And("^Validate the user after entering invalid or valida creds in emailid (.+) and password (.+) field with (.+)$")
	    public void Validate_the_user_after_entering_invalid_or_valida_creds_in_emailid_and_password_field(String email,String pass,String Data) throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ValidateSighninwithdifferntcreditiol(driver, email, pass,Data);
	    }
	   
	   @And("Validate the user should see the saved adult user present in the users account and the user should be able to select one")
	    public void Validate_the_user_should_see_the_saved_adult_user_present_in_the_users_account_and_the_user_should_be_able_to_select_one() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.SelectSavedAdult(driver);
	    }
	   
	   @And("User Pass the new user detailes")
	    public void User_Pass_the_new_user_detailes() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.select_Title(driver);
		   REVIEW.add_first_name(driver);
		   REVIEW.add_Last_Name(driver);
		   REVIEW.add_email(driver);
		   REVIEW.add_phone_no(driver);
	
		   
		   
	    }
	   
	   @And("User click On save travler button")
	    public void User_click_On_save_travler_button() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ClickSaveButton(driver);
		   
		   
	    }
	   
	   @And("User click On continu Button")
	    public void User_click_On_continu_Button() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ClickContinue(driver);
		   
		   
	    } 
	   @And("User is click on terms and proceed payamnet")
	    public void User_is_click_on_terms_and_proceed_payamnet() throws InterruptedException
	    {
		   REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		   REVIEW.ClickTermsAndProceedButton(driver);
		   
		   
	    }
	   
	   @And("User click on nevigation key for review page")
	    public void User_click_on_nevigation_key_for_review_page() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.NavigateBackkey(driver);		   
		   
	    }
	   
	   @And("Validate the new user is selected or not")
	    public void Validate_the_new_user_is_selected_or_not() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.ValidatetheAdultedetailes(driver);		   
		   
	    }
	   
	   @And("Validate the user is able to click on Terms of Use in traveler details section")
	    public void Validate_the_user_is_able_to_click_on_Terms_of_Use_in_traveler_details_section() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.Validatetheterms(driver);		   
		   
	    }
	   
	   @And("Validate the user should get Please Enter Coupon Code validation error msg when click direct one Apply")
	    public void Validate_the_user_should_get_Please_Enter_Coupon_Code_validation_error_msg_when_click_direct_one_Apply() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.ValidateApplyButton(driver);		   
		   
	    }
	   
	   @And("Validate the user should be able to type anything in coupons section and  get Invalid Coupon msg")
	    public void Validate_the_user_should_be_able_to_type_anything_in_coupons_section_and_get_Invalid_Coupon_msg() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.ValidateApplyButtonWithinvalidCoupne(driver);		   
		   
	    }
	   
	   
	   @And("Validate the user and the coupon price should be deducted from the total booking price")
	    public void Validate_the_user_and_the_coupon_price_should_be_deducted_from_the_total_booking_price() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.SelectTheRondumCoupne(driver);		   
		   
	    }
	   
	   @And("Validate the user is able to click on Terms of Use in fare details section")
	    public void Validate_the_user_is_able_to_click_on_Terms_of_Use_fare_details_section() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.ValidateTheTermsForFairedetailes(driver);		   
		   
	    }
	   
	   
	   @And("Validate the user is able to click on proceed to payment button without checking the I accept the terms of Use checkbox")
	    public void Validate_the_user_is_able_click_on_proceed_to_payment_button_without_checking_the_I_accept_the_terms_of_Use_checkbox() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.ValidateProceedPaymentButton(driver);		   
		   
	    }
	   
	   
	   @And("Validate the user is able to click on proceed to payment button")
	    public void Validate_the_user_is_able_to_clic_on_proceed_to_payment_button() throws InterruptedException
	    {		  
		        REVIEW=new POM_ReviewPage_Hotel_Flight(driver);
		        REVIEW.TextOnPG(driver);		   
		   
	    }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
