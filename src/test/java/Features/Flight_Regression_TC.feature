
Feature: Flight Module Regression TestCases

    Background:
    Given User is on zenith Landing page with the "uat" environment
  
    @Flight_Regression_TestCases
    Scenario: TC_1_Site Logo_To check the functionality of Site Logo on homepage
    Then User click on Hotel    
    When the user clicks on the application logo
    Then Validate user should be redirected to the Holiday Homepage 
      
      
    @Flight_Regression_TestCases
    Scenario Outline: TC_2_Site Logo_To check if user clicks on zenith logo of review page 
    Then User is Click On Flight 
    Then User select the trip and pass origin and destination from given sheetName <SheetName> and rowNumber <RowNumber>
    Then select the date for trip
    Then User select the passanger for trip  
    Then select the class for trip   
    And User clicks on the search button for flight
    When the user clicks on the application logo
    Then Validate user should be redirected to the Holiday Homepage 
    Examples:
    |SheetName|RowNumber|
    |0|1|
    
    
    @Flight_Regression_TestCases
    Scenario: TC_3_Homepage_To check if user scroll down and sroll up the page by using scroll bar
    Then User should be able to scroll down the page properly
    Then User should be able to scroll up the page properly
    
    
    @Flight_Regression_TestCases
    Scenario: TC_4_Header_To check if user clicks on Contact us Mobile numeber 
    When After clicking on the phone number, dialer pad should be opened
    Then validat the user click on support the mobile number and email should be visiable
    
       
    @Flight_Regression_TestCases
    Scenario: TC_5_Header_To check if user clicks on Hotel service icon
    Then User should be able to scroll down the page properly
    When The user should be redirected to the hotel homepage after clicking on Hotel service
    Then User should be able to scroll up the page properly
    And Validate the hotelHompage isDisplay or not
    
    @Flight_Regression_TestCases
    Scenario: TC_6_Sign In_To check if user click on Sign in option
    Then User click on Sighn in button  
    And Validate user should redirect to the Login page
    
    @Flight_Regression_TestCases
    Scenario: TC_7_Sign In_To check if user clicks Login button without entering Email id & Password in the field
    Then User click on Sighn in button  
    And Click on login button and Validate error message 
   
    @Flight_Regression_TestCases
    Scenario: TC_8_Sign In_To check if user clicks Login button with incorrect password
    Then User click on Sighn in button 
    Then User pass valid username digambar.karande@vernost.in and invalid pass gf
    And A validation error msg should be displayed for Incorrect password when click on login button
   
    @Flight_Regression_TestCases
    Scenario: TC_9_Sign In_To check if user clicks Login button with valid Email id & Password
    When User SighnIn with username and password
    Then Validate the text on home page
    
    @Flight_Regression_TestCases
    Scenario: TC_10_Sign In_To check if user clicks on Google sign
    Then User click on Sighn in button
    Then The User should able to login by using Google sign in option
    
    @Flight_Regression_TestCases
    Scenario: TC_11_Sign In_To check if user clicks on Forgot password link
    Then User click on Sighn in button
    Then validate when  User click on forget password button should redirect to the Forgot password page
    
    @Flight_Regression_TestCases
    Scenario: TC_12_Sign In_To check if user clicks on Reset password button for blank  email id 
    Then User click on Sighn in button
    Then validate when  User click on forget password button should redirect to the Forgot password page
    And To check if user clicks on Reset password button for blank  email id 
    
    @Flight_Regression_TestCases
    Scenario: TC_13_Sign In_To check if user clicks on Reset password button with incorrect email id 
    Then User click on Sighn in button
    Then validate when  User click on forget password button should redirect to the Forgot password page
    And To check if user clicks on Reset password button with incorrect email id  
    
    @Flight_Regression_TestCases
    Scenario: TC_14_Sign In_To check if user clicks on Reset password button with valid email id 
    Then User click on Sighn in button
    Then validate when  User click on forget password button should redirect to the Forgot password page
    And The user should get the Forgot Password email to reset password
    
    @Flight_Regression_TestCases
    Scenario: TC_15_Sign In_To check if user click on Sign Up ,  Terms & Conditions links
    Then User click on Sighn in button
    Then validate user able to click on terms and conditions

    
    @Flight_Regression_TestCases
    Scenario: TC_17_Sign In_To check if user clicks on Login button
    When User SighnIn with username and password
    Then Validate the text on home page
    
    @Flight_Regression_TestCases
    Scenario: TC_18_SignUp_To check if user click on Sign Up option
    Then User click on Sighn in button
    Then User click on Sighn up button  
    And Validate user should redirect to the Sighn Up Page
    
    @Flight_Regression_TestCases
    Scenario: TC_19_SignUp_To check if user clicks on Google sign up button
    Then User click on Sighn in button
    Then User click on Sighn up button  
    Then The User should able to login by using Google sign in option
    
    @Flight_Regression_TestCases
    Scenario: TC_20_SignUp_To check if user clicks on Sign Up button with blank email id 
    Then User click on Sighn in button
    Then User click on Sighn up button  
    Then To check if user clicks on Sign Up button with blank email id 
    
    @Flight_Regression_TestCases
    Scenario: TC_21_SignUp_To check if user clicks on Sign Up button with incorrect email id 
    Then User click on Sighn in button
    Then User click on Sighn up button  
    Then To check if user clicks on Sign Up button with incorrect email id 
         
    @Flight_Regression_TestCases
    Scenario: TC_22_SignUp_To check if user clicks on I Accept bounz terms & conditon
    Then User click on Sighn in button 
    Then User click on Sighn up button  
    Then Validate the user should able to select and unselect the checkbox of I Accept bounz terms & conditon
    
    @Flight_Regression_TestCases
    Scenario: TC_23_SignUp_To check if user clicks on Sign Up button with already logged in email id 
    Then User click on Sighn in button 
    Then User click on Sighn up button  
    Then Validate message to check if user clicks on Sign Up button with already logged in email id 
  
    
    @Flight_Regression_TestCases
    Scenario: TC_24_SignUp_To check if user clicks on Sign up button with valid email id & Password
    Then User click on Sighn in button 
    Then User click on Sighn up button  
    Then To check if user clicks on Sign up button with valid email id & Password user should redirect to the Sign Up form
    
    
      
    @Flight_Regression_TestCases
    Scenario: TC_25_SignUp_To check if user clicks on Sign up button with blank field
    Then User click on Sighn in button 
    Then User click on Sighn up button  
    Then Pass Valid email ID 
    And Validate error message when user directley click on sighup button on form page 
    
    @Flight_Regression_TestCases
    Scenario: TC_26_SignUp_To check if user clicks on sign up button for different  Passwords in New Password and Confirm New password field
    When User is click on My account 
    Then User click on Sighn up button  
    Then Pass Valid email ID 
    And To check if user clicks on sign up button for different Passwords in New Password and Confirm New password field 
    
    
    @Flight_Regression_TestCases
    Scenario: TC_27_SignUp_To check if user clicks on email id field
    When User is click on My account 
    Then User click on Sighn up button  
    Then Pass Valid email ID 
    And The user should not able to edit email id field
    
    @Flight_Regression_TestCases
    Scenario: TC_31_To check if user clicks on search button with blank Origin and Destination field 
    Then User is Click On Flight 
    Then Validate the error message after on Origin and Destination filed 
    
    @Flight_Regression_TestCases
    Scenario: TC_32_To check if user clicks on search button with Origin and Destination field with same details 
    Then User is Click On Flight
    When User pass same Origin and Destination 
    Then Validate the error message after user clicks on search button with Origin and Destination field with same details 
    
    
    @Flight_Regression_TestCases
    Scenario: TC_33_To check if user enters incorrect details in Origin and Destination field and search 
    Then User is Click On Flight
    When User pass invalid Origin and Destination 
    Then Validate the error message to check if user enters incorrect details in Origin and Destination field and search 
    
    @Flight_Regression_TestCases
    Scenario: TC_34_To check if user clicks on Swipe button
    Then User is Click On Flight
    When User pass Origin and Destination 
    Then The city details or airport code should get interchanged after clicking on swipe button
    
    @Flight_Regression_TestCases
    Scenario: TC_35_To check if user clicks on Round Trip button
    Then User is Click On Flight
    When User is click on Rountrip button
    Then The return date should selected in return trip calendar
     
    

    
    @Flight_Regression_TestCases
    Scenario: TC_40_To check if user clicks on cross icon of Return calendar field
    Then User is Click On Flight
    When User is click on Rountrip button
    Then Click on cross icon of Return calendar field
    And validate the trip type should chnage to the One way from Round way
    
    @Flight_Regression_TestCases
    Scenario Outline: TC_41_To check if user selects different Cabin class details 
    Then User is Click On Flight 
    Then User select the trip and pass origin and destination from given sheetName <SheetName> and rowNumber <RowNumber>
    Then select the date for trip
    Then User select the passanger for trip  
    And The user should able to select Business , First Class ,Premium Economy cabin class details
    Examples:
    |SheetName|RowNumber|
    |0|0|
    |0|1|
    |0|2|
    |0|3|
   
    @Flight_Regression_TestCases
    Scenario Outline:  TC_44_To check if user click on Add and Minus button  of  Adult traveler
    Then User is Click On Flight 
    When User is Click on Traveler field
    Then User is add the Adulte Pssanger is <Max> validate the user should selects Max 9 adult    
    Examples:
    |Max|
    |9|
    
    @Flight_Regression_TestCases
    Scenario Outline:  TC_44A_To check if user click on Add and Minus button  of  Adult traveler
    Then User is Click On Flight 
    When User is Click on Traveler field
    Then User is add the Adulte Pssanger is <Min> validate the user should selects  Min 1 adult traveler    
    Examples:
    |Min|
    |0|

    
    @Flight_Regression_TestCases
    Scenario Outline: TC_48_To check if user clicks on Search button
    Then User is Click On Flight 
    Then User select the trip and pass origin and destination from given sheetName <SheetName> and rowNumber <RowNumber>
    Then select the date for trip
    Then User select the passanger for trip  
    Then select the class for trip   
    And User clicks on the search button for flight 
    And Validate the user should get redirect to the Flight Result page
    Examples:
    |SheetName|RowNumber|
    |0|0|
    
    @Flight_Regression_TestCases
    Scenario Outline: TC_49_ To_Validate_the payment on the review page for one-way flight
    Given User is on zenith Landing page with the "uat" environment
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
    
    @Flight_Regression_TestCases
    Scenario Outline: TC_50_To_Validate_the payment on the review page for the Return flight
    Given User is on zenith Landing page with the "uat" environment
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
    |0|5|
    
    @Flight_Regression_TestCases
    Scenario Outline: TC_51_To_Validate_the payment on the Conformation page for one-way flight
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
    Then Calculate_the_AmountOn_ConformationPage
    Examples:
    |SheetName|RowNumber|
    |0|0|
    
   @Flight_Regression_TestCases
    Scenario Outline: TC_52_To_Validate_the payment on the Confirmation page for Return flight
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
    Then Calculate_the_AmountOn_ConformationPage
    Examples:
    |SheetName|RowNumber|
    |0|5|
  
    