package StepDefinitions;

import java.io.IOException;
import java.text.ParseException;

import BaseClass.BaseClass;
import PageObjectClass.POM_FlightBooking_Exceldata;
import PageObjectClass.POM_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_HomePage extends BaseClass{
	POM_FlightBooking_Exceldata HOME;
	POM_HomePage Home;
	
	    @When("the user clicks on the application logo")
	    public void whenUserClicksOnLogo() throws InterruptedException {
	    	Home=new POM_HomePage(driver);
	    	Home.click_On_logo(driver);
	    	
	       
	    }

	    @Then("Validate After Clicking on Logo user should be redirected to the Flight Homepage")
	    public void UserRedirectedToFlightHomepage() throws InterruptedException {
	     
	    	Home.Validate_Text(driver);
	    }
	    
	    @Then("User click on Hotel")
	    public void whenUserClicksOnHotel() throws InterruptedException {
	    	Home=new POM_HomePage(driver);
	    	Home.click_Hotel(driver);
	    }
	    
	    @When("User click on logo")
	    public void whenUserClicksOnHomepageLogo() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
	    	Home.click_On_HomePage_logo(driver);
	  
	    }

	    @Then("Validate user should be redirected to the Holiday Homepage")
	    public void thenUserRedirectedToFlightHomepage() throws InterruptedException {
	     
	    	Home.Validate_HolidayHome(driver);
	    }
	  
	   
	    
	    @Then("User should be able to scroll down the page properly")
	    public void userShouldScrollDown() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
	    	Home.ScrolldownValidateMess(driver);
	    	
	    }
	    
	    @Then("User should be able to scroll up the page properly")
	    public void userShouldScrollUp() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ScrollUpValidateMess(driver);
	    
	    }
	    
	    @When("After clicking on the phone number, dialer pad should be opened")
	    public void clickOnPhoneNumber() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
	    	Home.ClickonContactUs(driver);

	    }

	    @Then("validat the user click on support the mobile number and email should be visiable")
	    public void validateTextOnDialerPad() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.validate_MOBILE_Email(driver);
	    	
	    	
	    }
	    
	    @When("The user should be redirected to the hotel homepage after clicking on Hotel service")
	    public void redirectedtothehotelhomepage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnHederHotel(driver);
	    	
	    	
	    }
	    
	    @And("Validate the hotelHompage isDisplay or not")
	    public void validateHotelHomePage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateHotelHome(driver);
	    	
	    	
	    }
	    
	    @When("User is click on My account")
	    public void userIsOnMyAccountPage() throws InterruptedException {
	    	HOME=new POM_FlightBooking_Exceldata(driver);
	      //HOME.click_On_Myaccount(driver);
	    }

	    @Then("User click on Sighn in button")
	    public void userClicksSignInButton() throws InterruptedException {
	    	HOME=new POM_FlightBooking_Exceldata(driver);
		      HOME.click_On_SighIn(driver);
	    }

	    @And("Validate user should redirect to the Login page")
	    public void validateUserRedirectedToLoginPage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateLoginpageText(driver);
	    	
	    }
	    
	    @Then("User click on Sighn up button")
	    public void userClicksSignupButton() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnSighnUp(driver);
	    }

	    @And("Validate user should redirect to the Sighn Up Page")
	    public void validateUserRedirectedToSighnUpPage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateSighnupPAgeText(driver);
	    }
	  
	    @And("Click on login button and Validate error message")
	    public void validateErorrMessage() throws InterruptedException {
	    	HOME=new POM_FlightBooking_Exceldata(driver);
			HOME.click_On_Login(driver);
	    	Home=new POM_HomePage(driver);	
            Home.ValidateErorrMessageOnLogin(driver);

	    }
	    
	    @Then("^User pass valid username (.+) and invalid pass (.+)$")
	    public void user_pass_valid_username_and_invalid_pass(String string, String string2) throws InterruptedException, IOException {
	    	HOME=new POM_FlightBooking_Exceldata(driver);
	    	   HOME.Pass_email(driver, string);
			   HOME.pass_pass(string2);
	       
	    }
	    
	    
	    @Then("A validation error msg should be displayed for Incorrect password when click on login button")
	    public void a_validation_error_msg_should_be_displayed_for_incorrect_password_when_click_on_login_button() throws InterruptedException {
	    	HOME=new POM_FlightBooking_Exceldata(driver);
			HOME.click_On_Login(driver);
	    	
	    }
	    
	    @Then("Validate the text on home page")
	    public void ValidatetextOnHomePage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.Validate_Text(driver);
	    }
	    
	    @Then("The User should able to login by using Google sign in option")
	    public void UserloginwithGooglesighnin() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnGoogleSighnIn(driver);
	    }
	    
	    @Then("validate when  User click on forget password button should redirect to the Forgot password page")
	    public void UserredirectonpasswordForgetpage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ClickonForgetPass(driver);
	    }
	    
	    @And("To check if user clicks on Reset password button for blank  email id")
	    public void MessagewhenclickonresetPassword() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.clickandvalidatemesageforresegtpass(driver);
	    }
	    
	    @And("To check if user clicks on Reset password button with incorrect email id")
	    public void Messagewithinvalideemailidonforgotepage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateMessageinvalidEmail(driver);
	    }
	    
	    @And("The user should get the Forgot Password email to reset password")
	    public void OnForgotepasspagewithvalideemailresivdeemail() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatevalidEmailrecivdeemail(driver);
	    }
	    
	    @Then("The checkbox should be selected and unselected after click")
	    public void CheckRemembercheckbox() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.CheckRememberMeCheckBoox(driver);
	    }
	    
	    @Then("To check if user clicks on Sign Up button with blank email id")
	    public void MessageCheckSighnupwithblanckemail() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateMessageBlankemailsighnup(driver);
	    }
	    
	    @Then("To check if user clicks on Sign Up button with incorrect email id")
	    public void TocheckifuserclicksonSignUpbuttonwithincorrectemailid() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateMessageinvalidemailsighnup(driver);
	    }
	    
	    @Then("Validate the user should able to select and unselect the checkbox of I Accept bounz terms & conditon")
	    public void validatecheckboxonsighnuppagedforAcceptbounztermsconditon() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatecheckBoxOnSighnuppage(driver);
	    }
	    
	    @Then("Validate message to check if user clicks on Sign Up button with already logged in email id")
	    public void Validatemessagesighnupwithexistmail() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateMessageExistemailsighnup(driver);
	    }
	    
	    @Then("To check if user clicks on Sign up button with valid email id & Password user should redirect to the Sign Up form")
	    public void UserpassValidmailandredirecttosighnupformpage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.PassValidmailforsighupandredirectonformpage(driver);
	    }
	    
	    @Then("Pass Valid email ID")
	    public void PassValidEmailIDForSighnup() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.PassEmailIDForSighnup(driver);
	    }
	    
	    @And("Validate error message when user directley click on sighup button on form page")
	    public void Validateerrormessageafterclickondirectlysighnupbuttononformpage() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateMessagewithoutfilupformandclickonsighnupu(driver);
	    }
	    
	    @And("To check if user clicks on sign up button for different Passwords in New Password and Confirm New password field")
	    public void ValidatedifferntPasswordsinNewPasswordandConfirmNewpasswordfield() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.validateMessageforpasswordandconfirmpassword(driver);
	    }
	    
	    @And("The user should not able to edit email id field")
	    public void Theusershouldnotabletoeditemailidfield() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateEmailIDFiledisEditableornotOnSighnupFormPg(driver);
	    }
	    
	    @Then("Validate the error message after on Origin and Destination filed")
	    public void ValidatetheerrormessageafteronOriginandDestinationfiled() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateOriginandDestinationErrorMessage(driver);
	    }
	    
	    @When("User pass same Origin and Destination")
	    public void UserpasssameOriginandDestination() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.PassOriginAndDestination(driver);
	    	
	    	
	    }
	    
	    @Then("Validate the error message after user clicks on search button with Origin and Destination field with same details")
	    public void ValidateMessagewithSameOriginAndDestination() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatesameOriginandDestinationErrorMessage(driver);
	    }
	    
	    @When("User pass invalid Origin and Destination")
	    public void UserpassinvalidOriginandDestination() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.PassinvalidOriginAndDestination(driver);
	    	
	    	
	    }
	    
	    @Then("Validate the error message to check if user enters incorrect details in Origin and Destination field and search")
	    public void ValidateMessagewithInvalidOriginAndDestination() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateinvalidOriginandDestinationErrorMessage(driver);
	    }
	    
	    @When("User pass Origin and Destination")
	    public void UserpassOriginandDestination () throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.PassiOriginAndDestination(driver);
	    	
	    	
	    }
	    
	    @Then("The city details or airport code should get interchanged after clicking on swipe button")
	    public void Thecitydetailsorairportcodeshouldgetinterchangedafterclickingonswipebutton() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateSwipeButton(driver);
	    }
	    
	    @When("User is click on Rountrip button")
	    public void UserisclickonRountripbutton () throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.SelectRoundTrip(driver);
	    	
	    	
	    }
	    
	    @Then("The return date should selected in return trip calendar")
	    public void Thereturndateshouldselectedinreturntripcalendar() throws InterruptedException, ParseException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateRetundateSelectedOrNot(driver);
	    }
	    
	    
	    @Then("Click on cross icon of Return calendar field")
	    public void ClickoncrossiconofReturncalendarfield() 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.clickOnCrossButton(driver);
	    }
	    
	    
	    @And("validate the trip type should chnage to the One way from Round way")
	    public void ThetriptypeshouldchnagetotheOnewayfromRoundway() 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateOnewaydisplayornot(driver);
	    }
	    
	  

	    
	    @When("User is Click on Traveler field")
	    public void UserisClickonTravelerfield () throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.clickOnTravelerfield(driver);
	    	
	    	
	    }
	    
	  
	    
	    @Then("User is add the Adulte Pssanger is {int} validate the user should selects Max 9 adult")
	    public void user_is_add_the_adulte_pssanger_isMAX(Integer number) {
	    	Home=new POM_HomePage(driver);	
            Home.AddAdultePassanger(driver, number);
	    }

	    
	    @Then("User is add the Adulte Pssanger is {int} validate the user should selects  Min 1 adult traveler")
	    public void user_is_add_the_adulte_pssanger_isMIN(Integer number) {
	    	Home=new POM_HomePage(driver);	
            Home.AddAdultePassangerMin(driver, number);
	    }
	    
	    @Then("User is add the Adulte Pssanger is {int}")
	    public void user_is_add_the_adulte_pssanger(Integer number) {
	    	Home=new POM_HomePage(driver);	
            Home.Adultadd(driver, number);
	    }
	    
	    @And("Validate the Maximum number of children to be selected as = 9 - No of adults {int}")
	    public void Validatechildcount(Integer number) 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateChildCountWithAdult(driver, number);
	    }
	    
	    @And("The user should be able to select Infants Travelers {int} Maximum number of infants = number of adults selected")
	    public void ValidateInfentIsequaltoAdultorNot(Integer number) 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateINfentEqualToAdult(driver, number);
	    }
	    
	    @And("Validate the user should get redirect to the Flight Result page")
	    public void ValidatetheusershouldgetredirecttotheFlightResultpage() throws InterruptedException 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateelementOnFlightResultPage(driver);
	    }
	  
	    @And("Click on Any one package in Winter Holiday offer section")
	    public void selectanypackageinwinterHolidayoffersection() throws InterruptedException 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnHolidayPackage(driver);
	    }
	    
	    @And("Validate the user should redirect to the Holiday detail page and Same Package name should displayed on Holiday detail page")
	    public void ValidateUserShouldredirecttotheHolidaydetailpage() throws InterruptedException 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateHolidayPAckageOnsrp(driver);
	    }
	    
	    @Then("User should be able to scroll down the page upto  Europe offer section on homepage")
	    public void UserAbletoscrollUptoEuropeOffersection() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ScrollUptoEuropeSectionPage(driver);
	    }
	    
	    @And("The user should able to see Europe offer packages name & Price details on card")
	    public void TheusershouldabletoseeEuropeofferpackagesnamePricedetailsoncard() throws InterruptedException 
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatetheEuropdetailes(driver);
	    }
	
	
	    @And("Validate hotel search widget should be displayed")
	    public void Validatehotelsearchwidgetshouldbedisplayed()
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateHotelsearchwidgetshouldbedisplayed(driver);
	    }
	    
	    @And("Scroll down and click on Special offer section and validate it redirected or not")
	    public void ScrolldownandclickonSpecialoffersectionvalidateredirectedornot() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateredirectioninHotelScrolldownandclickSpecialoffersectionandclick(driver);
	    }
	    
	    @And("Validate if user is able to click on Winter Holidays section")
	    public void ValidateifuserisabletoclickonWinterHolidayssection() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateredirectioninHotelScrolldownandclickSpecialoffersectionandclick(driver);
	    }
	    
	    @And("Validate the user should be get validation error message Enter Destination")
	    public void ValidatetheusershouldbegetvalidationerrormessageEnterDestination() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateErrorMessageWithoutdestinationPass(driver);
	    }
	    
	   
	    
	  
	    
	    @Then("Validate if user is not getting any results for invalid City\\/Area\\/Hotel name")
	    public void validate_if_user_is_not_getting_any_results_for_invalid_city_area_hotel_name() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateErrorMessageWithoutdestinationPass(driver);
	    }
	    
	    @Then("Pass the invalid destination for hotel search on Home Page")
	    public void Pass_the_invalid_destination_for_hotel_search_on_Home_Page() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.SelectInvalidecityForHotel(driver);
	    }
	    
	    
	    @Then("Validate user should be able to enter City\\/Area\\/Hotel name in City\\/Area\\/Hotel name field and get result")
	    public void validate_user_should_be_able_to_enter_city_area_hotel_name_in_city_area_hotel_name_field_and_get_result() {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatethesearchresultonSRP(driver);
	    }
	    
	    
	    @Then("User Click on Calendar")
	    public void UserClickonCalendar() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnCalender(driver);
	    }
	    
	    @And("Validate the user should be able to open the calendar on hotel search widget")
	    public void Validatetheusershouldbeabletoopenthecalendaronhotelsearchwidget() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateCalenderisselectedornotforHotel(driver);
	    }
	    
	    @And("Validate the user should be able to click next and previous arrows and the forward dates should be displayed")
	    public void Validate_the_user_should_be_able_to_clicknext_and_previous_arrows_and_the_forward_dates_should_be_displayed() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatArrowOncalander(driver);
	    }
	    
	    
	    @And("Click on Rooms and Guests")
	    public void ClickonRoomsandGuests() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnRoomsandGuests(driver);
	    }
	    
	    @And("Validate the user should be able to see 2 Adults selected by default in Rooms and Guests")
	    public void ValidatethedefaultguestsinHotel() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatethedefaultguestsinHotel(driver);
	    }
	    
	    @And("Validate the user should be able to click on the  Minus icons on Rooms and Guests")
	    public void ValidatetheusershouldbeabletoclickMinusiconsonRoomsandGuests() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateclickontheMinusiconsonRoomsandGuests(driver);
	    }
	    
	    @And("Validate the user should be able to add a maximum of  7 Guests in 1 Room")
	    public void Validatetheusershouldbeabletoaddamaximumof7Guestsin1Room() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateMaxGuestSelectInHotelBooking(driver);
	    }
	    
	    
	    @Then("validate user able to click on terms and conditions")
	    public void validate_user_able_to_click_on_terms_and_conditions() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.UserclickOntermsAndCondition(driver);
	    }
	    
	    
	    @Then("User is added Child")
	    public void User_is_added_Child() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.UserAddedChild(driver);
	    }
	    
	    @And("User is click On Done button")
	    public void User_is_click_On_Done_button() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnDOneButtonAfertSelectingchiildForHotel(driver);
	    }
	    
	    @And("Validate Error mesage click on Done button without filling the Childs age")
	    public void Validate_Error_mesage_click_on_Done_button_without_filling_the_Childs_age() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatetheErrorMessageAfterclickOnDoneWithoutselectageOfChild(driver);
	    }
	    
	    @And("Validate the user is able to click on Select Age dropdown")
	    public void Validate_the_user_is_able_to_click_on_Select_Age_dropdown() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.Click_on_Select_Age_Dropdown(driver);
	    }
	    
	    @And("Validate the user should be able to click age between below numbers from the  Select Age Dropdown")
	    public void  Validatethe_user_should_be_able_to_click_age_between_0to12_from_the_Select_Age_Dropdown() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.Click_on_Select_Age_Dropdow_And_Child_Age(driver);
	    }
	    
	    @And("Validate the user should be able to add four rooms maximum in one search")
	    public void  Validate_the_user_should_be_able_to_add_four_rooms_maximum_in_one_search() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateRommselectedornotasperrequirement(driver);
	    }
	    
	    @Then("User is added room")
	    public void User_is_added_room() throws InterruptedException {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnAddRoom(driver);
	    }
	    
	    @And("Validate the user should be able to click on Remove button and the rooms added should be removed except the first one")
	    public void ValidatetheusershouldbeabletoclickonRemovebuttonandtheroomsaddedshouldberemovedexceptthefirstone() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnRemoveButtonForRemoveAddedRoom(driver);
	    }
	    
	    @And("Validate the Adults and Childs info and the guest count should be correct")
	    public void Validate_the_Adults_and_Childs_info_and_the_guest_count_should_be_correct() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatetheGuestCountOnSRP(driver);
	    }
	    
	    @And("Validate the user should be able to click on Search button and the the user should be redirected to Search page")
	    public void ValidatetheusershouldbeabletoclickonSearchbuttonandthetheusershouldberedirectedtoSearchpage() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidateUserRedirectedOrNotOnSearchPage(driver);
	    }
	    
	    @And("Validate the user should be able to see the results on search page if the results are coming from the supplier")
	    public void Validate_the_user_should_be_able_to_see_the_results_on_search_page_if_the_results_are_coming_from_the_supplier() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ValidatResultONSRP(driver);
	    }
	    
	    @And("Validate the user should be able to click on Reset button on No results found popup on the search page")
	    public void Validate_the_use_should_be_able_to_click_on_Reset_button_on_No_results_found_popup_on_the_search_page() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnResetFilterButton(driver);
	    }
	    
	    @And("Validate the user should be able to Click on Home button and the user should be redirected to Homepage")
	    public void Validate_the_user_should_be_able_to_Click_on_Home_button_and_the_user_should_be_redirected_to_Homepage() throws InterruptedException
	    {
	    	Home=new POM_HomePage(driver);	
            Home.ClickOnHome(driver);
	    }
	  
	    
	 
	    
	   
	    
	  
	
	    
	  
	    
	    
	    
}
