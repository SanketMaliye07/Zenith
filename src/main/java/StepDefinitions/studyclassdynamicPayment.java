package StepDefinitions;

public class studyclassdynamicPayment {
	
	public void checkFareDetails(WebDriver driver) throws InterruptedException {

		// This line scroll to fare detail section
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", fareDetailsSection);

		// Extract fare details
		Map<String, Double> fareDetails = new HashMap<>();
//        String[] fareLabels = {"Total Base Fare", "Total Taxes", "My Earning (Incl. of Taxes)"};
		String[] fareLabels = { "Total Base Fare", "My Earning (Incl. of Taxes)", "Total Taxes", "Seats", "Mealss",
				"Baggage", "Platform Fees:", "GST:" };

		// below line used for to get fare details all lable list
		List<WebElement> lableList = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_flight_base_fare__pLY6w']//div[1]//p"));
		int labelSize = lableList.size();

		List<WebElement> priceList = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_flight_base_fare__pLY6w']//div[2]//p"));
		int priceSize = priceList.size();

		List<WebElement> lableListone = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_taxes_gst_service__9W1Da']//div[1]//p"));
		int labelSizeone = lableListone.size();

		List<WebElement> priceListone = driver.findElements(By.xpath(
				"//div[@class='theme4_fare_detail_box__9WckK']//div[@class='theme4_taxes_gst_service__9W1Da']//div[2]//p"));
		int priceSizeone = priceListone.size();

//		for (WebElement searchLabel : lableList) {
//	        for (String label : fareLabels) {
//	        	String currentLabel = searchLabel.getText();
//				if (currentLabel.equalsIgnoreCase(label)) {
//					  fareDetails.put(label, Double.parseDouble(element.getText().trim()));
//					  
//				}	
//            }
//		}

		for (int i = 0; i < labelSize; i++) {
			for (String label : fareLabels) {
				String currentLabel = lableList.get(i).getText();
				if (currentLabel.equalsIgnoreCase(label)) {
					fareDetails.put(label, Double.parseDouble(priceList.get(i).getText().trim().replace(",", "")));

				}
			}
		}

		for (int i = 0; i < labelSizeone; i++) {
			for (String label : fareLabels) {
				String currentLabel = lableListone.get(i).getText();
				if (currentLabel.equalsIgnoreCase(label)) {
					fareDetails.put(label, Double.parseDouble(priceListone.get(i).getText().trim().replace(",", "")));

				}
			}
		}

		if (driver.findElements(By.xpath("//p[normalize-space()='Local Taxes (if applicable)']")).size() > 0) {
			double localTax = Double.parseDouble(driver.findElement(By.xpath(
					"//div[@class='theme4_flight_base_ticket_price__OWEX3']//input[@placeholder='Enter Amount']"))
					.getAttribute("value"));

			fareDetails.put("Local Taxes (if applicable)", localTax);

		}

		// Calculate total amount
		double finalTotalAmount = fareDetails.values().stream().mapToDouble(Double::doubleValue).sum();

		// Print the fare details and total amount
		System.out.println("Fare Details:");
		fareDetails.forEach((label, value) -> System.out.println(label + ": " + value + " BHD"));
		System.out.println("Final Total Amount: " + finalTotalAmount + " BHD");

		// this line check total amount calculation
		if (driver.findElements(By.xpath("//b[normalize-space()='Total Amount']")).size() > 0) {
			double totalAmt = Double
					.parseDouble(driver.findElement(By.xpath("//span[@id='final_flight_amt']")).getText());
			System.out.println("Final Amount after all calculation" + finalTotalAmount);
			System.out.println("Total amount is " + totalAmt);

			assertEquals(totalAmt, finalTotalAmount);

		}

	}  

}
