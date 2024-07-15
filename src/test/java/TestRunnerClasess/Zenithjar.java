package TestRunnerClasess;

import io.cucumber.core.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Zenithjar extends AbstractTestNGCucumberTests{
	
	public static void main(String args[]) {


		try {

			Main.main(new String[] { "-g", "StepDefinitions", "/target/test-classes/", "-t",
					"@Flight_Sanity_TestCases_PROD_With_Login or @Flight_Sanity_TestCases_PROD_Without_Login or @Flight_Sanity_TestCases_UAT_With_Login or @Flight_Sanity_TestCases_UAT_Without_Login or @Hotel_Sanity_TestCases_PROD_With_Login or @Hotel_Sanity_TestCases_PROD_Without_Login or @Hotel_Sanity_TestCases_UAT_With_Login or @Hotel_Sanity_TestCases_UAT_Without_Login or @Flight_Regression_TestCases or @Hotel_Regression_TestCases", "-p", "pretty", "-p",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "-p",
					"timeline:test-output-thread/" });

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Main method exception : " + e);
		}
      
           
	}

}
