package StepDefinitions;

import BaseClass.BaseClass;
import PageObjectClass.POM_ReviewPage;
import io.cucumber.java.en.When;
public class ReviewPage extends BaseClass {

	POM_ReviewPage Reviewpage;

	
	    
	
	  
	  
	 
	  @When("I select the 3adult")
	    public void select3Adult() throws InterruptedException {
		  
		  Reviewpage=new POM_ReviewPage(driver);
		  //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select3Adult(driver);
	    }
	  
	  
	  
	  @When("I select the 2adult")
	    public void select2Adult() throws InterruptedException {
		  
		  Reviewpage=new POM_ReviewPage(driver);
		  //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select2Adult(driver);
	    }
	  
	  
	  
	  @When("I select the 4adult")
	    public void select4Adult() throws InterruptedException {
		  
		  Reviewpage=new POM_ReviewPage(driver);
		  //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select4Adult(driver);
	    }
	  
	  
	
	  
	  
	  
	  @When("I select the 5adult for Ecomomy Refundable")
	    public void select5AdultforEconomyRefundable() throws InterruptedException {
		  
		  Reviewpage=new POM_ReviewPage(driver);
		  //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select5AdultEcomomyRefundable(driver);
	    }
	  
	

	    @When("I select the 4child for Ecomomy Refundable")
	    public void select4childforEconomyRefundable() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select4child_oneway(driver);
	    }
	    
	    @When("I select the 5child")
	    public void select5Child() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
			 //Reviewpage.Select5child(driver);
	    }

	    @When("I select the 3child")
	    public void select3Child() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select3child(driver);
	    }
	    
	    
	    
	    @When("I select the 2child")
	    public void select2Child() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select2child(driver);
	    }
	   
	    
	    @When("I select the 4infant for Ecomomy Refundable")
	    public void select4infantforEconomyRefundable() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select4infent_Oneway(driver);

	    }
	    
	    @When("I select the 2infant")
	    public void select2Infant() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
			 //Reviewpage.Select2infent(driver);
 
	    }
	    
	    @When("I select the 4infant")
	    public void select4Infant() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select4infent(driver);

	    }
	    @When("I select the 1infant")
	    public void select1Infant() throws InterruptedException {
	    	 Reviewpage=new POM_ReviewPage(driver);
	    	 //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
			 //Reviewpage.Select1infent(driver);

	    }

	
	    

	 
	   

	  
}
