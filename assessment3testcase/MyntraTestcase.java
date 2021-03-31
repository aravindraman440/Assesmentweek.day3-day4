package assessment3testcase;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraTestcase {

		
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(option);
			driver.get("http://www.myntra.com/");
			// ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement women = driver.findElementByXPath("(//a[text()='Women'])[1]");
			Actions action = new Actions(driver);
			action.moveToElement(women).perform();
			WebElement linkText = driver.findElementByLinkText("Jackets & Coats");
			linkText.click();
			String text = driver.findElementByXPath("//span[@class='title-count']").getText();
			System.out.println(text);
			int ActualCount = Integer.parseInt(text.replaceAll("\\D", ""));
            int ExpectedCount = 0;
			List<WebElement> list = driver.findElementsByXPath("//span[@class='categories-num']");
			for (int i = 0; i < list.size(); i++) {
				String text2 = list.get(i).getText();
				int int1 = Integer.parseInt(text2.replaceAll("\\D", ""));
				ExpectedCount = ExpectedCount + int1;
			}
			if (ActualCount == ExpectedCount) {
				System.out.println("Count matches");
			} else {
				System.out.println("Count not matches");
			}
			driver.findElementByXPath("//input[@value='Coats']//following::div[@class=\"common-checkboxIndicator\"]")
					.click();
			driver.findElementByXPath("//div[text()='+ ']").click();
			driver.findElementByXPath("//input[@class='FilterDirectory-searchInput']").sendKeys("MANGO");
			driver.findElementByXPath("(//input[@value='MANGO']//following-sibling::div)[2]").click();
			driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
			Thread.sleep(5000);
			List<WebElement> brand = driver.findElementsByXPath("//h3[@class='product-brand']");
			for (int i = 0; i < brand.size(); i++) {
				String text2 = brand.get(i).getText();
				if (text2.contains("MANGO")) {
					System.out.println(i + "is matching");
				} else {
					System.out.println(i + "is not matching");
				}
			}

			WebElement sort = driver.findElementByXPath("//div[@class='sort-sortBy']");
			Thread.sleep(10000);
			action.moveToElement(sort).perform();
			driver.findElementByXPath("//input[@value='discount']/parent::label").click();
            List<WebElement> price = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
			int priceval = Integer.parseInt(price.get(0).getText().replaceAll("\\D", ""));
			System.out.println("Price val is " + priceval);
        	action.moveToElement(driver.findElementByXPath("(//h3[@class='product-brand'])[1]")).perform();
			Thread.sleep(5000);
			driver.findElementByXPath("//span[@class='product-actionsButton product-wishlist product-prelaunchBtn']").click();				
			System.out.println("Title of login page is " + driver.getTitle());

		}

	}

