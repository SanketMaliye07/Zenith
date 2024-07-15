package StepDefinitions;

import BaseClass.BaseClass;
import PageObjectClass.POM_prodpaymentpage;
import io.cucumber.java.en.Then;

public class prodpaymentpage extends BaseClass {
POM_prodpaymentpage ProdPayment;
	
@Then("pass the card creditioles and do payment")
public void payment() throws InterruptedException {
 ProdPayment=new POM_prodpaymentpage(driver);
 ProdPayment.AddAdress(driver);
 ProdPayment.passCreditCardNumber(driver);
 ProdPayment.selectMonth(driver);
 ProdPayment.selectYear(driver);
 ProdPayment.passCvv(driver);
 ProdPayment.makepayement(driver);
 ProdPayment.ClickOnSubmit(driver);

 
 
	

}
}
