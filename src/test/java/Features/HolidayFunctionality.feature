Feature: Holiday Package Enquire/Booking Information

  @SmokeTest
  Scenario Outline: Holiday Package Enquiry Flow
    Given User is on Zenith Trip Landing page for Holiday Enquiry
    When User SignIn with username and password for Holiday Enquiry
    Then User select the Hotel option on home page
    Then User select the Holidays option on home page
    Then User Search by Package Name for Holidays Enquire from given sheetName <SheetName> and rowNumber <RowNumber>
    Then User select package from the search result page - SRP
    And User clicks on the Enquiry	button
    Then User selects Departure Type
    Then User Enter Customer Name
    Then User Enter Customer Email
    Then User Select Customer Mobile Code
    Then User Enter Customer Mobile Number
    Then User Select Customer City
    Then User Select No.Of Adults
    Then User Select No.Of child2to5yr
    Then User Select Toggle for Bed Required for child2to5yr
    Then User Select No.Of child6to11yr
    Then User Select Toggle for Bed Required for child6to11yr
    Then User clicks on the Apply button
    Then User Select No.Of Infants
    Then User Enter Special Requests In the CommentBox Or TextBox
    #Then User clicks on the Submit button
    Then User clicks on the Cancell button

    Examples: 
      | SheetName | RowNumber |
      |         6 |         0 |
      |         6 |         6 |
      #|         6 |         1 |
      #|         6 |         2 |
      #|         6 |         3 |
      
      
  #@SmokeTest
  #Scenario Outline: Holiday Booking Package Flow
    #Given User is on Zenith Trip Landing page for Holiday Enquiry
    #When User SignIn with username and password for Holiday Enquiry
    #Then User select the Hotel option on home page
    #Then User select the Holidays option on home page
    #Then User Search by Package Name for Holidays Enquire from given sheetName <SheetName> and rowNumber <RowNumber>
    #Then User select package from the search result page - SRP
    #Then User checks Availibilty of DepartureCity and DepartureDate
    #Then User select Departure City Drop-down
    #Then User select Departure Date
    #And User clicks on the Book Now button
    #Then User select the Travellers and click on the Apply button
    #Then User Apply for Coupon code optinal if Available
    #Then User clicks on the Traveler details tab
    #Then User Click on the continue booking button
    #Then User select Adds Traver Details by clicking on the Radio button
    #Then User Click on the continue booking button
    #Then User Acceps Terms & Condition after clik on the checkbox
#
    #Then User Click on the processed to payment button
    #Examples: 
      #| SheetName | RowNumber |
      #|         5 |         0 |
      
