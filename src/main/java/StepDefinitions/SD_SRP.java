package StepDefinitions;

import BaseClass.BaseClass;
import PageObjectClass.POM_HomePage;
import PageObjectClass.POM_SRP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SD_SRP extends BaseClass{
	
	POM_SRP SRP;
	
	 @And("User is click on for select for adult and room")
	    public void User_is_click_on_for_select_for_adult_and_room() throws InterruptedException
	    {
		   SRP=new POM_SRP(driver);
		   SRP.clicktoAddroomandadulte();
	    }

	   @And("Validate the user should be able to add a maximum of Saven Guests in one Room and the combination of Adult and Child in one room should be max Saven")
	    public void Validate_the_user_should_be_able_to_add_maximum_of_Saven_Guests_in_one_Room_and_the_combination_of_Adult_and_Child_in_one_room_should_be_max_Saven() throws InterruptedException
	    {
		   SRP=new POM_SRP(driver);
		   SRP.selectadultechild();
	    }
	
	   @And("Validate the user should be get Please enter valid age when the user tries to click on Done button without filling the Childs age")
	    public void Validate_the_user_should_be_get_Please_enter_valid_age_when_the_user_tries_to_click_on_Done_button_without_filling_the_Childs_age() throws InterruptedException
	    {
		   SRP=new POM_SRP(driver);
		   SRP.ClickDoneWithoutChildAge(driver);
	    }
	
	   @And("Validate the user should be able to click age between the given number from the  Select Age Dropdown")
	    public void Validate_the_user_should_be_able_to_click_age_between_the_given_number_from_the_Select_Age_Dropdown() throws InterruptedException
	    {
		   SRP=new POM_SRP(driver);
		   SRP.SelectAgeForChild();
	    }
	   
	   @And("Validate The user should be able to add Four rooms maximum in one search")
	    public void Validate_the_user_should_be_able_to_add_Four_rooms_maximum_in_one_search() throws InterruptedException
	    {
		   SRP=new POM_SRP(driver);
		   SRP.AddFourRooms(driver);
	    }
	   
	   @Then("User is click on calendar")
	    public void User_is_added_Child() throws InterruptedException {
		   SRP=new POM_SRP(driver);
		   SRP.clickOnCalander();
	    }
	   
	    
	    @And("Validate the user should be able to select the dates on calendar")
	    public void Validate_the_user_should_be_able_to_select_the_dates_on_calendar() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
	    	SRP.selectDateSRP(driver);
	    }
	
	    @And("Validate the user should be able to click on Rooms and Guests section")
	    public void Validate_the_user_should_be_able_to_click_on_Rooms_and_Guests_section() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.clicktoAddroomandadulte();
	    }
	
	    @And("Validate the user is click on Next buttons on Calendar")
	    public void Validate_the_user_is_click_on_Next_buttons_on_Calendar() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickOnNextButtonForDAte(driver);
	    }
	
	    @And("Validate the checkin date should be todays date and the checkout date should be 2 days ahead date")
	    public void Validate_the_checkin_date_should_be_todays_date_and_the_checkout_date_should_be_two_days_ahead_date() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.CheckTodayDate();
	    }
	    
	    @And("Validate the the user should be able to enter City_Area_Hotel name in City_Area_Hotel name field")
	    public void Validate_the_the_user_should_be_able_to_enter_City_Area_Hotel_name_in_City_Area_Hotel_name_field() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateCityNameOnSRP(driver);
	    }
	
	    @Then("Pass the invalid destination for hotel search")
	    public void Pass_the_invalid_destination_for_hotel_search() throws InterruptedException {
		   SRP=new POM_SRP(driver);
		   SRP.ValidateInvalidCityName(driver);
	    }
	
	    @And("Validate the user should be able to click on Remove button")
	    public void Validate_the_user_should_be_able_to_click_on_Remove_button_and_the_rooms_added_should_be_removed_except_the_first_one() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.UserclickOnRemoveButton(driver);
	    }
	
	    @And("Validate the user should be able to click on Done button")
	    public void Validate_the_user_should_be_able_to_click_on_Done_button() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickOnDoneAndAdulteandRoomCountshouldBeOk(driver);
	    }
	
	    @Then("User update the date")
	    public void User_is_able_pass_valida_city_Area_Hotel() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.selectDateSRP(driver);
	    }
	    
	    @And("User is able to click on update button")
	    public void User_is_able_to_click_on_update_button() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickOnUpdateButton(driver);
	    }
	    
	    @And("Validate the date is Updated or not")
	    public void Validate_the_city_Area_Hotel_name_is_Updated_or_not() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateUpdatebuttonworkinornot();
	    }
	    
	    @And("User is drag the Price range filter")
	    public void User_is_drag_the_Price_range_filter() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.drag_the_Price_range_filter(driver);
	    }
	    
	    @And("Validat the updated results according to the filter used should be displayed")
	    public void Validat_the_updated_results_according_to_the_filter_used_should_be_displayed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.Validatetheresultaccordingtoscrollbar();
	    }
	    
	    @And("User is click on Star rating filter")
	    public void User_is_click_on_Star_rating_filter() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickOnStar(driver);
	    }
	    
	    @And("User click on Amenities filter options for Amenities")
	    public void User_click_on_Amenities_filter_options() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.Amenities_filter(driver);
	    }
	    
	    
	    @And("Validate the user should be able to click on Show more button and all Amenities filter options should be displayed")
	    public void Validate_the_user_should_be_able_to_click_on_Show_more_button_and_all_Amenities_filter_ptions_should_be_displayed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateForshowmore(driver);
	    }
	    
	    @And("Validate the user click on Show less button the user should not be able to see all amenities")
	    public void Validate_the_user_click_on_Show_less_button_the_user_should_not_be_able_to_see_all_amenities() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateForshowLess(driver);
	    }
	    
	    @And("Validate the user should be able to click on Reset all filters button and the the filters should be removed and all hotels should be displayed")
	    public void Validate_the_user_should_be_able_to_click_on_Reset_all_filters_button_and_the_the_filters_should_be_removed_and_all_hotels_should_be_displayed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateResetButton(driver);
	    }
	    
	    @And("Validate the popularity sort by should be selected and the results should be displayed from the Lowest price and Highest star to the Highest price and Lowest star")
	    public void Validate_the_popularity_sort_by_should_be_selected_and_the_results_should_be_displayed_from_the_Lowest_price_and_Highest_star_to_the_Highest_price_and_Lowest_star() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateSortbyPrice(driver);
	    }
	    
	    @And("Validate the popularity sort by should be selected and the results should be displayed from the Highest price  and Highest star to the Lowest priceand Lowest star")
	    public void Validate_the_popularity_sor_by_should_be_selected_and_the_results_should_be_displayed_from_the_Highest_price_and_Highest_star_to_the_Lowest_priceand_Lowest_star() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateSortbyPriceHighToLow(driver);
	    }
	    
	    @And("Validate the user clicks on star sortby filter, hotel results should be displayed from lowest star to highest")
	    public void Validate_the_user_clicks_on_star_sortby_filter_hotel_results_should_be_displayed_from_lowest_star_to_highest() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateSortbyStarRatingLowToHigh(driver);
	    }
	    
	    @And("Validate the user clicks on star sortby filter, hotel results should be displayed from highest star to lowest")
	    public void Validate_the_user_clicks_on_star_sortby_filter_hotel_results_should_be_displayed_from_highest_star_to_lowest() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateSortbyStarRatingHighToLow(driver);
	    }
	    
	    @And("Validate the user should be able to click and enter the hotel name and accordingly the hotel should be displayed if the hotel is present in the list")
	    public void Validate_the_user_should_be_able_to_click_and_enter_the_hotel_name_and_accordingly_the_hotel_should_be_displayed_if_the_hotel_is_present_in_the_list() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateSearchbyhotelname(driver);
	    }
	    
	    @And("Validate when the user backspaces the entered name all hotel results should be displayed")
	    public void Validate_when_the_user_backspaces_the_entered_name_all_hotel_results_should_be_displayed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateSearchbyhotelnameReframesh(driver);
	    }
	    
	    @And("Validate the user should be able to click on Grid view button and the results should be displayed in Grid view")
	    public void Validate_the_user_should_be_able_to_click_on_Grid_view_button_and_the_results_should_be_displayed_in_Grid_view() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateGridView(driver);
	    }
	    
	    
	    @And("Validate the user should be able to click on Map view button and the results should be displayed in Map view")
	    public void Validate_the_user_should_be_able_to_click_on_Map_view_button_and_the_results_should_be_displayed_in_Map_view() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateLOcationView(driver);
	    }
	    
	    @And("Validate the user should be able to click on Cancel button on filters popup in Map view and the popup should be closed")
	    public void Validate_the_user_should_be_able_to_click_on_Cancel_button_on_filters_popup_in_Map_view_and_the_popup_should_be_closed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickOncloseButton(driver);
	    }
	    
	    @And("Validate the user should be able to click on list view button and the results should be displayed in list view")
	    public void Validate_the_user_should_be_able_to_click_on_list_view_button_and_the_results_should_be_displayed_in_list_view() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickOnListView(driver);
	    }
	    
	    @And("Validate the user should be able to see the hotel details on hotels details page")
	    public void Validate_the_user_should_be_able_to_see_the_hotel_details_on_hotels_details_page() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateHotelDetailPAge(driver);
	    }
	    @And("Validate the user should be able to click on button on Oops something went wrong popup back to home")
	    public void Validate_the_user_should_be_able_to_click_on_button_on_Oops_something_went_wrong_popup_back_to_home() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickonbuttononOopssomethingwentwrongpopup(driver);
	    }
	    @And("Validate the user should be able to Click on Home button and the user should be redirected to Homepage from Hotel detailes")
	    public void Validate_the_user_should_be_able_to_Click_on_Home_button_and_the_user_should_be_redirected_to_Homepage() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickOnHOMEButton(driver);
	    }
	    
	    @And("Validate the user should be able to Click on Room button and the user should be redirected to Rooms section below")
	    public void Validate_the_user_should_be_able_to_Click_on_Room_button_and_the_user_should_be_redirected_to_Rooms_section_below() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateRoomButton(driver);
	    }
	    
	    @And("Validate the user should be able to click on View on map button and the map should open up in new tab")
	    public void Validate_the_user_should_be_able_to_click_on_View_on_map_button_and_the_map_should_open_up_in_new_tab() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateViewinMapButton(driver);
	    }
	    
	    
	    @And("Validate the user should be able to click on View more button in about section and the about section details should expand")
	    public void Validate_the_user_should_be_able_to_click_on_View_more_button_in_about_section_and_the_about_section_details_should_expand() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickAndVAlidateForViewMore(driver);
	    }
	    
	    
	    @And("Validate the user should be able to clicks on View less section, the about us section should shorten up")
	    public void Validate_the_user_should_be_able_to_clicks_on_View_less_section_the_about_us_section_should_shorten_up() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ClickAndVAlidateForViewLess(driver);
	    } 
	    
	    
	    @And("Validate the user should be able to see the hotel detaile correct on detail page")
	    public void Validate_the_user_should_be_able_to_see_the_hotel_detaile_correct_on_detail_page() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateHotelDetaileOnDetailPAge(driver);
	    }
	    
	    @And("Validate the user should be able to click on Free cancellation button in Rooms section and all rooms with Free cancellation should be displayed")
	    public void Validate_the_user_should_be_able_to_click_on_Free_cancellation_button_in_Rooms_section_and_all_rooms_with_Free_cancellation_should_be_displayed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateFreeCancelationButton(driver);
	    }
	    
	    @And("Validate the user should be able to click on Free breakfast button in Rooms section and all rooms with Free breakfast should be displayed")
	    public void Validate_the_user_should_be_able_to_click_on_Free_breakfast_button_in_Rooms_section_and_all_rooms_with_Free_breakfast_should_be_displayed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateBreakfastIncluded(driver);
	    }
	    
	    @And("Validate the user should be able to click on All button in Rooms section and all rooms should be displayed")
	    public void Validate_the_user_should_be_abl_to_click_on_All_button_in_Rooms_section_and_all_rooms_should_be_displayed() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateAllButton(driver);
	    }
	    
	    
	    @And("Validate the user should be able to click on Fully refundable button in Rooms section if there are fully refundable rooms available")
	    public void Validate_the_user_should_be_able_to_click_on_Fully_refundable_button_in_Rooms_section_if_there_are_fully_refundable_rooms_available() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidateFullyrefundable(driver);
	    }
	    
	    
	    @And("Validate the user should be able to click on Book now button in Rooms section and the user should be redirected to Hotels review page")
	    public void Validate_the_user_should_be_able_to_click_on_Book_now_button_in_Rooms_section_and_the_user_should_be_redirected_to_Hotels_review_page() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidatBookNowButton(driver);
	    }
	    
	    @And("Validate the user should be able to click on cancel button on non refundable popup in Rooms section if there are non refundable rooms available")
	    public void Validate_the_user_should_be_able_to_click_on_cancel_button_on_non_refundable_popup_in_Rooms_section_if_there_are_non_refundable_rooms_available() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.Validatecancel_button_on_non_refundable_popup(driver);
	    }
	    
	    @And("Validate the user should be able to click on Non refundable button in Rooms section if there are Non refundable rooms available")
	    public void Validate_the_user_should_be_able_to_click_on_Non_refundable_button_in_Rooms_section_if_there_are_Non_refundable_rooms_available() throws InterruptedException
	    {
			   SRP=new POM_SRP(driver);
			   SRP.ValidatNonrefundablebutton(driver);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
}
