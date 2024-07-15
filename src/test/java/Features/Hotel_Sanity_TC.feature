Feature: Hotel Sanity_TestCases

 Background:    
   
    #@Hotel_Sanity_TestCases_PROD_With_Login
    Scenario Outline: Hotel Booking With login 
    Given User is on Elevate Trip Landing page for Hotel Booking with the "prod" environment
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
    |1|1|
    |1|2|
    |1|3|
    |1|4|
    |1|5|
    |1|6|
    |1|7|
    |1|8|
    |1|9|
    
   #@Hotel_Sanity_TestCases_PROD_Without_Login
   Scenario Outline: Hotel Booking Without login 
   Given User is on Elevate Trip Landing page for Hotel Booking with the "prod" environment
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
    |1|1|
    |1|2|
    |1|3|
    |1|4|
    |1|5|
    |1|6|
    |1|7|
    |1|8|
    |1|9|
    
    
    #@Hotel_Sanity_TestCases_UAT_With_Login
    Scenario Outline: Hotel Booking With login 
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
    |1|1|
    |1|2|
    |1|3|
    |1|4|
    |1|5|
    |1|6|
    |1|7|
    |1|8|
    |1|9|
    
   #@Hotel_Sanity_TestCases_UAT_Without_Login
   Scenario Outline: Hotel Booking Without login 
   Given User is on Elevate Trip Landing page for Hotel Booking with the "uat" environment
   Then User selct the Hotel option on home page
   Then User pass the cityname for hotlbooking from given sheetName <SheetIndex> and rowNumber <RowNumber>
   Then User select the date for hotle booking INdate and Outdate
   Then User select the Adult and child and room as per requirment
   And User clicks on the search button
   Then User selects the hotel
   And User selects the room 
   And User selects the adult for room without login
   Then I click on continue booking for hotel accept the terms of use for Hotel   
   Then User is select the netbanking and successfully do the payment      
   
    Examples:
    |SheetIndex|RowNumber|
    |1|0|
    |1|1|
    |1|2|
    |1|3|
    |1|4|
    |1|5|
    |1|6|
    |1|7|
    |1|8|
    |1|9|
    
    #And User selects the adult for as room
    #Then I click on continue booking for hotel accept the terms of use for Hotel   
    #Then User is select the netbanking and successfully do the payment  
    
   #And User selects the adult for room without login
   #Then I click on continue booking for hotel accept the terms of use for Hotel   
   #Then User is select the netbanking and successfully do the payment      
   
    