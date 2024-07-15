Feature: Holiday Package Enquire Information flow Regression Testing

  Background: 
    Given User is on Zenith Trip Landing page for Holiday Enquiry
    When User SignIn with username and password for Holiday Enquiry
    Then User select the Hotel option on home page
    Then User select the Holidays option on home page

  #@Holiday_Sanity_TestCases
  #Scenario Outline: Holiday Package Enquiry Flow
  #Given User is on Zenith Trip Landing page for Holiday Enquiry
  #When User SignIn with username and password for Holiday Enquiry
  #Then User select the Hotel option on home page
  #Then User select the Holidays option on home page
  @Holiday_regression_testcase
  Scenario: TC_28 Sort filter price and duration working
    When user clicks on price up arrow-icon button
    Then SRP result displays by price in Decending
    When user clicks on price down arrow-icon button
    Then SRP result displays by price in Acending
    When user clicks on duration down arrow-icon button
    Then SRP result displays by duration in Acending
    When user clicks on duration up arrow-icon button
    Then SRP result displays by duration in Decending

  @Holiday_regression_testcase
  Scenario: TC_30 sort SRP results sort by price Decending
    When user clicks on price up arrow-icon button
    Then SRP result displays by price in Decending

  @Holiday_regression_testcase
  Scenario: TC_31 sort SRP results sort by price Acending
    When user clicks on price down arrow-icon button
    Then SRP result displays by price in Acending

  @Holiday_regression_testcase
  Scenario: TC_33 sort SRP results sort by duration Acending
    When user clicks on duration down arrow-icon button
    Then SRP result displays by duration in Acending

  @Holiday_regression_testcase
  Scenario: TC_34 sort SRP results sort by duration Decending
    When user clicks on duration up arrow-icon button
    Then SRP result displays by duration in Decending

  @Holiday_regression_testcase
  Scenario: TC_35 Placeholder should be come "Search by City, Country"
    When user sholud on SRP page
    Then check for placeholder insearch text box

  @Holiday_regression_testcase
  Scenario: TC_38 check search button disabled if seach box blank
    When search box field is blank
    Then verify search button is disabled

  @Holiday_regression_testcase
  Scenario: TC_44 price filter range should be change
    When user select low and hight price range
    Then SRP page display results

  @Holiday_regression_testcase
  Scenario: TC_45  user select low price filter range should be change
    When user select low price range
    Then SRP page display results

  @Holiday_regression_testcase
  Scenario: TC_46 price filter low range should be change
    When user select hight price range
    Then SRP page display results

  @Holiday_regression_testcase
  Scenario: TC_51 user able to select category
    When user select category checkbox in search filter
    Then SRP page will displayed based on search filter

  @Holiday_regression_testcase
  Scenario: TC_52 user able to select multiple category
    When user select multiple category checkbox in search filter
    Then SRP page will displayed based on search filter

  @Holiday_regression_testcase
  Scenario: TC_c Counts should be displayed after category filter apply
    When user select category checkbox in search filter
    Then Total counts result displayed in SRP page

  @Holiday_regression_testcase
  Scenario: TC_d checks show more category button
    When user click on show more in category search filters

  @Holiday_regression_testcase
  Scenario: TC_58 user able to select theme
    When user select theme checkbox in search filter
    Then SRP page will displayed based on search filter

  @Holiday_regression_testcase
  Scenario: TC_58v1 user able to select multiple themes
    When user select multiple themes checkbox in search filter
    Then SRP page will displayed based on search filter

  @Holiday_regression_testcase
  Scenario: TC_60 Counts should be displayed after themse filter apply
    When user select theme checkbox in search filter
    Then Total counts result displayed in SRP page

  @Holiday_regression_testcase
  Scenario: TC_59 checks show more theme button
    When user click on show more in themes search filters

  @Holiday_regression_testcase
  Scenario: TC_40_1 search by with flights
    Then User click on With Flights button in search filters
    Then Validate user should be view listof packages With Flights

  @Holiday_regression_testcase
  Scenario: TC_40_2 search by without flights
    Then User click on Without Flights button in search filters
    Then Validate user should be view listof packages Without Flights

  @Holiday_regression_testcase
  Scenario: TC_71_72 user able to select Experiences
    When user select Experiences checkbox in search filter
    Then SRP page will displayed based on search filter

  @Holiday_regression_testcase
  Scenario: TC_73 user able to select multiple Experiences
    When user select multiple Experiences checkbox in search filter
    Then SRP page will displayed based on search filter

  @Holiday_regression_testcase
  Scenario: TC_75 count should be displayed in Experiences filters
    When user select Experiences checkbox in search filter
    Then validate Experiences Result counts

  @Holiday_regression_testcase
  Scenario: TC_82 reset searh filters
    When user click on the reset all filters button
    Then verify search reset filter and display default package list

  @Holiday_regression_testcase
  Scenario: TC_82 user selects multiple search filters
    When user select multiple search filters
    Then verify No results found message

  @Holiday_regression_testcase
  Scenario: TC_00 user select package from srp page
    When User select any package from list of packages

  @Holiday_regression_testcase
  Scenario: TC_82 user redirect to Overview
    When User select package from the search result page - SRP
    When user click on the Overview tab
    Then verify redirect to Overview page

  @Holiday_regression_testcase
  Scenario: TC_82 user redirect to Inclusions
    When User select package from the search result page - SRP
    When user click on the Inclusions tabItineraryTab
    Then verify redirect to Inclusions page

  @Holiday_regression_testcase
  Scenario: TC_82 user redirect to Itinerary
    When User select package from the search result page - SRP
    When user click on the Itinerary tab
    Then verify redirect to Itinerary page

  @Holiday_regression_testcase
  Scenario: TC_82 user redirect to Inclusion/Exclusion
    When User select package from the search result page - SRP
    When user click on the InclusionExclusion tab
    Then verify redirect to InclusionExclusion page

  @Holiday_regression_testcase
  Scenario: TC_82 user redirect to Inclusions
    When User select package from the search result page - SRP
    When user click on the Inclusions tab
    Then verify redirect to Inclusions page

  @Holiday_regression_testcase
  Scenario: TC_99 verify scrolldown rediret to policy page
    When User select package from the search result page - SRP
    When user user scroll policy upto policy
    Then verify redirect to policy page

  @Holiday_regression_testcase
  Scenario: TC_100 user redirect to policy
    When User select package from the search result page - SRP
    When user click on the policy tab
    Then verify redirect to policy page

  @Holiday_regression_testcase
  Scenario: TC_102 verify  policy read more functinality
    When User select package from the search result page - SRP
    When user click on read more in policy section

  @Holiday_regression_testcase
  Scenario: TC_103 verify  policy read less functinality
    When User select package from the search result page - SRP
    When user click on read less in policy section

  @Holiday_regression_testcase
  Scenario: TC_112 To check if user click on name field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the name field

  @Holiday_regression_testcase
  Scenario: TC_113 To check the if user enter the name  char
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the name field
    When user enter the name  char
    Then validate name char

  @Holiday_regression_testcase
  Scenario: TC_114 To check the if user enter the name alphanumeric
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User enter the name alphanumeric
    Then validate name alphanumeric

  @Holiday_regression_testcase
  Scenario: TC_115 To check the if user enter the name  Numaric value
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User user enter the name  Numaric value
    Then validate Numaric value

  @Holiday_regression_testcase
  Scenario: TC_116 To check the if user enter the name special char
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User enter the name special char
    Then validate special char

  @Holiday_regression_testcase
  Scenario: TC_117 To the if user keep name blank field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User keep name blank
    And click on submit button
    Then validate blank name field

  @Holiday_regression_testcase
  Scenario: TC_118 To check if user click on email field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the email field

  @Holiday_regression_testcase
  Scenario: TC_119 To check the if user enter the vaild email id
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the email field
    When user enter the vaild email id
    Then validate validemail id

  @Holiday_regression_testcase
  Scenario: TC_120 To check the if user enter the In vaild email id
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the email field
    And user enter the invalid email id
    And click on submit button
    Then validate invaildemail id

  @Holiday_regression_testcase
  Scenario: TC_121 To the if user keep email blank field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User keep email blank
    And click on submit button
    Then validate blank email field

  @Holiday_regression_testcase
  Scenario: TC_125 To check if user click on mobile no field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the mobile no field

  @Holiday_regression_testcase
  Scenario: TC_126 To check the if user enter the Invaild mobile no
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the mobile no field
    And user enter the invalid mobile no
    Then check for invaild mobile no

  @Holiday_regression_testcase
  Scenario: TC_127 To the if user keep mobile no blank field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User keep mobile no blank
    And click on submit button
    Then check for blank mobile no field

  @Holiday_regression_testcase
  Scenario: TC_128 To check if user click on city name field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the city name field

  @Holiday_regression_testcase
  Scenario: TC_129 To check the if user enter the Invaild city name
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the city name field
    And user enter the invalid city name
    Then check for invaild city name

  @Holiday_regression_testcase
  Scenario: TC_130 To check the if user enter the vaild city name
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the city name field
    And user enter the valid city name
    And user select city from dropdown
    Then check for vaild city name

  @Holiday_regression_testcase
  Scenario: TC_131 To the if user keep city name blank field
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User keep city name blank
    And click on submit button
    Then check for blank city name field

  @Holiday_regression_testcase
  Scenario Outline: TC_137 To the if user enter special text request
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the special request text
    And user enter the <sr> special request text
    And click on submit button
    Then check for <sr> special request text validation

    Examples: 
      | sr                       |
      | hello add me for request |

  @Holiday_regression_testcase
  Scenario Outline: TC_138 To check blank special text request
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the special request text
    And user enter the <sr> special request text
    And click on submit button
    Then check for <sr> special request text validation

    Examples: 
      | sr |
      |    |

  @Holiday_regression_testcase
  Scenario: TC_122 To check if user click on country code
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the country code

  @Holiday_regression_testcase
  Scenario Outline: TC_123 To check the if user enter the Invaild country code
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the country code
    And user enter the <code> country code
    Then check for <code> country code validation

    Examples: 
      | code  |
      | 434@$ |

  @Holiday_regression_testcase
  Scenario Outline: TC_A To check the if user enter the vaild country code
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the country code
    And user enter the <code> country code
    And user select country code from dropdown
    Then check for <code> country code validation

    Examples: 
      | code |
      |   91 |

  @Holiday_regression_testcase
  Scenario Outline: TC_124 To the if user keep country code blank
    When User select package from the search result page - SRP
    Then User clicks on the Enquiry button
    When User clicks on the country code
    And user enter the <code> country code
    And click on submit button
    Then check for blank country code

    Examples: 
      | code |
      |      |
