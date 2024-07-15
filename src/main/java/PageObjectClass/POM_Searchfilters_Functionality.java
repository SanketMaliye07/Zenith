package PageObjectClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import utils.CommonMethodes;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.asserts.SoftAssert;

//import com.mongodb.assertions.Assertions;

import BaseClass.BaseClass;
import utils.CommonMethodes;

public class POM_Searchfilters_Functionality  {

	@FindBy(xpath = "//div[contains(@class,'theme2_sortby_active__7OVPe')]")
	private WebElement priceSort;

	@FindBy(xpath = "//div[contains(@class,'theme2_sort_flt_flx__WG_Sb')]//div[contains(@class,'')][normalize-space()='Duration']")
	private WebElement durationSort;

	@FindBy(xpath = "//button[normalize-space()='Reset All Filters']")
	private WebElement resetallfilter;

	@FindBy(xpath = "<span class=\"MuiSlider-thumb MuiSlider-thumbColorPrimary\" tabindex=\"0\" role=\"slider\" data-index=\"0\" aria-label=\"Temperature range\" aria-orientation=\"horizontal\" aria-valuemax=\"4999\" aria-valuemin=\"4999\" aria-valuenow=\"4999\" style=\"left: 7.5%;\"></span>")
	private WebElement priceLowSlider;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div/div[1]/div/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/span/span[8]")
	private WebElement priceMaxSlider;

	@FindBy(xpath = "//div[@class='MuiBox-root jss7']//span[8]")
	private WebElement durationLowSlider;

	@FindBy(xpath = "//div[@class='MuiBox-root jss7']//span[8]")
	private WebElement durationMaxSlider;

	@FindBy(xpath = "//input[@value='With Flights']")
	private WebElement withflts;

	@FindBy(xpath = "//input[@value='Without Flights']")
	private WebElement withnoflts;

	@FindBy(xpath = "//input[@id='country_name_autocomplete']")
	private WebElement searchbox;

	@FindBy(xpath = "//div[@class='theme2_result_status__c1V_G']")
	private WebElement checkCountElement;

	@FindBy(xpath = "//h1[normalize-space()='No results found']")
	private WebElement noresultmsg;

	WebDriver driver;
	
	public POM_Searchfilters_Functionality(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sortByprice(WebDriver driver, String sotyType) throws InterruptedException {

		CommonMethodes.waitForElementToBeVisible(driver, priceSort, 3);
		WebElement element1 = priceSort;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void sortByduration(WebDriver driver, String sotyType) throws InterruptedException {
		WebElement element1 = durationSort;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void priceFilterRange(WebDriver driver, int minValue, int maxValue) throws InterruptedException {
		WebElement element1 = priceLowSlider;
		WebElement element2 = priceMaxSlider;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		Actions action = new Actions(driver);

		if (minValue > 0) {

			action.dragAndDropBy(element1, minValue, 0);
			CommonMethodes.waitfForElements(driver, 5000);
		}
		if (maxValue > 0) {
			action.dragAndDropBy(element2, maxValue, 0);
			CommonMethodes.waitfForElements(driver, 5000);
		}

	}

	public void durationFilterRange(WebDriver driver, int minValue, int maxValue) throws InterruptedException {
		WebElement element1 = priceLowSlider;
		WebElement element2 = priceMaxSlider;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		Actions action = new Actions(driver);

		if (minValue > 0) {

			action.dragAndDropBy(element1, minValue, 0);
			CommonMethodes.waitfForElements(driver, 5000);
		}
		if (maxValue > 0) {
			CommonMethodes.waitfForElements(driver, 5000);
		}

	}

	public void FltfilterType(WebDriver driver, String flttype) throws InterruptedException {

		System.out.println("FFFF 111");
		if (flttype == "WithFlights") {
			WebElement element1 = withflts;
//			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
			CommonMethodes.waitfForElements(driver, 3000);
			element1.click();
			CommonMethodes.waitfForElements(driver, 3000);
		} else {

			WebElement element2 = withnoflts;
//			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
			CommonMethodes.waitfForElements(driver, 3000);
			element2.click();
			CommonMethodes.waitfForElements(driver, 3000);
		}

	}

	public void filterByCategories(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void isShowMoreCategories(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);

		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void filterByThemes(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);

		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void filterByContinents(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void filterByInclusions(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);
	}

	public void isShowMoreInclusions(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);
	}

	public void filterByExperiences(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void filterByCountries(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void isShowMoreCountries(WebDriver driver, int mix, int max) throws InterruptedException {
		WebElement element1 = resetallfilter;
		WebElement element2 = resetallfilter;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void resetAllFilters(WebDriver driver) throws InterruptedException {
		WebElement element1 = resetallfilter;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		Thread.sleep(3000);

	}

	
	
	public void verifyDeaultListCounts(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		CommonMethodes.waitForElementToBeVisible(driver, checkCountElement, 10);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String checkResultCounts = ((WebElement) checkCountElement).getText();
		CommonMethodes.waitfForElements(driver, 5000);
		int rscount = Integer.parseInt(checkResultCounts.replaceAll("[^0-9]", ""));
		assertEquals(rscount, 20, "defult holiday package result count not match");
	}
	
	public void norsMessage(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		CommonMethodes.waitForElementToBeVisible(driver, noresultmsg, 10);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String text = ((WebElement) noresultmsg).getText();
		assertEquals(text, "No results found", "No result found message error");
	}

	public void searchByText(WebDriver driver, String sotyType) throws InterruptedException {
		WebElement element1 = resetallfilter;
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		CommonMethodes.waitfForElements(driver, 3000);
		element1.click();
		CommonMethodes.waitfForElements(driver, 3000);

	}

	public void searchBoxPlaceholder(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		WebElement element1 = searchbox;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		CommonMethodes.waitfForElements(driver, 3000);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String placeText = element1.getAttribute("placeholder");
		assertEquals(placeText, "Search by city, country", "search box placeholder not match");

	}
	
	public void checkSearchBoxBlank(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		WebElement element1 = searchbox;
		CommonMethodes.waitfForElements(driver, 3000);
		int searchTextLen = searchbox.getAttribute("value").length();
	
		assertEquals(searchTextLen, 0, "search input box not empty");

	}
	
	public void checkSearchButtonDisabled(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		WebElement element1 = searchbox;
		CommonMethodes.waitfForElements(driver, 3000);
		boolean isEnabled = searchbox.isEnabled();
		assertEquals(isEnabled,false , "search box button not disabled");

	}

	public void checkCounts(WebDriver driver) throws InterruptedException {
		System.out.println("AAAAAAAAAAAAAAAAAa");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)", "");
		CommonMethodes.waitForElementToBeVisible(driver, checkCountElement, 10);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		String checkResultCounts = ((WebElement) checkCountElement).getText();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkResultCounts);
		CommonMethodes.waitfForElements(driver, 5000);
		int rscount = Integer.parseInt(checkResultCounts.replaceAll("[^0-9]", ""));

		System.out.println("rsCountValue is === " + rscount);
		assertTrue(rscount > 0, "after filter apply search count not match/result not founds");
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertFalse(rsCountValue > 0,"Total Result count not matched");
//		softAssert.assertAll();

	}

	public void selectThemes(WebDriver driver) throws InterruptedException {

		WebElement wb = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > span:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > span:nth-child(3)"));
//		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", wb);
		jse.executeScript("arguments[0].click();", wb);
		CommonMethodes.waitfForElements(driver, 3000);

//		wb.click();
//		wb.isSelected();
//		assertEquals(wb.isSelected(), "check box not selected");
//		assertEquals(wb.isDisplayed(),true, "check box not displaying");
//		assertEquals(wb.isEnabled(),true, "check box not enabled");

	}

	public void multiSelectThemes(WebDriver driver) throws InterruptedException {

		WebElement wb1 = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > span:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > span:nth-child(3)"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", wb1);
		jse1.executeScript("arguments[0].click();", wb1);

		WebElement wb2 = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > span:nth-child(2) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(3)"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView(true);", wb2);
		jse2.executeScript("arguments[0].click();", wb2);

	}

	public void isShowMoreThemes(WebDriver driver) throws InterruptedException {
		WebElement isShowMoreThemes = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/span[1]/div[2]"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);

//		assertEquals(isShowMoreThemes.isSelected(), true,"isShowMoreThemes not selected");
//		assertEquals(isShowMoreThemes.isDisplayed(),true, "isShowMoreThemes not displaying");
//		assertEquals(isShowMoreThemes.isEnabled(),true, "isShowMoreThemes not enabled");

	}

	

	
	
	public void selectCategories(WebDriver driver) throws InterruptedException {

		WebElement wb = driver.findElement(By.cssSelector(
				"div[class='theme2_category_cont__qaY8L'] div[class='theme2_ax_filter_collapse_content__5X9Hs theme2_overFLow_hidden__BO__7'] div:nth-child(1) label:nth-child(1) span:nth-child(2)"));
//		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", wb);
		jse.executeScript("arguments[0].click();", wb);
		CommonMethodes.waitfForElements(driver, 3000);

//		wb.click();
//		wb.isSelected();
//		assertEquals(wb.isSelected(), "check box not selected");
//		assertEquals(wb.isDisplayed(),true, "check box not displaying");
//		assertEquals(wb.isEnabled(),true, "check box not enabled");

	}

	public void multiSelectCategories(WebDriver driver) throws InterruptedException {

		WebElement wb1 = driver.findElement(By.cssSelector(
				"div[class='theme2_category_cont__qaY8L'] div[class='theme2_ax_filter_collapse_content__5X9Hs theme2_overFLow_hidden__BO__7'] div:nth-child(1) label:nth-child(1) span:nth-child(2)"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", wb1);
		jse1.executeScript("arguments[0].click();", wb1);

		WebElement wb2 = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > span:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView(true);", wb2);
		jse2.executeScript("arguments[0].click();", wb2);

	}

	public void isShowMoreCategories(WebDriver driver) throws InterruptedException {
		WebElement isShowMoreThemes = driver.findElement(By.xpath(
				"//div[@class='theme2_filter_content_wrap__M01_L']//div[@class='theme2_showmore__sDKME'][normalize-space()='show more']"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);

//		assertEquals(isShowMoreThemes.isSelected(), true,"isShowMoreThemes not selected");
//		assertEquals(isShowMoreThemes.isDisplayed(),true, "isShowMoreThemes not displaying");
//		assertEquals(isShowMoreThemes.isEnabled(),true, "isShowMoreThemes not enabled");

	}

	public void selectExps(WebDriver driver) throws InterruptedException {

		// softassert if fails then continue to next test case without terminate
		SoftAssert softAssert = new SoftAssert();

		WebElement wb = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > span:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > span:nth-child(3)"));
//		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		assertEquals(wb.isDisplayed(), true, "Experience checkbox not displaying");
//		assertEquals(wb.isEnabled(), true, "Experience checkbox not enabled");
		softAssert.assertEquals(wb.isDisplayed(), true, "Experience checkbox not displaying");
		softAssert.assertEquals(wb.isEnabled(), true, "Experience checkbox not enabled");
		jse.executeScript("arguments[0].scrollIntoView(true);", wb);
		jse.executeScript("arguments[0].click();", wb);
		CommonMethodes.waitfForElements(driver, 5000);
		Thread.sleep(10000);
		System.out.println("ooooooooooo");
//		System.out.println(wb.isSelected());
//		assertEquals(wb.isSelected(), true, "Experience checkbox not selected");
//		softAssert.assertEquals(wb.isSelected(), true,"Experience checkbox not selected");
//		softAssert.assertAll();

	}

	public void multiSelectExps(WebDriver driver) throws InterruptedException {

		WebElement wb1 = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > span:nth-child(2) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > span:nth-child(3)"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", wb1);
		jse1.executeScript("arguments[0].click();", wb1);

		WebElement wb2 = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > span:nth-child(2) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > span:nth-child(3)"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView(true);", wb2);
		jse2.executeScript("arguments[0].click();", wb2);

	}

	public void isShowMoreExps(WebDriver driver) throws InterruptedException {
		WebElement isShowMoreExps = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/span[1]/div[2]"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
		CommonMethodes.waitfForElements(driver, 3000);

//		assertEquals(isShowMoreThemes.isSelected(), true,"isShowMoreThemes not selected");
//		assertEquals(isShowMoreThemes.isDisplayed(),true, "isShowMoreThemes not displaying");
//		assertEquals(isShowMoreThemes.isEnabled(),true, "isShowMoreThemes not enabled");

	}
}
