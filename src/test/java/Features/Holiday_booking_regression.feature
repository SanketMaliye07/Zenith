Feature: Holiday Package Booking with/without login

  @holiday_sanity44
  Scenario Outline: To check Holiday Booking with login
    Given user is on zenith page
    When user clicks on signin button for login
    And user signin with login credentials
    And user clicks on the holidays in header seaction
    Then user search package by destination from given sheetName <SheetName> and rowNumber <RowNumber>
    And user clicks on the search button
    Then user select package from the search result page - SRP
    And user checks availibilty of departureCity and departureDate
    And user clicks on the book now button on srp page
    Then user select the travellers and click on the apply button
    #Then User Apply for Coupon code optinal if Available
    Then user clicks on the contact details tab
    Then user select the travellers from drop-down traveller list
    Then user click on the continue booking button
    Then user acceps terms & condition after click on the checkbox
    Then User Click on the processed to payment button

    Examples: 
      | SheetName | RowNumber |
      |         2 |         0 |

  @Holiday_Sanity24
  Scenario Outline: To check Holiday Booking without login
    Given user is on zenith page
    And user clicks on the holidays in header seaction
    Then user search package by destination from given sheetName <SheetName> and rowNumber <RowNumber>
    And user clicks on the search button
    Then user select package from the search result page - SRP
    And user checks availibilty of departureCity and departureDate
    And user clicks on the book now button on srp page
    Then user select the travellers and click on the apply button
    Then User Apply for Coupon code optinal if Available
    Then User clicks on the Traveler details tab
    Then user click on the continue booking button
    Then User select Adds Traver Details by clicking on the Radio button
    Then user click on the continue booking button
    Then user acceps terms & condition after click on the checkbox
    Then User Click on the processed to payment button

    Examples: 
      | SheetName | RowNumber |
      |         4 |         2 |
