Feature: Flight Module Sanity test Cases 
 
   
   
    @Flight_Sanity_TestCases_PROD_With_Login
    Scenario Outline: Flight Booking with login 
    Given User is on zenith Landing page with the "prod" environment
    When User SighnIn with username and password
    Then User is Click On Flight 
    Then User select the trip and pass origin and destination from given sheetName <SheetName> and rowNumber <RowNumber>
    Then select the date for trip
    Then User select the passanger for trip  
    Then select the class for trip   
    And User clicks on the search button for flight 
    Then select the Flight and click on book  
    Then Calculate_the_AmountOnReviewPage 
    Examples:
    |SheetName|RowNumber|
    |0|0|
    |0|1|
    |0|2|
    |0|3|
    |0|4|
    |0|5|
    |0|6|
    |0|7|
    |0|8|
    |0|9|
    
    #@Flight_Sanity_TestCases_PROD_Without_Login
    Scenario Outline: Flight Booking without login 
    Given User is on zenith Landing page with the "prod" environment
    Then User is Click On Flight 
    Then User select the trip and pass origin and destination from given sheetName <SheetName> and rowNumber <RowNumber>
    Then select the date for trip
    Then User select the passanger for trip  
    Then select the class for trip   
    And User clicks on the search button for flight 
    Then select the Flight and click on book 
    Then Calculate_the_AmountOnReviewPage 
    Examples:
    |SheetName|RowNumber|
    |0|0|
    |0|1|
    |0|2|
    |0|3|
    |0|4|
    |0|5|
    |0|6|
    |0|7|
    |0|8|
    |0|9|
    
   #@Flight_Sanity_TestCases_UAT_With_Login
    Scenario Outline: Flight Booking with login 
    Given User is on zenith Landing page with the "uat" environment
    When User SighnIn with username and password
    Then User is Click On Flight 
    Then User select the trip and pass origin and destination from given sheetName <SheetName> and rowNumber <RowNumber>
    Then select the date for trip
    Then User select the passanger for trip  
    Then select the class for trip   
    And User clicks on the search button for flight 
    Then select the Flight and click on book
    When User selct adult child and infant
    Then I click on continue booking
    Then User is select the netbanking and successfully do the payment      
    
    Examples:
    |SheetName|RowNumber|
    |0|0|
    |0|1|
    |0|2|
    |0|3|
    |0|4|
    |0|5|
    |0|6|
    |0|7|
    |0|8|
    |0|9|
    
    #@Flight_Sanity_TestCases_UAT_Without_Login
    Scenario Outline: Flight Booking without login 
    Given User is on zenith Landing page with the "uat" environment
    Then User is Click On Flight 
    Then User select the trip and pass origin and destination from given sheetName <SheetName> and rowNumber <RowNumber>
    Then select the date for trip
    Then User select the passanger for trip  
    Then select the class for trip   
    And User clicks on the search button for flight 
    Then select the Flight and click on book
    When User selct adult child and infant without login
    Then User pass the Mobile number and EmailID
    Then I click on continue booking
    Then User is select the netbanking and successfully do the payment      
    
    Examples:
    |SheetName|RowNumber|
    |0|0|
    |0|1|
    |0|2|
    |0|3|
    |0|4|
    |0|5|
    |0|6|
    |0|7|
    |0|8|
    |0|9|
    
    #When User selct adult child and infant
    #Then I click on continue booking
    #Then User is select the netbanking and successfully do the payment  
    
    #When User selct adult child and infant without login
    #Then User pass the Mobile number and EmailID
    #Then I click on continue booking
    #Then User is select the netbanking and successfully do the payment    