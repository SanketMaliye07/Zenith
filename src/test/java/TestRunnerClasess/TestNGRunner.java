package TestRunnerClasess;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.annotations.AfterClass;
import StepDefinitions.Emailreport;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
 	    
	  	  
features={"src\\test\\java\\Features"},	
glue="StepDefinitions",
monochrome = true,
tags="@Flight_Sanity_TestCases_PROD_With_Login or @Flight_Sanity_TestCases_PROD_Without_Login or @Hotel_Sanity_TestCases_PROD_With_Login or @Hotel_Sanity_TestCases_PROD_Without_Login",
plugin= {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/",
		"rerun:target/failedrerun.txt"
	         	             
     	                                                                                                 	                                                                                                                                          	      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 	                                                  	                              
}                   
)   
    
public class TestNGRunner extends AbstractTestNGCucumberTests {

	 //@AfterClass
	public static void SendingMail() throws AddressException, IOException, MessagingException {

		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new Thread() {
			public void run() {
				Emailreport sm = new Emailreport();
				try {
					sm.mail();
					System.out.println("Report has been sent");
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}

			}
		});

	}
}
//Hotel_Regression_TC.feature
//Flight_Regression_TC.feature
//Holiday_sanity_tc.feature
//Hotel_Sanity_TC.feature
//Flight_Sanity_TC.feature
//tags="@Hotel_Regression_TestCases or @Hotel_Sanity_TestCases or @Flight_Regression_TestCases or @Flight_Sanity_TestCases or @holiday_sanity",

