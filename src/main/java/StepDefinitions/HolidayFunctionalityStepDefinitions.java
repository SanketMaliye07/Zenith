package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass;
import PageObjectClass.POM_Holiday_Excel_Data;
import PageObjectClass.POM_Holiday_Reviewpage;
import PageObjectClass.POM_Searchfilters_Functionality;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethodes;
import utils.ExcelReader;

public class HolidayFunctionalityStepDefinitions extends BaseClass {

	POM_Holiday_Excel_Data HOME;
	POM_Holiday_Excel_Data HOME1;
	ExcelReader reder;
	List<Map<String, String>> testData;

	POM_Searchfilters_Functionality rs;
	POM_Holiday_Reviewpage review;
	public int row;

//	@Before

//	@Before("@regression") 
//    public void setup() { 
//        WebDriverManager.chromedriver().setup(); 
//        driver.manage().window().maximize(); 
//    } 

	// below will run every steps

//	@BeforeStep
//	public void beforeSteps() {
//		System.out.println("Before Steps");
//	}
//
//	@AfterStep
//	public void afterSteps() {
//		System.out.println("After Steps");
//	}

	@Given("user is on zenith page")
	public void userOnHomePage() throws InterruptedException, IOException {
		System.out.println("Louching the Browser");
		LounchBrowser("uat");
	}

	@And("user clicks on signin button for login")
	public void user_clicks_signIn_button() throws InterruptedException, IOException {
		HOME = new POM_Holiday_Excel_Data(driver);
		HOME.click_On_SighIn(driver);
	}

	@And("user signin with login credentials")
	public void user_sign_in_with_username_and_password_for_holiday_enquiry() throws InterruptedException, IOException {

		HOME = new POM_Holiday_Excel_Data(driver);
		String usrname = CommonMethodes.readDataFromPropertyFile("username");
		String usrpass = CommonMethodes.readDataFromPropertyFile("pass");
		HOME.loginWithCredentials(driver, usrname, usrpass);

	}

	@Then("user clicks on the holidays in header seaction")
	public void clickOnHolidayHeader() throws InterruptedException {
		HOME = new POM_Holiday_Excel_Data(driver);
		HOME.redirectToHolidayPage(driver);

	}

	@Then("user search package by destination from given sheetName {int} and rowNumber {int}")
	public void searchPackageByDestination(Integer SheetNumber, Integer RowNumber)
			throws InterruptedException, InvalidFormatException, IOException {

		reder = new ExcelReader();
//		testData = reder.getData(
//				"/home/kuldeepruletiya/eclipse-workspace/zenith_automation/src/test/Resources/Elevate_Trip.xlsx",
//				SheetNumber);
//		
		testData = reder.getData(CommonMethodes.Excelpath(), SheetNumber);

		row = RowNumber;

		System.out.println(" ----- Holiday flow Package Type excel sheet ----");
		System.out.println(testData.get(row).get("PackageType"));
		System.out.println(" ----- Holiday flow Package Type excel sheet ----");
		System.out.println("RowNNN" + row);
		String PackageName = testData.get(row).get("Destination");

		System.out.println("PackageName is ===" + PackageName);
		HOME.Search_selectPackage(driver, PackageName);

	}

	@And("user clicks on the search button")
	public void searchButton() throws InterruptedException, IOException {

		HOME = new POM_Holiday_Excel_Data(driver);
		HOME.clickSearchButton(driver);

	}

	@Then("user select package from the search result page - SRP")
	public void user_select_package_from_the_search_result_page_srp() throws InterruptedException {
		HOME.selectHolidays(driver);
	}

	@And("user checks availibilty of departureCity and departureDate")
	public void user_checks_availibiltyOfdeparture_city_date() throws InterruptedException {
		HOME = new POM_Holiday_Excel_Data(driver);
		HOME.checkIsDisplayed(driver);
	}

	@Then("user select departure city drop-down")
	public void user_select_departure_city_drop_down() throws InterruptedException {
//		String city = testDataList.get(row).get("City");
		HOME.selectDepartureCity(driver);
	}

	@Then("user select departure date")
	public void user_select_departure_date() throws InterruptedException {
		HOME.selectDepartureDate(driver);
	}

	@Then("user clicks on the enquiry button")
	public void user_clicks_on_the_enquiry_button() throws InterruptedException {
		HOME = new POM_Holiday_Excel_Data(BaseClass.driver);
		HOME.clickOnEnquireButton(driver);
	}

	@Then("user enter customer name")
	public void to_verify_user_enter_customer_name() throws InterruptedException {
		String name = testData.get(row).get("Name");
		HOME.customerName(driver, name);
	}

	@Then("user enter customer email")
	public void to_verify_user_enter_customer_email() throws InterruptedException {

		String email = testData.get(row).get("Email");
		HOME.customerEmail(driver, email);
	}

	@Then("user select customer mobile code")
	public void to_verify_user_select_customer_mobile_code() throws InterruptedException {
		String code = testData.get(row).get("Code");
		HOME.sendMobileCode(driver, code);
	}

	@Then("user enter customer mobile number")
	public void to_verify_user_enter_customer_mobile_number() throws InterruptedException {
		String mnumber = testData.get(row).get("MobileNumber");
		HOME.sendMobileNumber(driver, mnumber);
	}

	@Then("user select customer city")
	public void to_verify_user_select_customer_city() throws InterruptedException {
		String city = testData.get(row).get("City");
		HOME.customerCity(driver, city);

	}

	@Then("user select no.of adults")
	public void to_verify_user_select_no_of_adults() throws InterruptedException {
		System.out.println("User Select No.Of Traveler Details");
		String nofAdt = testData.get(row).get("No.of Adults");
		HOME.selectNoOfAdults(driver, nofAdt);

	}

	@Then("user select no.of child2to5yr")
	public void to_verify_user_select_no_of_child2to5yr() throws InterruptedException {
		System.out.println("User Select No.Of Childrens");
		System.out.println("User Select No.Of child2to5yr");
		String nOfchild2to5yr = testData.get(row).get("No.of child2to5yr");
		System.out.println("cccc2t5 ----" + nOfchild2to5yr);
		HOME.selectChild2to5yr(driver, nOfchild2to5yr);
	}

	@Then("user Select Toggle for Bed Required for child2to5yr")
	public void to_verify_user_select_toggle_for_bed_required_for_child2to5yr() throws InterruptedException {
		HOME.bedRequiredFor2to5yrs(driver, 2);

	}

	@Then("user select no.of child6to11yr")
	public void to_verify_user_select_no_of_child6to11yr() throws InterruptedException {
		System.out.println("User Select No.Of child6to11yr");
		String nOfchild6to11yr = testData.get(row).get("No.of child6to11yr");
		HOME.selectChild6to11yr(driver, nOfchild6to11yr);

	}

	@Then("user Select Toggle for Bed Required for child6to11yr")
	public void to_verify_user_select_toggle_for_bed_required_for_child6to11yr() throws InterruptedException {
//		HOME.bedRequiredFor6to11yrs(driver, 2);
	}

	@Then("user select no.of infants")
	public void to_verify_user_select_no_of_infants() throws InterruptedException {

		String ninfts = testData.get(row).get("No.of Infants");
		HOME.selectNoOfInfnts(driver, ninfts);
	}

	@Then("user enter special requests in the commentbox Or textBox")
	public void to_verify_user_enter_special_requests_in_the_comment_box_or_text_box() throws InterruptedException {
		String srq = testData.get(row).get("SpecialRequest");
		HOME.sendSpecialInfo(driver, srq);
	}

	@Then("user clicks on the apply button")
	public void selectApplybutton() throws InterruptedException {
		HOME.selectApplybutton(driver);
	}

	@Then("User clicks on the submit button")
	public void to_verify_user_clicks_on_the_submit_button() throws InterruptedException {
		HOME.submitData(driver);
	}

	@Then("User clicks on the Cancell button")
	public void to_verify_user_clicks_on_the_cancell_button() throws InterruptedException, IOException {
		HOME.CancelData(driver);

	}

	@Then("logout the zenith application")
	public void log_out_zenith() throws InterruptedException, IOException {
		HOME.logoutZenith(driver);

	}

	/*
	 * 
	 * Booking flow
	 */
	@Then("user clicks on the book now button on srp page")
	public void user_clicks_booknow_button() throws InterruptedException {
		HOME.bookingNow(driver);

	}

	@Then("user select the travellers and click on the apply button")
	public void add_traveller_data() throws InterruptedException {

		String noadt = testData.get(row).get("No.of Adults");
		String nochd2t5 = testData.get(row).get("No.of child2to5yr");
		String nochd6t11 = testData.get(row).get("No.of child6to11yr");
		String noinfts0t2 = testData.get(row).get("No.of Infants");

//		String nochd2t5 = "0";
//		String nochd6t11 = "0";
//		String noinfts0t2 = "0";

		System.out.println("---- Holiday booking travellers data ------ noadt" + noadt);
		System.out.println("---- Holiday booking travellers data ------ nochd2t5" + nochd2t5);
		System.out.println("---- Holiday booking travellers data ------" + nochd6t11);
		System.out.println("---- Holiday booking travellers data ------" + noinfts0t2);

//		HOME.addTravellerData(driver, noadt, nochd2t5, nochd6t11, noinfts0t2);
		HOME.addTravellerData(driver, noadt, nochd2t5, nochd6t11, noinfts0t2);
		HOME.applyforTravellers(driver);
		HOME.applyBookNow(driver);

	}

	@Then("user clicks on the contact details tab")
	public void click_on_contact_details_tab() throws InterruptedException {
		HOME.clickContactDetailsTab(driver);
	}

	@Then("user select the travellers from drop-down traveller list")
	public void select_traveller_from_traveller_list() throws InterruptedException {
		HOME.selectTravelerFromDrpDown(driver);
	}

	@Then("user adds traveller details")
	public void add_traveller_with_nologin() throws InterruptedException {
		HOME.addTravellerDetails(driver);
	}

	@Then("user click on the continue booking button")
	public void user_clicks_on_continue() throws InterruptedException {
		HOME.userClicksOnContinue(driver);
	}

	@Then("User sign in with email and password")
	public void sign_with_email_password() throws InterruptedException {
		HOME.signWithEmailPassword(driver);
	}

	@Then("user acceps terms & condition after click on the checkbox")
	public void acceptTnC() throws InterruptedException {
		HOME.acceptTnCs(driver);
	}

	@Then("user click on the processed to payment button")
	public void processedToPayClick() throws InterruptedException {
		HOME.pgProcess(driver);
	}

//	@After
//	public void teardown() throws IOException, InterruptedException {
//		CloseBrowser();
//	}

	// search filter Test cases

	@Then("User click on With Flights button in search filters")
	public void user_click_on_with_flights_button_in_search_filters() throws InterruptedException {
		String flt = "WithFlights";
//		searchflt.FltfilterType(driver,flt);
//		HOME.FltfilterType(driver,flt);
		rs = new POM_Searchfilters_Functionality(driver);
//		rs.redirectToHolidayPage(driver);
		rs.FltfilterType(driver, "WithFlights");
	}

	@Then("Validate user should be view listof packages With Flights")
	public void validate_user_should_be_view_listof_packages_with_flights() throws InterruptedException {

	}

	@Then("User click on Without Flights button in search filters")
	public void user_click_on_without_flights_button_in_search_filters() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.FltfilterType(driver, "WithFlightsq");
	}

	@Then("Validate user should be view listof packages Without Flights")
	public void validate_user_should_be_view_listof_packages_without_flights() throws InterruptedException {

	}

	@When("user clicks on price up arrow-icon button")
	public void user_clicks_on_price_up_arrow_icon_button() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.sortByprice(driver, "up");
	}

	@When("user clicks on price down arrow-icon button")
	public void user_clicks_on_price_down_arrow_icon_button() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.sortByprice(driver, "down");

	}

	@Then("SRP result displays by price in Acending")
	public void srp_result_displays_by_price_in_acending() throws InterruptedException {

	}

	@Then("SRP result displays by price in Decending")
	public void srp_result_displays_by_price_in_decending() throws InterruptedException {

	}

	@Then("user select low and hight price range")
	public void select_low_high_price_range() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.priceFilterRange(driver, 1100, 8000);

	}

	@Then("user select hight price range")
	public void select_high_price_range() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.priceFilterRange(driver, 0, 1300);
	}

	@Then("user select low price range")
	public void select_low_price_range() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.priceFilterRange(driver, 3391, 0);
	}

	@Then("SRP page display results")
	public void srp_page_displaed() throws InterruptedException {

	}

	@When("user clicks on duration down arrow-icon button")
	public void user_clicks_on_duration_down_arrow_icon_button() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.sortByduration(driver, "down");
	}

	@Then("SRP result displays by duration in Acending")
	public void srp_result_displays_by_duration_in_acending() throws InterruptedException {

	}

	@When("user clicks on duration up arrow-icon button")
	public void user_clicks_on_duration_up_arrow_icon_button() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.sortByduration(driver, "up");
	}

	@Then("SRP result displays by duration in Decending")
	public void srp_result_displays_by_duration_in_decending() throws InterruptedException {

	}

	@When("user sholud on SRP page")
	public void user_sholud_on_srp_page() throws InterruptedException {
//		rs = new POM_Searchfilters_Functionality(driver);
//		rs.searchBoxPlaceholder(driver);
	}

	@Then("check for placeholder insearch text box")
	public void check_for_placeholder_insearch_text_box() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.searchBoxPlaceholder(driver);
	}

	@When("search box field is blank")
	public void checks_search_box_blank() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.checkSearchBoxBlank(driver);
	}

	@Then("verify search button is disabled")
	public void check_search_icon_button_disabled() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.checkSearchButtonDisabled(driver);
	}

	@When("user select category checkbox in search filter")
	public void user_select_category_from_search_filters() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.selectCategories(driver);
	}

	@When("user select multiple category checkbox in search filter")
	public void user_select_category_theme_from_search_filters() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.multiSelectCategories(driver);
	}

	@When("user click on show more in category search filters")
	public void showMoreCategory() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.isShowMoreCategories(driver);

	}

	@When("user select theme checkbox in search filter")
	public void user_select_theme_from_search_filters() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
//		rs.selectThemes(driver,1);
		rs.selectThemes(driver);
	}

	@When("user select multiple themes checkbox in search filter")
	public void user_select_multiple_theme_from_search_filters() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
//		rs.multiSelectThemes(driver,3);
		rs.multiSelectThemes(driver);
	}

	@When("SRP page will displayed based on search filter")
	public void srp_page_displayed() throws InterruptedException {
		System.out.println("SRP Pge will displayed if result founds");
	}

	@When("Total counts result displayed in SRP page")
	public void total_counts_displayed_srp_page() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.checkCounts(driver);

	}

	@When("user click on show more in themes search filters")
	public void showMoreThemes() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.isShowMoreThemes(driver);

	}

	@Then("user select Experiences checkbox in search filter")
	public void single_exp_select() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.selectExps(driver);

	}

	@Then("user select multiple Experiences checkbox in search filter")
	public void multiple_select_exp() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.multiSelectExps(driver);
	}

	@Then("validate Experiences Result counts")
	public void check_total_counts() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.checkCounts(driver);
	}

	@When("user click on the reset all filters button")
	public void restSearchFilters() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.resetAllFilters(driver);
	}

	@Then("verify search reset filter and display default package list")
	public void validateResetButton() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.verifyDeaultListCounts(driver);
	}

	@When("user select multiple search filters")
	public void selectMultipleFilters() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.multiSelectExps(driver);
		rs.isShowMoreThemes(driver);
	}

	@Then("verify No results found message")
	public void checkSearchNoResultMessage() throws InterruptedException {
		rs = new POM_Searchfilters_Functionality(driver);
		rs.norsMessage(driver);

	}

	@When("User select any package from list of packages")
	public void user_select_any_package_() throws InterruptedException {

		review = new POM_Holiday_Reviewpage(driver);
		review.selectpackage(driver);

	}

	@When("user click on the Overview tab")
	public void user_click_on_the_overview_tab() throws InterruptedException {

		review = new POM_Holiday_Reviewpage(driver);
		review.clickOverviewtab(driver);

	}

	@Then("verify redirect to Overview page")
	public void verify_redirect_to_overview_page() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.verifyOverviewtab(driver);
	}

	@When("user click on the Inclusions tab")
	public void user_click_on_the_inclusions_tab() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.clickInclusionstab(driver);
	}

	@Then("verify redirect to Inclusions page")
	public void verify_redirect_to_inclusions_page() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.verifyInclusionstab(driver);
	}

	@When("user click on the Itinerary tab")
	public void user_click_on_the_itinerary_tab() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.clickItineraryTab(driver);
	}

	@Then("verify redirect to Itinerary page")
	public void verify_redirect_to_itinerary_page() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.verifyItinerarytab(driver);
	}

	@When("user click on the InclusionExclusion tab")
	public void user_click_on_the_inclusion_exclusion_tab() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.clickInclusionExclusionTab(driver);
	}

	@Then("verify redirect to InclusionExclusion page")
	public void verify_redirect_to_inclusion_exclusion_page() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.verifyInclusionExclusiontab(driver);
	}

	@When("user click on the policy tab")
	public void user_click_on_policy_tab() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.clickpolicyTab(driver);
	}

	@When("user user scroll policy upto policy")
	public void user_scroll_policy_page() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.scrollpolicyTab(driver);
	}

	@Then("verify redirect to policy page")
	public void verify_policy_page() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.verifyPolicytab(driver);
	}

	@When("user click on read more in policy section")
	public void readMorePolicy() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.readMorePolicyDetails(driver);
	}

	@When("user click on read less in policy section")
	public void readLessPolicy() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.readLessPolicyDetails(driver);
	}

	@Then("user click on the Enquiry button")
	public void user_click_on_the_enquiry_button() throws InterruptedException {
		HOME = new POM_Holiday_Excel_Data(driver);
		HOME.clickOnEnquireButton(driver);

	}

	@When("verify popup page displaying")
	public void isEnquirePopUpDisplayed() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isPopEnquireDisplayed(driver);
	}

//	@When("User on pop-up page")
//	public void userOnPopUpPage() throws InterruptedException {
//		review = new POM_Holiday_Reviewpage(driver);
//		review.selectDepartureType(driver, "Fixed");
//	}

	@Then("validate departure section contains")
	public void validateDepartureContains() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isDepartureContain(driver, "Fixed");
		review.isDepartureContain(driver, "Flexible");
		review.isDepartureContain(driver, "Anytime");

	}

	@When("User clicks on the fixed")
	public void selectFixed() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectDepartureType(driver, "Fixed");
	}

	@Then("fixed is displayed with highlight")
	public void isFixedDisplayed() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isDepartureSelected(driver, "Fixed");
	}

	@When("User clicks on the flexible")
	public void selectFlexible() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectDepartureType(driver, "Flexible");
	}

	@Then("flexible is displayed with highlight")
	public void isFlexibleDisplayed() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isDepartureSelected(driver, "Flexible");
	}

	@When("User clicks on the anytime")
	public void selecytAnytime() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectDepartureType(driver, "Anytime");
	}

	@Then("anytime is displayed with highlight")
	public void isAnytimeDisplayed() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isDepartureSelected(driver, "Anytime");
	}

	@When("User clicks on the name field")
	public void clicknamefield() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectname(driver);
	}

	@When("user enter the name  char")
	public void enternamechar() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendNameValue(driver, "puja");
	}

	@Then("validate name char")
	public void validatenamechar() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkNameFieldValidation(driver, "char");
	}

	@When("User keep name blank")
	public void namefield() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectname(driver);
		review.sendNameValue(driver, "");
	}

	@And("click on submit button")
	public void submitName() throws InterruptedException {
		HOME = new POM_Holiday_Excel_Data(driver);
		HOME.submitData(driver);
	}

	@Then("validate blank name field")
	public void isblankNameField() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isblankName(driver);
	}

	@When("User enter the name alphanumeric")
	public void enterAlphaNumricNameField() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendNameValue(driver, "puja123");
	}

	@Then("validate name alphanumeric")
	public void validateNameAlphanumeric() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkNameFieldValidation(driver, "alphanumberic");
	}

	@When("User user enter the name  Numaric value")
	public void enternumbername() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendNameValue(driver, "65564454343");
	}

	@Then("validate Numaric value")
	public void validateNumbericName() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkNameFieldValidation(driver, "numberic");
	}

	@When("User enter the name special char")
	public void enterNameSpecialChar() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendNameValue(driver, "!@#$%^&*");
	}

	@Then("validate special char")
	public void validateSpecialChar() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkNameFieldValidation(driver, "special");
	}

	@When("User keep city blank and click on submit button")
	public void cityfield() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectDepartureType(driver, "Anytime");
	}

//	@Then("validate blank city field")
//	public void isblankCityField() throws InterruptedException {
//		review = new POM_Holiday_Reviewpage(driver);
//		review.isblankCity(driver);
//	}

	@When("User clicks on the email field")
	public void clickemailfield() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectemail(driver);
	}

	@When("user enter the vaild email id")
	public void enterEmail() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendEmailValue(driver, "puja@vernost.in");
	}

	@Then("validate validemail id")
	public void chekvalidemailid() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkEmailFieldValidation(driver, "emailid");
	}

	@And("user enter the invalid email id")
	public void enterInvaildEmail() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendEmailValue(driver, "puja123");
	}

	@Then("validate invaildemail id")
	public void checkInvaildEmailId() throws InterruptedException {
		review.isValidEmail(driver);
	}

	@When("User keep email blank")
	public void enteremailchar() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendEmailValue(driver, "puja@");
	}

	@Then("validate blank email field")
	public void isblankEmailField() throws InterruptedException {
		review.isValidEmail(driver);
	}

	@Then("validate email char")
	public void validatemailchar() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkNameFieldValidation(driver, "char");
	}

	@When("User clicks on the country code")
	public void clickCountryCodefield() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.clickCountryCode(driver);
	}

	@When("user enter the (.*) country code")
	public void user_enter_the_admin_country_code(String code) throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendCountryCodeValue(driver, code);

	}

	@Then("check for (.*) country code validation")
	public void check_for_country_code_validation(String code) throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkVaildCountryCode(driver, code);
	}

	@And("user select country code from dropdown")
	public void selectCountryCodeDropDown() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectCountryCodeDropDown(driver);
	}

	@Then("check for blank country code")
	public void checkForBlankCountryCode() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isblankCountryCode(driver);
	}

	@When("User clicks on the mobile no field")
	public void clickMobileNofield() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectMobileNumber(driver);
	}

	@And("user enter the invalid mobile no")
	public void enterInvalidMobileNo() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendMobileNumberValue(driver, "puja233243#@");
	}

	@Then("check for invaild mobile no")
	public void chekInvalidMobileNo() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkMobileNumberValidation(driver);
	}

	@When("User keep mobile no blank")
	public void enterBlankMobileNo() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendMobileNumberValue(driver, "");
	}

	@Then("check for blank mobile no field")
	public void checkBlankMobileNo() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isblankMobileNumber(driver);
	}

	@When("User clicks on the city name field")
	public void clickCityNamefield() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.clickcity(driver);
	}

	@And("user enter the invalid city name")
	public void enterInvalidCityName() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendCityValue(driver, "3#@#fs53");
	}

	@Then("check for invaild city name")
	public void chekInvalidCityName() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkVaildCity(driver);
	}

	@And("user enter the valid city name")
	public void entervalidCityName() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendCityValue(driver, "mumbai");
	}

	@And("user select city from dropdown")
	public void selectCityDropDown() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.selectCityDropDown(driver);
	}

	@Then("check for vaild city name")
	public void chekvalidCityName() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkVaildCity(driver);
	}

	@When("User keep city name blank")
	public void enterBlankCityName() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendCityValue(driver, "");
	}

	@Then("check for blank city name field")
	public void checkBlankCityName() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.isblankCity(driver);
	}

	@When("User clicks on the special request text")
	public void clickSpecialRequest() throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.clickSpecialRequest(driver);
	}

	@And("user enter the (.*) special request text")
	public void user_enter_special_request(String reqvalue) throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.sendSpecialValue(driver, reqvalue);

	}

	@Then("check for (.*) special request text validation")
	public void check_for_special_requesttext_validation(String srq) throws InterruptedException {
		review = new POM_Holiday_Reviewpage(driver);
		review.checkVaildSpecialRequest(driver, srq);
	}

}
