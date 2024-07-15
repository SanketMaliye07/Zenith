package PageObjectClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethodes;

public class POM_Holiday_Excel_Data {

	POM_prodpaymentpage pg;
	boolean isCityDisplayed = false;
	boolean isDateDisplayed = false;
//	boolean flag = false;
	WebDriver driver;

	@FindBy(xpath = "(//span[normalize-space()='My Account'])[1]")
	private WebElement Myaccount;

//	@FindBy(xpath = "//img[@alt='Holidays']")
//	private WebElement clickHoliday;

	@FindBy(xpath = "//input[@id='myTextField']")
	private WebElement clickforsearch;

	@FindBy(xpath = "//div[@class='theme5_input_search_destination__ThJm5']//input[@id='myTextField']")
	private WebElement searchDestination;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "(//input[@id='myTextField'])[1]")
	private WebElement SearchCity;
	@FindBy(xpath = "(//input[@id='myTextField'])[2]")
	private WebElement SearchCityname;
	@FindBy(xpath = "(//div[@id='hotelData'])[1]")
	private WebElement selectCity;

	@FindBy(xpath = "//i[@class='tawk-icon tawk-icon-close']")
	private WebElement iframeClose;

//	
	@FindBy(xpath = "//div[@class='infinite-scroll-component__outerdiv']//div[contains(@class,'infinite-scroll-component')]//div[1]//div[2]//div[2]//button[1]")
	private WebElement clickBookNowInSrpPage;

	@FindBy(xpath = "//button[normalize-space()='Enquire']")
	private WebElement enquireButton;

	@FindBy(xpath = "//button[normalize-space()='Apply']")
	private WebElement applyButton;

	@FindBy(xpath = "//label[normalize-space()='Fixed']")
	private WebElement departureRadio1;

	@FindBy(xpath = "//label[normalize-space()='Flexible']")
	private WebElement departureRadio2;

	@FindBy(xpath = "//label[normalize-space()='Anytime']")
	private WebElement departureRadio3;

	@FindBy(xpath = "//input[@value='Done']")
	private WebElement Done;
	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
	private WebElement Search;

	@FindBy(xpath = "//li[normalize-space()='Holidays']")
	private WebElement selectHoliday;

	@FindBy(xpath = "//button[normalize-space()='Continue Booking']")
	private WebElement Continue_Booking;

	@FindBy(xpath = "//input[@value='false']")
	private WebElement termAndconditionsCheck;

	@FindBy(xpath = "//button[normalize-space()='Proceed to Payment']")
	private WebElement proceedpayment;

	// for Enquire flow
	@FindBy(xpath = "//input[@id='name']")
	private WebElement customName;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement custoEmail;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement customCity;

	@FindBy(xpath = "//input[@id='country-code']")
	private WebElement customMobileCode;

	@FindBy(xpath = "//input[@id='mobile-number']")
	private WebElement customMobileNumber;

	@FindBy(xpath = "//textarea[@id='special-request']")
	private WebElement customSpecialRequest;

	@FindBy(xpath = "//select[@id='adult-select']")
	private WebElement selectNoOfAdt;

	@FindBy(xpath = "//select[@id='infant-select']")
	private String selectNoOfInfs;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement selectCancelBtn;

	@FindBy(xpath = "//img[contains(@alt,'Logout')]")
	private WebElement logout;

	@FindBy(xpath = "//div[@id='children-2-11-select']")
	private WebElement childrens;

	@FindBy(xpath = "//div[@id='childs-6-11yr-pax']//div[@class='theme2_adultpaxrow__e04zo']")
	private WebElement chd6to11;

	@FindBy(xpath = "//div[@id='childs-2-5yr-pax']//div[@class='theme2_adultpaxrow__e04zo']")
	private WebElement chd2to5;

	@FindBy(xpath = "//div[@id='childs-2-5yr-pax']//button[@type='button'][normalize-space()='+']")
	private WebElement child2to5yr;

	@FindBy(xpath = "//div[@id='childs-6-11yr-pax']//button[@type='button'][normalize-space()='+']")
	private WebElement child6to11yr;

	@FindBy(xpath = "//button[normalize-space()='Download package details as PDF']")
	private WebElement downloadpackpdf;

	// Holiday Booking flow webElements

	@FindBy(xpath = "//div[@id='cityDropDown']")
	private WebElement selecCityElement;

	@FindBy(xpath = "//input[@id='country_name_autocomplete']")
	private WebElement clickDepCityfield;

	@FindBy(xpath = "//li[@id='test0']")
	private WebElement selectcityname;

	@FindBy(xpath = "//input[@id='myTextField']")
	private WebElement selectDepDate;

	@FindBy(xpath = "//button[normalize-space()='Book Now']")
	private WebElement clickBookNowInReviewPage;

	@FindBy(xpath = "//button[@id='book-now-btn']")
	private WebElement clickBookNowBtn2;

	@FindBy(xpath = "//div[@class='theme5_travellersdetailsinputrow__JokTL']")
	private WebElement selectTravellersElement;

	@FindBy(xpath = "//div[@id='adults-pax']//button[2]")
	private WebElement adtpaxcount;

	@FindBy(xpath = "//div[@id='childs-2-5yr-pax']//button[2]")
	private WebElement chdpax1;

	@FindBy(xpath = "//div[@id='childs-6-11yr-pax']//button[2]")
	private WebElement chdpax2;

	@FindBy(xpath = "//div[@id='infants-0-2yr-pax']//button[2]")
	private WebElement infantspax1;

	@FindBy(xpath = "//div[normalize-space()='Contact Details']")
	private WebElement contactDetailsTab;

	@FindBy(xpath = "//input[@placeholder='Number of Travellers']")
	private WebElement t_title;

	@FindBy(xpath = "//p[normalize-space()='Mr']")
	private WebElement t_mr;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement t_firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement t_lastname;

	@FindBy(xpath = "//input[@id='emailId']")
	private WebElement t_email;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement t_mobileno;

	@FindBy(xpath = "//input[@id='countryISD']")
	private WebElement t_mobilecode;

//	@FindBy(xpath = "//body/div[@id='__next']/div/div[@class='desktop-layoutwrapper shared-offileheader new-homepage']/main[@class='pt-16']/div[@class='theme2_booking_confirm_main_page__QUIek']/div[@class='theme2_booking_confirm_main_page_flex__JHFgS']/div[@class='theme2_booking_confirm_right_tab__FIqmz']/div[@class='theme2_booking_confirm_main_container__4oIlU']/div[@class='theme2_booking_confirm_main_container_left__3JxcE']/div/div/div[@class='theme2_booking_confirm_traveller_deta__ntCJ8']/div[@class='theme2_saved_travFlx__S6X6_']/div[2]")
//	@FindBy(xpath = "//body/div/div/div/main/div/div/div/div/div/div/div/div/div/div/div[2]/input[1]")
//	private WebElement travellerRadioBtn;

//	@FindBy(xpath = "//h2[normalize-space()='Select Traveller']")
//	private WebElement travellerDropDownBox;

	@FindBy(xpath = "//div[@class='theme5_saved_travFlx__0b6Df']")
	private WebElement travellersDropDownList;

	public POM_Holiday_Excel_Data(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='/images/widgetIcons/Hotel_Header.svg']")
	private WebElement hotelElement;

	@FindBy(xpath = "//div[@class='calendar_calendar_wid_main__Cyjf9']")
	private WebElement calander;
	// input[@id='myTextField']

	@FindBy(xpath = "//input[@value='With Flights']")
	private WebElement withflts;

	@FindBy(xpath = "//input[@value='Without Flights']")
	private WebElement withnoflts;

	@FindBy(xpath = "//span[normalize-space()='Sign In']")
	private WebElement usignbtn;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement uemail;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement upass;

	@FindBy(xpath = "//button[normalize-space()='LOGIN']")
	private WebElement uloginbtn;

	@FindBy(xpath = "//button[@class='Theme2_googleLoginBtn__9a_Ny']")
	private WebElement signwithG;

	// this for zenith for login sign
	@FindBy(xpath = "//a[contains(@title,'My Account')]")
	private WebElement signinbtn;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;

	@FindBy(xpath = "//a[normalize-space()='Holidays']")
	private WebElement holidayHeader;

//	@FindBy(xpath = "//li[normalize-space()='Holidays']//div[@class='Desktop_service_icon__5qFo3']")
//	private WebElement holidayHeader;

	public void click_On_Myaccount(WebDriver driver) throws InterruptedException {
		CommonMethodes.waitForElementToBeVisible(driver, Myaccount, 30);
	}

	public void click_On_SighIn(WebDriver driver) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", signinbtn);

	}

	public void loginWithCredentials(WebDriver driver, String usrname, String passwrd) throws InterruptedException {

		username.sendKeys(usrname);
		Thread.sleep(500);
		password.sendKeys(passwrd);
		Thread.sleep(500);
		loginbtn.click();
		Thread.sleep(500);
	}

	public void redirectToHolidayPage(WebDriver driver) throws InterruptedException {

		holidayHeader.click();
//		CommonMethodes.waitForElementToBeVisible(driver, holidayHeader, 3);
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", holidayHeader);

//		Thread.sleep(500);

	}

	public void Search_selectPackage(WebDriver driver, String destination) throws InterruptedException {
//		CommonMethodes.waitForElementToBeVisible(driver, SearchPackageByDestination, 3);
//		CommonMethodes.waitForElementToBeVisible(driver, SearchPackageByDestination, 3);
		System.out.println("destination name is" + destination);
		clickforsearch.click();

		// div[@class='theme5_activity_autocomplete_name__Btnci']

		searchDestination.sendKeys(destination);
		Thread.sleep(10000);
		List<WebElement> allSuggesionListData = driver.findElements(By.xpath("//div[@id='ACTIVITY_CITY-0']"));

		System.out.println("allDates-allSuggesionListData---" + allSuggesionListData);

		for (WebElement searchText : allSuggesionListData) {
			String current_dt = searchText.getText();
			if (current_dt.equals(destination)) {
				System.out.println("date match condition true");
				searchText.click();
				Thread.sleep(5000);
				break;
			}

		}

	}

	public void clickSearchButton(WebDriver driver) throws InterruptedException {
		WebElement element1 = searchButton;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", searchButton);
		element1.click();
		Thread.sleep(3000);

	}

	public void selectHolidays(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickBookNowInSrpPage);
		Thread.sleep(5000);

	}

//	public boolean checkIsDisplayed(WebDriver driver) throws InterruptedException {
//
//		try {
//			System.out.println("Check Departure City and Departure City Opions Availabel for Selection");
//
//			isCityDisplayed = driver.findElement(By.xpath("//input[@id='country_name_autocomplete']")).isDisplayed();
//			isDateDisplayed = driver.findElement(By.xpath("//input[@id='myTextField']")).isDisplayed();
//
//			System.out.println("departure city drop down Available " + isCityDisplayed);
//			System.out.println("departure date drop down Available" + isDateDisplayed);
//
//			if (isCityDisplayed & isDateDisplayed) {
//				flag = true;
//				selectDepartureCity(driver);
//				selectDepartureDate(driver);
//			} else {
//				flag = false;
//			}
//
//			return flag;
//
//		} catch (NoSuchElementException e) {
//
//			System.out.println("Exception in finding the element:" + e.getMessage());
//
//			return flag;
//
//		}
//
//	}

	public void checkIsDisplayed(WebDriver driver) throws InterruptedException, NoSuchElementException {

		System.out.println("Check Departure City and Departure City Opions Availabel for Selection");

		if (driver.findElements(By.xpath("//input[@id='country_name_autocomplete']")).size() > 0) {
			selectDepartureCity(driver);
		}

		if (driver.findElements(By.xpath("//input[@id='myTextField']")).size() > 0) {
			selectDepartureDate(driver);
		}

		Thread.sleep(2000);

	}

	public void clickOnEnquireButton(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", enquireButton);
//		Thread.sleep(3000);
		enquireButton.click();
		Thread.sleep(3000);

	}

	public void customerName(WebDriver driver, String cname) throws InterruptedException {
		WebElement element1 = customName;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		element1.clear();
		element1.sendKeys(cname);
		Thread.sleep(2000);
	}

	public void customerEmail(WebDriver driver, String cemail) throws InterruptedException {
		WebElement element1 = custoEmail;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		js.executeScript("arguments[0].scrollTop = arguments[1];",
				driver.findElement(By.xpath("//div[@id='enquiry-main']")), 1000);
		element1.clear();
		element1.sendKeys(cemail);
		Thread.sleep(2000);

	}

	public void customerCity(WebDriver driver, String ccity) throws InterruptedException {
//		WebElement element1 = customCity;

//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		js.executeScript("arguments[0].scrollTop = arguments[1];",
				driver.findElement(By.xpath("//div[@id='enquiry-main']")), 1000);
		customCity.clear();
		customCity.sendKeys(ccity);
		Thread.sleep(1000);
		customCity.sendKeys(Keys.ARROW_DOWN);
		customCity.sendKeys(Keys.ENTER);

	}

	public void sendMobileCode(WebDriver driver, String mobilecode) throws InterruptedException {

		CommonMethodes.waitForElementToBeVisible(driver, customMobileCode, 3);
		customMobileCode.clear();
		Thread.sleep(3000);
		customMobileCode.sendKeys(mobilecode);
		Thread.sleep(2000);
		customMobileCode.sendKeys(Keys.ARROW_DOWN);
		customMobileCode.sendKeys(Keys.ENTER);
	}

	public void sendMobileNumber(WebDriver driver, String mnumber) throws InterruptedException {

		WebElement element1 = customMobileNumber;

		// check for scrol down page up to element
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		element1.clear();
		element1.sendKeys(mnumber);
		Thread.sleep(2000);
	}

	public void sendSpecialInfo(WebDriver driver, String srinfo) throws InterruptedException {

		WebElement element1 = customSpecialRequest;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		element1.clear();
		element1.sendKeys(srinfo);
		Thread.sleep(2000);
	}

//	public void travellers_for_enquire(WebDriver driver, String noAdt, String nochild2to5yr, String nochild6to11yr,
//			String noInfs) throws InterruptedException {
//
//		Select selectAdts = new Select(driver.findElement(By.xpath("//select[@id='adult-select']")));
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
//		selectAdts.selectByValue(noAdt);
//		Thread.sleep(15000);
//
//		int child2t5Counts = Integer.valueOf(nochild2to5yr);
//		for (int i = 1; i <= child2t5Counts; i++) {
//			Thread.sleep(10000);
//			CommonMethodes.waitForElementToBeVisible(driver, child2to5yr, 30);
//			CommonMethodes.ScrollingView(driver, child2to5yr);
//			Thread.sleep(10000);
//		}
//
//		Thread.sleep(15000);
//
//		int child5t11Counts = Integer.valueOf(nochild6to11yr);
//
//		for (int i = 1; i <= child5t11Counts; i++) {
//			Thread.sleep(10000);
//			CommonMethodes.waitForElementToBeVisible(driver, child6to11yr, 10);
//			CommonMethodes.ScrollingView(driver, child6to11yr);
//			Thread.sleep(10000);
//		}
//		Thread.sleep(15000);
//
//		Select infse = new Select(driver.findElement(By.xpath("//select[@id='infant-select']")));
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
//		infse.selectByValue(noInfs);
//		Thread.sleep(3000);
//
//	}

	public void selectNoOfAdults(WebDriver driver, String noAdt) throws InterruptedException {

//		Select se = new Select(driver.findElement(By.xpath(selectNoOfAdt)));
		Select adtse = new Select(driver.findElement(By.xpath("//select[@id='adult-select']")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");

		if (!noAdt.isEmpty()) {
			adtse.selectByValue(noAdt);
			Thread.sleep(10000);
		}

	}

	public void selectNoOfInfnts(WebDriver driver, String noInfs) throws InterruptedException {

//		Select infse = new Select(driver.findElement(By.xpath(selectNoOfInfs)));
		Select infse = new Select(driver.findElement(By.xpath("//select[@id='infant-select']")));

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");

		if (!noInfs.isEmpty()) {
			infse.selectByValue(noInfs);
			Thread.sleep(10000);
		}

	}

	public void selectChild2to5yr(WebDriver driver, String CountOfchild2to5yr) throws InterruptedException {

		System.out.println("CountOfchild2to5yr----" + CountOfchild2to5yr);
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
//		CommonMethodes.waitForElementToBeVisible(driver, childrens, 30);
//		driver.findElement(By.xpath("//div[@id='children-2-11-select']")).click();
		Thread.sleep(3000);

		WebElement wb = driver.findElement(By.xpath("//div[@id='children-2-11-select']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", wb);

		if (!CountOfchild2to5yr.isEmpty()) {
			int counts = Integer.valueOf(CountOfchild2to5yr);

			if (counts > 0) {

//				childrens.click();
				Thread.sleep(10000);

				for (int i = 1; i <= counts; i++) {

//					CommonMethodes.waitForElementToBeVisible(driver, child2to5yr, 10);
//					CommonMethodes.ScrollingView(driver, child2to5yr);
//					Thread.sleep(3000);

					WebElement wb1 = driver.findElement(
							By.xpath("//div[@id='childs-2-5yr-pax']//button[@type='button'][normalize-space()='+']"));
					JavascriptExecutor jse1 = (JavascriptExecutor) driver;
					jse1.executeScript("arguments[0].click();", wb1);

				}
				Thread.sleep(3000);

			}
		}

	}

	public void bedRequiredFor2to5yrs(WebDriver driver, int noInfs) throws InterruptedException {
		CommonMethodes.waitForElementToBeVisible(driver, childrens, 10);
//		int counts= Integer.valueOf(CountOfchild2to5yr);
		
		 
		
		// list contains all bed yes/no options
		List<WebElement> travllerList = driver
				.findElements(By.xpath("//div[@id='childs-2-5yr-pax']//div[@class='theme5_adultpaxinforeqiredrow__CInct']//div[@class='theme5_infantinnerrow__7sGnB']"));
		
		for (int i = 1; i <= noInfs; i++) {
			CommonMethodes.waitForElementToBeVisible(driver, child2to5yr, 10);
			Thread.sleep(3000);
		}

		Thread.sleep(3000);
	}

	public void selectChild6to11yr(WebDriver driver, String CountOfchild6to11yr) throws InterruptedException {
//		CommonMethodes.waitForElementToBeVisible(driver, childrens, 10);
//		CommonMethodes.waitForElementToBeVisible(driver, chd6to11, 10);
		Thread.sleep(3000);

		if (!CountOfchild6to11yr.isEmpty()) {
			int counts = Integer.valueOf(CountOfchild6to11yr);

			if (counts > 0) {
				for (int i = 1; i <= counts; i++) {
//					CommonMethodes.waitForElementToBeVisible(driver, child6to11yr, 10);
//					CommonMethodes.ScrollingView(driver, child6to11yr);
//					Thread.sleep(3000);

					WebElement wb1 = driver.findElement(
							By.xpath("//div[@id='childs-6-11yr-pax']//button[@type='button'][normalize-space()='+']"));
					JavascriptExecutor jse1 = (JavascriptExecutor) driver;
					jse1.executeScript("arguments[0].click();", wb1);

				}
				Thread.sleep(3000);

			}
		}

	}

	public void bedRequiredFor6to11yrs(WebDriver driver, int noInfs) throws InterruptedException {
//		for (int i = 1; i <= noInfs; i++) {
//			CommonMethodes.waitForElementToBeVisible(driver, child2to5yr, 10);
//			Thread.sleep(3000);
//		}
//
//		Thread.sleep(3000);
	}

	public void selectApplybutton(WebDriver driver) throws InterruptedException {

		WebElement wb = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", wb);
		Thread.sleep(1000);

	}

	public void submitData(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", submitBtn);
		submitBtn.click();
//		Thread.sleep(3000);

	}

	public void CancelData(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", selectCancelBtn);
		selectCancelBtn.click();
		Thread.sleep(3000);

	}

	public void logoutZenith(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", selectCancelBtn);
		selectCancelBtn.click();
		Thread.sleep(3000);

	}

	public void downLoadPackagePdf(WebDriver driver) throws InterruptedException {

		WebElement element1 = downloadpackpdf;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(500);
		element1.click();
		Thread.sleep(3000);

	}

	// HolidayBooking

	public void addTravellerData(WebDriver driver, String noadt, String nochd2t5, String nochd6t11, String noinfts0t2)
			throws InterruptedException, NumberFormatException {

		CommonMethodes.waitForElementToBeVisible(driver, selectTravellersElement, 10);

		Thread.sleep(3000);
		if (!noadt.isEmpty()) {
			int nadt = Integer.valueOf(noadt);
			if (nadt > 0) {
				for (int i = 1; i <= nadt; i++) {
					CommonMethodes.waitForElementToBeVisible(driver, adtpaxcount, 10);
					CommonMethodes.ScrollingView(driver, adtpaxcount);
					Thread.sleep(3000);
				}
				Thread.sleep(3000);
			}
		}

		if (!nochd2t5.isEmpty()) {
			int nchd2t5 = Integer.valueOf(nochd2t5);
			if (nchd2t5 > 0) {

				for (int i = 1; i <= nchd2t5; i++) {
					CommonMethodes.waitForElementToBeVisible(driver, chdpax1, 10);
					CommonMethodes.ScrollingView(driver, chdpax1);
					Thread.sleep(3000);
				}
				Thread.sleep(3000);
			}

		}

		if (!nochd6t11.isEmpty()) {
			int nchd6t11 = Integer.valueOf(nochd6t11);

			if (nchd6t11 > 0) {

				for (int i = 1; i <= nchd6t11; i++) {
					CommonMethodes.waitForElementToBeVisible(driver, chdpax2, 10);
					CommonMethodes.ScrollingView(driver, chdpax2);
					Thread.sleep(3000);
				}
				Thread.sleep(3000);
			}

		}

		if (!noinfts0t2.isEmpty()) {
			int ninfts0t2 = Integer.valueOf(noinfts0t2);

			if (ninfts0t2 > 0) {

				for (int i = 1; i <= ninfts0t2; i++) {
					CommonMethodes.waitForElementToBeVisible(driver, infantspax1, 10);
					CommonMethodes.ScrollingView(driver, infantspax1);
					Thread.sleep(3000);
				}
				Thread.sleep(3000);

			}

		}

		Thread.sleep(3000);

	}

	public void bookingNow(WebDriver driver) throws InterruptedException {
		WebElement element1 = clickBookNowInReviewPage;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", clickBookNowInReviewPage);
		Thread.sleep(3000);
		element1.click();
		Thread.sleep(3000);

	}

	public void applyforTravellers(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		applyButton.click();
		Thread.sleep(3000);

	}

	public void applyBookNow(WebDriver driver) throws InterruptedException {
//		WebElement element1 = clickBookNowBtn2;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		clickBookNowBtn2.click();
		Thread.sleep(3000);

	}

	public void clickContactDetailsTab(WebDriver driver) throws InterruptedException {

//		CommonMethodes.waitForElementToBeVisible(driver, contactDetailsTab, 10);
//		contactDetailsTab.click();
//		Thread.sleep(1000);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", contactDetailsTab);

	}

	public void selectTravelerFromDrpDown(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
//		CommonMethodes.waitForElementToBeVisible(driver, travellersDropDownList, 10);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", travellersDropDownList);

		// list all travellers from list drop down
		List<WebElement> travllerList = driver
				.findElements(By.xpath("//div[@class='theme5_saved_travFlx__0b6Df']//ul"));

		System.out.println("travllerList---" + travllerList);

		System.out.println("travllerList- size--" + travllerList.size());

		int travellerListSize = travllerList.size();
		travllerList.get(0).click();
		Thread.sleep(1000);

//		if (travellerListSize > 0) {
//			WebElement travellername = travllerList.get(0);
//			Thread.sleep(1000);
//			System.out.println("this travellername is selected " + travellername);
//			travellername.click();
//			Thread.sleep(1000);
//		}

	}

	public void addTravellerDetails(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", "");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", t_title);

//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", "");
//		Thread.sleep(3000);
//		t_title.click();
//		t_mr.click();

		List<WebElement> titleList = driver.findElements(By.xpath("//div[@id='title']//p"));
		Thread.sleep(2000);

		System.out.println("titleList size" + titleList.size());

		if (titleList.size() > 0) {
//			titleList.get(0).click();
			executor.executeScript("arguments[0].click();", titleList.get(0));
			Thread.sleep(1000);
		}

		t_firstname.sendKeys("kuldeep");
		t_lastname.sendKeys("ruletiya");
		t_email.sendKeys("kuldeep.ruletiya@vernost.in");
		t_mobileno.sendKeys("9769555660");
		Thread.sleep(4000);

		t_mobilecode.click();
		Thread.sleep(3000);
		t_mobilecode.clear();
		t_mobilecode.sendKeys("91");
//		Thread.sleep(4000);
		t_mobilecode.sendKeys(Keys.ARROW_DOWN);
		t_mobilecode.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

	public void userClicksOnContinue(WebDriver driver) throws InterruptedException {
//		WebElement element1 = Continue_Booking;

//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", Continue_Booking);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", Continue_Booking);

		Thread.sleep(1000);
		Continue_Booking.click();
		Thread.sleep(10000);

	}

	public void signWithEmailPassword(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", usignbtn);
		Thread.sleep(1000);
		usignbtn.click();
		Thread.sleep(3000);

		uemail.sendKeys("kuldeep.ruletiya@vernost.in");
		Thread.sleep(2000);

		upass.sendKeys("Admin@1234");
		Thread.sleep(2000);

		uloginbtn.click();
		Thread.sleep(3000);

	}

	public void signWithGoogle(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", signwithG);
		Thread.sleep(1000);
		signwithG.click();
		Thread.sleep(5000);

	}

	public void acceptTnCs(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-800)", "");
		Thread.sleep(5000);
		termAndconditionsCheck.click();
		Thread.sleep(5000);

	}

	public void pgProcess(WebDriver driver) throws InterruptedException {

//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", proceedpayment);
		proceedpayment.click();
		Thread.sleep(5000);

		pg = new POM_prodpaymentpage(driver);
		pg.passCreditCardNumber(driver);
		pg.selectMonth(driver);
		pg.selectYear(driver);
		pg.passCvv(driver);
//		pg.billaddress(driver);
//		pg.billCity(driver);
//		pg.billCountry(driver);
		pg.makepayement(driver);

	}

	public void selectDepartureCity(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickDepCityfield);
		Thread.sleep(1000);
//		selectcityname.click();
		executor.executeScript("arguments[0].click();", selectcityname);
		Thread.sleep(3000);

	}

	public void selectDepartureDate(WebDriver driver) throws InterruptedException {

//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		CommonMethodes.waitForElementToBeVisible(driver, calander, 1);
		Thread.sleep(3000);

		while (true) {

			String currMonthYear = driver
					.findElement(By.xpath("//div[@class='calendar_calendar_head_center_side__vHrNy']")).getText();
			System.out.println("currMonthYear-----" + currMonthYear);
			Thread.sleep(300);
			// This list contains enabled Dates
			List<WebElement> currMonthYearDate = driver
					.findElements(By.cssSelector(".calendar_day_cell_center_highlight__nGqyQ"));
			Thread.sleep(3000);
			System.out.println("enabled date list currMonthYearDate-----" + currMonthYearDate);

			int dateListSize = currMonthYearDate.size();
			Thread.sleep(3000);

			System.out.println("dateListSize---" + dateListSize);

			System.out.println("dateListSize---" + dateListSize);

			if (dateListSize > 0) {
				WebElement usrdate = currMonthYearDate.get(0);
				Thread.sleep(1000);
				System.out.println("usr date is---" + usrdate);
				usrdate.click();
				Thread.sleep(1000);
				break;

			} else {
				// next forward check for month and year if no date Available
				driver.findElement(By.xpath("//div[@class='calendar_calendar_head_right_side__FtxCD']")).click();
			}

		}

		Thread.sleep(1000);

		Thread.sleep(1000);

	}

	public void FltfilterType(WebDriver driver, String flttype) throws InterruptedException {

		if (StringUtils.isNotEmpty(flttype)) {
			System.out.println(flttype.length());

			System.out.println("flttype--1111111--" + flttype);
			if (flttype == "WithFlights") {
				WebElement element1 = withflts;
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
				Thread.sleep(300);
				element1.click();
				Thread.sleep(3000);
			} else {

				WebElement element2 = withnoflts;
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
				Thread.sleep(300);
				element2.click();
				Thread.sleep(3000);
			}

		} else {
			System.out.println("Empty string");
		}

	}
}
