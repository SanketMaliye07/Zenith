package BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.CommonMethodes;

public class BaseClass extends CommonMethodes {

	protected static WebDriver driver;
	ExtentReports extent;

	public void LounchBrowser(String environment) throws IOException, InterruptedException {

		if (CommonMethodes.readDataFromPropertyFile("browser").equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
//			        option.addArguments("disable-infobars");

			switch (environment.toLowerCase()) {
			case "prod":
				driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				driver.get(CommonMethodes.readDataFromPropertyFile("PRODURL"));
				System.out.println("User is on PRODURL");
				break;
			case "uat":
				driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				driver.get(CommonMethodes.readDataFromPropertyFile("PRODURL"));
				System.out.println("User is on UATNEW");
				break;
			}

			// driver.get(CommonMethodes.readDataFromPropertyFile("UATNEW"));

			System.out.println("Successfully Launch the URL with Chrome");
			// PRODURL
			// UATNEW
                      Thread.sleep(5000);
		} 
		else if (CommonMethodes.readDataFromPropertyFile("browser").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--remote-allow-origins=*", "--disable-popup-blocking");
			driver = new FirefoxDriver(option);
			driver.manage().window().maximize();
			driver.get(CommonMethodes.readDataFromPropertyFile("PRODURL"));
			System.out.println("Successfully Launch the URL with Firefox");
			CommonMethodes.wait1(driver, 10);

		} else if (CommonMethodes.readDataFromPropertyFile("browser").equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--remote-allow-origins=*", "--disable-popup-blocking");
			driver = new EdgeDriver(option);
			driver.manage().window().maximize();
			driver.get(CommonMethodes.readDataFromPropertyFile("PRODURL"));
			System.out.println("Successfully Launch the URL with Edge");
			CommonMethodes.wait1(driver, 10);

		}

	}

}
