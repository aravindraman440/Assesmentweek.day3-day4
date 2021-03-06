package leadstestcase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
			public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElementById("username").sendKeys("DemoCSR");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				Thread.sleep(2000);
				driver.findElementByLinkText("CRM/SFA").click();
				Thread.sleep(5000);
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("//span[text()='Phone']").click();
				
				driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(2000);
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
				driver.findElementByLinkText("Duplicate Lead").click();
				driver.findElementByName("submitButton").click();
				driver.close();
		}
		}