Feature: Hotel Regression_TestCases

 Background:    
   Given User is on Elevate Trip Landing page for Hotel Booking with the "uat" environment
   
    @Hotel_Regression_TestCases
    Scenario: TC_1_ 
    Then User selct the Hotel option on home page
    And Validate hotel search widget should be displayed
      
    @Hotel_Regression_TestCases
    Scenario: TC_2_HomePage_Search widget_To check if user is able to search for Hotel while keeping the City/Area/Hotel name blank
    Then User selct the Hotel option on home page
    And User clicks on the search button
    And Validate the user should be get validation error message Enter Destination
      
      
    @Hotel_Regression_TestCases
    Scenario: TC_3_HomePage_Search widget_To check if user is not getting any results for invalid City/Area/Hotel name
    Then User selct the Hotel option on home page 
    Then Pass the invalid destination for hotel search on Home Page
    And User clicks on the search button
    And Validate if user is not getting any results for invalid City/Area/Hotel name
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_4_HomePage_Search widget_To check if user is able to able to enter City/Area/Hotel name
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   #And Validate user should be able to enter City/Area/Hotel name in City/Area/Hotel name field and get result
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
      
    @Hotel_Regression_TestCases
    Scenario: TC_5_HomePage_Calendar_To check if user is able to open the calendar after clicking on Calendar section
    Then User selct the Hotel option on home page 
    Then User Click on Calendar
    And Validate the user should be able to open the calendar on hotel search widget
    
  
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_6_HomePage_Calendar_To check if user is able to select dates on calendar 
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_7_HomePage_Rooms and Guests_To check the current adult details is being displayed in Adults section
   Then User selct the Hotel option on home page
   And Validate the user should be able to see 2 Adults selected by default in Rooms and Guests
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_8_HomePage_Rooms and Guests_To check if user is able to click on Plus icons on Rooms and Guests
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the Adult and child and room as per requirment  
    Examples:
    |SheetIndex|RowNumber|
    |1|2|
 
 
   @Hotel_Regression_TestCases
   Scenario Outline: TC_9_HomePage_Rooms and Guests_To check if user is able to click Minus icons on Rooms and Guests 
   Then User selct the Hotel option on home page
   And Click on Rooms and Guests
   And Validate the user should be able to click on the  Minus icons on Rooms and Guests
   
   

   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_10_HomePage_Rooms and Guests_To check if the user is able to click on Done button without filling the Childs age 
   Then User selct the Hotel option on home page
   And Click on Rooms and Guests
   Then User is added Child
   And User is click On Done button
   And Validate Error mesage click on Done button without filling the Childs age
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_11_HomePage_Rooms and Guests_To check if the user is able to click on Select Age dropdown 
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the Adult and child and room as per requirment  
    Examples:
    |SheetIndex|RowNumber|
    |1|2|
   
 
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_12 _HomePage_Rooms and Guests_To check if the user is able to add 4 rooms  
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to add four rooms maximum in one search
    Examples:
    |SheetIndex|RowNumber|
    |1|4|
  
  
  
   @Hotel_Regression_TestCases
   Scenario Outline: TC_13_HomePage_Rooms and Guests_To check if the user is able to click on Remove button 
   Then User selct the Hotel option on home page
   And Click on Rooms and Guests
   Then User is added room
   And Validate the user should be able to click on Remove button and the rooms added should be removed except the first one
                 
   @Hotel_Regression_TestCases
   Scenario Outline: TC_14_HomePage_Rooms and Guests_To check if the user is able to click on Done button after entering Adults and Childs info  
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the Adults and Childs info and the guest count should be correct
    Examples:
    |SheetIndex|RowNumber|
    |1|2|          
       
   @Hotel_Regression_TestCases
   Scenario Outline: TC_15_HomePage_Rooms and Guests_To check if the user is able to click on Search button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to click on Search button and the the user should be redirected to Search page
    Examples:
    |SheetIndex|RowNumber|
    |1|0| 
    
           
  @Hotel_Regression_TestCases
   Scenario Outline: TC_16_Search Result Page_Breadcrumbs_To check if the user is able to click on Home button on breadcrumbs
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to Click on Home button and the user should be redirected to Homepage
    Examples:
    |SheetIndex|RowNumber|
    |1|1| 
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_17_Search Result Page_Modify tab_To check if user is not getting any results for invalid City/Area/Hotel name
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then Pass the invalid destination for hotel search 
     Examples:
    |SheetIndex|RowNumber|
    |1|1|  

 
   @Hotel_Regression_TestCases
   Scenario Outline: TC_18_Search Result Page_Modify tab_To check if user is able to able to enter City/Area/Hotel name
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the the user should be able to enter City_Area_Hotel name in City_Area_Hotel name field
    Examples:
    |SheetIndex|RowNumber|
    |1|1|  
    
 
 
   
         
   @Hotel_Regression_TestCases
   Scenario Outline: TC_19_Search Result Page_Modify tab_To check if user is able to click on Rooms and Guests
    Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to click on Rooms and Guests section
    Examples:
    |SheetIndex|RowNumber|
    |1|1| 
    
   
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_20_Search Result Page_Modify tab_To check if the user is able to click on Done button without filling the Childs age
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User is click on for select for adult and room
   And Validate the user should be get Please enter valid age when the user tries to click on Done button without filling the Childs age
   Examples:
    |SheetIndex|RowNumber|
    |1|11| 
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_21_Search Result Page_Modify tab_To check if the user is able to select age from Select Age Dropdown
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User is click on for select for adult and room
   And Validate the user should be able to click age between the given number from the  Select Age Dropdown
   Examples:
    |SheetIndex|RowNumber|
    |1|11| 
    
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_22_Search Result Page_Modify tab_To check if the user is able to add 4 rooms 
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User is click on for select for adult and room
   And Validate The user should be able to add Four rooms maximum in one search
   Examples:
    |SheetIndex|RowNumber|
    |1|11| 
    
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_23_Search Result Page_Modify tab_To check if the user is able to click on Remove button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User is click on for select for adult and room
   And Validate the user should be able to click on Remove button
   Examples:
    |SheetIndex|RowNumber|
    |1|0|  
    
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_24_Search Result Page_Modify tab_To check if the user is able to click on Done button after entering Adults and Childs info
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User is click on for select for adult and room
   And Validate the user should be able to click on Done button
   Examples:
    |SheetIndex|RowNumber|
    |1|11| 
     
    
 
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_25_Search Result Page_Price range filter_To check if the user is able to use Price range filter
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And User is drag the Price range filter 
   Examples:
    |SheetIndex|RowNumber|
    |1|11| 
    
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_26_Search Result Page_Star rating filter_To check if the user is able to click on Star rating filter options
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And User is click on Star rating filter
   Examples:
    |SheetIndex|RowNumber|
    |1|11|
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_27_Search Result Page_Amenities filter_To check if the user is able to click on Amenities filter options
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And User click on Amenities filter options for Amenities
   Examples:
 |SheetIndex|RowNumber|
 |1|11|
     
                            
 

 
   @Hotel_Regression_TestCases
   Scenario Outline: TC_28_Search Result Page_Reset all filters button_To check if the user is able to click on Reset all filters button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to click on Reset all filters button and the the filters should be removed and all hotels should be displayed
   Examples:
 |SheetIndex|RowNumber|
 |1|11|

  @Hotel_Regression_TestCases
   Scenario Outline: TC_29_Search Result Page_Sort by_To check if the user is able to click on Sort by options
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the popularity sort by should be selected and the results should be displayed from the Lowest price and Highest star to the Highest price and Lowest star
   Examples:
 |SheetIndex|RowNumber|
 |1|11|
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_30_Search Result Page_Sort by_To check if the user is able to click on Reset all filters button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the popularity sort by should be selected and the results should be displayed from the Highest price  and Highest star to the Lowest priceand Lowest star
   Examples:
 |SheetIndex|RowNumber|
 |1|11|
 
   @Hotel_Regression_TestCases
   Scenario Outline: TC_31_Search Result Page_Sort by_To check if the user is able to click on Reset all filters button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user clicks on star sortby filter, hotel results should be displayed from lowest star to highest 
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_32_Search Result Page_Sort by_To check if the user is able to click on Reset all filters button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user clicks on star sortby filter, hotel results should be displayed from highest star to lowest 
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
    
   @Hotel_Regression_TestCases
   Scenario Outline: TC_33_Search Result Page_Search by hotel name_To check if the user is able to use Search by hotel name field
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to click and enter the hotel name and accordingly the hotel should be displayed if the hotel is present in the list 
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_34_Search Result Page_Search by hotel name_To check if the user is able to use Search by hotel name field
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate when the user backspaces the entered name all hotel results should be displayed
   Examples:
   |SheetIndex|RowNumber|
   |1|11|

   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_35_Search Result Page_Map view_To check if the user is able to click on Map view button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to click on Map view button and the results should be displayed in Map view
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
     
    

   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_36_Search Result Page_List view _To check if the user is able to click on list view button
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to click on list view button and the results should be displayed in list view
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
   

   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_37_Hotel details page_Breadcrumbs_To check if the user is able to click on Home button on breadcrumbs
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And Validate the user should be able to Click on Home button and the user should be redirected to Homepage from Hotel detailes
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_38_Hotel details page_Rooms_To check if the user is able to click on Room button on subheader
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And Validate the user should be able to Click on Room button and the user should be redirected to Rooms section below
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
    
       
   @Hotel_Regression_TestCases
   Scenario Outline: TC_39_Hotel details page_Overview_To check if the user is able to see the hotel details properly on overview section
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   And Validate the user should be able to see the hotel detaile correct on detail page 
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_40_Hotel details page_Overview_To check if the user is able to click on View on Map button on overview section
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And Validate the user should be able to click on View on map button and the map should open up in new tab
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
         

   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_41_Hotel details page_Rooms_To check if the user is able to click on All button in Rooms section
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And Validate the user should be able to click on All button in Rooms section and all rooms should be displayed
   Examples:
   |SheetIndex|RowNumber|
   |1|11| 
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_42_Hotel details page_Rooms_To check if the user is able to click on Fully refundable button in Rooms section
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And Validate the user should be able to click on Fully refundable button in Rooms section if there are fully refundable rooms available
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
   
 
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_43_Hotel details page_Rooms_To check if the user is able to click on Book now button in Rooms section
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And User selects the room 
   And Validate the user should be able to click on Book now button in Rooms section and the user should be redirected to Hotels review page
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
   
  
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_44_Review page_Review your booking_To check if the user is able to click on Continue button in review your booking section
   When User SighnIn with username and password for Hotel Booking
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And User selects the room 
   And User clicks on the continue button 
   And Validate the user should be able to click on Continue button in review your booking section and Travelers details section should be displayed
   Examples:
   |SheetIndex|RowNumber|
   |1|1|
   

   @Hotel_Regression_TestCases
   Scenario Outline: TC_46_Review page_validate the error mesage on review page if directly click on continue  without add adult detailes 
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And User selects the room 
   And User clicks on the continue button 
   And Validate The user should be able to see correct details Travelers details section
   Examples:
   |SheetIndex|RowNumber|
   |1|1|

   
    @Hotel_Regression_TestCases
    Scenario Outline: TC_47_Review page_Traveler details section_To check if the user can add information traveler details section
    Given User is on Elevate Trip Landing page for Hotel Booking with the "uat" environment
    When User SighnIn with username and password
    Then User selct the Hotel option on home page
    Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
    Then User select the date for hotle booking INdate and Outdate
    Then User select the Adult and child and room as per requirment
    And User clicks on the search button
    Then User selects the hotel
    And User selects the room 
    And User selects the adult for as room
    Then I click on continue booking for hotel accept the terms of use for Hotel   
    Then User is select the netbanking and successfully do the payment      
   
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
    
    

   
    @Hotel_Regression_TestCases
    Scenario Outline: TC_48_Review page_Traveler details section_To check if the user is able to select saved traveler user in logged in case
    Given User is on Elevate Trip Landing page for Hotel Booking with the "uat" environment
    When User SighnIn with username and password
    Then User selct the Hotel option on home page
    Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
    Then User select the date for hotle booking INdate and Outdate
    Then User select the Adult and child and room as per requirment
    And User clicks on the search button
    Then User selects the hotel
    And User selects the room 
    And User selects the adult for as room      
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
    

 
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_49_Review page_Coupons_To check if the user clicks on apply button without entering coupon code in coupons section textbox 
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And User selects the room 
   And Validate the user should get Please Enter Coupon Code validation error msg when click direct one Apply
   Examples:
   |SheetIndex|RowNumber|
   |1|0|
   
   
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_50_Review page_Coupons_To check if the user enters invalid coupon in coupons section textbox 
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And User selects the room 
   And Validate the user should be able to type anything in coupons section and  get Invalid Coupon msg
   Examples:
   |SheetIndex|RowNumber|
   |1|1|
   
   
   
   @Hotel_Regression_TestCases
   Scenario Outline: TC_51_Review page_Coupons_To check if the user is able to select coupons in coupons section
   When User SighnIn with username and password for Hotel Booking
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And User selects the room 
   And Validate the user and the coupon price should be deducted from the total booking price
   Examples:
   |SheetIndex|RowNumber|
   |1|11|
    
    @Hotel_Regression_TestCases
    Scenario Outline: TC_52_Hotel Booking With login 
    When User SighnIn with username and password
    Then User selct the Hotel option on home page
    Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
    Then User select the date for hotle booking INdate and Outdate
    Then User select the Adult and child and room as per requirment
    And User clicks on the search button
    Then User selects the hotel
    And User selects the room 
    And User selects the adult for as room
    Then I click on continue booking for hotel accept the terms of use for Hotel   
    Then User is select the netbanking and successfully do the payment      
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
    
       
    @Hotel_Regression_TestCases
    Scenario Outline: TC_53_Calculate_the_AmountOnReviewPage
    When User SighnIn with username and password
    Then User selct the Hotel option on home page
    Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
    Then User select the date for hotle booking INdate and Outdate
    Then User select the Adult and child and room as per requirment
    And User clicks on the search button
    Then User selects the hotel
    And User selects the room 
    Then Calculate_the_AmountOnReviewPage    
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
    
    @Hotel_Regression_TestCases
    Scenario Outline: TC_54_Calculate_the_AmountOn_ConformationPage
    When User SighnIn with username and password
    Then User selct the Hotel option on home page
    Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
    Then User select the date for hotle booking INdate and Outdate
    Then User select the Adult and child and room as per requirment
    And User clicks on the search button
    Then User selects the hotel
    And User selects the room 
    And User selects the adult for as room
    Then I click on continue booking for hotel accept the terms of use for Hotel   
    Then User is select the netbanking and successfully do the payment
    Then Calculate_the_AmountOn_ConformationPage      
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
    
  