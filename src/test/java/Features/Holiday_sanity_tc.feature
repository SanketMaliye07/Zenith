Feature: Holiday package sanity Enquire/Booking flow testing

  @holiday_sanity
  Scenario Outline: To check Holiday Enquiry Flow with login
    Given user is on zenith page
    When user clicks on signin button for login
    And user signin with login credentials
   # And user clicks on the holidays in header seaction
    Then user search package by destination from given sheetName <SheetName> and rowNumber <RowNumber>
    And user clicks on the search button
    Then user select package from the search result page - SRP
    And user checks availibilty of departureCity and departureDate
    And user clicks on the enquiry button
    Then user select customer city
    Then user select no.of adults
    Then user select no.of child2to5yr
    #Then User Select Toggle for Bed Required for child2to5yr
    Then user select no.of child6to11yr
    #Then User Select Toggle for Bed Required for child6to11yr
    Then user clicks on the apply button
    Then user select no.of infants
    Then user enter special requests in the commentbox Or textBox
    #Then User clicks on the submit button
    Then User clicks on the Cancell button
    #Then logout the zenith application

    Examples: 
      | SheetName | RowNumber |
      |         2 |         0 |
      |         2 |         1 |
      |         2 |         2 |
      |         2 |         3 |
      |         2 |         4 |

  @holiday_sanity
  Scenario Outline: To check Holiday Enquiry Flow without login
    Given user is on zenith page
    #And user clicks on the holidays in header seaction
    Then user search package by destination from given sheetName <SheetName> and rowNumber <RowNumber>
    And user clicks on the search button
    Then user select package from the search result page - SRP
    Then user checks availibilty of departureCity and departureDate
    And user clicks on the enquiry button
    Then user enter customer name
    Then user enter customer email
    Then user select customer mobile code
    Then user enter customer mobile number
    Then user select customer city
    Then user select no.of adults
    Then user select no.of child2to5yr
    #Then User Select Toggle for Bed Required for child2to5yr
    Then user select no.of child6to11yr
    #Then User Select Toggle for Bed Required for child6to11yr
    Then user clicks on the apply button
    Then user select no.of infants
    Then user enter special requests in the commentbox Or textBox
    #Then User clicks on the submit button
    Then User clicks on the Cancell button

    Examples: 
      | SheetName | RowNumber |
      |         2 |         5 |
      |         2 |         6 |
      |         2 |         7 |
      |         2 |         8 |
      |         2 |         9 |

  @holiday_sanity
  Scenario Outline: To check Holiday Booking with login
    Given user is on zenith page
    When user clicks on signin button for login
    And user signin with login credentials
    #And user clicks on the holidays in header seaction
    Then user search package by destination from given sheetName <SheetName> and rowNumber <RowNumber>
    And user clicks on the search button
    Then user select package from the search result page - SRP
    And user checks availibilty of departureCity and departureDate
    And user clicks on the book now button on srp page
    Then user select the travellers and click on the apply button
    #Then user clicks on the contact details tab
    Then user adds traveller details
    #Then user select the travellers from drop-down traveller list
    Then user click on the continue booking button
    #Then user acceps terms & condition after click on the checkbox
    #Then user click on the processed to payment butto
    Then User is select the netbanking and successfully do the payment

    Examples: 
      | SheetName | RowNumber |
      |         2 |        10 |
      |         2 |        11 |
      |         2 |        12 |
      |         2 |        13 |
      |         2 |        14 |

  @holiday_sanity
  Scenario Outline: To check Holiday Booking without login
    Given user is on zenith page
    #And user clicks on the holidays in header seaction
    Then user search package by destination from given sheetName <SheetName> and rowNumber <RowNumber>
    And user clicks on the search button
    Then user select package from the search result page - SRP
    And user checks availibilty of departureCity and departureDate
    And user clicks on the book now button on srp page
    Then user select the travellers and click on the apply button
    Then user adds traveller details
    Then user click on the continue booking button
    Then User is select the netbanking and successfully do the payment

    Examples: 
      | SheetName | RowNumber |
      |         2 |        15 |
      |         2 |        16 |
      |         2 |        17 |
      |         2 |        18 |
      |         2 |        19 |
