package PageObjectClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import utils.CommonMethodes;
import utils.RegexExpresionPatterns;

public class POM_Holiday_Reviewpage {

	@FindBy(xpath = "//body/div[@id='__next']/div/div[@class='desktop-layoutwrapper shared-offileheader new-homepage']/main[@class='pt-16']/div[@class='theme2_mainrow__jxV82']/div[@class='theme2_holidaycontainer__FZqiC']/div[@class='theme2_filters_tiles_wrap__rJaRa']/div[@class='theme2_tiles_holiday__SshHe']/div[@class='theme2_thumbnailrow__krCrQ']/div[1]")
	private WebElement pkselect;

	@FindBy(xpath = "//button[normalize-space()='Overview']")
	private WebElement overviewTab;

	@FindBy(xpath = "//h1[normalize-space()='Overview']")
	private WebElement verifyOverviewText;

	@FindBy(xpath = "//div[@class='theme2_hotel_overview_sec__nq8mW']//button[@class='theme2_active__9M3eH'][normalize-space()='Inclusions']")
	private WebElement InclusionsTab;

	@FindBy(xpath = "//h1[normalize-space()='Overview']")
	private WebElement verifyInclusionsText;

	@FindBy(xpath = "//button[normalize-space()='Itinerary']")
	private WebElement ItineraryTab;

	@FindBy(xpath = "//h1[normalize-space()='Overview']")
	private WebElement verifyItineraryText;

	@FindBy(xpath = "//button[normalize-space()='Inclusion/Exclusion']")
	private WebElement InclusionExclusionTab;

	@FindBy(xpath = "//h1[normalize-space()='Overview']")
	private WebElement verifyInclusionExclusionText;

	@FindBy(xpath = "//button[normalize-space()='Policy']")
	private WebElement policyTab;

	@FindBy(xpath = "//button[normalize-space()='...Read More']")
	private WebElement readMorePolicy;

	@FindBy(xpath = "//button[normalize-space()='Itinerary']")
	private WebElement readLessPolicy;

	@FindBy(xpath = "//h1[normalize-space()='Overview']")
	private WebElement verifyPolicyText;

	@FindBy(xpath = "//button[normalize-space()='Enquiry']")
	private WebElement enquireBtn;

	@FindBy(xpath = "//h1[normalize-space()='No. of Traveller(s)']")
	private WebElement popuptext;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement cancelBtn;

	@FindBy(xpath = "//span[normalize-space()='Day 1']")
	private WebElement dayOne;

	@FindBy(xpath = "//span[normalize-space()='Day 2']")
	private WebElement dayTwo;

	@FindBy(xpath = "//span[normalize-space()='Day 3']")
	private WebElement dayThree;

	@FindBy(xpath = "//span[normalize-space()='Day 4']")
	private WebElement dayFour;

	@FindBy(xpath = "//body/div[@id='__next']/div/div[@class='desktop-layoutwrapper shared-offileheader new-homepage']/main[@class='pt-16']/div[@class='theme2_holidaydetailsrow__hgMyS']/div[@class='theme2_holidaycarouselrow__fdCyv']/div[@class='theme2_maininneractivity__WHP_F']/div[@class='theme2_mainleftactivity___88QX']/div[@id='section3']/div[@class='theme2_bottomoverview__gWgnM']/div[@class='theme2_itinerarytabcolumright__8fdbP']/div[@class='theme2_itinerarytabcolumrightdata__PCm3T']/p[1]")
	private WebElement checkDaysText;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement customName;

	@FindBy(xpath = "//p[normalize-space()='Enter a valid Customer Name']")
	private WebElement custErrMsg;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement custoEmail;

	@FindBy(xpath = "//p[normalize-space()='Enter a valid Email ID']")
	private WebElement custEmailErrMsg;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement customCity;

	@FindBy(xpath = "//p[normalize-space()='Enter a valid City']")
	private WebElement cityErrMsg;

	@FindBy(xpath = "//input[@id='country-code']")
	private WebElement customMobileCode;

	@FindBy(xpath = "//p[@class='theme2_error__xR16m theme2_error_left__HQI_D']")
	private WebElement mobileCodeErrMsg;

	@FindBy(xpath = "//input[@id='mobile-number']")
	private WebElement customMobileNumber;

	@FindBy(xpath = "//p[@class='theme2_error__xR16m theme2_error_right__yR74K']")
	private WebElement mobileNumberErrMsg;

	@FindBy(xpath = "//input[@id='special-request']")
	private WebElement customSpecialRequest;

	@FindBy(xpath = "//select[@id='adult-select']")
	private WebElement selectNoOfAdt;

	@FindBy(xpath = "//select[@id='infant-select']")
	private String selectNoOfInfs;

	@FindBy(xpath = "//select[@id='infant-select']")
	private String submitButton;

	@FindBy(xpath = "//select[@id='infant-select']")
	private String cancelButton;

	RegexExpresionPatterns expcheck;
	WebDriver driver;

	public POM_Holiday_Reviewpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectpackage(WebDriver driver) throws InterruptedException {
		WebElement element1 = pkselect;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();
		Thread.sleep(3000);

	}

	public void clickOverviewtab(WebDriver driver) throws InterruptedException {
		WebElement element1 = overviewTab;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();
		Thread.sleep(2000);

	}

	public void verifyOverviewtab(WebDriver driver) throws InterruptedException {
		String text = verifyOverviewText.getText();
		assertEquals(text, "Overview", "verify Overview tab failed");
//	Thread.sleep(2000);

	}

	public void clickInclusionstab(WebDriver driver) throws InterruptedException {
		WebElement element1 = InclusionsTab;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();
		Thread.sleep(2000);

	}

	public void verifyInclusionstab(WebDriver driver) throws InterruptedException {
		String text = verifyInclusionExclusionText.getText();
		assertEquals(text, "Inclusions", "verify Inclusions tab failed");

	}

	public void clickItineraryTab(WebDriver driver) throws InterruptedException {
		WebElement element1 = ItineraryTab;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();
		Thread.sleep(2000);

	}

	public void verifyItinerarytab(WebDriver driver) throws InterruptedException {

		String text = verifyItineraryText.getText();
		assertEquals(text, "Itineraries", "verify Itineraries tab failed");

	}

	public void clickInclusionExclusionTab(WebDriver driver) throws InterruptedException {
		WebElement element1 = InclusionExclusionTab;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();
		Thread.sleep(2000);

	}

	public void verifyInclusionExclusiontab(WebDriver driver) throws InterruptedException {

		String text = verifyInclusionExclusionText.getText();
		assertEquals(text, "Inclusions", "verify InclusionExclusion tab failed");

	}

	public void clickpolicyTab(WebDriver driver) throws InterruptedException {
		WebElement element1 = policyTab;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();
		Thread.sleep(2000);

	}

	public void scrollpolicyTab(WebDriver driver) throws InterruptedException {
		// h1[normalize-space()='Policies']

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ItineraryTab);
		Thread.sleep(5000);
		ItineraryTab.click();
		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", policyTab);
		Thread.sleep(2000);

	}

	public void readMorePolicyDetails(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", readMorePolicy);
		ItineraryTab.click();
		Thread.sleep(5000);

	}

	public void readLessPolicyDetails(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", readLessPolicy);
		ItineraryTab.click();
		Thread.sleep(5000);

	}

	public void verifyPolicytab(WebDriver driver) throws InterruptedException {
		String text = verifyPolicyText.getText();
		assertEquals(text, "Policies", "verify Policy tab failed");

	}

	public void isPopEnquireDisplayed(WebDriver driver) throws InterruptedException {
		String text = popuptext.getText();
		assertEquals(text, "No. of Traveller(s)", "enuire pop up page text not match");

		if (true) {
			WebElement element1 = cancelBtn;
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1200)", "");
			element1.click();
			Thread.sleep(1000);
		}

	}

	public void selectDepartureType(WebDriver driver, String DepType) throws InterruptedException {
		if (DepType.equalsIgnoreCase("Fixed")) {
			driver.findElement(By.cssSelector("label[for='fixed']")).click();
		} else if (DepType.equalsIgnoreCase("Flexible")) {
			driver.findElement(By.cssSelector("label[for='flexible']")).click();
		} else if (DepType.equalsIgnoreCase("Anytime")) {
			driver.findElement(By.cssSelector("label[for='anytime']")).click();
		}
		Thread.sleep(3000);
	}

	public void isDepartureSelected(WebDriver driver, String DepType) throws InterruptedException {
		if (DepType.equalsIgnoreCase("Fixed")) {
			Boolean isFixedSelected = driver.findElement(By.cssSelector("label[for='fixed']")).isSelected();
			System.out.println("isFixedSelected --- " + isFixedSelected);
		} else if (DepType.equalsIgnoreCase("Flexible")) {
			Boolean isFlexibleSelected = driver.findElement(By.cssSelector("label[for='flexible']")).isSelected();
			System.out.println("isFlexibleSelected" + isFlexibleSelected);
		} else if (DepType.equalsIgnoreCase("Anytime")) {
			Boolean isAnytimeSelected = driver.findElement(By.cssSelector("label[for='anytime']")).isSelected();
			System.out.println("isAnytimeSelected" + isAnytimeSelected);
		}

		Thread.sleep(3000);

	}

	public void isDepartureContain(WebDriver driver, String DepType) throws InterruptedException {
		if (DepType.equalsIgnoreCase("Fixed")) {
			String text = driver.findElement(By.cssSelector("label[for='fixed']")).getText();
			assertEquals(text, "fixed", "departure section not contain fixed");

		} else if (DepType.equalsIgnoreCase("Flexible")) {
			String text = driver.findElement(By.cssSelector("label[for='flexible']")).getText();
			assertEquals(text, "flexible", "departure section not contain flexible");

		} else if (DepType.equalsIgnoreCase("Anytime")) {

			String text = driver.findElement(By.cssSelector("label[for='anytime']")).getText();
			assertEquals(text, "anytime", "departure section not contain anytime");

		}

		Thread.sleep(3000);

	}

	public void selectname(WebDriver driver) throws InterruptedException {
		WebElement element1 = customName;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();

	}

	public void sendNameValue(WebDriver driver, String text) throws InterruptedException {
		WebElement element1 = customName;
		element1.clear();
//		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.sendKeys(text);
		Thread.sleep(1000);

	}

	public void isblankName(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		WebElement element1 = customName;
		CommonMethodes.waitfForElements(driver, 3000);
		Thread.sleep(1000);
		String textmsg = custErrMsg.getText();
		int textleng = customName.getAttribute("value").length();
		assertTrue(textleng > 0, "name is not blank");
		assertEquals(textmsg, "Enter a valid Customer Name");

	}

	public void checkNameFieldValidation(WebDriver driver, String typeValidation) throws InterruptedException {

		WebElement element1 = customName;
		CommonMethodes.waitfForElements(driver, 3000);
		Thread.sleep(1000);
		String value = customName.getAttribute("value");
		System.out.println("name filed type " + typeValidation);
		System.out.println("name fields value is -- " + value);

		RegexExpresionPatterns expcheck = new RegexExpresionPatterns();
		if (typeValidation == "char") {

			assertEquals(expcheck.isChar(value), true, "not contains characters");

		} else if (typeValidation == "alphanumberic") {
			assertEquals(expcheck.isAlphaNumberic(value), true, "name filed not contains alphanumberi");
		} else if (typeValidation == "numberic") {
			assertEquals(expcheck.isMobileNumber(value), true, "name filed not contains numberic");
		} else if (typeValidation == "blank") {
			assertEquals(expcheck.isBlank(value), false, "name filed is not blank");
		} else if (typeValidation == "special") {
			assertEquals(expcheck.isSpecial(value), true, "name filed not contains special characters");

		}

	}

	public void checkEmailFieldValidation(WebDriver driver, String typeValidation) throws InterruptedException {

		WebElement element1 = custoEmail;
		CommonMethodes.waitfForElements(driver, 3000);
		Thread.sleep(1000);
		String value = custoEmail.getAttribute("value");
		System.out.println("email filed type " + typeValidation);
		System.out.println("email fields value is -- " + value);

		RegexExpresionPatterns expcheck = new RegexExpresionPatterns();
		if (typeValidation == "char") {

			assertEquals(expcheck.isChar(value), true, "not contains characters");

		} else if (typeValidation == "alphanumberic") {
			assertEquals(expcheck.isAlphaNumberic(value), true, "name filed not contains alphanumberi");
		} else if (typeValidation == "numberic") {
			assertEquals(expcheck.isMobileNumber(value), true, "name filed not contains numberic");
		} else if (typeValidation == "blank") {
			assertEquals(expcheck.isBlank(value), false, "name filed is not blank");
		} else if (typeValidation == "special") {
			assertEquals(expcheck.isSpecial(value), true, "name filed not contains special characters");

		} else if (typeValidation == "emailid") {
			assertEquals(expcheck.isEmailValidation(value), true, "Invaild Email id ");

		}

	}

	public void selectemail(WebDriver driver) throws InterruptedException {

		WebElement element1 = custoEmail;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();

	}

	public void sendEmailValue(WebDriver driver, String text) throws InterruptedException {
		WebElement element1 = custoEmail;
		custoEmail.clear();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.sendKeys(text);
		Thread.sleep(1000);

	}

	public void isValidEmail(WebDriver driver) throws InterruptedException {
		String text = custEmailErrMsg.getText();
		assertEquals(text, "Enter a valid Email ID");

	}

	public void clickcity(WebDriver driver) throws InterruptedException {
		WebElement element1 = customCity;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();

	}

	public void isblankCity(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		WebElement element1 = customCity;
//		CommonMethodes.waitfForElements(driver, 3000);
		Thread.sleep(1000);
		String cityerrormsg = cityErrMsg.getText();
		int textleng = customCity.getAttribute("value").length();
		assertTrue(textleng > 0, "city name is not blank");
		assertEquals(cityerrormsg, "Enter a valid City");

	}

	public void sendCityValue(WebDriver driver, String cityname) throws InterruptedException {
		WebElement element1 = customCity;
		customCity.clear();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.sendKeys(cityname);
		Thread.sleep(1000);

	}

	public void checkVaildCity(WebDriver driver) throws InterruptedException {

		List<WebElement> citylist = driver.findElements(By.xpath("//div[@class='theme2_datalistrow__61d7o']//ul"));
		int listcount = citylist.size();

		if (listcount > 0) {
			System.out.println("City Found in the list");
		} else {
			System.out.println("No City Found in the list");
		}

	}

	public void selectCityDropDown(WebDriver driver) throws InterruptedException {
		WebElement element1 = customCity;
		String cityname = customCity.getAttribute("value");
		Thread.sleep(3000);

		List<WebElement> citylist = driver.findElements(By.xpath("//div[@class='theme2_datalistrow__61d7o']//ul"));

		System.out.println("allDates-allSuggesionListData---" + citylist);

		for (WebElement searchText : citylist) {
			String currentcity = searchText.getText();
			if (currentcity.equals(cityname)) {
				System.out.println("sesrch city found matched");
				searchText.click();
				Thread.sleep(10000);
				break;
			}

		}

//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");

	}

	public void clickSpecialRequest(WebDriver driver) throws InterruptedException {
		WebElement element1 = customSpecialRequest;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();

	}

	public void sendSpecialValue(WebDriver driver, String text) throws InterruptedException {
		WebElement element1 = customSpecialRequest;
		customSpecialRequest.clear();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.sendKeys(text);
		Thread.sleep(1000);

	}

	public void selectMobileNumber(WebDriver driver) throws InterruptedException {
		String text = customMobileNumber.getText();
		customMobileNumber.clear();

	}

	public void sendMobileNumberValue(WebDriver driver, String text) throws InterruptedException {
		WebElement element1 = customMobileNumber;
		customMobileNumber.clear();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.sendKeys(text);
		Thread.sleep(1000);

	}

	public void isblankMobileNumber(WebDriver driver) throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		WebElement element1 = customMobileNumber;
		CommonMethodes.waitfForElements(driver, 3000);
		Thread.sleep(1000);
		String textmsg = mobileNumberErrMsg.getText();
		int textleng = customMobileNumber.getAttribute("value").length();
		assertTrue(textleng > 0, "moibile number is not blank");
		assertEquals(textmsg, "Enter a vaild Mobile Number");

	}

	public void checkMobileNumberValidation(WebDriver driver) throws InterruptedException {

		WebElement element1 = customMobileNumber;
		CommonMethodes.waitfForElements(driver, 3000);
		Thread.sleep(1000);
		String value = customMobileNumber.getAttribute("value");
		System.out.println("customMobileNumber fields value is -- " + value);

		RegexExpresionPatterns expcheck = new RegexExpresionPatterns();
		assertEquals(expcheck.isMobileNumberValidation(value), true, "Invaild mobile number");

	}

	public void clickCountryCode(WebDriver driver) throws InterruptedException {
		WebElement element1 = customMobileCode;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		element1.click();

	}

	public void isblankCountryCode(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		WebElement element1 = customMobileCode;
//		CommonMethodes.waitfForElements(driver, 3000);
		Thread.sleep(1000);
		String errorMsg = mobileCodeErrMsg.getText();
		int textLength = customMobileCode.getAttribute("value").length();
		assertEquals(textLength, 0, "Country code is not blank");
		assertEquals(errorMsg, "Enter a valid Country code");

	}

	public void sendCountryCodeValue(WebDriver driver, String code) throws InterruptedException {
		WebElement element1 = customMobileCode;
		customMobileCode.clear();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		RegexExpresionPatterns expcheck = new RegexExpresionPatterns();
		assertEquals(expcheck.isMobileCode(code), true, "Invaild country code format");
		if (expcheck.isMobileCode(code)) {
			element1.sendKeys(code);
			Thread.sleep(3000);
		}

	}

	public void checkVaildCountryCode(WebDriver driver, String code) throws InterruptedException {

		RegexExpresionPatterns expcheck = new RegexExpresionPatterns();
		assertEquals(expcheck.isMobileCode(code), true, "Invaild country code");

	}

	public void selectCountryCodeDropDown(WebDriver driver) throws InterruptedException {
		WebElement element1 = customMobileCode;
		String code = customMobileCode.getAttribute("value");
		Thread.sleep(3000);

		List<WebElement> codelist = driver
				.findElements(By.xpath("//div[@class='theme2_countrycodedropdownrow__Rk7uF']"));

		System.out.println("codelist all---" + codelist);

		for (WebElement searchText : codelist) {
			String currentcode = searchText.getText();

			if (currentcode.equals(code)) {
				System.out.println("search country code found matched");
				searchText.click();
				Thread.sleep(10000);
				break;
			}

		}

	}

	public void checkVaildSpecialRequest(WebDriver driver, String srq) throws InterruptedException {

		WebElement element1 = customSpecialRequest;
		String reqtext = customSpecialRequest.getAttribute("value");
		int textleng = reqtext.length();
		assertTrue(textleng > 0, "Special Request Text is not blank");

	}

}
