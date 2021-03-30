package Assessment3;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementById("src").sendKeys("C");
	Thread.sleep(2000);
	driver.findElementById("src").sendKeys(Keys.DOWN,Keys.ENTER);
	driver.findElementById("dest").sendKeys("Chennai",Keys.ENTER,Keys.TAB);
	Thread.sleep(3000);
	driver.findElementById("onward_cal").click();
	Thread.sleep(5000);
	driver.findElementByClassName("next").click();
	Thread.sleep(5000);
	driver.findElementByXPath("//table[@class='rb-monthTable first last']//tr[3]/td[4]").click();
	Thread.sleep(5000);
	driver.findElementByXPath("//button[text()='Search Buses']").click();
	Thread.sleep(5000);
	String text=driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
	System.out.println(text);
	driver.findElementByClassName("//i[@class='icon icon-close c-fs']").click();
	
	
	
	}}

