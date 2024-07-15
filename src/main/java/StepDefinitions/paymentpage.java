package StepDefinitions;

import BaseClass.BaseClass;
import PageObjectClass.POM_PaymentPage;
import io.cucumber.java.en.Then;

public class paymentpage extends BaseClass{

	POM_PaymentPage Payment;
	
	 @Then("User is select the netbanking and successfully do the payment")
	    public void clickAcceptOption() throws InterruptedException {
		 Payment=new POM_PaymentPage(driver);
		 Payment.Forpaymnet(driver);
	    }
	 
}
